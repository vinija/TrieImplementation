import java.util.HashMap;

/**
 * Created by vinija on 12/25/16.
 */
public class Trie {
    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    //Insert a word into the Trie
    public void insert(String word){
        HashMap<Character,TrieNode> children = root.children;

        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);

            TrieNode t;

            if(children.containsKey(c)){
                t = children.get(c);
            }else{
                t = new TrieNode(c);
                //Character, TrieNode
                children.put(c,t);
            }

            children = t.children;

            if(i==word.length()-1)
                t.isLeaf = true;
        }
    }

    public boolean search (String word){
        TrieNode t = searchNode(word);
        if(t != null && t.isLeaf)
            return true;
        else
            return false;

    }

    public TrieNode searchNode(String word){
        HashMap<Character, TrieNode> children = root.children;
        TrieNode t = null;
        for (int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(children.containsKey(c)){
                t= children.get(c);
                children = t.children;
            }else{
                return null;
            }
        }
        return t;
    }
}
