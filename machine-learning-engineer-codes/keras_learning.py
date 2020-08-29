# -*- coding: utf-8 -*-
"""
Created on Wed Jun 24 03:13:54 2020

@author: jean-
"""

import pandas as pd
import numpy as np 
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from keras.layers import Dense 
from keras.models import Sequential

def assign_sex(row):
    if row['Sex'] == 'male':
        return 1 
    else : 
        return 0
    
train_data = pd.read_csv('titanic.csv' , sep = ',')
train_data = train_data.drop(['PassengerId','Name','Cabin','Embarked'
                              ,'Ticket' , 'Fare'] , axis = 1)
    
train_data['Sex'] = train_data.apply(assign_sex , axis = 1)

train_data.fillna(0 , inplace = True)

x = np.array(train_data.iloc[:,1:])
y = np.ravel(train_data.Survived)

seed = 9
np.random.seed(seed)

filename = 'BBCN.csv'
dataframe = pd.read_csv(filename)
dataframe.head()

array = dataframe.values

X = array[:,0:11] 
Y = array[:,11]

model = Sequential()
model.add(Dense(12, input_dim=11, kernel_initializer='uniform', activation='relu'))
model.add(Dense(8, kernel_initializer='uniform', activation='relu'))
model.add(Dense(1, kernel_initializer='uniform', activation='sigmoid'))

model.compile(loss='binary_crossentropy', optimizer='adam', metrics=['accuracy'])

model.fit(X, Y, epochs=20, batch_size=30)

scores = model.evaluate(X, Y)
print("%s: %.2f%%" % (model.metrics_names[1], scores[1]*100))


