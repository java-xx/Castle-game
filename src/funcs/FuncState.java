package funcs;

import castle.Game;

public class FuncState extends Funcsrc {
	
	public FuncState(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void DoFunc(String cmd) {
		// TODO Auto-generated method stub
		System.out.println(game.PLayerToString());
	}

}