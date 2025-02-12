import speech_recognition as sr
import os
import sys









def voice_command():
    recognizer = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening...")
        recognizer.adjust_for_ambient_noise(source)
        audio = recognizer.listen(source)
         
        
        

    try:
        command = recognizer.recognize_google(audio).lower()
        print("You said:", command)

        if "open registration page" in command:
            print("REGISTRATION_PAGE")
        elif "check seat availability" in command:
            print("SEAT_AVAILABILITY")
        elif "show student record" in command:
            print("STUDENT_RECORD")
        elif "show report" in command:
            print("SHOW_REPORT")
        elif "chrome open" in command:
            os.system("start chrome")
            print("CHROME_OPENED")
        else:
            print("UNKNOWN_COMMAND")

    except sr.UnknownValueError:
        print("NO_INPUT")
    except sr.RequestError:
        print("API_ERROR")

voice_command() 
