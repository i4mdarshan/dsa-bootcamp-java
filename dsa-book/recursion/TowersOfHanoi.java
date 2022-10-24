public class TowersOfHanoi {

    // A -> SourcePeg 1,2,3,4
    // B -> AuxPeg
    // C -> DestPeg

    static void move(int n, char sourcePeg, char destPeg, char auxPeg) {
        if (n == 1) {
            System.out.println("Move disk 1 from peg " + sourcePeg + " to " + destPeg);
            return;
        }

        // Move n-1 diska from A -> B
        move(n - 1, sourcePeg, auxPeg, destPeg);

        System.out.println("Move disk "+ n +" from peg " + sourcePeg + " to " + destPeg);

        // Move n -1 disk from B -> C
        move(n - 1, auxPeg, destPeg, sourcePeg);

    }

    public static void main(String args[]) {
        move(4, 'A', 'C', 'B');
    }
}