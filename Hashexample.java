
import java.util.HashMap;
 public class Hashexample
 {
 public static  void main (String []args)
 {
    HashMap<String, Integer>  nums = new HashMap<>();
    nums.put("Tesla" ,2025);
    nums.put("Mazda" ,2018);
    nums.put("Elantra" ,2013);
    System.out.println(nums.get("Mazda"));
 }}
 