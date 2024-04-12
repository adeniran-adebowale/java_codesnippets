package src.org.fedemyanor.codesnippets;

public class Counter {  
    private int count; 
    public Counter( ) { } // default constructor (count is 0)
    public Counter(int initial) { count = initial; } // an alternate constructor
    public int getCount( ) { return count; } // an accessor method
    public void increment( ) { count++; } // an update method
    public void increment(int delta) { count += delta; } 
    public void decrement( ) { count--; } // an update method
    public void decrement(int delta) { count -= delta; } 
    
    public void reset( ) { count = 0; } 
    }