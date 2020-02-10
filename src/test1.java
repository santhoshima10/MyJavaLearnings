public class test1 {


        public static int min(int a, int b, int c, int d) {
            int minValue=0;
            if(min(a,b)< min(c,d)){
                minValue = min(a,b);
            }
            else{
                minValue = min(c,d);
            }
            return minValue;

        }

        public static int min(int a, int b) {
            int minValue = 0;
            if(a < b){
                minValue = a;
            }
            else{
                minValue = b;
            }
            return minValue;

        }

        public static void main(String[] args) throws Exception {
            String word = "hello";
           // word.toCharArray()
            System.out.println(2+2+"2");
            System.out.println("2"+2+2);
            String str = "a simple string";
                    if(str.startsWith("A simple")){
                        str = str.substring(2,8);
                    }
                    else{
                        str = str.replace("a","A SIMPLE").substring(2,8);
                    }

                    System.out.println(str);
            System.out.println(min(-20, -10));
            System.out.println(min(-20, -10, -30, -40));
            System.out.println(min(-20, -10, -30, 40));
            System.out.println(min(-40, -10, -30, 40));

            String s = "welcometojava";
            String substr = "";
            String max="";
            String min=s.substring(0,3);
            System.out.println("Length of string"+s.length());
            for(int i = 0; i < s.length();i++){
                if(i+3 <= s.length()){
                    substr = s.substring(i,i+3);
                    System.out.println(s.substring(i,i+3));

                    if(substr.compareTo(max) > 0){
                        max = substr;
                    }
                }





            }
            System.out.println(max);


            for(int i = 0; i < s.length();i++){
                if(i+3 <= s.length()){
                    substr = s.substring(i,i+3);

                    if(substr.compareTo(min) < 0){
                        min = substr;
                    }
                }




            }
            System.out.println(min);

        }
    }

