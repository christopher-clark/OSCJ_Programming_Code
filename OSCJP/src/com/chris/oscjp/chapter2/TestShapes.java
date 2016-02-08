package com.chris.oscjp.chapter2;

public class TestShapes {
	public static void main (String[] args) {
		PlayerPiece player = new PlayerPiece();
		player.displayShape();
		player.movePiece();
		TilePiece tile = new TilePiece();
		tile.getAdjacent();
		doShapes(player);
		doShapes(tile);
		
		Object o = player;
		System.out.println("o is type of" + o.getClass());
		GameShape shape = player;
		System.out.println("GameShape is type of" + shape.getClass());
		Animatable mover = player;
		mover.animate();
		System.out.println("mover is type of" + mover.getClass());
	}
	public static void doShapes(GameShape shape) {
		shape.displayShape();
	}
}
