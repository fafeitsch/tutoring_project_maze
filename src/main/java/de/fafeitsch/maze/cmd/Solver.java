package de.fafeitsch.maze.cmd;

import de.fafeitsch.maze.Importer;
import de.fafeitsch.maze.PrettyPrinter;
import de.fafeitsch.maze.domain.ShortestPathFinder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solver {
    public static void main(String args[]) throws FileNotFoundException {
        if (args.length != 5) {
            System.out.println("Please give at least 5 arguments: [PATH_TO_FILE] [START_ROW] [START_COL] [END_ROW] [END_COL]");
            return;
        }
        int startX = Integer.parseInt(args[1]);
        int startY = Integer.parseInt(args[2]);
        int endX = Integer.parseInt(args[3]);
        int endY = Integer.parseInt(args[4]);

        Scanner scanner = new Scanner(new FileInputStream(args[0]));
        Importer importer = new Importer();
        char[][] maze = importer.readFromScanner(scanner);
        scanner.close();

        ShortestPathFinder finder = new ShortestPathFinder(maze);
        finder.drawShortestPathInMaze(startX, startY, endX, endY);

        PrettyPrinter printer = new PrettyPrinter(maze);
        printer.printPretty(System.out);
    }
}
