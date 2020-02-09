package algo.coursera.part1.week1;

public class QuickUnionImproveUF {
    private int[] id;
    private int[] sz;

    public QuickUnionImproveUF(int n){
        id = new int[n];
        sz = new int[n];
        for(int i=0; i<n; i++){
            id[i] = i;
            sz[i] = 0;
        }
    }

    private int root(int i){
        while (i != id[i]){
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q){
        return (root(p) == root(q));
    }

    public void union(int p, int q){
        int pid = root(p);
        int qid = root(q);
        if(pid == qid)
            return;
        if(sz[pid] < sz[qid]) {
            id[pid] = qid;
            sz[qid] += sz[pid];
        }else {
            id[qid] = pid;
            sz[pid] += sz[qid];
        }
    }
}
