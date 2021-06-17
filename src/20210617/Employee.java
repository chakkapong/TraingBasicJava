public class Employee {
    private int id;
    private  String fname;
    private  String lname;
    private  String pos;
    public  Employee(){
        this("?","?");
    }
    public  Employee(String fname, String lname){
       this.fname = fname;
       this.lname = lname;
    }
    void doSmt(){

    }
    public String getFullName() {
        return fname + " : " + lname;
    }

    String getPositionName(){
        return  "";
    }
}
