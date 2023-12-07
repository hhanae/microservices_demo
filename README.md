
<h1 align="center">
  <br>
  Microservices Lab Project
  <br>
</h1>

<h4 align="center">Welcome to the Microservices Lab Project! This project is designed to help you understand the basic concepts of <a href="https://cloud.google.com/learn/what-is-microservices-architecture?hl=fr#:~:text=L'architecture%20de%20microservices%20(ou,%C3%A9l%C3%A9ment%20ayant%20ses%20propres%20responsabilit%C3%A9s.)" target="_blank">microservices architecture</a> in computer science.</h4>

![Microservices_architecture](https://github.com/hhanae/microservices_demo/assets/97336261/4ceb4237-4a9c-41d7-a8c0-bb2a282ff50e)


<p align="center">
  <a href="#how-it-works">Why to work with Microservices Architecture ?</a> •
  <a href="#prerequisites">Prerequisites</a> •
  <a href="#project_structure">Project Stucture</a> •
  <a href="#steps">Steps</a> 
</p>



## How It Works

Microservice architecture aims to provide manageability to large, resource-intensive applications. Since each individual microservice performs one narrowly focused task (application function), they can be updated independently of other components. Thus, scaling and changing existing functionality is carried out with minimal resource consumption and downtime.

As for the principles of operation of a separate microservice, it lies in the fact that when a client generates a request with the help of the user interface, which, through the API gateway, activates the microservice (or several of them) responsible for executing this request.

Thus, even the most complex multi-stage tasks can be implemented with the least resource consumption. At the same time, a combination of various microservices gives companies access to solving a wide variety of problems without requiring the implementation of full-fledged software components with independent interfaces.


## Prerequisites

Creating a microservices project with Spring Boot involves several prerequisites. Here are the key prerequisites you'll need to set up before starting your microservices project:

* Java Development Kit (JDK)
* Integrated Development Environment (IDE) like IntelliJ IDEA
* Knowledge of Spring Boot Features
* Containerization Tool: DOCKER
* Database: MySQL


> **Note**
> Docker is a prerequisities if you want to containerize the project. If you want just to get started with the microservices architecture without containerizing it you don't have to install Docker.


## Project Structure

In this Lab Project, we created two micro-services: client-service & voiture-service. Furthermore, we created a service called Eureka Server which is a service registry that enables microservices to discover and communicate with each other. Finally, we created Spring Cloud Gateway Which is a powerful and flexible API gateway that provides capabilities such as routing, filtering, and load balancing. 

Here is a simplified representation of ou Project Structure:
```bash
microservices-demo
|-- client-service
|   |-- src
|   |   |-- main
|   |       |-- java
|   |       |   |-- org.ensaj.clientservice
|   |       |       |-- ClientServiceApplication.java
|   |       |       |-- model
|   |       |       |   |-- Client.java
|   |       |       |-- repository
|   |       |       |   |-- ClientRepository.java
|   |       |       |-- service
|   |       |           |-- ClientService.java
|   |       |-- resources
|   |           |-- application.properties
|
|-- voiture-service
|   |-- src
|   |   |-- main
|   |       |-- java
|   |       |   |-- org.ensaj.voitureservice
|   |       |       |-- VoitureServiceApplication.java
|   |       |       |-- model
|   |       |       |   |-- Voiture.java
|   |       |       |-- repository
|   |       |       |   |-- VoitureRepository.java
|   |       |       |-- service
|   |       |           |-- VoitureService.java
|   |       |       |-- resources
|   |       |           |-- application.properties
|
|-- eureka-server
|   |-- src
|   |   |-- main
|   |       |-- java
|   |       |   |-- org.ensaj.eurekaserver
|   |       |       |-- EurekaServerApplication.java
|   |       |       |-- resources
|   |       |           |-- application.properties
|
|-- gateway-service
|   |-- src
|   |   |-- main
|   |       |-- java
|   |       |   |-- org.ensaj.gateway
|   |       |       |-- GatewayServiceApplication.java
|   |       |       |-- config
|   |       |           |-- GatewayConfig.java
|   |       |       |-- resources
|   |       |           |-- application.properties

```


## Steps

provide you with a step-by-step guide on how to create separate Spring Boot projects for the client service, voiture service, Eureka server, and Spring Cloud Gateway.

### Step 1: Create a Spring Boot Project for Client Service
* Open your preferred IDE (such as IntelliJ IDEA).
* Create a new Spring Boot project, named client-service
* Add the necessary dependencies, including Spring Web and Spring Data JPA.
* Create the Client entity:
* Create Client Repository:
* Implement the service:
* Implement the Controller:
### Step 2: Create a Spring Boot Project for Voiture Service
* Open your preferred IDE (such as IntelliJ IDEA).
* Create a new Spring Boot project, named client-service
* Add the necessary dependencies, including Spring Web and Spring Data JPA.
* Create the Client entity:
* Create Client Repository:
* Implement the service:
* Implement the Controller:
### Step 3: Create a Spring Boot Project for Eureka Server
* Open your preferred IDE (such as IntelliJ IDEA).
* Create a new Spring Boot project, named client-service
* Add the necessary dependencies, including Spring Web and Spring Data JPA.
* Create the Client entity:
* Create Client Repository:
* Implement the service:
* Implement the Controller:
### Step 4: Create a Spring Boot Project for Spring Cloud Gateway
* Open your preferred IDE (such as IntelliJ IDEA).
* Create a new Spring Boot project, named client-service
* Add the necessary dependencies, including Spring Web and Spring Data JPA.
* Create the Client entity:
* Create Client Repository:
* Implement the service:
* Implement the Controller:
### Step 5: Containerize the app:

## You may also like...

- [Pomolectron](https://github.com/amitmerchant1990/pomolectron) - A pomodoro app
- [Correo](https://github.com/amitmerchant1990/correo) - A menubar/taskbar Gmail App for Windows and macOS

## License

MIT

---

> [amitmerchant.com](https://www.amitmerchant.com) &nbsp;&middot;&nbsp;
> GitHub [@amitmerchant1990](https://github.com/amitmerchant1990) &nbsp;&middot;&nbsp;
> Twitter [@amit_merchant](https://twitter.com/amit_merchant)

