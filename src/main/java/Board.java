public class Board {

    private int markedCell;
    public String printCurrentState() {
        if(markedCell == 1) {
            return """
                +---+---+---+
                | X | 2 | 3 |
                +---+---+---+
                | 4 | 5 | 6 |
                +---+---+---+
                | 7 | 8 | 9 |
                +---+---+---+""";
        }

    return """
                +---+---+---+
                | 1 | 2 | 3 |
                +---+---+---+
                | 4 | 5 | 6 |
                +---+---+---+
                | 7 | 8 | 9 |
                +---+---+---+""";
    }

    public void markCell(int cellPosition) {
        this.markedCell = cellPosition;
    }
}
