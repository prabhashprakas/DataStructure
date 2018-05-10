package trie;

public class TrieNode {
	boolean isWord;
	TrieNode [] children = new TrieNode[26];
	TrieNode() {
		this.isWord = false;
		for (int i = 0; i<26; ++i) {
			children[i] = null;
		}
	}
	int getIndex(char c) {
		return (int)c - (int)'a';
	}
	void addchar(char c) {
		this.children[getIndex(c)] = new TrieNode();
	}
	boolean isNull(char c) {
		if (this.children[getIndex(c)] == null) return true;
		else return false;
	}
	boolean isEnd(char c) {
		if (this.children[getIndex(c)].isWord == true) return true;
		else return false;
	}
	void makeEnd(char c) {
		this.children[getIndex(c)].isWord = true;
	}
	TrieNode next(char c) {
		return this.children[getIndex(c)];
	}
}
