public class TowerOfHanoi
{
    public static void hanoi(char A, char B, char C, int n)
    {

        // if only 1 disk is left

        if (n == 1)
            System.out.println("Move " + n + " from rod " + A + " to rod " + C);

        // if more than 1 disk are left

        else
        {
            // move n - 1 disks from 'A' rod to 'C' rod
            hanoi(A, C, B , n - 1);

            // print the current move

            System.out.println("Move " + n + " from rod " + A + " to rod " + C);

            // move n - 1 disks from 'B' rod to 'C' rod

            hanoi(B, C, A, n - 1);
        }
    }

    public static void main(String args[])
    {

        hanoi( 'A', 'C', 'B', 4);

    }
}