package HyperSkillDaily;

public class AsciiCharSequence implements CharSequence{

    private byte[] byteArray;
    public AsciiCharSequence(byte[] input){
        byteArray = input;

    }

    public int length(){
        return byteArray.length;
    }

    public char charAt(int index){
        char charAtIndex = (char)byteArray[index];
        return charAtIndex;
    }

    public CharSequence subSequence(int start,int end){

       StringBuilder builder = new StringBuilder();
        for (int i = start; i < end; i++){
            builder.append((char)byteArray[i]);
        }
        String substr =  builder.toString();
       // byte[] byteArrayTemp = substr.getBytes();
        return  substr;



    }

    public String toString(){
        String newString = new String(byteArray);
        return newString;
    }

    public static void main(String[] args) {
        byte[] sample = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        AsciiCharSequence charSeq = new AsciiCharSequence(sample);
        System.out.println("Char  sequence  toString(): " + charSeq.toString());//Hello world!
        System.out.println("Char  sequence length(): " + charSeq.length());//12
        System.out.println("Char at 0 position: " + charSeq.charAt(0));//H
        System.out.println("Char at 11 position: " + charSeq.charAt(11));//!
        System.out.println("Char subSequence: " + charSeq.subSequence(0, 1));//H
        System.out.println("Char subSequence: " + charSeq.subSequence(11, 12));//!
        System.out.println("Char subSequence: " + charSeq.subSequence(0, 4));//Hell
    }
}
