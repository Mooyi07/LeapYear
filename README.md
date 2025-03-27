# Leap Year Checker

## 📌 Description
This Java program determines whether a given year is a **leap year** or not. The user inputs a year, and the program evaluates it using the standard leap year conditions.

## 🛠 Features
- Accepts a **year** as user input.
- Checks whether the year is a **leap year** based on:
  - Divisibility by **4**.
  - Not divisible by **100**, unless also divisible by **400**.
- Displays whether the year is a **leap year** or **not**.

## 📂 File Structure
- `Main.java` – Contains the implementation for the leap year checker.

## 🚀 Usage
1. **Compile the Java file:**
   ```sh
   javac Main.java
   ```
2. **Run the program:**
   ```sh
   java Main
   ```
3. **Enter a year when prompted:**
   ```
   Enter year: 2024
   ```
4. **Example Output:**
   ```
   This is a leap year
   ```
   ```
   Enter year: 2023
   This is not a leap year
   ```

## 📝 Explanation
1. The user enters a year.
2. The program checks if:
   - The year is **divisible by 4** but **not by 100** (unless also divisible by **400**).
   - If the condition is met, it prints **“This is a leap year”**.
   - Otherwise, it prints **“This is not a leap year”**.

## 📜 License
This project is open-source and free to use.

