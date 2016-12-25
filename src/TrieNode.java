import java.util.HashMap;

/**
 * Created by vinija on 12/25/16.
 */
public class TrieNode {

    char c;
    HashMap<Character,TrieNode> children = new HashMap<Character,TrieNode>();
    boolean isLeaf;

    public TrieNode(char c){
        this.c = c;
    }

    public TrieNode(){}

}
