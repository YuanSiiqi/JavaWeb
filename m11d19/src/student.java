/**
 * 作者：ysq
 * 日期: 2020/11/19 16:14
 * 描述:
 */
public class student {
    private String sid;
    private String sname;
    private String age;
    private String sex;
    private String department;
    private String address;
    private String birthplace;

    public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "sid='" + sid + '\'' +
                ", sname='" + sname + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                ", birthplace='" + birthplace + '\'' +
                '}';
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
}
