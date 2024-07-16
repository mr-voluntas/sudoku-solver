package com.wxllxm;

public class SudokuTable {

  private static final int GRID_SIZE = 9;
  private int[][] table;

  SudokuTable(int[][] table) {
    this.table = table;
  };

  public boolean isValidPlacement(int num, int row, int col) {
    return isRowValid(num, row) && isColValid(num, col) && isSubgridValid(num, row, col);
  }

  private boolean isRowValid(int num, int row) {
    for (int col = 0; col < GRID_SIZE; col++) {
      if (table[row][col] == num) {
        return false;
      }
    }
    return true;
  }

  private boolean isColValid(int num, int col) {
    for (int row = 0; row < GRID_SIZE; row++) {
      if (table[row][col] == num) {
        return false;
      }
    }
    return true;
  }

  private boolean isSubgridValid(int num, int row, int col) {
    int startRow = row - (row % 3);
    int startCol = col - (col % 3);

    for (int i = startRow; i < startRow + 3; i++) {
      for (int j = startCol; j < startCol + 3; j++) {
        if (table[i][j] == num) {
          return false;
        }
      }
    }
    return true;
  }

  public void printTable() {
    System.out.println("---------------------");
    for (int i = 0; i < table.length; i++) {
      if (i % 3 == 0 && i != 0) {
        System.out.println("------+-------+------");
      }
      for (int j = 0; j < table[i].length; j++) {
        if (j % 3 == 0 && j != 0) {
          System.out.print("| ");
        }
        System.out.print(table[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("---------------------");
  }

}
