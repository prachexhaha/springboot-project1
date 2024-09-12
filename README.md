# springboot-project1

### problem statement



changing of the server port :
1) /main/resources/application.properties
`server.port=9090`


`@GetMapping("employees")`
    `public List<Employee> getAllEmployees` `(@RequestParam` `(required = false) String param)`
    if a param is not passed while testing then you will get a 404 bad request error, so it is better to put the required field as false. so incase a param is not passed also, it will return whatever is there in the function.

without parameter -> 404 bad request
