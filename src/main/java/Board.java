import java.util.Arrays;

public class Board {
    private String[] firstRowMarks = new String[3];

    private int markedCell;

    public Board() {
    }
    public Board(int markedCell) {
        this.markedCell = markedCell;
    }

    public String printCurrentState() {
        if(markedCell != 0) {
            firstRowMarks[markedCell -1] = "X";
        }
        String[] firstRowCells = firstRowMarks;
        for(int cell = 0; cell < firstRowMarks.length; cell++) {
            boolean isMarked = firstRowMarks[cell] != null;
            if(!isMarked) {
                firstRowCells[cell] = String.valueOf(cell + 1);
            }
        }
        return "+---+---+---+\n| "+
                    String.join(" | ", firstRowCells) +
                """
                 |\n+---+---+---+
                | 4 | 5 | 6 |
                +---+---+---+
                | 7 | 8 | 9 |
                +---+---+---+""";
        }

}
