 package LinkedList;

public class LinkedListSize {
	
	
	
	public static SizeLL<Integer> LinkedList(){
	SizeLL<Integer> I1= new SizeLL<>(2);
	SizeLL<Integer> I2= new SizeLL<>(3);	
	SizeLL<Integer> I3= new SizeLL<>(4);		
	SizeLL<Integer> I4= new SizeLL<>(5);	
	SizeLL<Integer> I5= new SizeLL<>(6);
	SizeLL<Integer> I6= new SizeLL<>(1);
	I1.next=I2;
	I2.next=I3;
	I3.next=I4;
	I4.next=I5;
	I5.next=I6;
	
	return I1;
	}
	
	
	public static int printSize(SizeLL<Integer> head) {
		int count=0;
		SizeLL<Integer> temp = head;
		while(temp !=null) {
		count +=1;
		temp = temp.next;
		}
		return count;
	}

	public static void main(String[] args) {
		SizeLL<Integer> size  = LinkedList();
				int ans=printSize(size);
				System.out.println(ans);

	}

}
