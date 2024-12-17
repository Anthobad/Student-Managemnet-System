# **README for Java Student Management System**

## **Overview**
This project consists of several Java classes that form a simple student management system. The purpose of these classes is to model student data and provide functionalities related to student information, particularly for undergraduate and graduate students. The system allows for the input, processing, and output of student data-including personal details, academic records, and thesis topics-in two .txt files one for undergrad and another for grad and sorted alphabeticaly by family name.

## **Classes**

### 1. Student Class
The `Student` class represents a general student entity. It includes attributes and methods to manage the student's basic information.

#### Attributes:
- **fname**: First name of the student.
- **lname**: Last name of the student.
- **id**: Unique identification number for the student.
- **acceptanceYear**: The year the student was accepted.
- **year**: The current year of study.
- **faculty**: The faculty to which the student belongs.
- **major**: The major field of study.
- **didGraduate**: Graduation status of the student.

#### Constructor:
> `Student(String fname, String lname, int id, int startYear, String faculty, int year, String major)`: _Initializes a new instance of the Student class with the provided first name, last name, ID, acceptance year, faculty, current year, and major._

#### Methods:
- **setName(String fname, String lname)**: Sets the first and last name of the student.
- **setID(int id)**: Sets the ID of the student.
- **setFaculty(String faculty)**: Sets the faculty of the student.
- **setMajor(String major)**: Sets the major of the student.
- **setDidGraduate(boolean didGraduate)**: Sets the graduation status of the student.
- **setCurrentYear(int year)**: Sets the current year of study.
- **getName()**: Returns the full name of the student.
- **getLName()**: Returns the last name of the student.
- **getMajor()**: Returns the major of the student.
- **getID()**: Returns the ID of the student.
- **getYear()**: Returns the current year of study.
- **getAcceptanceYear()**: Returns the year the student was accepted.
- **getFaculty()**: Returns the faculty of the student.
- **toString()**: Returns a formatted string representation of the student.

### 2. UndergradStd Class
The `UndergradStd` class extends the `Student` class and represents an undergraduate student. It adds additional attributes and methods specific to undergraduate studies.

#### Attributes:
- **yearsNeeded**: The number of years required to graduate based on the major.

#### Constructor:
> `UndergradStd(String fname, String lname, int id, int startYear, String faculty, int year, String major)`: _Initializes a new instance of the UndergradStd class with the provided attributes, including major._

#### Methods:
- **setYearsNeeded(String faculty)**: Determines and sets the years needed to graduate based on the faculty.
- **getYearsUntilGrad()**: Calculates and returns the number of years remaining until graduation.
- **getGradYear()**: Calculates and returns the expected graduation year.
- **didGraduate()**: Checks if the student has graduated based on the years needed and updates the graduation status.
- **toString()**: Returns a formatted string representation of the undergraduate student, including years until graduation and graduation status.

### 3. GradStd Class
The `GradStd` class extends the `Student` class and represents a graduate student. It includes thesis topic management.

#### Attributes:
- **thesisTopic**: The topic of the student's thesis.

#### Constructor:
> `GradStd(String fname, String lname, int id, int startYear, int year, String major, String thesisTopic)`: _Initializes a new instance of the GradStd class with the provided attributes, including thesis topic._

#### Methods:
- **setThesis(String thesisTopic)**: Sets the thesis topic for the graduate student.
- **getThesis()**: Returns the thesis topic of the graduate student.
- **toString()**: Returns a formatted string representation of the graduate student, including the thesis topic.

### 4. Graduation Interface
The `Graduation` interface defines the graduation logic for students.

#### Methods:
- **didGraduate()**: Method to check if a student has graduated.

### 5. StudentMagSys Class
The `StudentMagSys` class is the main application that handles the reading, processing, and output of student data.

#### Methods:

### 1. `public static void main(String[] args) throws FileNotFoundException`
- **Description**: The entry point of the application.
- **Functionality**: Reads student data from `Students.txt`, creates `UndergradStd` and `GradStd` objects, sorts the students, and outputs the results to `UnderGradStudents.txt` and `GradStudents.txt`.

### 2. `public static void sortStudents(ArrayList<Student> students)`
- **Description**: Sorts the list of students by their last names.
- **Parameters**: 
  - `ArrayList<Student> students`: The list to be sorted.

### 3. `public static void reorder(ArrayList<Student> students)`
- **Description**: Reorders undergraduate students to place graduated students at the top.
- **Parameters**: 
  - `ArrayList<Student> students`: The list of undergraduate students.

## **Usage**
1. Ensure the `Students.txt` file is formatted correctly.
2. Compile and run the `StudentMagSys.java` file.
3. Check the output files `UnderGradStudents.txt` and `GradStudents.txt` for organized student information.

## **Conclusion**
The `StudentMagSys` class is essential for managing student data, providing functionalities to read, process, and output student information efficiently.
