package pieces;

import java.awt.image.BufferedImage;

import main.Board;

public class Knight extends Piece {

	public Knight(Board board, int col, int row, boolean isWhite, int point) {
		super(board);
		this.col = col;
		this.row = row;
		this.xPos = col * board.tileSize;
		this.yPos = row * board.tileSize;
		
		this.point = point;

		this.isWhite = isWhite;
		this.name = "Knight";

		this.sprite = sheet.getSubimage(3 * sheetScale, isWhite ? 0 : sheetScale, sheetScale, sheetScale)
				.getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH); //takes resource image and process it

	}

	public boolean isValidMovement(int col, int row) { //how to piece make moves
		return Math.abs(col - this.col) * Math.abs(row - this.row) == 2;
	}

}
