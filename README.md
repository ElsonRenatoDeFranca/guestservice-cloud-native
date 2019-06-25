# guestservice-cloud-native

Spring has given a starter project for actually becoming a client of the config server. One of benefits of using that client, it is allows us to bootstrap to that config server and get our config at the appropriate point of bean lifecycle.

A cloud native webservice must be developed with the following changes in mind:

1- The guestservice must be registered to Eureka server as an Eureka client. We must do that by adding the following annotation to the main class:

@EnableDiscoveryClient
public class GuestCloudNativeMicroservice {

	public static void main(String[] args) {
		SpringApplication.run(GuestCloudNativeMicroservice.class, args);
	}
}

2- We also need to add the following dependencies to the pom.xml file

<dependency>
    <groupId>org.springframework.cloud</groupId>
     <artifactId>spring-cloud-starter-config</artifactId>
</dependency>

<dependency>
     <groupId>org.springframework.cloud</groupId>
     <artifactId>spring-cloud-starter-eureka</artifactId>
     <version>1.4.7.RELEASE</version>
</dependency>

