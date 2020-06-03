public class lklklk {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y;
        if (x > 0) {
            y = 2*x-10;
        }
        else if (x == 0) {
            y = 0;
        } else {
            y = 2 * Math.abs(x) - 1;
        }
        System.out.println(y);

    }

}
