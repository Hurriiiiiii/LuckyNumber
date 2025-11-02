Lucky Number App

An Android app built to demonstrate the difference between explicit and implicit intents in Android.
The app asks for the user’s name, generates a random lucky number, and lets them share it with other apps like WhatsApp, Gmail, or Messages.

🚀 Features

Uses explicit intent to navigate from one activity to another

Uses implicit intent to share data with other apps

Random number generation for a “lucky number”

Clean, interactive interface using ConstraintLayout

Demonstrates real-world use of Intent objects in Android

🔍 Concepts Covered

Explicit Intent: Launching SecondActivity from MainActivity with user data

Implicit Intent: Sharing the lucky number via available apps

Extras Passing: Sending data between activities using putExtra() and getStringExtra()

Random Number Generation: Using the Random class in Java

🛠️ Technologies Used

Language: Java

IDE: Android Studio

Layout: ConstraintLayout (XML)

📱 How It Works

The user enters their name in the input box.

When the “Wish Me Luck!” button is clicked:

An explicit intent opens the second activity.

A random number is generated and displayed as the user’s lucky number.

Pressing “Share My Lucky Number” triggers an implicit intent, opening a chooser menu so the user can share the message through any app.

🧩 File Structure
app/

 └── src/

      └── main/

           ├── java/com/example/luckynumber/

           │    ├── MainActivity.java

           │    └── SecondActivity.java

           └── res/layout/

                ├── activity_main.xml

                └── activity_second.xml


💡 Learning Purpose

This project was created to understand and practice explicit and implicit intents in Android.
It’s an essential concept for navigation and app-to-app communication in Android development.