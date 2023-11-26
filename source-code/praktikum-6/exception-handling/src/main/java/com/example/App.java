package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.print("Masukkan umur: ");
				int umur = scanner.nextInt();

				if (umur < 0 || umur > 120) {
					throw new IllegalArgumentException("Umur tidak valid");
				}

				System.out.println("Umur tercatat");
			} catch (InputMismatchException e) {
				System.out.println("Input tidak valid, masukkan angka.");
				scanner.nextLine(); // Consume the invalid input
			} catch (IllegalArgumentException e) {
				System.out.println(e.toString());
			} catch (Exception e) {
				System.out.println("Terjadi kesalahan lainnya.");
			}
		}
	}
}