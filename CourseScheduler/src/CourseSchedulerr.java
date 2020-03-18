
import java.util.*;
import java.io.*;

public class CourseSchedulerr {
    public static void main(String[] args){
        //problem 1
        Instructor prof1 = new Instructor();
        Instructor prof2 = new Instructor("Bingo", "Bongo", "Ya moms house", 1230);
        System.out.println(prof1.toString());
        System.out.println(prof2.toString());        //problem 2
        System.out.println();
        Textbook book1 = new Textbook();
        Textbook book2 = new Textbook("John", "Cena", 89);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        //problem 3
        System.out.println();
        Course course1 = new Course();
        Course course2 = new Course("Intro to Programming", "Fall", prof1, book1);
        Course course3 = new Course("Intermediate Programming", "Spring", prof2, book2);
        System.out.println(course1.toString());
        System.out.println(course2.toString());
        System.out.println(course3.toString());

        //problem 4
        ArrayList<Course> courses = new ArrayList<Course>();
        String in = "coursedata.txt";
        try {
            readCourseData(courses, in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readCourseData(ArrayList courses, String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        while(input.hasNextLine()) {
            String wat = input.nextLine();
            String[] info = wat.split(",");
            String name = info[0];
            String semester = info[1];
            String the = input.nextLine();
            String[] info2 = the.split("\\* ");
            String fname =  info2[0];
            String lname =  info2[1];
            String building =  info2[2];
            int num =  Integer.parseInt(info2[3]);
            Instructor ins = new Instructor(fname, lname, building, num);
            String title =  input.nextLine();
            String pub =  input.nextLine();
            int ed =  Integer.parseInt(input.nextLine());
            Textbook book = new Textbook(title, pub, ed);
            Course course = new Course(name, semester, ins, book);
            courses.add(course);
            System.out.println(course.toString());
        }
    }
}
