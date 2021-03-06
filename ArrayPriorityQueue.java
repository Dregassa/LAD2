import java.util.ArrayList;

public class ArrayPriorityQueue<T extends Comparable<? super T>> implements PriorityQueue<T>{

    
    private ArrayList<T> _data;

    public void add(T item){
	_data.add(item);
    }

    public boolean isEmpty(){
	return _data.size() == 0;
    }

    public T peekMin(){

	if (isEmpty()) return null; 
	
	T value = _data.get(0);
	for (int k = 1; k < _data.size(); k++){
	    if (value.compareTo(_data.get(k)) > 0) { //value greater than current object
		value = _data.get(k);
	    }
	    
	}
	return value;
    }

    public T removeMin(){

	if (isEmpty()) return null; 
	
	T value = _data.get(0);
	int index = 0;
	for (int k = 1; k < _data.size(); k++){
	    if (value.compareTo(_data.get(k)) > 0) { //value greater than object
		value = _data.get(k);
		index = k;
	    }
	    
	}

	_data.remove(index);
	return value;
    }

    
    public ArrayPriorityQueue(){
	_data = new ArrayList<T>();
    }


    public static void main(String[] args){

	ArrayPriorityQueue daniel = new ArrayPriorityQueue<Integer>();

	System.out.println(daniel.isEmpty());
	
	daniel.add(4);

	System.out.println(daniel.isEmpty());
	
	daniel.add(1);
	daniel.add(4);
	daniel.add(3);
	daniel.add(2);
	daniel.add(2);

	System.out.println(daniel.peekMin());
	System.out.println(daniel.removeMin());
	System.out.println(daniel.removeMin());
	System.out.println(daniel.removeMin());

	System.out.println(daniel.isEmpty());
	
	System.out.println(daniel.removeMin());
	System.out.println(daniel.removeMin());
	System.out.println(daniel.removeMin());

	System.out.println(daniel.isEmpty());

	System.out.println(daniel.removeMin());

	
	
    }
}


