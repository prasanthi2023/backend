import java.util.Collection;
import java.util.ArrayList;

public class Todo_IsEmpty {
    public static void main(String[] args){
        Collection<String> letters=new ArrayList<>();
        letters.add("J");
        letters.add("A");
        letters.add("V");
        letters.add("A");
        if(letters.isEmpty()) System.out.println("Empty List");
        else{
            System.out.println("contains values ->" + letters);
        }

    }
}
