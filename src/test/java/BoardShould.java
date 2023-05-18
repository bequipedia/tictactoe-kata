import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardShould {

    @Test
    void print_default_state() {
        Board board = new Board();

        String boardState = board.printCurrentState();

        String expectedState = """
                +---+---+---+
                | 1 | 2 | 3 |
                +---+---+---+
                | 4 | 5 | 6 |
                +---+---+---+
                | 7 | 8 | 9 |
                +---+---+---+""";
        assertEquals(expectedState, boardState);
    }

    @Test
    void print_state_with_first_cell_marked_when_firs_player_marked_one() {
        Board board = new Board();

        board.markCell(1);
        String boardState = board.printCurrentState();

        String expectedState = """
                +---+---+---+
                | X | 2 | 3 |
                +---+---+---+
                | 4 | 5 | 6 |
                +---+---+---+
                | 7 | 8 | 9 |
                +---+---+---+""";
        assertEquals(expectedState, boardState);
    }

    @Test
    void print_state_with_second_cell_marked_when_firs_player_marked_two() {
        Board board = new Board();

        board.markCell(2);
        String boardState = board.printCurrentState();

        String expectedState = """
                +---+---+---+
                | 1 | X | 3 |
                +---+---+---+
                | 4 | 5 | 6 |
                +---+---+---+
                | 7 | 8 | 9 |
                +---+---+---+""";
        assertEquals(expectedState, boardState);
    }
}
