# Email-Subscription-using-Servlet
This project is a fully functional Java Servlet-based Email Subscription System built using HTML, CSS, JSP/Servlets, and Apache Tomcat. It allows users to enter their details—including name, email, gender, and interests. The project demonstrates core web development concepts such as servlets, request handling, MVC structure, database connectivity.

# Features
Responsive and styled HTML subscription form
Handles POST requests using a Servlet
Validates and processes user details
Displays a success or error message
Deployable on Apache Tomcat
Clean directory structure for easy understanding

# Project Structure
 <img width="435" height="625" alt="image" src="https://github.com/user-attachments/assets/71495bb8-ad29-42c8-a74e-35bfbdfa3af1" />

# How to Run the Project
1. Install Requirements
Java JDK 21 or above
Apache Tomcat 9
VS Code with Java extensions

2. Compile the Servlet
Open VS Code Terminal inside project folder:
javac -cp "C:\Program Files\Apache Software Foundation\Tomcat 9.0\lib\servlet-api.jar;." -d build\classes src\com\subscription\EmailSubscriptionServlet.java

3. Create WAR File
Inside project root:
jar cvf EmailSubscription.war -C WebContent . -C build\classes .

4. Deploy to Tomcat
Copy WAR file:
copy EmailSubscription.war "C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps\"

5. Start Tomcat
cd "C:\Program Files\Apache Software Foundation\Tomcat 9.0\bin"
startup.bat

6. Access the Application
Open your browser:
   http://localhost:8080/EmailSubscription/
   Form submits to: /EmailSubscription/SubscribeServlet
