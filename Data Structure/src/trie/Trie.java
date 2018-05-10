package trie;

public class Trie {
	TrieNode root;
	Trie() {
		root = new TrieNode();
	}
	void insert(String str) {
		TrieNode currNode = this.root;
		for (int i = 0; i<str.length(); ++i) {
			char c = str.charAt(i);
			
			if (currNode.isNull(c)) {
				currNode.addchar(c);
			}
			if (i == str.length() - 1) {
				currNode.makeEnd(c);
			}
			currNode = currNode.next(c);
		}
	}
	boolean isExist(String str) {
		TrieNode currNode = this.root; 
		for (int i = 0; i<str.length(); ++i) {
			char c = str.charAt(i);
			if (currNode.isNull(c)) {
				return false;
			}
			if (i == str.length() - 1 & currNode.isEnd(c)) {
				return true;
			}
			currNode = currNode.next(c);
		}
		return false;
	}
	public static void main(String args[]) {
		Trie trie = new Trie();
		trie.insert("king");
		trie.insert("kind");
		trie.insert("kin");
		
		System.out.println(trie.isExist("k"));
		System.out.println(trie.isExist("ki"));
		System.out.println(trie.isExist("kin"));
		System.out.println(trie.isExist("king"));
		System.out.println(trie.isExist("kong"));
		System.out.println(trie.isExist("kings"));
	}
}
