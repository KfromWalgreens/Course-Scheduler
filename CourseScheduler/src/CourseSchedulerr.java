public class CourseSchedulerr {
    public static void main(String[] args){
        //problem 1
        Instructor prof1 = new Instructor();
        Instructor prof2 = new Instructor("Bingo", "Bongo", "Ya moms house", 1230);
        System.out.println(prof1.toString());
        System.out.println(prof2.toString());
        //problem 2
        Textbook book1 = new Textbook();
        Textbook book2 = new Textbook("John", "Cena", 89);
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}
