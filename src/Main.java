
public class Main {

	public static void main(String[] args) {
		double inputVector[] = { 1, 2, 3 };
		double inputWeights[][] = {
			{4, 7},
			{5, 8},
			{6, 9}
		};
		
		System.out.println("Neural networks!"); // ayy lmao
		// System.out.println(Arrays.toString( Matrix.multiply(inputVector, inputWeights) ));

		NeuralNetwork nn = new NeuralNetwork( new int[]{2, 3, 1} );

		nn.process( new double[]{0.01, 0.5} );
	}

}
