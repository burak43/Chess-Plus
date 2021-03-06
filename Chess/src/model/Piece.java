package model;

import javax.swing.ImageIcon;

public abstract class Piece {
	private Color pieceColor;
	public Square currentLocation;
	private boolean moved;
	private ImageIcon image;

	/**
	 * @param color
	 *            Color of the piece
	 * @param location
	 *            Location of the piece, which is of type Square. Pass "null" if
	 *            the piece has not yet been placed to a square
	 */
	public Piece(Color color, Square location) {
		pieceColor = color;
		currentLocation = location;
	}

	/**
	 * Updates the current location of this piece and marks it as moved.
	 * 
	 * @param newLocation
	 *            New location of this piece.
	 * @return a boolean to indicate success of failure
	 */
	public boolean updateLocation(Square newLocation) {
		if (newLocation.getPlacedPiece().getPieceColor() == this.getPieceColor()) {
			return false;
		}
		this.currentLocation = newLocation;
		this.setMoved();
		return true;
	}

	/**
	 * @return the moved
	 */
	public boolean isMoved() {
		return this.moved;
	}

	/**
	 * @return the pieceColor
	 */
	public Color getPieceColor() {
		return pieceColor;
	}

	/**
	 * @param pieceColor
	 *            the pieceColor to set
	 */
	public void setPieceColor(Color pieceColor) {
		this.pieceColor = pieceColor;
	}

	/**
	 * @return the currentLocation
	 */
	public Square getCurrentLocation() {
		return currentLocation;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setCurrentLocation(Square location) {
		this.currentLocation = location;
	}

	/**
	 * Marks the piece as moved.
	 */
	public void setMoved() {
		this.moved = true;
	}

	/**
	 * @return the image
	 */
	public ImageIcon getImage() {
		return image;
	}

	/**
	 * @param image
	 *            the image to set
	 */
	protected void setImage(ImageIcon image) {
		this.image = image;
	}

}
