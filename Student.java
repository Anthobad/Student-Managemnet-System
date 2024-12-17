public class Student{
    private String fname; //first name
    private String lname; //last name
    private int id; //students id
    private int acceptanceYear; //the year of acceptance
    private int year; //current year
    private String faculty; //faculty of the student
    private String major; //major
    private boolean didGraduate;

    public Student(String fname, String lname, int id, int startYear, String faculty, int year, String major){
        setName(fname, lname);
        setID(id);
        setCurrentYear(year);
        setMajor(major);
        this.acceptanceYear = startYear;
        setFaculty(faculty);
    }

    public void setName(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }
    public void setMajor(String major){this.major = major;}
    public void setID(int id){this.id = id;}
    public void setFaculty(String faculty){this.faculty = faculty;}
    public void setDidGraduate(boolean didGraduate){this.didGraduate = didGraduate;}
    public void setCurrentYear(int year){this.year = year;}

    public String getName(){
        return fname+" "+lname;
    }
    public String getLName(){return lname;}
    public String getMajor(){return major;}
    public int getID(){return id;}
    public int getYear(){return year;}
    public int getAcceptanceYear(){return acceptanceYear;}
    public String getFaculty(){return faculty;}

    @Override
    public String toString(){
        return String.format("NAME: %-15s | ID: %d | ACCEPTANCE YEAR: %d | FACULTY: %-17s | MAJOR: %-24s", getName(), getID(), getAcceptanceYear(), getFaculty(), getMajor());
    }
}
