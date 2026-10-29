# Number Guesser

A simple console-based **Java application built with Maven** where the player tries to guess a randomly generated number.

## Features

* **Random Generation:** Generates a random number between 1 and 100.
* **Input Validation:** Prevents crashes by rejecting non-integer inputs and prompting the user to try again.
* **Interactive Feedback:** Provides "Too high" or "Too low" hints.
* **Score Tracking:** Tracks and displays the total number of attempts it took to win.

## Prerequisites

* **Java Development Kit (JDK) 25** or higher
* **Apache Maven 3.x**

## Project Structure

```text
number-guesser/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── josef/
│                   └── NumberGuesser.java
└── pom.xml
```

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/josef40/number-guesser.git
cd number-guesser
```

### 2. Build the Project
Compile the project and bundle it into a runnable JAR file using Maven:
```bash
mvn clean package
```

### 3. Run the Application
Execute the compiled JAR file from the command line:
```bash
java -cp target/number-guesser-1.0-SNAPSHOT.jar com.josef.NumberGuesser
```
