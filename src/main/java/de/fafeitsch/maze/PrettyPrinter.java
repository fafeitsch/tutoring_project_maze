package de.fafeitsch.maze;

import java.io.PrintStream;

public class PrettyPrinter {
    private final char[][] maze;

    public PrettyPrinter(char[][] maze) {
        this.maze = maze;
    }

    public void printPretty(PrintStream writer) {
        for (int row = 0; row < this.maze.length; row++) {
            writer.println(new String(this.maze[row]));
        }
    }
}
