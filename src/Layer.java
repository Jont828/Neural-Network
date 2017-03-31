import java.util.Arrays;

public class Layer {
	private double weights[][];
	private double bias;

	public Layer(int rows, int cols) {
		weights = new double[rows][cols];

		bias = Math.random() * 2 - 1;
		
		for(int i=0; i<weights.length; i++) {
			for(int j=0; j<weights[0].length; j++) {
				// weights[i][j] = j+1;
				weights[i][j] = Math.random() * 2 - 1;

				System.out.print(weights[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();

	}

	public int size() {
		return weights.length;
	}

	public double sigmoid(double x) {
		return 1 / ( 1 + Math.exp(-1 * (x + bias)) );
	}

	public double sigmoidDerivative(double x) {
		return sigmoid(x) * (1 - sigmoid(x));
	}

	public double[] process(double inputs[]) {
		double result[] = Matrix.multiply(inputs, weights);

		for(int i=0; i<result.length; i++) {
			result[i] = sigmoid(result[i]);
		}

		return result;
	}

	public String toString() {
		String result = "";

		for(double w[] : weights) {
			result += Arrays.toString(w) + "\n";
			// System.out.println("")
			//System.out.println(Arrays.toString(w));
		}

		return result;
	}
}
