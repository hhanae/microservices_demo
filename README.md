
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
|-- Client
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
|-- Voiture
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

### Step 1: Create a Spring Boot Project for Client MicroService
* Open your preferred IDE (such as IntelliJ IDEA).
* Create a new Spring Boot project, named client-service.
* Add the necessary dependencies, including Spring Web and Spring Data JPA.
* Create the Client entity.
* Create Client Repository.
* Implement the service.
* Implement the Controller.
* Configure the application.properties file for the Client:
* Modify the main class:
![image](https://github.com/hhanae/microservices_demo/assets/97336261/186881da-86c8-407f-8914-6dafb3d8f80c)


### Step 2: Create a Spring Boot Project for Voiture MicroService
* Open your preferred IDE (such as IntelliJ IDEA).
* Create a new Spring Boot project, named voiture-service
* Add the necessary dependencies, including Spring Web and Spring Data JPA.
* Create the Voiture entity.
* Create Voiture Repository.
* Implement the service.
* Implement the Controller.
* Configure the application.properties file for the Voiture:
![image](https://github.com/hhanae/microservices_demo/assets/97336261/18d05393-480f-434a-afe8-cf96509b7def)
* Modify the main class:
![image](https://github.com/hhanae/microservices_demo/assets/97336261/22b30f6f-c3d9-433d-8bf0-34c95cedb422)

### Step 3: Create a Spring Boot Project for Eureka Server
* Open your IDE.
* Create a new Spring Boot project.
* Add the necessary dependencies, including Eureka Server.
* Annotate the main class with @EnableEurekaServer:
![image](https://github.com/hhanae/microservices_demo/assets/97336261/8839604f-403e-49e5-a7d2-495894a691d4)
* Configure the application.properties file for the Eureka server:
![image](https://github.com/hhanae/microservices_demo/assets/97336261/45da5504-c86f-465f-ad90-924e44e962d5)

### Step 4: Create a Spring Boot Project for Spring Cloud Gateway
* Open your IDE.
* Create a new Spring Boot project.
* Add the necessary dependencies, including Spring Cloud Gateway.
* Create a GatewayConfig class to configure routes:
![image](https://github.com/hhanae/microservices_demo/assets/97336261/994c4acd-08a4-434e-8326-cd0e7bf7c5b0)
* Configure the application.properties file for the gateway:
![image](https://github.com/hhanae/microservices_demo/assets/97336261/19f5a0b1-03e4-43cd-951b-49d0ba796d12)

We can get sure that the microservices are saved successfully by serving this url: http://localhost:8761

![image](https://github.com/hhanae/microservices_demo/assets/97336261/afbba49c-772b-4905-9ef1-4b394afb810e)


### Step 5: Run the Eureka Server, the Gateway, the Client Microservice & the Voiture Microservice
Browse for the microservice clients:
![image](https://github.com/hhanae/microservices_demo/assets/97336261/9a1206ac-475d-472f-83f2-4d2bc9460d14)
Browse for the microservice voitures:
![image](https://github.com/hhanae/microservices_demo/assets/97336261/a48c0937-2cde-4b92-bce2-1122937f637f)


### Step 6: Containerize the app:

First, we generate the jars of each project by running the command below in each service:
```bash
mvn package
```
Before we continue, be sure the jar was generated in the target folder:

![image](https://github.com/hhanae/microservices_demo/assets/97336261/dde949a1-8a3e-4705-8b15-91a090c872c6)

Second, we create a dockerfile in each project and we add its associated jar:
```bash

```
## License

MIT

---

> Portfolio [@hanim_hanae]([https://twitter.com/amit_merchant](https://hanim-hanae.vercel.app/)https://hanim-hanae.vercel.app/)

