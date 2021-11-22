public class destructor {
    public void finalize() {
        System.out.println("object is garbage collected");
    }
    public static void main(String args[]) {
        destructor np1 = new destructor(); // first instantiation of Class destructor
        destructor np2 = new destructor(); // second instantiation of Class destructor
        np1 = null;
        np2 = null;
        System.gc();
        System.out.println("In the Main Method");
    }
}