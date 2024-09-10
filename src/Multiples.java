public class Multiples {
    public static void main(String[] args) {
        int j = 0;
        for(int i=1; i<1000; i++){
            boolean multiple_three = i % 3 == 0;
            boolean multiple_five = i % 5 == 0;

            if(multiple_three){
                j++;
            }
            else if(multiple_five){
                j++;
            }
        }
        System.out.println(j);
    }

}
