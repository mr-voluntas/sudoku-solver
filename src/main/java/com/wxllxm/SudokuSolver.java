package com.wxllxm;

public class SudokuSolver {
  public static void main(String[] args) {

    int[][] sudokuNumbers = {
        { 0, 0, 9, 5, 0, 1, 3, 7, 8 },
        { 0, 8, 0, 3, 0, 0, 4, 0, 0 },
        { 4, 0, 0, 0, 9, 2, 0, 0, 0 },
        { 0, 3, 5, 2, 0, 7, 0, 0, 0 },
        { 9, 4, 0, 1, 0, 3, 2, 5, 0 },
        { 0, 0, 0, 9, 5, 0, 6, 1, 0 },
        { 6, 9, 4, 7, 1, 0, 0, 3, 0 },
        { 0, 0, 0, 6, 3, 0, 7, 4, 0 },
        { 0, 5, 0, 0, 0, 8, 0, 0, 0 }
    };

    SudokuTable table = new SudokuTable(sudokuNumbers);

    table.printTable();

    System.out.println(table.isValidPlacement(8, 6, 3));

  }
}
