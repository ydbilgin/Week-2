
public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ali","555","TRH");
        Teacher t2 = new Teacher("Veli","111","BIO");
        Teacher t3 = new Teacher("Mahmut","222","FIZ");
        Course c1 = new Course("Tarih" , "101" , "TRH");
        Course c2 = new Course("Biyoloji" , "101", "BIO");
        Course c3 = new Course("Fizik" , "101","FIZ");

        Student s1 = new Student ("Ahmet","133","4",c1,c2,c3);
        s1.addBulkExamNote(70,55,30);
        s1.addBulkSozluNote(80,60,20);
        Student s2 = new Student ("Mehmet","144","4",c1,c2,c3);
        s2.addBulkExamNote(20,55,30);
        s2.addBulkSozluNote(33,60,20);
        Student s3 = new Student ("Cemal","155","4",c1,c2,c3);
        s3.addBulkExamNote(100,55,80);
        s3.addBulkSozluNote(100,100,80);


        c1.addTeacher(t1);
        c2.addTeacher(t2);
        c3.addTeacher(t3);

        s1.isPass();
        s2.isPass();
        s3.isPass();






    }

}