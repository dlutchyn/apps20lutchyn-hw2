package ua.edu.ucu.collections.immutable;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.InputMismatchException;

public class ImmutableArrayListTest {

    @Test
    public void testArrayInit() {
        Integer[] startList = {1, 2, 3};
        ImmutableArrayList arr = new ImmutableArrayList(startList);

        assertEquals("[1, 2, 3]", arr.toString());
    }

    @Test
    public void testAddLastArray() {
        Integer[] startList = {1, 2, 3};
        Object e = 9;
        ImmutableArrayList arr = new ImmutableArrayList(startList);
        ImmutableArrayList newArr = arr.add(e);

        assertEquals("[1, 2, 3, 9]", newArr.toString());
    }

    @Test
    public void testAddIndexArray() {
        Integer[] startList = {1, 2, 3};
        Object e = 9;
        ImmutableArrayList arr = new ImmutableArrayList(startList);
        ImmutableArrayList newArr = arr.add(1, e);

        assertEquals("[1, 9, 2, 3]", newArr.toString());
    }

    @Test
    public void testAddArrLastArray() {
        Integer[] startList = {1, 2, 3};
        Object[] c = {5, 6, 7};
        ImmutableArrayList arr = new ImmutableArrayList(startList);
        ImmutableArrayList newArr = arr.addAll(c);

        assertEquals("[1, 2, 3, 5, 6, 7]", newArr.toString());
    }

    @Test
    public void testAddArrIndexArray() {
        Integer[] startList = {1, 2, 3};
        Object[] c = {5, 6, 7};
        ImmutableArrayList arr = new ImmutableArrayList(startList);
        ImmutableArrayList newArr = arr.addAll(2, c);

        assertEquals("[1, 2, 5, 6, 7, 3]", newArr.toString());
    }

    @Test
    public void testArrayRemove() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableArrayList arr = new ImmutableArrayList(startList);
        ImmutableArrayList newArr = arr.remove(3);

        assertEquals("[1, 2, 3, 5, 6]", newArr.toString());
    }

    @Test
    public void testArraySet() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableArrayList arr = new ImmutableArrayList(startList);
        ImmutableArrayList newArr = arr.set(3, 10);

        assertEquals("[1, 2, 3, 10, 5, 6]", newArr.toString());
    }

    @Test
    public void testArrayIndexOf() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableArrayList arr = new ImmutableArrayList(startList);
        int index = arr.indexOf(2);

        assertEquals(1, index);
    }

    @Test
    public void testArraySize() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableArrayList arr = new ImmutableArrayList(startList);
        int size = arr.size();

        assertEquals(6, size);
    }

    @Test
    public void testArrayClear() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableArrayList arr = new ImmutableArrayList(startList);
        ImmutableArrayList newArr = arr.clear();

        assertEquals("[]", newArr.toString());
    }

    @Test
    public void testArrayIsEmpty() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableArrayList arr = new ImmutableArrayList(startList);
        boolean empty = arr.isEmpty();

        assertEquals(false, empty);
    }

    @Test
    public void testArrayToArray() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableArrayList arr = new ImmutableArrayList(startList);
        Object[] arrArr = arr.toArray();

        assertEquals(Arrays.toString(arrArr), arr.toString());
    }

    @Test
    public void testArrayToString() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableArrayList arr = new ImmutableArrayList(startList);

        assertEquals("[1, 2, 3, 4, 5, 6]", arr.toString());
    }

}
