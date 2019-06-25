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

