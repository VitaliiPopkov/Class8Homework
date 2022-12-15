public class Human {
    String name;
    int age;
    int height;
    int weight;
    String nationality;

    public Human(String name, int age, int height, int weight, String nationality) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getNationality() {
        return nationality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
