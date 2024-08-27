package sets;
import java.util.Comparator;

public class MyComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		int cid1 = o1.getId();
		int cid2 =o2.getId();
		if(cid1 <cid2) {
			return -1;
		}else if(cid1>cid2) {
			return 1;
		}else {
			return 0;
		}
	}

}