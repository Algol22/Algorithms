import java.util.Arrays;

class twoSum {



    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        for(int a=0; a<nums.length; a++){
            for(int b=a+1; b<nums.length; b++){
                if((nums[a]+nums[b])==target){


                    arr[0] = a;
                    arr[1] = b;


                }

            }

        }

        // int[] arr = new int[2];
        // arr[0] = 1;
        // arr[1] = 2;
        return  arr ;
    }



    public static void main (String[] args){
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10 };
        int target =10;
        twoSum one = new twoSum();
        System.out.print(Arrays.toString(one.twoSum(intArray, target)));

    }
}