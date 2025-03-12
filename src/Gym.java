import java.util.Scanner;

public class Gym{
    int age;
    String name;
    boolean isactive;
    int duration;
    int fee;
    int calculate(){
        return duration*1000;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n ;
        System.out.println("Enter number of members: ");
        n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
            Gym obj=new Gym();
            System.out.println("Enter your name: ");
            obj.name=scanner.next();
            System.out.println("Enter your age:");
            obj.age=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your membership status : ");
            obj.isactive=scanner.nextBoolean();
            System.out.println("Enter duration : ");
            obj.duration=scanner.nextInt();
            System.out.println();
            obj.fee=obj.calculate();
            System.out.println(obj.fee);
        }





    }
}

