package pi2.ejercicio138;

import us.lsi.tiposrecursivos.BinaryTree;

public class Metodos138 {

	public static <E> Boolean estaEquilibrado(BinaryTree<E> t) {
		Boolean res = null;
		switch (t.getType()) {
		case Empty:
			res = true;
			break;
		case Leaf:
			res = true;
			break;
		case Binary:
			int izq = t.getLeft().getHeight();
			int der = t.getRight().getHeight();
			int diferencia = Math.abs(izq - der);
			res = (izq == der || diferencia == 1) && estaEquilibrado(t.getLeft()) 
					&& estaEquilibrado(t.getRight());
			break;
		}
		return res;
	}
	
}
