import javax.xml.stream.events.Characters;
import java.util.HashSet;
import java.util.List;

public class Maximum_Length_of_a_Concatenated_String_with_Unique_Characters {
    public int maxLength(List<String> arr) {
for (int i = 0;i<arr.size()-1;i++){
    for (int j = i+1;j<arr.size();j++){
        String s = arr.get(i)+ arr.get(j);
        HashSet<Characters> set = new HashSet<>();
        for (int k =0;k<s.length();k++){
            if (set.contains(s.charAt(k))){
                continue;
            }
            else {}
        }
    }

}


   return 3; }

}
