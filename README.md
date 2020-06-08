
## Ports

Application | Port      
 -------- |---------  
 Album Service | 8080,8081... 
 Spring Cloud Config Server  | 8888  
 Currency Exchange Service | 8000,8001,8002...
 Currency Conversion Service | 8100, 8101, 8102...
 Netflix Eureka Naming Server | 8761
 Netflix Zuul API Gateway Server | 8765
 Zipkin Distributed Tracing Server | 9411
 

## URLs

|     Application       |     URL          |
| ------------- | ------------- |
| Limits Service | http://localhost:8080/limits POST -> http://localhost:8080/actuator/refresh|
|Spring Cloud Config Server| http://localhost:8888/limits-service/default http://localhost:8888/limits-service/dev |
|  Currency Converter Service - Direct Call| http://localhost:8100/currency-converter/from/USD/to/INR/quantity/10|
|  Currency Converter Service - Feign| http://localhost:8100/currency-converter-feign/from/EUR/to/INR/quantity/10000|
| Currency Exchange Service | http://localhost:8000/currency-exchange/from/EUR/to/INR http://localhost:8001/currency-exchange/from/USD/to/INR|
| Eureka | http://localhost:8761/|
| Zuul - Currency Exchange & Exchange Services | http://localhost:8765/currency-exchange-service/currency-exchange/from/EUR/to/INR http://localhost:8765/currency-conversion-service/currency-converter-feign/from/USD/to/INR/quantity/10|
| Zipkin | http://localhost:9411/zipkin/ |
| Spring Cloud Bus Refresh | http://localhost:8080/actuator/bus-refresh |

## VM Argument

-Dserver.port=8001

### Installing Rabbit MQ

#### Windows
- https://www.rabbitmq.com/install-windows.html
- https://www.rabbitmq.com/which-erlang.html
- http://www.erlang.org/downloads
- Video - https://www.youtube.com/watch?v=gKzKUmtOwR4

#### Mac
- https://www.rabbitmq.com/install-homebrew.html

## Zipkin Installation

Quick Start Page
- https://zipkin.io/pages/quickstart

Downloading Zipkin Jar
- https://search.maven.org/remote_content?g=io.zipkin.java&a=zipkin-server&v=LATEST&c=exec

Command to run

You need to specify the absolute path to run the jarfile.
```
RABBIT_URI=amqp://localhost 
java -jar "C:\Graduate\Web Development\practice\Itlize Global\BackEnd\Microsoft Service\JoeLearnMicroserviceFromIn28Mins\microservices\zipkin-server-2.12.9-exec.jar"
```



 
 
 
        