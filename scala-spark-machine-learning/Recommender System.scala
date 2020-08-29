// Databricks notebook source
import org.apache.spark.ml.recommendation.ALS

// COMMAND ----------

val ratings = spark.read.option("header" , "true").option("inferSchema" , "true").csv("/FileStore/tables/movie_ratings.csv")

// COMMAND ----------

val Array(training , test) = ratings.randomSplit(Array(0.8 , 0.2))

// COMMAND ----------

val als = new ALS().setMaxIter(5).setRegParam(0.01).setUserCol("userId").setItemCol("movieId").setRatingCol("rating")

// COMMAND ----------

val model = als.fit(training)

// COMMAND ----------

val predictions = model.transform(test)

// COMMAND ----------

predictions.show(2)

// COMMAND ----------

import org.apache.spark.sql.functions._
val error = predictions.select($"rating"-$"prediction")

error.show(5)

// COMMAND ----------

error.na.drop().describe().show(2)
