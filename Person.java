import java.util.Objects;

public class Person {
    private String IDNum;
    private String firstName;
    private String lastName;
    private int YOB;
    static private int IDSeed = 1;
    public static void setIDSeed(int IDSeed) { Person.IDSeed = IDSeed;}
    public static int getGetIDSeed(){ return IDSeed;}

    public Person(String IDNum, String firstName, String lastName, int YOB) {
        this.IDNum = IDNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.YOB = YOB;
    }
    public Person(String firstName, String lastName, int YOB) {
        this.IDNum = this.getIDNum();
        this.firstName = firstName;
        this.lastName = lastName;
        this.YOB = YOB;
    }
    public String getIDNum() {
        return IDNum;
    }

    public void setIDNum(String IDNum) {
        this.IDNum = IDNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "IDNum='" + IDNum + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", YOB=" + YOB +
                '}';
    }
}
