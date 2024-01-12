import java.util.*;
class details
{
    int id,age,sem;
    char gen;
    String desig;
    Scanner s=new Scanner(System.in);
    void choice()
    {
        int c=s.nextInt();
        switch(c)
        {
            case 1:
                getstu();
                break;
            case 2:
                getprof();
                break;
            case 3:
                getnon();
                break;
            case 4:
                System.exit(0);
        }
    }
    void getstu()
    {
        System.out.print("Enter student ID - ");
        id=s.nextInt();
        System.out.print("Enter age - ");
        age=s.nextInt();
        System.out.print("Enter semester number - ");
        sem=s.nextInt();
        System.out.print("Enter you gender(m/f) - ");
        gen=s.next().charAt(0);
        disstu();
    }
    void getprof()
    {
        System.out.print("Enter staff ID - ");
        id=s.nextInt();
        System.out.print("Enter age - ");
        age=s.nextInt();
        System.out.print("Enter you gender(m/f) - ");
        gen=s.next().charAt(0);
        s.nextLine();
        System.out.print("Enter your designation - ");
        desig=s.nextLine();
        disprof();
    }
    void getnon()
    {
        System.out.print("Enter non-teaching staff ID - ");
        id=s.nextInt();
        System.out.print("Enter age - ");
        age=s.nextInt();
        System.out.print("Enter you gender(m/f) - ");
        gen=s.next().charAt(0);
        disnon();
    }
    void disstu()
    {
        System.out.println("Your ID - "+id);
        System.out.println("Your age - "+age);
        System.out.println("Your gender - "+gen);
        System.out.println("Semester number - "+sem);
    }
    void disprof()
    {
        System.out.println("Your ID - "+id);
        System.out.println("Your age - "+age);
        System.out.println("Your gender - "+gen);
        System.out.println("Your designation - "+desig);
    }
    void disnon()
    {
        System.out.println("Your ID - "+id);
        System.out.println("Your age - "+age);
        System.out.println("Your gender - "+gen);
    }
}
public class Main
{
	public static void main(String[] args) {
		details d=new details();
		while(true)
		{
		    System.out.printf("Press 1 if you are a student,\nPress 2 if you are a faculty,\nPress 3 if you are a non-teaching staff,\nPress 4 to exit --> ");
		    d.choice();
		}
	}
}
