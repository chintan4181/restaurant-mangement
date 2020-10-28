# restaurant-mangement
REST API using Spring Boot.

### Techonologies & Tools
* Maven
* Spring Boot

<p>


![Image of restaurant-management system](https://github.com/chintan4181/restaurant-mangement/blob/master/Restaurant-management.png)

### Assumptions:Below aussumptions have made due to time constraints and simplicity.
  
  - To make it simple due to time limitations, all below services are bundled in one Spring Boot project. However for microservices, we can create 3 different spring boot services. Inter service communication can be implemented using Eureka Server.
  - JSON sample request are not embedeed for APIs. 

There are 3 REST services for this system
- <b>Restaurant Service</b>: customer can book tables using this service<br/>
    POST: /tables -  book tables from list of available tables<br/>
    GET: /tables - retrieve all tables for this restaurant<br/>
    GET: /tables/{id} - retrieve table by id to check if it's already reserved or not.<br/>
    
- <b>Order Service</b>: customer can place order using Order Service<br/>

    POST: /orders - creating new order<br/>
    GET: /orders/{id} - get order by id<br/>
    DELETE: /orders/{id} - delete order by id<br/>
  
- <b>Menu Service</b>: customer can browse menu using this service.
  
    POST: /menus - create new menus <br/>( <b>Note:</b> This is for Restaurant Administrator and not for customer. Due to simplicity authentication/authorization is not emebedded in the service, but it can be implemented using Spring Security)<br/>
    GET: /menus/{id} - retrieves menu details by id<br/>
    GET: /menus/ - retrieves all menues for this restaurant<br/>
  
  
  
  
  

