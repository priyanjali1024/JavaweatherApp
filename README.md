# 🌦️ Java Weather App

A simple **Java console application** that fetches **live weather data** using the OpenWeatherMap API.

---

## 📌 Features

- 🔎 Enter any city name to get current weather data
- 🌡️ Displays temperature in Celsius
- 💧 Shows humidity
- 🔁 Real-time API integration using HTTP requests
- 📦 JSON parsing using `org.json` library

---

## 🚀 How It Works

1. User is prompted to enter a city name (e.g., Chennai, London)
2. The app sends a **GET request** to the OpenWeatherMap API
3. API returns live weather data in **JSON format**
4. JSON data is parsed to extract temperature & humidity
5. Output is displayed in the console

---

## 🛠️ Technologies Used

| Tool            | Purpose                         |
|-----------------|---------------------------------|
| Java            | Programming language            |
| OpenWeatherMap  | Free Weather API                |
| JSON Library    | To parse JSON data (`json.jar`) |
| VS Code / Eclipse | IDE to write and run Java     |
| Git & GitHub    | Version control and deployment  |

---

## 📦 Installation & Setup

1. Clone the repo:
   ```bash
   git clone https://github.com/priyanjali1024/JavaweatherApp.git

2. Compile the app:
    javac -cp ".;lib/json-20250517.jar" WeatherApp.java

3. Run the app:
    java -cp ".;lib/json-20250517.jar" WeatherApp

🧠 What I Learned
    *How to use APIs in Java
    *Building and validating URLs with URI and URL
    *Sending HTTP requests using HttpURLConnection
    *Reading input streams using BufferedReader
    *parsing JSON data in Java
    *Using Git to track & push code to GitHub

🔗 Live Repository
    https://github.com/priyanjali1024/JavaweatherApp

👩‍💻 Author
Priyadharshini — BTech ECE Student, Developer & Learner
LinkedIn  www.linkedin.com/in/priyadharshini-maddela-876932252
