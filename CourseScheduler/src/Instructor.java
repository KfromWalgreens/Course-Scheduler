public class Instructor {

    private String firstname;
    private String lastname;
    private String officebuilding;
    private int roomnum;

    public Instructor(){
        firstname = "Albert";
        lastname = "Einstein";
        officebuilding = "McNair";
        roomnum = 420;
    }

    public Instructor(String fname, String lname, String building, int num){
        firstname = fname;
        lastname = lname;
        officebuilding = building;
        roomnum = num;
    }

    public String toString(){
        return firstname + "*" + lastname + "*" + officebuilding + "*" + roomnum;
    }

}
