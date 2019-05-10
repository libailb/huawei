import java.util.Arrays;
import java.util.HashMap;

public class test {
public static void main(String[] args) {
	String s = "15261812225|2000.00|2|0||";
	String[] a = s.trim().split("\\|");
	//System.out.println(a.length);
	//System.out.println(Arrays.toString(a));
	
	String s1 = "15261812225";
	long l1 = Long.parseLong(s1);
	//System.out.println(l1);
	
	String s2 = "!3!4";
	String[] a2 = s2.split("!");
	//System.out.println(Arrays.toString(a2));
	HashMap<Integer, Integer> map = new HashMap<>();
	map.put(2, 2);
	System.out.println(map.get(3));
	
}
}
