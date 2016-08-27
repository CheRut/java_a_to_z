package ru.dimcher.part002.start;

import ru.dimcher.part002.models.*;

import java.util.*;

public class ConsoleInput implements Input {

	private Scanner scanner = new Scanner(System.in);
	private Item item;
	private int position = 0;

	public String ask(String question) {
		System.out.print(question);
		return scanner.next();
	}

	public int chooseOption(String question) {
		System.out.print(question);
		return scanner.nextInt();
	}
}
