package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here
        RpnStack rpn = new RpnStack();
        int resultado = rpn.run(ler(new FileReader("src/Calc1.stk")));
        System.out.println(resultado);
    }

    public static ArrayList<String> ler(FileReader arquivo){
        Scanner in =  new Scanner(arquivo);
        ArrayList<String> entrada = new ArrayList<String>();
        while(in.hasNext()) {
            entrada.add(in.nextLine());
        }
        return entrada;
    }
}
