public class str_replace {
    public static void main(String[] args) {
        String str = "Rama had three brothers";
        String strgs[] = str.split(" ");
        for (int i = 0; i < strgs.length; i++) {
            if (strgs[i].equals("Rama")) {
                strgs[i] = "Sham";
            }
        }
        for (int i = 0; i < strgs.length; i++) {
            System.out.print(strgs[i] + " ");
        }
        System.out.println();
    }
}