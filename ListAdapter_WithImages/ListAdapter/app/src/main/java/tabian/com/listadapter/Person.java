package tabian.com.listadapter;

/**
 * Created by User on 3/14/2017.
 */

public class Person {
    private String name;
    private String birthday;
    private String sex;
    private String imgURL;

    public Person(String name, String birthday,  String sex, String imgURL) {
        this.birthday = birthday;
        this.name = name;
        this.sex = sex;
        this.imgURL = imgURL;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
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
