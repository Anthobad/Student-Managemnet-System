public class GradStd extends Student{
    private String thesisTopic;//the topic that the student bases his thesis on
    public GradStd(String fname, String lname, int id, int startYear, int year, String major, String thesisTopic){
        super(fname, lname, id, startYear, "", year, major);
        setThesis(thesisTopic);
    }
    public void setThesis(String thesisTopic){this.thesisTopic = thesisTopic;}
    public String getThesis(){return thesisTopic;}
    @Override
    public String toString(){
        return String.format("NAME: %-15s | ID: %d | ACCEPTANCE YEAR: %d | MAJOR: %-39s | THESIS TOPIC: %s",getName(), getID(), getAcceptanceYear(), getMajor(), getThesis());
    }
}
