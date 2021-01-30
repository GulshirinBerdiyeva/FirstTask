package com.epam.task.first.logic;

import com.epam.task.first.entity.Array;
import com.epam.task.first.view.ConsoleArrayPrinter;
import org.junit.Assert;
import org.junit.Test;

public class ArrayLogicTest {
    private ArrayLogic arrayLogic = new ArrayLogic();
    private final Array array = new Array(7, 18, -1, 2, 6, -4, -5);

    //findMax
    @Test
    public void testFindMaxShouldFindMaxWhenNumbersApplied(){
        //when
        int actual = arrayLogic.findMax(array);

        //then
        Assert.assertEquals(18, actual);
    }

    //findMin
    @Test
    public void testFindMinShouldFindMinWhenNumbersApplied(){
        //when
        int actual = arrayLogic.findMin(array);

        //then
        Assert.assertEquals(-5, actual);
    }

    //replacementEvenElements
    @Test
    public void testReplacementEvenElementsShouldReplacementEvenElementsWhenNumbersApplied(){
        //given
        ConsoleArrayPrinter printer = new ConsoleArrayPrinter();
        printer.print(array);

        //when
        arrayLogic.replacementEvenElements(array);

        //then
        printer.print(array);
    }

    //findMean
    @Test
    public void testFindMeanShouldFindMeanWhenNumbersApplied(){
        //when
        double actual = arrayLogic.findMean(array);

        //then
        Assert.assertEquals(3.286, actual, 0.001);
    }

    //findSum
    @Test
    public void testFindSumShouldFindSumWhenNumbersApplied(){
        //when
        int actual = arrayLogic.findSum(array);

        //then
        Assert.assertEquals(23, actual);
    }

    //findAmountOfPositiveElements
    @Test
    public void testFindAmountOfPositiveElementsShouldFindAmountOfPositiveElementsWhenNumbersApplied(){
        //when
        int actual = arrayLogic.findAmountOfPositiveElements(array);

        //then
        Assert.assertEquals(4, actual);
    }

    //findAmountOfNegativeElements
    @Test
    public void testFindAmountOfNegativeElementsShouldFindAmountOfNegativeElementsWhenNumbersApplied(){
        //when
        int actual = arrayLogic.findAmountOfNegativeElements(array);

        //then
        Assert.assertEquals(3, actual);
    }

}
