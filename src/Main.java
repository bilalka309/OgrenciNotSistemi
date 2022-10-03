public class Main {
    public static void main(String[] args) {
        Teacher T1=new Teacher("AHMET","000","TRH");
        Teacher T2=new Teacher("ADEM","000","FZK");
        Teacher T3=new Teacher("BİLAL","000","MTMTK");

        Course C1=new Course("TARİH","101","TRH");
        Course C2=new Course("FİZİK","101","FZK");
        Course C3=new Course("MATEMATİK","101","MTMTK");

        C1.addTeacher(T1);
        C2.addTeacher(T2);
        C3.addTeacher(T3);

        Student s1 = new Student("İnek Şaban", 4, "140144015",C1, C2, C3);
        s1.addBulkExamVerbalNote(50,20,40,65,62,58);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", C1, C2, C3);
        s2.addBulkExamVerbalNote(50,36,90,65,23,58);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", C1, C2, C3);
        s3.addBulkExamVerbalNote(50,60,70,65,62,89);
        s3.isPass();

        s2.printNote();
        s3.printNote();
        s1.printNote();


    }
}