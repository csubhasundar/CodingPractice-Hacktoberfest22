# -*- coding: utf-8 -*-
"""
Created on Sun Mar 20 21:41:10 2022

@author: Souvik Bhattacharya
"""

import speech_recognition as sr
#A=("audio.wav")
r=sr.Recognizer()
with sr.Microphone() as source:
    print('say')
    audio=r.listen(source)
try:
    print(r.recognize_google(audio))
except sr.UnknownValueError:
    print("couldn't understand the audio")
except sr.RequestError:
    print("couldn't get the results")