public class Student {
    private String fname; //first name
    private String lname; //last name
    private int id; //students id
    private int year; //the current year of acceptance
    private String faculty; //faculty of the student

    public Student(String fname, String lname, int id, int startYear, String faculty){
        setName(fname, lname);
        setID(id);
        this.year = startYear;
        setFaculty(faculty);
    }

    public void setName(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }
    public void setID(int id){this.id = id;}
    public void setFaculty(String faculty){this.faculty = faculty;}

    public String getName(){
        return fname+" "+lname;
    }
    public int getID(){return id;}
    public int getYear(){return year;}
    public String getFaculty(){return faculty;}
}
