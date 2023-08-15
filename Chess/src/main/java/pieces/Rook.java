package pieces;

import java.awt.image.BufferedImage;

import main.Board;

public class Rook extends Piece {

	public Rook(Board board, int col, int row, boolean isWhite, int point) {
		super(board);
		this.col = col;
		this.row = row;
		this.xPos = col * board.tileSize;
		this.yPos = row * board.tileSize;
		
		this.point = point;

		this.isWhite = isWhite;
		this.name = "Rook";

		this.sprite = sheet.getSubimage(4 * sheetScale, isWhite ? 0 : sheetScale, sheetScale, sheetScale)
				.getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH);//takes resource image and process it

	}

	public boolean isValidMovement(int col, int row) {//how to piece make moves
		return this.col == col || this.row == row;

	}

	public boolean moveCollidesWithPiece(int col, int row) {//checks collide with other pieces

		// left
		if (this.col > col)
			for (int c = this.col - 1; c > col; c--)
				if (board.getPiece(c, this.row) != null)
					return true;

		// right
		if (this.col < col)
			for (int c = this.col + 1; c < col; c++)
				if (board.getPiece(c, this.row) != null)
					return true;

		// up
		if (this.row > row)
			for (int r = this.row - 1; r > row; r--)
				if (board.getPiece(this.col, r) != null)
					return true;

		// down
		if (this.row < row)
			for (int r = this.row + 1; r < row; r++)
				if (board.getPiece(this.col, r) != null)
					return true;

		return false;

	}

}
