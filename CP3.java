
/**
 * Given the root to a binary tree, implement serialize(root), 
 * which serializes the tree into a string, and deserialize(s), 
 * which deserializes the string back into the tree.
 */
public class CP3
{
    public static void main(String[] args){
        System.out.println(serialize(n));
    }
	
	public String serialize(Node n){
        StringBuilder s = “”.append(n.value());
        if(n.left()){
                s.append(“l”+ serialize(n.getLeft()));
        }
        if(n.right()){
                s.append(“r”+ serialize(n.getRight()));
        }
        s.append(“u”);
        return s.toString();

}

}
