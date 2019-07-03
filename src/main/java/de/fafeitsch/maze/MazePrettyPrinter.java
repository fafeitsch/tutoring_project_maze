package de.fafeitsch.maze;

import java.io.PrintStream;
import java.io.PrintWriter;

public class MazePrettyPrinter {
    private final char[][] maze;

    public MazePrettyPrinter(char[][] maze) {
        this.maze = maze;
    }

    public void printPretty(PrintStream writer) {
        for (int row = 0; row < maze.length; row++) {
            writer.println(new String(maze[row]));
        }
    }
}
