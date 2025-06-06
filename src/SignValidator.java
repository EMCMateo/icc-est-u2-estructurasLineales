import Controllers.StackGenerico;
import java.util.Scanner;
public class SignValidator {

    public void isValid() {
        Scanner scanner = new Scanner(System.in);
         StackGenerico<Character> StackGenericoChar = new StackGenerico<>();
        StackGenerico<Character> StackGenericoChar2 = new StackGenerico<>();

        System.out.println("-----------------------------------------------------------");
        char var;

        while (true) {
            System.out.println("Ingrese un caracter = '(' , ')' , '{' , '}' , '[' o ']' , Para salir ingrese 'x'");
            var = scanner.next().charAt(0);

            if (var == 'x' || var == 'X') {
                break;
            }

            if (var != '(' && var != ')' && var != '{' && var != '}' && var != '[' && var != ']') {
                System.out.println(" Carácter inválido.");
                continue;
            }

            if (var == '(' || var == '{' || var == '[') {
                StackGenericoChar.push(var);
                StackGenericoChar.stringStack();
                continue;
            }

            if (var == ')' || var == '}' || var == ']') {
                StackGenericoChar2.push(var);

                if (StackGenericoChar.isEmpty()) {
                    System.out.println(" Error: signo de cierre sin apertura.");
                    System.out.println("Resultado: false");
                    return;
                }

                char lastOpen = StackGenericoChar.pop();
                char lastClose = StackGenericoChar2.pop();

                if (!((lastOpen == '(' && lastClose == ')') || (lastOpen == '{' && lastClose == '}') || (lastOpen == '[' && lastClose == ']'))) {
                    System.out.println("Error: los signos no están balanceados.");
                    System.out.println("Resultado: false");
                    return;
                } else {
                    System.out.println(" Paréntesis correctos hasta ahora.");
                }
            }
        }

        if (StackGenericoChar.isEmpty() && StackGenericoChar2.isEmpty()) {
            System.out.println("Resultado: true");
        } else {
            System.out.println("Resultado: false");
        }
    }
}