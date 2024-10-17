import java.util.Scanner;

public class Student
{
    // Instance variables
    String studentRollNo;
    String studentName;
    String mobileNumber;
    int[] subjectMarks;

    // Instance method
    public void setStudentRollNo(String studentRollNo)
    {
        this.studentRollNo = studentRollNo;
    }
    
    // Corrected: Added missing setter method for studentName
    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public void setMobileNumber(String mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }
    
    public void setSubjectMarks(int[] subjectMarks)
    {
        this.subjectMarks = subjectMarks;
    }

    public String getStudentRollNo(){
        return this.studentRollNo;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public String getMobileNumber(){
        return this.mobileNumber;
    }

    public int[] getSubjectMarks(){
        return this.subjectMarks;
    }

    public static void main(String[] args){
        // Corrected: Scanner object creation
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        
        System.out.println("Enter Student RollNo: ");
        String studentRollNo = scanner.nextLine();
        student.setStudentRollNo(studentRollNo);

        System.out.println("Enter Student Name: ");
        String studentName = scanner.nextLine();
        // Corrected: Changed method to set studentName
        student.setStudentName(studentName);

        System.out.println("Enter Student MobileNumber: ");
        String mobileNumber = scanner.nextLine();
        // Corrected: Changed method to set mobileNumber
        student.setMobileNumber(mobileNumber);

        System.out.println("Enter number of Subjects: ");
        int n = scanner.nextInt();
        // Added to consume the newline character left by nextInt()
        scanner.nextLine(); 

        int[] subjectMarks = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter subject " + (i + 1) + " marks:");
            subjectMarks[i] = scanner.nextInt();
            // Added to consume the newline character left by nextInt()
            scanner.nextLine(); 
        }
        student.setSubjectMarks(subjectMarks);

        System.out.println("Student Roll No: " + student.getStudentRollNo());
        System.out.println("Student Name: " + student.getStudentName());
        // Corrected: Changed print statement to show mobile number
        System.out.println("Student Mobile Number: " + student.getMobileNumber());
        
        subjectMarks = student.getSubjectMarks();
        for(int i=0; i<subjectMarks.length; i++)
            System.out.println("Subject " + (i + 1) + " Marks: " + subjectMarks[i]);
    }
}