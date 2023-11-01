package biconsumer2;

public class Patients {
    private String name;
    private String disease;
    private int age;

    public Patients(String name, String disease, int age) {
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "patients{" +
                "name='" + name + '\'' +
                ", disease='" + disease + '\'' +
                ", age=" + age +
                '}';
    }
}
