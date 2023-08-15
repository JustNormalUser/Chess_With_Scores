package pieces;

import java.awt.image.BufferedImage;

import main.Board;
import main.Move;

public class King extends Piece {

	public King(Board board, int col, int row, boolean isWhite, int point) {
		super(board);
		this.col = col;
		this.row = row;
		this.xPos = col * board.tileSize;
		this.yPos = row * board.tileSize;
		
		this.point = point;

		this.isWhite = isWhite;
		this.name = "King";

		this.sprite = sheet.getSubimage(8, isWhite ? 0 : sheetScale, sheetScale, sheetScale)
				.getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH);//takes resource image and process it

	}

	public boolean isValidMovement(int col, int row) {//how to piece make moves
		return Math.abs((col - this.col) * (row - this.row)) == 1
				|| Math.abs(col - this.col) + Math.abs(row - this.row) == 1 || canCastle(col, row);
	}

	private boolean canCastle(int col, int row) {//check castle

		if (this.row == row) {
			if (col == 6) {
				Piece rook = board.getPiece(7, row);
				if (rook != null && rook.isFirstMove && isFirstMove) {
					return board.getPiece(5, row) == null 
							&& board.getPiece(6, row) == null
							&& !board.checkScanner.isKingChecked(new Move(board, this, 5, row));
				}
			} else if (col ==2) {
				Piece rook = board.getPiece(7, row);
				return board.getPiece(3, row) == null &&
						board.getPiece(2, row) == null &&
						board.getPiece(1, row) == null &&
						!board.checkScanner.isKingChecked(new Move(board, this, 3, row));
			}
		}

		return false;
	}

}
