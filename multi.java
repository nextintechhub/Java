
public class multi {
        public void multiplication (){
            System.out.println("Your Multiplication Table is Here: ");
            for (int i=1;i<=10;i++){
                for (int j=1; j<=10; j++){
                    int multiply=i*j;
                    if (multiply >= 50){
                        break;
                    }
                    System.out.println(" "+i+" X "+j+" "+" = "+multiply);
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            multi obj=new multi();
            obj.multiplication();
        }
    }
