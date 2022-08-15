public class Student {
    String name;
    String stuNo;
    int classes;
    Course fizik;
    Course kimya;
    Course mat;
    double average;
    boolean isPass;

    Student(String name,int classes,String stuNo,Course mat,Course fizik,Course kimya){
    this.name = name;
    this.stuNo = stuNo;
    this.classes = classes;
    this.mat = mat;
    this.fizik = fizik;
    this.kimya = kimya;
    calcAverage();
    this.isPass = false;
    }
    public void addBulkExamNote(int mat,int fizik,int kimya){
        if(mat>=0  && mat<=100){
            this.mat.note = mat;
        }
        if(fizik>=0 && fizik<=100){
            this.fizik.note=fizik;
        }
        if(kimya>=0 && kimya<=100){
            this.kimya.note = kimya;
        }
    }
    public void isPass(){
        calcAverage();
        printNote();
        System.out.println("Ortalama \t    : "+this.average);
        if(this.average>=50){
            System.out.println("Sinifi gecti.");
        }
        else
            System.out.println("Sinifta kaldi.\n");
    }
    public void calcAverage(){
        this.average = (this.fizik.note + this.kimya.note +this.mat.note)/3;
    }
    public void printNote(){
        System.out.println("Ad              : "+this.name);
        System.out.println("Matematik Notu \t: "+this.mat.note);
        System.out.println("Fizik Notu \t    : "+this.fizik.note);
        System.out.println("Kimya Notu \t    : "+this.kimya.note);
    }

}
