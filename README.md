# Test specification
As the payment team of Currencycloud we need to manage the full lifecycle of a payment.

The goal of this test is to assess your skills in functional programming, best practices, code architecture and identifying flaws in the logic.
You will implement a simple payment system that can manage the full lifecycle of a payment.

A payment entity consists of the following information:
- amount: the amount of the payment
- payer name: the name of the payer in the form of “name surname”
- beneficiary name: the name of the receiver of the payment in the form of “name surname”

When a payment submission request is received, the system must perform two steps: validation and submission. Below is a detailed description of each step:
- validation: it checks that the amount is present, and that the payer name and beneficiary name are not longer than 15 characters
- submission: it receives a valid payment and simply returns it. This step is skipped if the payment is invalid

Your task is to model the domain and provide an implementation of the validation and submission steps, along with tests. You can use any libraries you would like, but we have provided some samples for your convenience. The entry point of the application is the Main object that we have provided.

The application should create a valid payment and take it through validation and submission. The application should be run via the command line with the sbt run command and should print the amount, payer name and beneficiary name of the submitted payment.

To simplify your task, you can hardcode the payment fields in the application instead of passing them via command line. 