public class FizzBuzz {

    public static void main(String[] args){
        int i;
        int x;
        int y;


        for(i = 1 ; i <= 100 ; i++){
            x = i % 3;
            y = i % 5;
            if (x == 0 && y == 0){
                System.out.println("FizzBuzz");

            }
            else if(y == 0){
                System.out.println("Buzz");
            }
            else if(x == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}


