package collections;

import java.util.Vector;

public class VectorOperations {

	public static void main(String[] args) {
		Vector<Integer> vi=new Vector<Integer>();
					vi.add(8);
					vi.add(0, 1);
					vi.add(6);
					vi.add(1, 5);
		Vector<Integer> v1=new Vector<Integer>();
						v1.add(7);
						v1.add(null);
						v1.add(1);
					
					vi.addAll(v1);
//					vi.add(18);
//					vi.add(189);
//					vi.add(12);
				System.out.println(vi);
				System.out.println(vi.get(4));
				vi.addElement(9);
				System.out.println(vi);
				System.out.println("Capacity " + vi.capacity());
				System.out.println(" Size: " + vi.size());
				System.out.println(vi.isEmpty());
				System.out.println(vi.contains(9));
				System.out.println(vi.indexOf(78));
				System.out.println(vi.set(0, 100));
				System.out.println(vi);
						vi.remove(null);
				System.out.println(vi);
						vi.removeAll(v1);
				System.out.println(vi);
						vi.set(3, 785);
				System.out.println(vi);
				
					
	}

}
