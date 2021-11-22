

import java.io.*;
import java.util.*;

// ENUNCIADO:

// Sense espais:

/* Donada una cadena, crea una altra cadena igual a la primera sense espais en blanc.

Input Format

Introduïm una cadena de text fins a final de línia.

Constraints

No n'hi ha.

Output Format

La mateixa cadena introduïda sense espais.

Sample Input 0

A l'INS Poblenou s'esta molt be.
Sample Output 0

Al'INSPoblenous'estamoltbe.

 */






public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String texto = sc.nextLine();



        System.out.println(texto.replace(" ",""));

    }
}
