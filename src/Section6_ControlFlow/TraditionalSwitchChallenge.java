package Section6_ControlFlow;

public class TraditionalSwitchChallenge {

    public static void main(String[] args) {

        char letter = 'A';

        switch (letter) {
            case 'A':
                System.out.println("Letter = " + letter + " = NATO Word Able");
                break;
            case 'B':
                System.out.println("Letter = " + letter + " NATO Word Baker");
                break;
            case 'C':
                System.out.println("Letter = " + letter + " NATO Word harlie");
                break;
            case 'D':
                System.out.println("Letter = " + letter + " NATO Word Dog");
                break;
            case 'E':
                System.out.println("Letter = " + letter + " NATO Word Easy");
                break;
            default:
                System.out.println("not found");
        }
    }
}
