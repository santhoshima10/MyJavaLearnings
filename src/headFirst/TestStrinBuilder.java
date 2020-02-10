package headFirst;

public class TestStrinBuilder {

    public static void main(String[] args){
        System.out.println((2*3) + 4 * (5 + 6 * 7));

        String address = "1.1.1.1";
        StringBuilder sb = new StringBuilder();
        String[] strArr = "1.1.1.1".split("\\.");
        System.out.println(strArr.length);

        for(int i = 0; i < strArr.length-1; i++){
            System.out.println(strArr[i]);
            sb.append(strArr[i]);
            if(i == strArr.length-1){
                continue;
            }
            else{
                sb.append("[.]");
            }

        }
        System.out.println(sb.toString());
    }



}
