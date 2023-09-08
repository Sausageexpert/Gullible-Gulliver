package Enums;

public class Main {
    public static void main(String[] args){
       // seasoneDetective(-5);
        guessTheAnimal(friendlyNeighbourhoodCreatures.EEEEEEEEEEEEEEE);
    }
    public static void guessTheAnimal(friendlyNeighbourhoodCreatures foo){
        switch(foo){
            case EEEEEEEEEEEEEEE:
                case PAVBHAJI: // now the same message gets displayed when either of them is entered, or just use a comma after EEEEEEEEEEEEEEE and enter PAVBHAJI
                    System.out.println("you have interrupted ms. Eeeeeeeeeeeeeee's nap (or maybe she just normally sounds like she's snoring, who knows)");
                    break;
            case FLUFFYFACE:
                System.out.println("you just saved a fluffy bird from having a friend (read as being eaten)");
                break;
            case BOBA:
                System.out.println("kinda like Smaug but better because... she just is");
                break;
            case NOTALYNX:
                System.out.println("definitely not a lynx, what gave you that idea?");
                break;
            default:
                System.out.println("looks like that friendly neighbourhood animal is visiting a relative, they aren't home at the moment");
                break;
        }
    }
   /* public static void seasoneDetective(int foo){
        switch(foo){
            case 1:
                System.out.println("January is in winter (if you're in the northern hemisphere)");
                break;
            case 2:
                System.out.println("February is in winter too");
                break;
            case 3:
                System.out.println("March is in spring");
                break;
            case 4:
                System.out.println("April is in spring too");
                break;
            case 5:
                System.out.println("May is in spring");
                break;
            case 6:
                System.out.println("June is in summer");
                break;
            case 7:
                System.out.println("July is in summer too");
                break;
            case 8:
                System.out.println("August is summer");
                break;
            case 9:
                System.out.println("September is in fall");
                break;
            case 10:
                System.out.println("October is in fall too");
                break;
            case 11:
                System.out.println("November is in fall");
                break;
            case 12:
                System.out.println("December is in winter");
                break;
            default:
                System.out.println("are you sure that's a month?");
                break;

        } */
    }

