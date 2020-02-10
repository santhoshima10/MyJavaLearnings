import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

    public static void main(String[] args){

        Map<String,Boolean> shoppingList = new HashMap<String, Boolean>();

        shoppingList.put("Idly Rice",true);
        shoppingList.put("Bread",Boolean.TRUE);
        shoppingList.put("Chips",Boolean.FALSE);
        shoppingList.put("Eggs",Boolean.TRUE);
        shoppingList.put("Coffee",true);

        System.out.println(shoppingList.get("Bread"));
        System.out.println(shoppingList.toString());

    }

}
