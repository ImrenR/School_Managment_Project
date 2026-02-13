public class Teacher extends Person {


    //Fields

    private int sicilNo;
    private String bolum;

    public Teacher(String nameSurname, int age, String id, int sicilNo, String bolum) {
        super(nameSurname, age, id);
        this.sicilNo = sicilNo;
        this.bolum = bolum;
    }

    //getter setter


    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    public String  getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return super.toString() +
                "sicilNo=" + sicilNo +
                ", bolum=" + bolum +
                "} " ;
    }
}
