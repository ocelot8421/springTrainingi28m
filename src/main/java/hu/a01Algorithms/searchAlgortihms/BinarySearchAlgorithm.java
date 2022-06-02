package hu.a01Algorithms.searchAlgortihms;

import hu.a02Animals.bottomLayer.SortAlgorithm;
import hu.a01Algorithms.sortAlgorithms.BubbleSortAlgorithm;

public class BinarySearchAlgorithm {

    //Loose Coupling --------------------------------------------------------------------------------------------------
    //attributes:
    private SortAlgorithm sortAlgorithm;

    //Constructors:
    public BinarySearchAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    //Methods:
    public int binarySearchLooseCouplingMethod(int[] numbers, int numberToSearchFor) {

        //Instances:
        //____________

        //Method of Instantiated Class:
        //____________

        //Method of Attribute:
        int[] sortedNumbers = sortAlgorithm.sortMethod(numbers);

        //Search the array
        return 20;
    }


    //Tight Coupling --------------------------------------------------------------------------------------------------
    //attributes:
    //_________

    //Constructors:
    public BinarySearchAlgorithm() {
        //_________
    }

    //Methods:
    public int binarySearchTightCouplingMethod(int[] numbers, int numberToSearchFor) {

        //Instances:
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

        //Method of Instance:
        int[] sortedNumbers = bubbleSortAlgorithm.sortMethod(numbers);

        //Method of Attribute:
        //__________

        //Search the array
        return 10;
    }


}
