import java.util.Scanner;

public class ShapeGen4 { 

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int inputSize;
    

    System.out.println("Would you like to create a shape (Y/N)? ");
    String answerInput = sc.nextLine();
    String answerUpper = answerInput.toUpperCase();
    char answer = answerUpper.charAt(0);

    /* Spør brukeren om de vil ha en shape & trekker ut første bokstaven i svaret 
    -> Gjør den om til en stor bokstav 
    -> Og lagrer den i en char kalt answer */


    while (answer == 'Y')
    // hvis svaret er Y, Yes, yes, osv starter while loopen under
    {
    System.out.println("What shape would you like to print - (T)riangle , (S)quare, (R)ectangle: ");
    String inputString = sc.nextLine();
    String uppercaseInput = inputString.toUpperCase();
    char inputShape = uppercaseInput.charAt(0);
    /* Spør brukeren om hvilken shape de vil ha & trekker ut første bokstaven i svaret 
    -> Gjør den om til en stor bokstav 
    -> Og lagrer den i en char kalt inputshape */

     switch (inputShape) 
     {
         case 'T':
         System.out.println("Select the size: ");
         inputSize = sc.nextInt();
         Triangle(inputSize);
         break;
    // Hvis input shape er T,t osv spør brukeren om størrelsen til Trekanten og sender denne verdien til Triangle metoden på bunnen

         case 'S':
         System.out.println("Select the size: ");
         inputSize = sc.nextInt();
         Square(inputSize);
         break;
    // Hvis input shape er S,s osv spør brukeren om størrelsen til Firkanten og sender denne verdien til Square metoden på bunnen
        case 'R':
        System.out.print("Enter the length of the rectangle: ");
                int reclength = sc.nextInt();
                System.out.print("Enter the height of the rectangle: ");
                int recHeight = sc.nextInt();
                Rectangle(reclength, recHeight);
        break;
         default: 
         System.out.println("Invalid input please enter - (T)riangle or (S)quare or (R)ectangle : ");
         break;
    // Hvis brukeren setter inn en ugyldig verdi printes teksten over
     }
    } 
    
    sc.close();


 }

 public static void Triangle(int size)
    {

       if ((size < 3)) 
       {
         System.out.println("Invalid number input number is to small");
         //Hvis inputsize er mindre enn 3 blir det for lite til å lage en trekant og teksten over blir printet
       } 
       else 
       {
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Ellers printes trekanten med denne nested loopen
       }

    }

 public static void Square(int size) 
 {
    
        if ((size < 2)) 
        {
          System.out.println("Invalid number input number is to small");
          //Hvis inputsize er mindre enn 3 blir det for lite til å lage en firekant og teksten over blir printet
        } 
        else 
        {
         for (int i = 0; i < size; i++) 
         {
            for (int j = 0; j < size; j++) 
            {
                System.out.print("* ");
            } 
             System.out.println(); 
         }
        }
        }

          public static void Rectangle(int reclength, int recheight) {
          for (int i = 0; i < recheight; i++) {
              for (int j = 0; j < reclength; j++) {
                  System.out.print("* ");
              }
              System.out.println(); 
       
        }
    }

 
}
