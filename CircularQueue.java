
public class CircularQueue {
	int[] data;
	int count;
	int head, tail;
	CircularQueue(int _s)
	{
		data = new int[_s];
		count = 0;
		head = tail = -1;
	}
	public void printQueue()
	{
		for(int i = head ; i < head + count;  i++ )
		{
			System.out.print(data[i % data.length] + " ");
		}
		System.out.println();
	}
	
	public void enQueue(int v) throws Exception
	{
		if(count == data.length)
			throw new Exception();
		count++;
		if(count == 1)
			head++;
		tail = (tail + 1) % data.length;
		data[tail] = v;
	}
	
	public int deQueue() throws Exception
	{
		if(count == 0)
			throw new Exception();
		count--;
		int d = data[head];
		head = (head + 1) % data.length;
		return d;
	}
	
	public static void main(String[] args) throws Exception
	{
		CircularQueue c = new CircularQueue(4);
		c.enQueue(1);
		c.enQueue(2);
		c.enQueue(3);
		c.enQueue(4);
		c.printQueue();
		c.deQueue();
		c.printQueue();
		c.enQueue(5);
		c.printQueue();
		c.deQueue();
		c.deQueue();
		c.printQueue();
		c.enQueue(1);
		c.enQueue(2);
		c.printQueue();
		
	}

}
