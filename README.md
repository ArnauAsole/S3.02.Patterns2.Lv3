# S3.02.Patterns2.Lv3

# 💳 Shoe Store Payment System using Callback Pattern

### 📄 Description – Exercise Statement
This exercise implements the Callback design pattern to simulate a payment gateway system for a shoe store. The main idea is to allow different payment methods (credit card, PayPal, and bank account debit) to be passed as callbacks to a generic payment gateway.

The application is structured around the following components:

PaymentMethod: an interface that acts as a callback, defining the pay(double amount) method.

Concrete Payment Methods: CreditCardPayment, PayPalPayment, and BankDebitPayment implement PaymentMethod, providing different behaviors.

PaymentGateway: simulates a secure payment platform that receives the callback and invokes it without knowing the specific payment method.

ShoeStore: the class representing the business that uses the payment gateway to process purchases.

Main: the entry point of the program where the store processes several purchases using different payment methods.

Summary of the exercise statement:
Simulate a payment gateway that accepts different encapsulated payment methods (credit card, PayPal, or bank account debit). The gateway should execute the payment without knowing the internal details and return control to the store class that called it.

### 💻 Technologies Used

🧠 Java 17 (or later)

🔨 Gradle (project build and dependency management)

💡 IntelliJ IDEA as the development environment

☕ JDK (Java Development Kit)

📦 Java Standard Library

🔗 Git and GitHub for version control

### 📋 Requirements
Java 17 or higher installed

IntelliJ IDEA (recommended)

Gradle (bundled with IntelliJ or installed separately)

GitHub account (to clone or fork the repository)

### 🛠️ Installation
Open the project in IntelliJ IDEA:

Go to File > Open... and select the shoe-store-callback project folder.

Wait for Gradle to sync.

Ensure the correct JDK is set:

Go to File > Project Structure > Project SDK → Java 17+

Build the project via Build > Build Project

### ▶️ Running the Project
Once the project is open in IntelliJ:

Open Main.java.

Click the green Run button (or press Ctrl+Shift+F10) to start the program.

### 🧪 Sample Flow
The store creates an order for shoes with a specific price.

A payment method is chosen (credit card, PayPal, bank debit).

The chosen payment method is passed to the PaymentGateway as a callback.

The PaymentGateway calls the pay() method of the passed-in object.

Control returns to the store after the payment is processed.

### 📦 Output Example
```
Customer is checking out shoes worth 79.99€
Processing payment through secure gateway...
Paying 79.99€ with Credit Card.
Payment processed successfully.

Customer is checking out shoes worth 59.5€
Processing payment through secure gateway...
Paying 59.5€ with PayPal.
Payment processed successfully.

Customer is checking out shoes worth 102.35€
Processing payment through secure gateway...
Paying 102.35€ via Bank Account Debit.
Payment processed successfully.
```

### 🌐 Deployment
This project is intended for educational and console-based usage only.

To create a .jar file for deployment:

Go to File > Project Structure > Artifacts

Create a new JAR artifact from the Gradle build output

Use Build > Build Artifacts to compile it

To run the JAR from terminal:

```
java -jar shoe-store-callback.jar
```
### 🤝 Contributing
All contributions are welcome! To contribute:
Marc, Ana, Javier, Ignasi, Alejandro, Vanina, Meritxell.

### 🔗 Git and GitHub link:
```
https://github.com/ArnauAsole/S3.02.Patterns2.Lv3.git
```
