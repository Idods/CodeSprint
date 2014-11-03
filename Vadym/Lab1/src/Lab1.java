import sort.SortingAnalizer;
import generator.*;


public class Lab1 {

	public static void main(String[] args) {
//		GeneratorAlgorithm ga = new RandomArray();
//		Integer[] array = ga.generate(10);
////		System.out.println(Arrays.toString(array));
//		BubbleSinkSort bs = new BubbleSinkSort();
//		bs.sort(array);
//		System.out.println(Arrays.toString(array));		

		SortingAnalizer sa = new SortingAnalizer();
		sa.writeStatisticsToCsvFile();
	}
}