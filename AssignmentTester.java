public class AssignmentTester
 {
    public static void main(String[] args)
	{
        int result1 = Assignment.numberOfSubject();
        double result2 = Assignment.marksGeting();
        String result3 = Assignment.subjectName();
        boolean result4 = Assignment.havePassed();
        char result5 = Assignment.finalAssignment();

        System.out.println("number of subject is: " + result1);
        System.out.println("marks getting: " + result2);
        System.out.println("subject name: " + result3);
        System.out.println("i have passed in this subject: " + result4);
        System.out.println("is this final assignment: " + result5);
    }
}
