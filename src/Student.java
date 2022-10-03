public class Student {
    String name;
    int stuNo;
    String classses;
    Course C1;
    Course C2;
    Course C3;
    Boolean isPass;
    double average;
    double lAverage1,lAverage2,lAverage3;
    Student(String name,int stuNo,String classses,Course C1,Course C2,Course C3){
        this.name=name;
        this.stuNo=stuNo;
        this.classses=classses;
        this.C1=C1;
        this.C2=C2;
        this.C3=C3;
        System.out.println(C1.ynote);
        this.isPass=false;
    }
    public void addBulkExamVerbalNote(int yTarih,int sTarih,int yFizik,int sFizik,int yMat,int sMat){
        if(yTarih>=0 && yTarih<=100){ this.C1.ynote=yTarih;}
        if(sTarih>=0 && sTarih<=100) {this.C1.snote=sTarih;}
        if (yFizik>=0 && yFizik<=100) {this.C2.ynote=yFizik;}
        if (sFizik>=0 && sFizik<=100) {this.C2.snote=sFizik;}
        if (yMat>=0 && yMat<=100) {this.C3.ynote=yMat;}
        if (sMat>=0 && sMat<=100) {this.C3.snote=sMat;}
    }
    public void isPass() {
        if (this.C1.ynote == 0 || this.C1.snote== 0 || this.C2.ynote == 0||this.C2.snote == 0 || this.C3.ynote == 0|| this.C3.snote == 0 ) {
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
    public void lessonAverage(){
        this.lAverage1=((this.C1.ynote*0.8)+(this.C1.snote*0.2));

        this.lAverage2=((this.C2.ynote*0.8)+(this.C2.snote*0.2));

        this.lAverage3=((this.C3.ynote*0.8)+(this.C3.snote*0.2));

    }
    public void calcAvarage() {
        this.average=(this.lAverage1+this.lAverage2+this.lAverage3)/3;

    }

    public boolean isCheckPass() {
        lessonAverage();
        calcAvarage();
        return this.average > 55;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Tarih Ort Notu : " + this.lAverage1);
        System.out.println("Fizik Ort Notu : " + this.lAverage2);
        System.out.println("Matematik Ort Notu : " + this.lAverage3);
    }


}
