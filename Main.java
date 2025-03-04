import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        locateSelect("muitas coisas");
    }

    public static void locateSelect(String expressao) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> loc = new ArrayList<>();
        ArrayList<Character> expChar = new ArrayList<>();
        if (expressao.length() < 6)
            System.out.println("SELECT nao encotrado");
        while (i < expressao.length()) {
            switch (expressao.charAt(i)) {
                case 's', 'e', 'l', 'c', 't', 'S', 'E', 'L', 'C', 'T':
                    loc.add(i);
                    expChar.add(expressao.charAt(i));
                    break;
            }
            i++;
        }
        i = 0;
        while (i <= expChar.size() - 6) { // Ensure at least 6 elements exist
            if ((expChar.get(i) == 's' || expChar.get(i) == 'S') &&
                    (expChar.get(i + 1) == 'e' || expChar.get(i + 1) == 'E') &&
                    (expChar.get(i + 2) == 'l' || expChar.get(i + 2) == 'L') &&
                    (expChar.get(i + 3) == 'e' || expChar.get(i + 3) == 'E') &&
                    (expChar.get(i + 4) == 'c' || expChar.get(i + 4) == 'C') &&
                    (expChar.get(i + 5) == 't' || expChar.get(i + 5) == 'T')) {

                System.out.println("A palavra chave SELECT encontra-se a partir do indice " + loc.get(i) + " ate ao indice " + loc.get(i + 5));
                i += 6;
                j = 1;
            } else {
                i++;
            }
        }

        if(j == 0)
            System.out.println("A palavra chave nao foi encotrada");
    }
}


