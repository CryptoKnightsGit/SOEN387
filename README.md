# SOEN387
Assignments for SOEN387 Fall 2023

Ashiqur Rahman

Zain Khan

## Development Environment and Compilation Instructions

For this specific assignment, we are using Maven in VS Code with the Java extensions, as well as the Community Server extension for Tomcat.

To run the project, you'll need to:

1. Add Tomcat as a server and start it from the "Servers" tab in VS Code on the left side.
2. Right-click on it to add deployment, which is the WAR file called theprj.war.
3. Go to localhost:8080, and select the "theprj" application, which will bring you to the home index.

For staff users, login credentials have been defaulted to:
- Username: staff
- Password: secret

For normal users, any non-blank information is fine.

If recurring errors occur, please run the following command to clean and install the project:
```bash
mvn clean install
