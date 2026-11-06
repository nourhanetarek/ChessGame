package ChessCore;

public final class ClassicChessGame extends ChessGame  implements Cloneable {

    public ClassicChessGame() {
        super(ClassicBoardInitializer.getInstance());
    }

    @Override
    protected boolean isValidMoveCore(Move move) {
        return !Utilities.willOwnKingBeAttacked(this.getWhoseTurn(), move, this.getBoard());
    }

    
}
