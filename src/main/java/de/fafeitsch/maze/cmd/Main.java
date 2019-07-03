package de.fafeitsch.maze.cmd;

import de.fafeitsch.maze.Importer;
import de.fafeitsch.maze.MazePrettyPrinter;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(Main.class.getResourceAsStream("maze.txt"));
        Importer importer = new Importer();
        char[][] maze = importer.readFromScanner(scanner);
        scanner.close();
        MazePrettyPrinter printer = new MazePrettyPrinter(maze);
        printer.printPretty(System.out);
    }
}
