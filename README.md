# API Integration Projects – AQI, Weather & OMDB

## Overview
This repository contains three independent mini-projects built using **Java Spring Boot** and **plain HTML/JavaScript**.  
Each project demonstrates integration with a public external API, RESTful backend design, in-memory caching, and a simple frontend UI.

The projects included are:
1. Air Quality Index (AQI) Search
2. Current Weather Search
3. OMDB Movie Explorer

All services run locally using a single Spring Boot application.

---

## Tech Stack
- Java 17
- Spring Boot
- Maven
- Spring Cache (In-memory)
- HTML, CSS, JavaScript

---

## Projects Included

### 1️⃣ Air Quality Index (AQI) Search
- Search AQI by city name
- Displays AQI value and related information
- Uses a public AQI API
- Cached per city to improve performance

**Backend Endpoint**
### UI Screenshot 1
![UI Screenshot 1](<img width="1920" height="1080" alt="Screenshot 2026-01-01 124558" src="https://github.com/user-attachments/assets/75a1678e-e18f-4c2c-a4fe-e77983c491ad" />
.jpg)
---

### 2️⃣ Current Weather Search
- Search current weather by city name
- Displays temperature, humidity, and wind speed
- Uses a public weather API
- Cached per city to improve performance

**Backend Endpoint**
<img width="1919" height="1070" alt="Screenshot 2026-01-01 124850" src="https://github.com/user-attachments/assets/acc2aecf-675b-4616-b512-8f3b9af96ef3" />



### 3️⃣ OMDB Movie Explorer
- Search movies/series by title
- Displays posters, titles, and release years
- Uses the OMDB public API
- Cached per search keyword

**Backend Endpoint**
<img width="1919" height="1079" alt="Screenshot 2026-01-01 124907" src="https://github.com/user-attachments/assets/74b4793b-31e6-4a8a-b24d-3b938479e39f" />


## Project Structure

Project Root
├── src/
│   └── main/
│       └── java/
│           └── aqi/demo/
│               ├── controller/
│               │   ├── AqiController.java
│               │   ├── WeatherController.java
│               │   └── MovieController.java
│               ├── services/
│               │   ├── AqiService.java
│               │   ├── WeatherService.java
│               │   └── MovieService.java
│               └── AqiApplication.java
├── frontend/
│   ├── aqi.html
│   ├── weather.html
│   └── omdb.html
├── pom.xml
└── README.md

---

## How to Run the Backend (Spring Boot)

### Prerequisites
- Java 17 installed
- Internet connection (for public APIs)

### Steps
1. Open terminal in the project root (where `pom.xml` exists)
2. Run the application using Maven Wrapper:

./mvnw spring-boot:run


(Windows PowerShell)


.\mvnw.cmd spring-boot:run


3. Wait until you see:


Tomcat started on port 8080


The backend is now running.

---

## How to Run the Frontend

The frontend is built using **plain HTML + JavaScript**.

### Steps
1. Open the `frontend` folder
2. Open any file directly in a browser:
   - `aqi.html` → AQI Search UI
   - `weather.html` → Weather Search UI
   - `omdb.html` → OMDB Movie Explorer UI
3. Ensure the backend is running on `http://localhost:8080`

The frontend communicates with the backend using REST APIs.

---

## Notes
- All projects use **public/free-tier APIs**
- API responses may be temporarily unavailable due to rate limits or API availability
- API keys are included for demonstration purposes only
- The architecture is extensible and can be expanded further

---

## Status
Submitted as part of a coding assignment.  
The repository may be refined further within the provided 48-hour window.
