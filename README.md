# sudoku-solver
Cheat at solving sudokus

mvn compile exec:java -Dexec.mainClass="com.wxllxm.SudokuSolver"


I picked the 3x3 with the most numbers.

find which numbers are not in the 3x3 grid.
add number where number is not in the same row/col.
repeat until 3x3 is complete.

move onto the next 3x3 with the most numbers.

if multiple options. move onto next number within 3x3 and come back.

if still have multiple options, move onto the next 3x3 and come back.

move onto next 3x3 with the most numbers OR the move number in row/col



1. Pick the 3x3 with the most numbers.
2. If the 3x3 has the same numbers as others. pick the one with the most row/col numbers.

1. List the numbers which are needed to be placed.
2. Compare these to numbers in the row/col to see where they can be placed with confidence.
3. Move to next 3x3 when all high confidence numbers have been placed.





