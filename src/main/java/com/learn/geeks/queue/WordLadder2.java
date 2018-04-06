package com.learn.geeks.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class WordLadder2 {


		public static void main(String[] args) {
			List<String> dictionary = new ArrayList<String>();
			List<String> visited = new ArrayList<String>();
			dictionary.addAll(Arrays.asList(new String[]{"hot","dot","dog","lot","log"}));
			String start="hit";
			String target="cog";
			dictionary.add(target);
			Queue<WordNode> queue = new LinkedList<>();
			int minSteps=0;
			int preNumOfSteps = 0;
			
			queue.add(new WordNode(start,1));
			while(!queue.isEmpty()) {
				WordNode node = queue.poll();
				int currentNumOfSteps = node.numberOfSteps;
				if(node.word.equalsIgnoreCase(target)) {
					System.out.println("number of words "+node.numberOfSteps);
					while(node.pre !=null){
						System.out.print(node.word+" ->");
	                    node = node.pre;
	                }
					System.out.print(start);
					continue;
				}
				if(preNumOfSteps < currentNumOfSteps)
					dictionary.removeAll(visited);
				preNumOfSteps=currentNumOfSteps;
				char[] wordArr = node.word.toCharArray();
				for(int i=0;i<wordArr.length;i++) {
					for(char a='a';a<='z';a++) {
						char temp = wordArr[i];
						if(wordArr[i] != a)
							wordArr[i]=a;
						String adjecentWord = new String(wordArr);
						if(dictionary.contains(adjecentWord)) {
							queue.add(new WordNode(adjecentWord,node.numberOfSteps+1,node));
							visited.add(adjecentWord);
						}
						wordArr[i]=temp;
					}
				}
			}
}
}
