public class Person { // POJO class

  private  String nameSurname;
    private  int age;
    private   String id;


    public Person(String nameSurname, int age, String id) {
        this.nameSurname = nameSurname;
        this.age = age;
        this.id = id;
    }


    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nameSurname='" + nameSurname + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
