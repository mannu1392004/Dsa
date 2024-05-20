public class eucledien_algorithm {
    public String gcdOfStrings(String str1, String str2) {
if (
  !(str1+str2).endsWith(str2+str1)
){
    return "";
}
int len1 = str1.length();
int len2 = str2.length();

while (len2!=0){
    int temp = len2;
    len2 = len1%len2;
    len1 = temp;
}
return str1.substring(0,len1);
    }
}
