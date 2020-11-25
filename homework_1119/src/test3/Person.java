package test3;

/**
 * 作者：ysq
 * 日期: 2020/11/19 19:53
 * 描述:
 */
public class Person {
    private String id;
  private String name;
    private String age;
    private String address;
    private String sex;
    private float weight;
    private float height;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
