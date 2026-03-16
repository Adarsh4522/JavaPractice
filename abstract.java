import java.util.Scanner;

class Student {
    double totalMarks;
    double obtainedMarks;

    Student (double totalMarks, double obtainedMarks) {
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;

    }

    double calculatePercentage() {
        return(obtainedMarks/totalMarks)*100;
    }

}

class ScholarshipStudent extends Student {
    ScholarshipStudent(double totalMarks, double obtainedMarks ) {
        super(totalMarks, obtainedMarks);
    }

    @Override
    double calculatePercentage() {
        return super.calculatePercentage()+5;
    }
}

public class abstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) {
            int  n= sc.nextInt();
            int m = sc.nextInt();

            Student ob = new Student(n,m);

            ScholarshipStudent scholStudent = new ScholarshipStrudent(n,m);

            System.out.printf("Student Percentage: %.2f%%\n", ob.calculatePercentage());
            System.out.printf("Scholarship Student Percentage: %2.f%%\n", scholStudent.calculatePercentage());
            
        }

        sc.close();
    }
}
