import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int math,phy,turkish,chem,music;
        int addtoclassforavarage = 5;

        Scanner scanner= new Scanner(System.in);

        System.out.println("please enter your math grades: ");
        math= scanner.nextInt();
        if(math<0 || math>100){
            math= 0;
            addtoclassforavarage--;
        }

        System.out.println("please enter your physics grade: ");
        phy=scanner.nextInt();
        if(phy<0 || phy>100){
            phy= 0;
            addtoclassforavarage--;
        }

        System.out.println("Please enter your turkish grade:");
        turkish= scanner.nextInt();
        if(turkish<0 || turkish>100){
            turkish= 0;
            addtoclassforavarage--;
        }

        System.out.println("Please enter your chemistry grade:");
        chem= scanner.nextInt();
        if(chem<0 || chem>100){
            chem= 0;
            addtoclassforavarage--;
        }

        System.out.println("Please enter your music grade:");
        music= scanner.nextInt();
        if(music<0 || music>100){
            music= 0;
            addtoclassforavarage--;
        }
        double avarage= (math+ phy+ turkish+ chem+ music)/addtoclassforavarage;

        if(avarage>=55){
            System.out.println("Congratulation you pass the class!  ");

        }else{
         System.out.println("You failed!");
         System.out.println("Your avarage grade:" + avarage);

        }
    }
}