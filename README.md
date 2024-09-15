# springboot-project1

### problem statement



changing of the server port :
1) /main/resources/application.properties
`server.port=9090`


`@GetMapping("employees")`
    `public List<Employee> getAllEmployees` `(@RequestParam` `(required = false) String param)`
    if a param is not passed while testing then you will get a 404 bad request error, so it is better to put the required field as false. so incase a param is not passed also, it will return whatever is there in the function.

without parameter -> 404 bad request


for some reason it works without the Autowired annotation


usually you inject dependency into a constuctor(need to study this in more depth)

For we need to JPA entity

entity class is required to make with the table
repo class is required for performing CRUD operations

and for the different layers, you ideally need to make packages that is, make folders.

under application.properties the datasource.url should have port 3306 and the name of the database.

if under the entity code, you do not provide a name to the table then, it picks up the class name by default

flow is like : 
controller ->service layer (where the implementation happens), here you will inject the repo so that the CRUD operations happen.