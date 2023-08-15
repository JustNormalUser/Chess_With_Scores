package pieces;

import java.awt.image.BufferedImage;

import main.Board;

public class Queen extends Piece {

	public Queen(Board board, int col, int row, boolean isWhite, int point) {
		super(board);
		this.col = col;
		this.row = row;
		this.xPos = col * board.tileSize;
		this.yPos = row * board.tileSize;
		
		this.point = point;

		this.isWhite = isWhite;
		this.name = "Queen";

		this.sprite = sheet.getSubimage(sheetScale, isWhite ? 0 : sheetScale, sheetScale, sheetScale)
				.getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH);//takes resource image and process it

	}

	public boolean isValidMovement(int col, int row) {//how to piece make moves
		return this.col == col || this.row == row || Math.abs(this.col - col) == Math.abs(this.row - row);
	}

	public boolean moveCollidesWithPiece(int col, int row) { //checks collide with other pieces (Bishop U Rook = Queen)

		if (this.col == col || this.row == row) {
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
		} else {

			// up left
			if (this.col > col && this.row > row)
				for (int i = 1; i < Math.abs(this.col - col); i++)
					if (board.getPiece(this.col - i, this.row - i) != null)
						return true;

			// up right
			if (this.col < col && this.row > row)
				for (int i = 1; i < Math.abs(this.col - col); i++)
					if (board.getPiece(this.col + i, this.row - i) != null)
						return true;

			// down left
			if (this.col > col && this.row < row)
				for (int i = 1; i < Math.abs(this.col - col); i++)
					if (board.getPiece(this.col - i, this.row + i) != null)
						return true;

			// down left
			if (this.col < col && this.row < row)
				for (int i = 1; i < Math.abs(this.col - col); i++)
					if (board.getPiece(this.col + i, this.row + i) != null)
						return true;
		}

		return false;

	}

}
