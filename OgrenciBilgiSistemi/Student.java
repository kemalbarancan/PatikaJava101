public class Student {
    Course mat;
    Course fizik;
    Course kimya;

    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;


    Student(String name, String stuNo, String classes, Course mat, Course fizik, Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.average = 0.0;
        this.isPass = false;

    }
    void addBulkExamNote(int mat, int fizik, int kimya){
        if(mat >= 0 && mat <= 100){
            this.mat.note = mat;
        }
        if(fizik >= 0 && fizik <=100){
            this.fizik.note = fizik;
        }
        if(kimya >= 0 && kimya <=100){
            this.kimya.note = kimya;
        }
    }
    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }


    public void calcAverage(){
        this.average = (this.mat.note + this.fizik.note + this.kimya.note)/3.0;
    }
    public boolean isCheckPass(){
        calcAverage();
        return this.average>55;
    }

    void printNote(){

        System.out.println(mat.name + " notu: \t" +mat.note);
        System.out.println(fizik.name + " notu: \t" +fizik.note);
        System.out.println(kimya.name + " notu: \t" +kimya.note);
        System.out.println("Ortalamanız: "+this.average);
    }
}
