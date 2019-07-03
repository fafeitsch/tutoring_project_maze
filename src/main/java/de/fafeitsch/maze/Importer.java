package de.fafeitsch.maze;

import java.util.Scanner;

public class Importer {

    public char[][] readFromScanner(Scanner scanner) {
        int height = Integer.parseInt(scanner.nextLine());
        char[][] result = new char[height][];
        for (int row = 0; row < height; row++) {
            result[row] = scanner.nextLine().toCharArray();
        }
        return result;
    }
}
