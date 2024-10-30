package convertidorDivisas;

public class Convertir {

	public static float eurosAPesetas(float euros) {
		float pesetas = 0;

		pesetas = euros * 166f;

		return pesetas;

	}

	public static float eurosALibras(float euros) {
		float libras = 0;

		libras = euros * 0.83f;

		return libras;
	}

}
