# Restaurant API
<p>This is a simple RESTful API that provides CRUD (Create, Read, Update, Delete) functionality for managing restaurants.</p>

## Technologies Used
* Java
* Spring Boot
* Maven 

## Getting Started
<p>Clone this repository
</p>

<p>The application will start running at http://localhost:8080.</p>

## API Endpoints
### Get All Restaurants
```Java
GET /restaurants
```
<p>Returns a list of all restaurants in the database.</p>

### Get Restaurant by ID
```Java
GET /restaurants/{id}
```

<p>Returns the restaurant with the specified ID.</p>

### Add Restaurant
```Java
POST /restaurants/add
```

### Add Restaurant
```Java
POST /restaurants/add
```
<p>Adds a new restaurant to the database. The request body should contain the details of the restaurant in JSON format.</p>

### Update Restaurant
```Java
PUT /restaurants/{id}
```
<p>Updates the details of the restaurant with the specified ID. The request body should contain the updated details of the restaurant in JSON format.</p>

### Delete Restaurant
```Java
DELETE /restaurants/{id}
```
<p>Deletes the restaurant with the specified ID.</p>

## Author
<p>Madhur Patari - kmadhur07@gmail.com</p>








