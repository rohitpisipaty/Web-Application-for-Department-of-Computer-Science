# Web-Application-for-Department-of-Computer-Science
# 1. Import the WAR file into Eclipse
# 2. If there are any errors in the project build, please import the JAR files which are part of the zip file ( JAR files can be found in lib folder, refer below for folder structures)

# 3. Start the Tomcat server (The WAR file is compatible with Tomcat version 7)

# 4. Click on index.html and choose Run on server option



# Src folder contains the package Bean which has the following files

# 1. FirstServlet - Front Controller, Servlet file

# 2. Student DAO - Data access object file which interacts with the DB

# 3. DataProcessor - Class file to compute mean and standard deviation

# 4. StudentBean - Bean to hold form field parameters entered by user

# 5. DataBean - Bean to hold mean and standard deviation


# The WebContent folder has the following files:

# 1. WinnerAcknowledgment.jsp - To congratulate user on winning raffle and lists student ID’s fetched from DB

# 2. SimpleAcknowledgment.jsp - To thank the user for taking the survey, lists student ID’s fetched from DB

# 3. Student.jsp - Displays the info requested by user on clicking the hyperlinked student id

# 4. NoSuchStudent.jsp - When the DB returns a null for a query (rare case) , displays no user found


