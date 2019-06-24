import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WeekCMutation {

	public static void main(String[] args) {
		String start = "AACCGGTT";
		String end = "AAACGGTA";
		String bank [] = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};
		WeekCMutation obj = new WeekCMutation();
		System.out.println(obj.Mutation(start, end, bank));
	}
	
	public int Mutation(String start, String end, String[] bank) {
			  
			
			  Set<String> all = new HashSet<>();
	        all.addAll(Arrays.asList(bank));
	        int result = 1;
	        Set<String> mutate = new HashSet<>();
	        all.remove(start);
	        mutate.add(start);
	      
	        
	        
	        while (!all.isEmpty() && result <= bank.length) {
	            Set<String> t = new HashSet<>();
	            for (String gene : mutate) {
	                for (int i = 0; i < 8; i++) {
	                    char[] array = gene.toCharArray();
	                    for (char c : new char[] {'A', 'C', 'G', 'T'}) {
	                        array[i] = c;
	                        String temp = new String(array);
	                        if (all.contains(temp)) {
	                            if (end.equals(temp)) {
	                                return result;
	                            }
	                            t.add(temp);
	                            all.remove(temp);
	                        }
	                          }
	                          }
	                          }
	                                    result++;
	                                    mutate.addAll(t);
	                                           
	                          }
	                                  return -1;
	                            }
	                          }
	