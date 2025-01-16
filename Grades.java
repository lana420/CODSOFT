import java.util.Scanner;
 
public class Grades{
   
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        
        int subjects = 5;

        int [] marks= new int [subjects];

        System.out.println("enter the marks:");

        for(int i=0; i<subjects;i++){
            System.out.println("subject"+ (i+1)+':');
            marks[i]=sc.nextInt();

            if (marks[i]<0|| marks[i]>100){
                System.out.println("invalib");
                return;

            }


        }
        int finalmarks=0;
        for(int mark : marks){
            finalmarks+=mark;

        }
        double average=(double)finalmarks/subjects;

        char grade;
        if(average>=90){
            grade='A';
        }else if(average>=80){
            grade='B';


        }else if(average>=70){
            grade='C';

        } else if (average>=60){
            grade='D';


        }else{
            grade='F';

        }
        System.out.println("\n results");
        System.out.println("finalmarks"+finalmarks);
        System.out.println("average:"+String.format("%.2f",average)+"%");
        System.out.println("grade:"+grade);



        

    }
}