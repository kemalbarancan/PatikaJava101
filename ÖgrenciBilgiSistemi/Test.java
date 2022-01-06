public class Test {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("Ali Hoca", "TRH", "333");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Külyutmaz", "BIO","1111");
        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji","101","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "1234", "4",tarih, fizik, biyo );
        s1.addBulkExamNote(100,80,20);
        s1.isPass();

        Student s2 = new Student("Ali Veli", "12345", "3", tarih, fizik, biyo);
        s2.addBulkExamNote(60,70,70);
        s2.isPass();
    }
}
