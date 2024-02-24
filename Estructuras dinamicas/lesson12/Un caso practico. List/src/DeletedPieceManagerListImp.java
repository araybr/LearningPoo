import java.util.ArrayList;
import java.util.List;

public class DeletedPieceManagerListImp implements IDeletedPieceManager {

    List<Piece> pieceList;

    //put your task here


    public DeletedPieceManagerListImp() {
        pieceList = new ArrayList<>();
    }

    @Override
    public void addPiece(Piece piece) {
        pieceList.add(piece);
    }

    @Override
    public int count(Piece.Type pieceType) {
        int cuenta = 0;
        for (Piece piece : pieceList){
            if (piece.getType().getShape().equals(pieceType.getShape())&&piece.getType().getColor().equals(pieceType.getColor())){
                cuenta++;
            }
        }
        return cuenta;
    }

    @Override
    public Piece removeLast() {
        pieceList.remove(pieceList.get(pieceList.size()-1));
        return pieceList.get(pieceList.size()-1);
    }

}
