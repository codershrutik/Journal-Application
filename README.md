# Journal-Application
This project is a journal application, created using Spring Boot.

For this project, inside the com.example.journalApplication folder, I have created different packages which perform various operations.
The controller packages contain the JournalEntryController, HealthCheck, etc. The entity package contains the JournalEntry, etc.

According to software development's best practice, the controllers(endpoints) call the services(which contain the business logic), which calls the repository, which is the form of an interface. The interfaces in the repository extend the MongoRepository interface, which performs the standard CRUD operations in the MongoDB database.
