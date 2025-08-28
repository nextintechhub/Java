public class foreach {
    public static void main(String[] args) {
        int[] number = {2, 3, -5, 1};
        int sum=0;
                for(int num: number){
                    sum+=num;
                }
        System.out.println("Sum" + sum);
    }

}
