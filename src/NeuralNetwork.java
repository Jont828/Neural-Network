import java.util.Arrays;

public class NeuralNetwork {
	public Layer layers[];

	public NeuralNetwork(int layerSizes[]) {
		layers = new Layer[layerSizes.length];

		for(int i=0; i<layerSizes.length-1; i++) {
			// System.out.println("here");
			layers[i] = new Layer(layerSizes[i], layerSizes[i+1]);
			// System.out.println();
		}
		layers[layers.length-1] = new Layer(layerSizes[layerSizes.length-1], 1);

	}

	public double[] process(double inputVector[]) {
		if(inputVector.length != layers[0].size())
			throw new RuntimeException("Input vector must be the same size as the input layer!");

		double result[] = inputVector;

		for(Layer l : layers) {
			System.out.println("Layer:\n\n" + l);
			System.out.println("Result is" + Arrays.toString(result));
			result = l.process(result);
			System.out.println("Just ran result");

		}

		return result;
	}
}
