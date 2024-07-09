public class MagicalArenaTest{

    public static void main(String[] args) {
        
        MagicalArena magicalArenaobj = new MagicalArena();

        int[] maxhealths = {100, 95, 70, 85};
        int[] maxstrengths = {20, 18, 10, 8};
        int[] maxattacks = {50, 40 ,35, 15};
        String winner;
        int awins =0; 
        int bwins =0;

        for(int i=0; i<4; i++){
            winner = magicalArenaobj.getReady(maxhealths[i], maxstrengths[i], maxattacks[i]);
            if (winner.equals("A")) {
                awins++;
            }
            else{
                bwins++;
            }
        }
        System.out.printf("A won : %d times %nB won : %d times",awins,bwins);
    }
}