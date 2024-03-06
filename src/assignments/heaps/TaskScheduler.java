package src.assignments.heaps;

class TaskScheduler {
    // https://leetcode.com/problems/task-scheduler/
    class Task {
        int time;
        int freq;

        public Task(int time, int freq) {
            this.time = time;
            this.freq = freq;
        }
    }
    public int leastInterval(char[] tasks, int n) {
        int[] arr = new int[26];
        for(char task: tasks) arr[task-'A']++;

        int max = 0, maxCount = 0;
        for (int val: arr){
            if (max == val) maxCount++;
            else if (max < val) {
                max = val;
                maxCount = 1;
            }
        }

        int emptySlots = (max - 1) * (n - (maxCount - 1));
        int availableTasks = tasks.length - max * maxCount;
        int idles = Math.max(0, emptySlots - availableTasks);
        
        return tasks.length + idles;
        // int totalTime = 0;
        // int[] freq = new int[26];

        // for(char ch : tasks) {
        //     freq[ch - 'A'] += 1;
        // }
        // PriorityQueue<Task> pq = new PriorityQueue<>(new Comparator<Task>(){
        //     public int compare(Task a, Task b) {
        //         return -Integer.compare(a.freq, b.freq);
        //     }
        // });

        // for(int i = 0; i < 26; i++) {
        //     if(freq[i] > 0) {
        //         pq.add(new Task(0, freq[i]));
        //     }
        // }
        // Queue<Task> q = new LinkedList<>();
        // while(!pq.isEmpty() || !q.isEmpty()) {
        //     if(!q.isEmpty() && totalTime - q.peek().time > n) {
        //         pq.add(q.remove());
        //     }
        //     if(!pq.isEmpty()) {
        //         Task task = pq.remove();
        //         task.freq--;
        //         task.time = totalTime;

        //         if(task.freq > 0) {
        //             q.add(task);
        //         }
        //     }
        //     totalTime++;
        // }
        // return totalTime;
    }
}