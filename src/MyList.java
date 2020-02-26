public class MyList<E> implements Cloneable{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;


    public MyList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int Capacity) {
        elements =  new Object[Capacity];
    }

    public void add(int index, E element) {
        ensureCapacity(elements.length);
        for (int i = size-1;i>=index;i--){
            elements[i+1] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public void ensureCapacity(int minCapacity){
        if (size >= minCapacity){
            Object[] newArr =  new Object[size*2+1];
            System.arraycopy(elements, 0, newArr, 0, size);
            elements = newArr;
        }
    }

    public void clear() {
        size = 0;
        elements = new Object[size];
    }

    public int indexOf(E o) {
        for (int i=0;i<elements.length;i++){
            if(o.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(E o) {
        for (int i=0;i<elements.length;i++){
            if (o.equals(elements[i]))
                return true;
        }
        return false;
    }

    public E remove(int index) {
        int count = 0;
        E e = (E) elements[index];
        Object[] newArr = new Object[elements.length-1];
        for (int i=0;i<elements.length;i++){
            if (i==index) continue;
            newArr[count++] = elements[i];
        }
        elements = newArr;
        return e;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        if (index<0 || index >=elements.length){
            throw new IndexOutOfBoundsException();
        }

        return (E) elements[index];
    }

    public void showList() {
        for (Object i: elements) {
            System.out.println(i);
        }
    }

    public void trimToSize() {
        if (size!=elements.length){
            Object[] newArr = (E[]) new Object[size];
            System.arraycopy(elements,0,newArr,0, size);
            elements = newArr;
        }
    }
}
