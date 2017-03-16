package tabian.com.listadapter;

/**
 * Created by User on 3/14/2017.
 */

public class Person {
    private String name;
    private String birthday;
    private String sex;

    public Person(String name, String birthday,  String sex) {
        this.birthday = birthday;
        this.name = name;
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
