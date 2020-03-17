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
    }
}
