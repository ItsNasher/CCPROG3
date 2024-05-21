import java.util.Scanner;
public class UniversityAccount{
    private String idNumber;
    private String name;
    private Boolean isTeacher;

    public UniversityAccount (String idNumber, String name, Boolean isTeacher){
        this.idNumber = idNumber;
        this.name = name;
        this.isTeacher = isTeacher;
    }

    public static void displayRecord(String idNumber, String name, Boolean isTeacher){
        if (isTeacher){
            System.out.println("Account type: Teacher" + " " + idNumber + " " + name);
        }
        else if (!isTeacher){
            System.out.println("Account type: Student" + " " + idNumber + " " + name);
        }
    }
    public static UniversityAccount createRecord(){
        UniversityAccount c;
        String ID = "", name = "", input = "";
        Boolean teacher = null;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ID: ");
        ID = s.nextLine();
        System.out.print("Enter name: ");
        name = s.nextLine();
        System.out.print("Is this a teacher? (Yes/No): ");
        input = s.nextLine();
        if (input.equals("Yes"))
            teacher = true;
        else
            teacher = false;

        c = new UniversityAccount (ID, name, teacher);
        return c;
    }
    public String getIdNumber(){
        return this.idNumber;
    }

    public String getName(){
        return this.name;
    }

    public Boolean getisTeacher(){
        return this.isTeacher;
    }

    public static void main (String[] args){
        String idNumber, name;
        //UniversityAccount[] records = new UniversityAccount[20];
        //int n = records.length;
        UniversityAccount e = createRecord();
        displayRecord(e.getIdNumber(), e.getName(), e.getisTeacher());
    }
}