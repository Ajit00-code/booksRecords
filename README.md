# booksRecords
Book Records is a simple Project of getting Books records through rest-api and display it in a html page. 
Books also contains data of related Author and Publisher of Book.


# What the repository contains

1) BookRecorsManagement-ui - contains UI files
2) BooksRecordManagement-engine - contains Backend Spring-boot project
3) Diagram - ER Diagram and UI-image


# Technologies
- HTML
- CSS
- Javascript
- Spring boot
- REST-API
- MongoDB ( Database )



# How to run the project

Export the both projects (UI and backend) to your local system.

UI Project :
You can directly run index.html file from UI project it doesn't need any configuration.

Backend-Project :
-For backend you need to setup java environment on your system.
-Because it uses mongoDB database, you need to install mongoDB server and need to create database in it with name "booksRecordManagement".
after creating database you have to import 3 json files ( Author-data.json, Book-data.json, Publisher-data.json ) from location 
"booksRecord\BooksRecordManagement-engine\src\main\resources".
- And done you can now run your Back-end project by using any java supported IDE or building the jar.


# where to find data for database

like I mention on above at location - booksRecord\BooksRecordManagement-engine\src\main\resources you can find JSON files for MongoDB database
( Author-data.json, Book-data.json, Publisher-data.json ).


# How UI looks 

![alt text](https://github.com/Ajit00-code/booksRecords/blob/master/BookRecorsManagement-ui/ui-image2.png)


# ER-Diagram

![alt text](https://github.com/Ajit00-code/booksRecords/blob/master/Diagram/bookRecords-ER.jpg)

