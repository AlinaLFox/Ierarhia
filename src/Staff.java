import javax.management.remote.rmi._RMIConnection_Stub;

public class Staff extends Person {

    private String school;
    private double pay;

    public Staff (String name, String adress, String school, double pay) {
        this.name = name;
        this.adress = adress;
        this.pay = pay;
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Staff{" + "name='" + name + ", adress='" + adress +
                "school='" + school + '\'' + ", pay=" + pay + '}';
    }
}
