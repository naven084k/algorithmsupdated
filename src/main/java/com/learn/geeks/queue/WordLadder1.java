package com.learn.geeks.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class WordNode {
	public WordNode(String word, int numberOfSteps) {
		super();
		this.word = word;
		this.numberOfSteps = numberOfSteps;
	}
	public WordNode(String word, int numberOfSteps,WordNode pre) {
		super();
		this.word = word;
		this.numberOfSteps = numberOfSteps;
		this.pre=pre;
	}
	String word;
	int numberOfSteps;
	WordNode pre;
	
}
public class WordLadder1 {

	public static void main(String[] args) {
		List<String> dictionary = new ArrayList<String>();
		dictionary.addAll(Arrays.asList(new String[]{"hot","dot","dog","lot","log"}));
		String start="hit";
		String target="cog";
		dictionary.add(target);
		Queue<WordNode> queue = new LinkedList<>();
		
		queue.add(new WordNode(start,1));
		while(!queue.isEmpty()) {
			WordNode node = queue.poll();
			
			if(node.word.equalsIgnoreCase(target)) {
				System.out.println("number of words "+node.numberOfSteps);
				break;
			}
			char[] wordArr = node.word.toCharArray();
			for(int i=0;i<wordArr.length;i++) {
				for(char a='a';a<='z';a++) {
					char temp = wordArr[i];
					if(wordArr[i] != a)
						wordArr[i]=a;
					String adjecentWord = new String(wordArr);
					if(dictionary.contains(adjecentWord)) {
						queue.add(new WordNode(adjecentWord,node.numberOfSteps+1,node));
					}
					wordArr[i]=temp;
				}
			}
		}
	}
}
