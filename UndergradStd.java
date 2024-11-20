public class UndergradStd extends Student{
    private String major; //major
    private String yeartype; //sophomore, junior, senior
    private int currentYear; //first second thrird ...
    private int yearsNeeded; //years needed for student in a specific major to graduate (eg: 3, 4, 5, 7)

    public UndergradStd(String fname, String lname, int id, int startYear, String faculty, String major, String yeartype){
        super(fname, lname, id, startYear, faculty);
        setMajor(major);
        setYearType(yeartype);
        setCurrentYear(yeartype);
        setYearsNeeded(faculty);
    }
    public void setYearType(String yeartype){this.yeartype = yeartype;}
    public void setMajor(String major){this.major = major;}
    private void setCurrentYear(String yeartype){
        if(yeartype.equals("sophomore"))
            currentYear = 1;
        else if(yeartype.equals("junior"))
            currentYear = 2;
        else if(yeartype.equals("senior"))
            currentYear = 3;
    }
    private void setYearsNeeded(String faculty){
        if(faculty.equals("engineering"))
            yearsNeeded = 5;
        else if(faculty.equals("med"))
            yearsNeeded = 7;
        else if(faculty.equals("business"))
            yearsNeeded = 4;
        else
            yearsNeeded = 3;
    }

    public String getYeartype(){return yeartype;}
    public String getMajor(){return major;}
    public int getYearsUntilGrad(){return yearsNeeded - currentYear;}
    public int getGradYear(){return this.getYear() + this.getYearsUntilGrad();}

    public void advance(){currentYear++;}
}