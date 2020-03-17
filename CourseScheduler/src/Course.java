import javax.xml.soap.Text;

public class Course {

    //Implement the Course class in the CourseScheduler project.
    // Instantiate Instructor and Textbook objects and use them along with the course name and semester as parameters to the
    // Course constructor. Output the properties of the Course object using the toString() method.
    // You can verify the format of the toString() by comparing it with the file input format described in Problem 4 below.

    private String name;
    private String semester;
    private Instructor instructor;
    private Textbook textbook;

    public Course(){
        name = null;
        semester = null;
        instructor = null;
        textbook = null;
    }

    public Course(String n, String s, Instructor i, Textbook t){
        name = n;
        semester = s;
        instructor = i;
        textbook = t;
    }

    public String toString(){
        return name + ", " + semester + System.lineSeparator() + instructor + System.lineSeparator() + textbook;
    }
}
