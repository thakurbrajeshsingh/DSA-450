package LinkedList;

public class CountIndex {

	public static SizeLL<Integer> countSizeInput() {
		
		SizeLL<Integer> l1=new  SizeLL<>(10);
		SizeLL<Integer> l2= new SizeLL<>(20);
		SizeLL<Integer> l3= new SizeLL<>(30);
		SizeLL<Integer> l4= new SizeLL<>(40);
		SizeLL<Integer> l5= new SizeLL<>(50);	
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		return l1;	
	}
	
		
public static int print(SizeLL<Integer> head,int pos) {
	SizeLL<Integer> temp = head;
	int i = 0;
	while(i<pos-1) {
		temp=temp.next;
		i++;
	}
	temp=temp.next;
	int ith=temp.data;
	return ith;
}
//	<---------------------------------------------------------------->
//OR (Optimized)
public static void printIndex(SizeLL<Integer> head,int i) {
	int pos = 0;
	SizeLL<Integer> temp = head;
	while(temp != null && pos<i ) {
		temp = temp.next;
		pos++;
	}
	if(temp !=null) {
		System.out.println( "Data is "+ temp.data);
	}
}
	
	public static void main(String[] args) {
		
	SizeLL<Integer> size = countSizeInput();
//	int ans = 	print(size, 2);
//	System.out.println(ans);
	int ans = print(size,2);
	System.out.println(ans);
	
	}

}
