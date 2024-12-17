import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
public class StudentMagSys{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("Students.txt"));
        PrintStream printUnderGrad = new PrintStream(new File("UnderGradStudents.txt"));
        PrintStream printGrad = new PrintStream(new File("GradStudents.txt"));
        int year = in.nextInt();
        in.nextLine();
        ArrayList<Student> underGrad = new ArrayList<Student>();
        ArrayList<Student> grad = new ArrayList<Student>();
        while(in.hasNextLine()){
            String line = in.nextLine();
            Scanner lineScanner = new Scanner(line);
            if(lineScanner.next().equals("UnderGrad")){
                String fn = lineScanner.next();
                String ln = lineScanner.next();
                int id = lineScanner.nextInt();
                String major = "";
                while(!(lineScanner.hasNextInt())){
                    major = major + lineScanner.next();
                    if(!(lineScanner.hasNextInt()))
                        major = major + " ";
                }
                int accYear = lineScanner.nextInt();
                String faculty = "";
                while(lineScanner.hasNext()){
                    faculty = faculty + lineScanner.next();
                    if(lineScanner.hasNext())
                        faculty = faculty + " ";
                }
                underGrad.add(new UndergradStd(fn, ln, id, accYear, faculty, year, major));
            }
            else{ //if(lineScanner.next().equals("Grad")){
                String fn = lineScanner.next();
                String ln = lineScanner.next();
                int id = lineScanner.nextInt();
                String major = "";
                while(!(lineScanner.hasNextInt())){
                    major = major + lineScanner.next();
                    if(!(lineScanner.hasNextInt()))
                        major = major + " ";
                }
                int accYear = lineScanner.nextInt();
                String thesis = "";
                while(lineScanner.hasNext()){
                    thesis = thesis + lineScanner.next();
                    if(lineScanner.hasNext())
                        thesis = thesis + " ";
                }
                grad.add(new GradStd(fn, ln, id, accYear, year, major, thesis));
            }
        }
        sortStudents(underGrad);
        reorder(underGrad);
        sortStudents(grad);
        printUnderGrad.println("UnderGraduates of year "+year+":");
        int underGradCount = 1;
        for(Student s:underGrad){
            printUnderGrad.printf("%3d. %s\n", underGradCount, s);
            underGradCount++;
        }
        printGrad.println("Graduates of year "+year+":");
        int gradCount = 1;
        for(Student s:grad){
            printGrad.printf("%3d. %s\n", gradCount, s);
            gradCount++;
        }
    }
    //method to sort the students by alphabetical order of there last name
    public static void sortStudents(ArrayList<Student> students){
        int nbOfStd = students.size();
        for(int i = 0; i < nbOfStd -1; i++){
            for(int j = 0; j < nbOfStd -1 -i; j++){
                if((students.get(j).getLName()).compareTo(students.get(j+1).getLName()) > 0){
                    Student temp = students.get(j);
                    students.set(j, students.get(j+1));
                    students.set(j+1, temp);
                }
            }
        }
    }
    //reorder method to put all that graduated on top ingnoring sorting
    public static void reorder(ArrayList<Student> students){
        int nbOfStd = students.size();
        int j = 0;
        for(int i = 0; i < nbOfStd -1; i++){
            if(((UndergradStd)(students.get(i))).didGraduate()){
                Student temp = students.get(i);
                students.remove(i);
                students.add(j, temp);
                j++;
            }
        }
    }
}