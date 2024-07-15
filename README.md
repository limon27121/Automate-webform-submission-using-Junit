# Web Form Automation

This project automates the submission of a web form available at [Digital Unite Practice Web Form](https://www.digitalunite.com/practice-webform-learners). It includes uploading a file and verifying the success message.

## Prerequisites

- [Node.js](https://nodejs.org/en/) installed
- [npm](https://www.npmjs.com/) (comes with Node.js)
- [ChromeDriver](http://chromedriver.chromium.org/downloads) (ensure it matches your Chrome version)
- [Selenium WebDriver](https://www.selenium.dev/) (can be installed via npm)

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/webform-automation.git
   cd webform-automation
## Overview
This project automates the submission of a web form available at Digital Unite Practice Web Form. It uses Selenium WebDriver with Node.js to interact with the web form, fill in necessary fields, upload a file, submit the form, and verify the success message upon submission.

## Key Features

- **Automated Form Submission**: Navigate to the web form URL and fill out required fields programmatically.
  
- **File Upload Support**: Ability to upload a file (up to 2MB) as part of the form submission process.
  
- **Success Message Verification**: Script waits for and verifies the appearance of the success message ("Thank you for your submission!") on the web page.
  
- **Logging**: Console logs indicate whether the form submission was successful or if any errors occurred during the process.



##Purpose
The primary purpose of this project is to demonstrate automated testing capabilities using Selenium WebDriver and Node.js. By automating the web form submission, it showcases how repetitive manual tasks can be efficiently handled through script automation, ensuring accuracy and reliability in testing scenarios.
