public class UndergradStd extends Student implements Graduation{
    //private String yeartype; //sophomore, junior, senior
    //private int currentYear; //first second thrird ...
    private int yearsNeeded; //years needed for student in a specific major to graduate (eg: 3, 4, 5, 7)

    public UndergradStd(String fname, String lname, int id, int startYear, String faculty, int year, String major/*, String yeartype*/){
        super(fname, lname, id, startYear, faculty, year, major);
        //setYearType(yeartype);
        //setCurrentYear(yeartype);
        setYearsNeeded(faculty);
    }
    //public void setYearType(String yeartype){this.yeartype = yeartype;}
    /*private void setCurrentYear(String yeartype){
        if(yeartype.equals("sophomore"))
            currentYear = 1;
        else if(yeartype.equals("junior"))
            currentYear = 2;
        else if(yeartype.equals("senior"))
            currentYear = 3;
    }*/
    private void setYearsNeeded(String faculty){
        if(faculty.equals("engineering"))
            yearsNeeded = 5;
        else if(faculty.equals("medicine"))
            yearsNeeded = 7;
        else if(faculty.equals("business"))
            yearsNeeded = 4;
        else
            yearsNeeded = 3;
    }

    //public String getYeartype(){return yeartype;}
    public int getYearsUntilGrad(){
        int x = yearsNeeded - (super.getYear()-super.getAcceptanceYear());
        if(x < 0)
            return 0;
        return x;
    }
    public int getGradYear(){return this.getYear() + this.getYearsUntilGrad();}

    public boolean didGraduate(){
        if((this.getYear()-this.getAcceptanceYear()) > yearsNeeded){
            super.setDidGraduate(true);
            return true;
        }
        super.setDidGraduate(false);
        return false;
    }
    @Override
    public String toString(){
        return String.format("%s | YEARS TILL GRAD: %d | DID GRADUATE: %b", super.toString(), getYearsUntilGrad(), didGraduate());
    }
}