package Recursion;

public class TowerOfHanoi {
	
	public static void towerHanoi(int disks,int source,int aux,int dest) {
		if(disks==0) {
			return;
		}
		towerHanoi(disks-1, source, dest, aux);
		System.out.println("Move Disk 1 from rod "+ source + "to rod" + dest);
		towerHanoi(disks-1, aux, source, dest);
	}

	public static void main(String[] args) {
		int disks = 2;
		char a,b,c;
		towerHanoi(disks, 1,2 ,3 );

	}

}
