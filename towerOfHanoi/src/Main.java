public class Main {
    public static void towerOfHanoi(int n, String source, String destination, String auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
        } else {

            towerOfHanoi(n - 1, source, auxiliary, destination);


            System.out.println("Move disk " + n + " from " + source + " to " + destination);


            towerOfHanoi(n - 1, auxiliary, destination, source);
        }
    }

    public static void main(String[] args) {
        int numberOfDisks = 3;

        
        String sourceRod = "A";
        String destinationRod = "C";
        String auxiliaryRod = "B";


        towerOfHanoi(numberOfDisks, sourceRod, destinationRod, auxiliaryRod);
    }
}
