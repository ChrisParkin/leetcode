import java.util.ArrayList;
import java.util.Stack;
import java.util.List;

public class Solution {

	public List<List<Integer>> subsets(int[] S) {
		List<List<Integer>> O = new ArrayList<List<Integer>>();
		
		for(int i=0; i < Math.pow(2, S.length); i++){
			ArrayList<Integer> l = new ArrayList<Integer>();

			for(int j = 0; j < S.length; j++){
				if((1 & (i >> j)) == 1){
					System.out.println("Adding " + S[S.length - 1 - j]);
					l.add(0,S[S.length - 1 - j]);
				}
				System.out.println(1 & (i >> j));
			}
			System.out.println(l.toString());
			java.util.Collections.sort(l);
			O.add(l);
			System.out.println("--");
		}
		return O;
    }
	
	public List<List<Integer>> subsets2(int[] S) {
		java.util.Arrays.sort(S);
		List<List<Integer>> O = new ArrayList<List<Integer>>();
		
		// empty set
		O.add(new ArrayList<Integer>());
		
		// first element
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(S[0]);
		O.add(l);
		
		// now iteratively concatenate them
		for(int i = 1; i < S.length; i++){
			int length = O.size();
			for(int j = 0; j < length; j++){
				ArrayList<Integer> list = (ArrayList<Integer>) ((ArrayList) O.get(j)).clone();
				list.add(S[i]);
				O.add(list);
			}
		}
		
		return O;
    }
	
	public static void main(String[] args){
		Solution sol = new Solution();
//		List<List<Integer>> sets = sol.subsets(new int[]{4,1,0});
//		for(List<Integer> set : sets){
//			ArrayList<Integer> s = (ArrayList<Integer>)set;
//			System.out.print("{ ");
//			for(Integer i : s){
//				System.out.print(i + " ");
//			}
//			System.out.print("}\n");
//		}
		
		List<List<Integer>> sets2 = sol.subsets2(new int[]{4,2,5,2,32,52,125,1,0});
		for(List<Integer> set : sets2){
			ArrayList<Integer> s = (ArrayList<Integer>)set;
			System.out.print("{ ");
			for(Integer i : s){
				System.out.print(i + " ");
			}
			System.out.print("}\n");
		}
	}
}
