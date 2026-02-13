public class Student extends Person{

private String studentNo;
private String classs;


//constructor


    public Student(String nameSurname, int age, String id,String studentNo,String classs) {
        super(nameSurname, age, id);
        this.studentNo=studentNo;
        this.classs=classs;
    }

    //getter setter


    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "studentNo='" + studentNo + '\'' +
                ", classs='" + classs + '\'' +
                "} " ;
    }
}
