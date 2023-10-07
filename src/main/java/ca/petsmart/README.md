# PetSmart Selenium Test Automation

This repository contains a set of Selenium test cases for PetSmart, an e-commerce platform for pet products and services. The tests are designed to automate various user interactions with the website, such as logging in, signing up, and booking grooming services.

### Table of Contents

* Description
* Usage
* Test Cases
* Dependencies

### Description

The codebase includes page object classes and test cases for PetSmart's web application. The test automation framework is built using Selenium WebDriver, Java, and TestNG.

### Usage
To use this codebase for Selenium test automation of the PetSmart website, follow these steps:

1. **Clone the Repository:** Clone this repository to your local machine.

`git clone https://github.com/AleksVo1/petsmart.git`

2. **Set Up Dependencies:** Ensure that you have the following dependencies installed and configured:

* Java Development Kit (JDK)
* Selenium WebDriver
* WebDriver executables (e.g., ChromeDriver, Firefox GeckoDriver) added to your system's PATH.
* Import the Project: Import the project into your preferred Integrated Development Environment (IDE), such as IntelliJ IDEA or Eclipse.

4. **Run Test Cases:** Open and run the test cases located in the ca.petsmart.webPages package. For example:


`public class LoginTest extends BasePageTest {
    @Test
    public void testLogin() {
        // Implement your test steps here
    }
}`

5. **Customize and Extend:** Modify and extend the test cases as needed for your testing requirements. You can create additional test cases and page object classes to cover various scenarios.

### Test Cases
The test cases provided in this repository cover the following scenarios:

- **LoginTest:** Automates the login process, including accepting cookies and verifying successful login.

- **SignUpTest:** Automates the sign-up process, creating a new user account, and saving credentials to a file.

- **GroomingWithAddonTest:** Automates the booking of grooming services, including selecting a store, appointment, add-ons, and completing the booking.

Each test case class extends the BasePageTest class, which provides common setup and teardown procedures.

### Dependencies

This project relies on the following dependencies:

- Java Development Kit (JDK): Make sure you have Java installed on your system.
- Selenium WebDriver: Download and include the Selenium WebDriver library in your project.
- WebDriver Executables: Download the WebDriver executables (e.g., ChromeDriver, Firefox GeckoDriver) and configure them in your system's PATH.

Ensure that you have set up these dependencies before running the test cases.