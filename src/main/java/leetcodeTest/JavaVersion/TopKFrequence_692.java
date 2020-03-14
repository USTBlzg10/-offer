/*
package leetcodeTest.JavaVersion;

import java.util.*;

*/
/**
 * @author LiuZhiguo
 * @date 2019/11/20 14:12
 * 给一非空的单词列表，返回前 k 个出现次数最多的单词。
 * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
 * 输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
 * 输出: ["i", "love"]
 * 解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
 *     注意，按字母顺序 "i" 在 "love" 之前。
 *//*

public class TopKFrequence_692 {
    public List<String> topKFrequent(String[] words,int k){
        //创建一个Map，记录每个单词出现的次数
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        //使用优先队列，通过出现次数排列单词
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //1.如果word出现频率相同，按照字母顺序排序
                if (map.get(s1) == map.get(s2)) {
                    return s1.compareTo(s2);
                }
                //2.按照出现频率从大到小排序
                return map.get(s2) - map.get(s1);
            }
        });
        //3.往优先队列插入元素
        for (String key : map.keySet())
            priorityQueue.add(key);
        //4.加入集合
        List<String> res = new ArrayList<>();
        for (int i = 0; i < k; i++)
            res.add(priorityQueue.poll());
        return res;
    }
    public static void main(String[] args){
        TopKFrequence_692 topKFrequence_692 = new TopKFrequence_692();
        String[] strings = {"i","love", "leetcode", "i", "love", "coding"};
        System.out.println(topKFrequence_692.topKFrequent(strings,2));
    }
}
*/
