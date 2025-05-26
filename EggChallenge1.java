public class EggChallenge1 {
    //for this challenge we have a building of n floors and 2 eggs
    //two outcomes, drop the egg, 1 it survives (safe floor) 2 breaks( too high)
    //goal is to find the highest safest floor with few drops.


    public static int EggDrop(int floor, int eggs) {


        if (floor == 0 || eggs == 0) {
            return 0;
        }  //ground floor no neeed to throw


        if(eggs == 1){
            return floor;
        }
        if(floor== 1){  //if you have only 1 floor
            return 1;
        }
        int safe;
        int min = Integer.MAX_VALUE;
        //either breaking or not  and by breaking, we cant use that egg
        for(int i = 1; i<=floor; i++){
            safe =  Math.max(EggDrop(i, eggs-1), EggDrop(floor -i, eggs));
            if(safe < min){
                min = safe;
            }

            System.out.print(min + ", ");
        }

        return  min +1;
    }
    public static void main(String[] args){
        System.out.println(EggDrop(5,2));
    }
}