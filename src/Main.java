public class Main {

    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Sevim", "90550000000", "MAT");
        Teacher t2 = new Teacher("Asim", "90550000001", "FZK");
        Teacher t3 = new Teacher("Yavuz", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ebubekir Mert", 4, "2351",fizik, mat,kimya);
        s1.addBulkExamNote(90,30,65);
        s1.isPass();

        Student s2 = new Student("Semih Gungormez", 4, "9931", fizik, mat,kimya);
        s2.addBulkExamNote(50,50,40);
        s2.isPass();

        Student s3 = new Student("Mehmet Coskun", 4, "9962", fizik, mat,kimya);
        s3.addBulkExamNote(40,35,50);
        s3.isPass();
    }
}
