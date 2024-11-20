# **README for Java Student Management System**
## **Overview**
This project consists of two Java classes, Student and UndergradStd, which are part of a simple student management system. The purpose of these classes is to model student data and provide functionalities related to student information, particularly for undergraduate students. (To be continued...)

## Classes
## 1. Student Class
The Student class represents a general student entity. It includes attributes and methods to manage the student's basic information.

### Attributes:
- fname: First name of the student.
- lname: Last name of the student.
- id: Unique identification number for the student.
- year: The year the student was accepted.
- faculty: The faculty to which the student belongs.
### Constructor:
> Student(String fname, String lname, int id, int startYear, String faculty): _Initializes a new instance of the Student class with the provided first name, last name, ID, start year, and faculty._
### Methods:
- setName(String fname, String lname): Sets the first and last name of the student.
- setID(int id): Sets the ID of the student.
- setFaculty(String faculty): Sets the faculty of the student.
- getName(): Returns the full name of the student.
- getID(): Returns the ID of the student.
- getYear(): Returns the year the student was accepted.
- getFaculty(): Returns the faculty of the student.

## 2. UndergradStd Class
The UndergradStd class extends the Student class and represents an undergraduate student. It adds additional attributes and methods specific to undergraduate studies.

### Attributes:
- major: The student's major field of study.
- yeartype: The current year type of the student (e.g., sophomore, junior, senior).
- currentYear: Represents the current year of study (0 for freshman, 1 for sophomore, etc.).
- yearsNeeded: The number of years required to graduate based on the major.
### Constructor:
> UndergradStd(String fname, String lname, int id, int startYear, String faculty, String major, String yeartype): _Initializes a new instance of the UndergradStd class with the provided attributes, including major and year type._
### Methods:
- setYearType(String yeartype): Sets the year type of the undergraduate student.
- setMajor(String major): Sets the major of the undergraduate student.
- setCurrentYear(String yeartype): Determines and sets the current year of study based on the year type.
- setYearsNeeded(String faculty): Determines and sets the years needed to graduate based on the faculty.
- getYeartype(): Returns the year type of the undergraduate student.
- getMajor(): Returns the major of the undergraduate student.
- getYearsUntilGrad(): Calculates and returns the number of years remaining until graduation.
- getGradYear(): Calculates and returns the expected graduation year.
- advance(): Increments the current year of study by one.
