Description
Problem name
[Core Java] Hotel management system
Problem statement
You are given two Java classes, Reservation and Room. The objective is to complete the functions present in the HotelManagementSystem.java class.

Technical specifications

Tech stack 
Backend: Java
Ports 
Backend: 8000
Tasks

Check room availability for a specific date range
Find reservations by guest name
Calculate the total revenue generated. Note: Check RoomType.java for the price of each room type
Reserve a room
Cancel a reservation
Calculate the occupancy rate of rooms
Find available rooms by their room type
Check room availability for a specific date
Calculate the revenue for a specific date range. Note: Check RoomType.java for the price of each room type
Find reservations for a specific date range
Find reservations by the room number
Check room availability by the room number
Testing instructions

To run any additional commands, use the Terminal. For example, navigate to the '/backend' directory in the Terminal and use the command: mvn compile
Upon clicking the Run code or Submit code buttons, access the Build log or Execution log to review comprehensive details about the test outcomes.
Submission instructions

Clicking Run code compiles and runs your code against sample tests, but it will not generate scores.
Clicking Submit code runs your code against multiple test cases, assessing different scenarios holistically, and the score will be assigned accordingly.

**Project source**
backend

**Build commands**
mvn clean install -DskipTests=true

**Deploy commands**
echo "Done"

**Sample Evaluation commands**
mvn clean test -Dtest=sampleTest
junit-merge -o xunitreport.xml -d target/surefire-reports/

**Evaluation commands**
mvn clean test -Dtest=mainTest
junit-merge -o xunitreport.xml -d target/surefire-reports/

**Evaluation report path**
xunitreport.xml
