package application;

import entities.Rent;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] vetor = new Rent[10];

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();

            for (int i = 1; i<=n; i++){
                sc.nextLine();
                System.out.println("Rent #" + i + ":");
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Email: ");
                String email = sc.next();
                System.out.println("Room: ");
                int roomNumber = sc.nextInt();

                vetor[roomNumber] = new Rent(name,email);
            }

        System.out.println("Busy rooms: ");

            for (int i=0; i<10; i++){
                if (vetor[i] != null){
                    System.out.println(i + ": " + vetor[i]);
                }
            }

        sc.close();
    }
}
