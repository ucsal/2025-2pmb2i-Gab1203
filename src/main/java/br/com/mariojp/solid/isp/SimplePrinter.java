package br.com.mariojp.solid.isp;

public class SimplePrinter implements Printer {

    @Override
    public void print(String content) {
        System.out.println("Printou!");
    }
}
