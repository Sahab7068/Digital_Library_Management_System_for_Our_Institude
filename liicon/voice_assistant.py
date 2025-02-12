import speech_recognition as sr
import pyttsx3

recognizer = sr.Recognizer()
engine = pyttsx3.init()
command = recognizer.recognize_google(audio).lower()
print("Recognized Command (Raw):", command)  # ✅ Check karo ki actual output kya aa raha hai


def speak(text):
    engine.say(text)
    engine.runAndWait()

def listen():
    with sr.Microphone() as source:
        print("Listening for command...")
        recognizer.adjust_for_ambient_noise(source)
        audio = recognizer.listen(source)

    try:
        command = recognizer.recognize_google(audio).lower()
        print("You said:", command)
        return command
    except sr.UnknownValueError:
        print("Could not understand the audio")
        return "none"
    except sr.RequestError:
        print("Could not request results")
        return "none"

if __name__ == "__main__":
    command = listen()
    if command != "none":
        print(command)
