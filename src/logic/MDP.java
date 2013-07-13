package logic;

import model.Matrix;
import model.Point;

public class MDP {

	public void mdp(int x, int y) {
		Point ponto = this.selectFromMatrix(x, y);
		Integer[][] r = Matrix.r();
		System.out.println(ponto.getValue());
		r[ponto.getX()][ponto.getY()] = ponto.getValue();
	}

	public Point selectFromMatrix(int x, int y) {
		Integer[][] r = Matrix.r();
		Integer[][] w = Matrix.w();

		Integer norte = null;
		Integer sul = null;
		Integer leste = null;
		Integer oeste = null;

		Integer maior = null;
		int linha = x;
		int coluna = y;
		//System.out.println("r[0].length = " + r[0].length);
		try {
			sul = r[linha + 1][coluna];
			if(sul == null){
				System.err.println("SUL INVÁLIDO!");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("SUL INVÁLIDO!");
		}
		try {
			norte = r[linha - 1][coluna];
			if(norte == null){
				System.err.println("NORTE INVÁLIDO!");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("NORTE INVÁLIDO!");
		}
		try {
			leste = r[linha][coluna + 1];
			if(leste == null){
				System.err.println("LESTE INVÁLIDO!");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("LESTE INVÁLIDO!");
		}
		try {
			oeste = r[linha][coluna - 1];
			if(oeste == null){
				System.err.println("OESTE INVÁLIDO!");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("OESTE INVÁLIDO!");
		}

		Integer[] valores = { norte, sul, leste, oeste };

		for (int i = 0; i < valores.length; i++) {
			if (maior == null) {
				maior = valores[i];
			}

			if (valores[i] != null) {
				if (valores[i] > maior) {
					maior = valores[i];
				}
			}
		}
		System.out.println("maior: " + maior);
		maior += w[x][y];
		Point point = new Point(x, y, maior);
		System.out.println(point);
		return point;
	}

}
