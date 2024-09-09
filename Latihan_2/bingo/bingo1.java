/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum2;

/**
 *
 * @author User
 */
public class bingo1 {
    private int numClaps;

    public bingo1(int numClaps) {
        this.numClaps = numClaps;
    }

    public void sing() {
        System.out.println("There was a farmer who had a dog,\nAnd Bingo was his name-o.");
        for (int i = 0; i < numClaps; i++) {
            System.out.print("B-");
        }
        System.out.println("I-N-G-O");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < numClaps; j++) {
                System.out.print("B-");
            }
            System.out.println("I-N-G-O");
        }
        System.out.println("And Bingo was his name-o.");
    }
    public void sing2() {
        System.out.println("\nThere was a farmer who had a dog,\nAnd Bingo was his name-o.");
        for (int i = 0; i < numClaps; i++) {
            System.out.print("(clap)-");
        }
        System.out.println("I-N-G-O");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < numClaps; j++) {
                System.out.print("(clap)-");
            }
            System.out.println("I-N-G-O");
        }
        System.out.println("And Bingo was his name-o.");
    }
    public void sing3() {
        System.out.println("\nThere was a farmer who had a dog,\nAnd Bingo was his name-o.");
        for (int i = 0; i < numClaps; i++) {
            System.out.print("(clap)-");
        }
        System.out.println("(clap)-N-G-O");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < numClaps; j++) {
                System.out.print("(clap)-");
            }
            System.out.println("(clap)-N-G-O");
        }
        System.out.println("And Bingo was his name-o.");
    }
    public void sing4() {
        System.out.println("\nThere was a farmer who had a dog,\nAnd Bingo was his name-o.");
        for (int i = 0; i < numClaps; i++) {
            System.out.print("(clap)-");
        }
        System.out.println("(clap)-(clap)-G-O");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < numClaps; j++) {
                System.out.print("(clap-)");
            }
            System.out.println("(clap)-(clap)-G-O");
        }
        System.out.println("And Bingo was his name-o.");
    }
    public void sing5() {
        System.out.println("\nThere was a farmer who had a dog,\nAnd Bingo was his name-o.");
        for (int i = 0; i < numClaps; i++) {
            System.out.print("(clap)-");
        }
        System.out.println("(clap)-(clap)-(clap)-O");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < numClaps; j++) {
                System.out.print("(clap)-");
            }
            System.out.println("(clap)-(clap)-(clap)-O");
        }
        System.out.println("And Bingo was his name-o.");
    }
    public void sing6(){
    System.out.println("\nThere was a farmer who had a dog,\nAnd Bingo was his name-o.");
        for (int i = 0; i < numClaps; i++) {
            System.out.print("(clap)-");
        }
        System.out.println("(clap)-(clap)-(clap)-(clap)");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < numClaps; j++) {
                System.out.print("(clap)-");
            }
            System.out.println("(clap)-(clap)-(clap)-(clap)");
        }
        System.out.println("And Bingo was his name-o.");
    }
    
}

