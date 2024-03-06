public class GirlsGettingGradeA {
    public static void main(String[] args) {
        int totalStudents = 90;
        int boys = 45;
        double gradeAPercentage = 50.0;
        int gradeABoys = 20;

        int gradeAStudents = (int) ((gradeAPercentage / 100) * totalStudents);
        int girls = totalStudents - boys;
        int gradeAGirls = gradeAStudents - gradeABoys;

        System.out.println("Total number of girls getting grade 'A'= " + gradeAGirls);
    }
}
