public class HouseRobber3 {
    //Leetcode 97

    //In this case, givwn a tree with nodes representing houses, you are allowed to still from each not as long as you
    //cant steal from parent and child i.e you have to skip


    ///Key note, we have the left and right side

    public static int rob(TreeNode root){  //class has to be created

        return Math.max(recu(root)[0], recu(root)[1]);

    }

    public static int[] recu(TreeNode root){

        if(root == null){
            return new int[]{0,0};   //If tree is null return array with values 0
        }

        int [] leftSide= recu(root.left);  //do recursion for the left side
        int [] rightSide = recu(root.right);

        //base cases are if root is included or not
        //remember my array returns array of withRoot and withoutRoot

        int withRoot= root.val + leftSide[1] + rightSide[1]; //index 1 represents without root
        int withoutRoot = Math.max(leftSide[0], leftSide[1]) + Math.max(rightSide[0], rightSide[1]);

        //for the withoutroot check the maxvalue from the left and right side for the node below

        return new int[]{withRoot, withoutRoot};
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,9,5) ;
        System.out.println(rob(root));
    }

}
