package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    @Test
    public void testLinkInit() {
        Integer[] startList = {1, 2, 3};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);

        assertEquals("[1, 2, 3]", arr.toString());
    }

    @Test
    public void testAddLastLink() {
        Integer[] startList = {1, 2, 3};
        Object e = 9;
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        ImmutableLinkedList newArr = arr.add(e);

        assertEquals("[1, 2, 3, 9]", newArr.toString());
    }

    @Test
    public void testAddIndexLink() {
        Integer[] startList = {1, 2, 3};
        Object e = 9;
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        ImmutableLinkedList newArr = arr.add(1, e);

        assertEquals("[1, 9, 2, 3]", newArr.toString());
    }

    @Test
    public void testAddArrLastLink() {
        Integer[] startList = {1, 2, 3};
        Object[] c = {5, 6, 7};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        ImmutableLinkedList newArr = arr.addAll(c);

        assertEquals("[1, 2, 3, 5, 6, 7]", newArr.toString());
    }

    @Test
    public void testAddArrIndexLink() {
        Integer[] startList = {1, 2, 3};
        Object[] c = {5, 6, 7};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        ImmutableLinkedList newArr = arr.addAll(2, c);

        assertEquals("[1, 2, 5, 6, 7, 3]", newArr.toString());
    }

    @Test
    public void testAddLastElemLink() {
        Integer[] startList = {1, 2, 3};
        Object e = 9;
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        ImmutableLinkedList newArr = arr.addLast(e);

        assertEquals("[1, 2, 3, 9]", newArr.toString());
    }

    @Test
    public void testAddFirstElemLink() {
        Integer[] startList = {1, 2, 3};
        Object e = 9;
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        ImmutableLinkedList newArr = arr.addFirst(e);

        assertEquals("[9, 1, 2, 3]", newArr.toString());
    }

    @Test
    public void testGetFirstLink() {
        Integer[] startList = {1, 2, 3};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        Object getObj = arr.getFirst();

        assertEquals(1, getObj);
    }

    @Test
    public void testGetLastLink() {
        Integer[] startList = {1, 2, 3};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        Object getObj = arr.getLast();

        assertEquals(3, getObj);
    }

    @Test
    public void testRemoveFirstLink() {
        Integer[] startList = {1, 2, 3};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        ImmutableLinkedList newArr = arr.removeFirst();

        assertEquals("[2, 3]", newArr.toString());
    }

    @Test
    public void testRemoveLastLink() {
        Integer[] startList = {1, 2, 3};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        ImmutableLinkedList newArr = arr.removeLast();

        assertEquals("[1, 2]", newArr.toString());
    }

    @Test
    public void testLinkRemove() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        ImmutableLinkedList newArr = arr.remove(3);

        assertEquals("[1, 2, 3, 5, 6]", newArr.toString());
    }

    @Test
    public void testLinkSet() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        ImmutableLinkedList newArr = arr.set(3, 10);

        assertEquals("[1, 2, 3, 10, 5, 6]", newArr.toString());
    }

    @Test
    public void testLinkIndexOf() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        int index = arr.indexOf(2);

        assertEquals(1, index);
    }

    @Test
    public void testLinkSize() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        int size = arr.size();

        assertEquals(6, size);
    }

    @Test
    public void testLinkClear() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        ImmutableLinkedList newArr = arr.clear();

        assertEquals("[]", newArr.toString());
    }

    @Test
    public void testLinkIsEmpty() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        boolean empty = arr.isEmpty();

        assertEquals(false, empty);
    }

    @Test
    public void testLinkToArray() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);
        Object[] arrArr = arr.toArray();

        assertEquals(Arrays.toString(arrArr), arr.toString());
    }

    @Test
    public void testLinkToString() {
        Integer[] startList = {1, 2, 3, 4, 5, 6};
        ImmutableLinkedList arr = new ImmutableLinkedList(startList);

        assertEquals("[1, 2, 3, 4, 5, 6]", arr.toString());
    }
}
