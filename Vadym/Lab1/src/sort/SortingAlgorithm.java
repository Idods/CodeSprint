package sort;

/**
 * Represents general interface for different sorting algorithms(states of Sorter).
 * @author Vadym
 *
 */
public abstract class SortingAlgorithm {
	
	@SuppressWarnings("rawtypes")
	public abstract <E extends Comparable> void sort(E[] array);
	
	/*method swap is general for all sorting algorithm, therefore 
	it's protected and final*/
	@SuppressWarnings("rawtypes")
	protected final <E extends Comparable> void swap(E[] array, int i, int j){
		E temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}