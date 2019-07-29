class FreqStack {
    Map<Integer, Integer> freq ;
    Map<Integer, Stack<Integer>> group;
    int maxfreq;
    public FreqStack() {
        freq = new HashMap<>();
        group = new HashMap<>();
        maxfreq = 0;
    }

    public void push(int x) {
        int f = freq.getOrDefault(x, 0) + 1;
        freq.put(x,f);
        if(f > maxfreq){
            maxfreq = f;
        }
        group.computeIfAbsent(f,z->new Stack()).push(x);
    }

    public int pop() {
        int x = group.get(maxfreq).pop();
        freq.put(x, freq.get(x) - 1);
        if(group.get(maxfreq).size() == 0){
            maxfreq --;
        }
        return x;
    }
}
/*
Topic: Stack
Algorithms:
1. we need a map called freq to record the elements 'x' and its number of occurrences
2. we also need a maxfreq to keep track of current maximum frequency of any elements 
in the stack.
3. group is a map from frequency to a stack of elements with that frequency.
4. If x has the frequency f, we will have x in all group[i] (i <= f), not just top.

Time: O(1) for both pop() and push() operations
Space: O(N) which is number of element in the FreqStack
*/
/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */
