public class Board {

    private int markedCell;

    public Board() {
    }

    public Board(int markedCell) {
        this.markedCell = markedCell;
    }

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

        if(markedCell == 2) {
            return """
                +---+---+---+
                | 1 | X | 3 |
                +---+---+---+
                | 4 | 5 | 6 |
                +---+---+---+
                | 7 | 8 | 9 |
                +---+---+---+""";
        }
        if(markedCell == 3) {
            return """
                +---+---+---+
                | 1 | 2 | X |
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
}
