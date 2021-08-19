  <h3 align="center">Kafka Spring Boot Kubernetes Kickstart Template</h3>

  <p align="center">
   This is small project to quickly setup and kickstart development with awesome technologies such as Kafka-Kubernetes-SpringBoot
    <br />

   
</p>



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>   
    <li><a href="#license">License</a></li>

  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

This project is to quickly setup the stack and kicstart development.
Here's why you should use this:
* Setting Kafka on Kubernetes is not easy ( Strimzi has helped certainly)
* Integration SpringBoot with Kafka can be tricky
* Integrating and making this work on top of kubernetes can be difficult for beginners

### Built With

This section should list any major frameworks that you built your project using. Leave any add-ons/plugins for the acknowledgements section. Here are a few examples.
* [Kubernetes](https://kubernetes.io)
* [Kafka](https://kafka.apache.org/)
* [SpringBoot](https://spring.io/projects/spring-boot)

<!-- GETTING STARTED -->
## Getting Started

These are steps to get started with this.

### Prerequisites

1. Install Minikube
2. Set the following parameters
```
minikube config set memory 12000
minikube config set disk-size 50Gib
minikube config set cpus 8
minikube config set vm-driver virtualbox
minikube stop
minikube delete
RD /S /Q .kube
#minikube start --kubernetes-version=v1.17.9
minikube start
minikube addons enable ingress
```

### Installation

1. Create Kafka Namesspace
   ```sh
   kubectl create namespace kafka
   ```
2. Clone the repo
   ```sh
   git clone https://github.com/rebataur/Kafka-Kubernetes-SpringBoot.git
   ```
3. Install Kafka
   ```sh
   kubectl create -f 'https://strimzi.io/install/latest?namespace=kafka' -n kafka
   ```
4. Install Kafka persistence API
   ```sh
   kubectl apply -f https://strimzi.io/examples/latest/kafka/kafka-persistent-single.yaml -n kafka 
   ```



<!-- USAGE EXAMPLES -->
## Usage

1. Install Kafka persistence API
   ```sh
    curl http://{MINIKUBE_IP}:{SERVICE_PORT}/greetings?message=hello; echo
   ```
2. Watch the Command-Processor logs to see the message being consumed.

<!-- LICENSE -->
## License

Apache License

