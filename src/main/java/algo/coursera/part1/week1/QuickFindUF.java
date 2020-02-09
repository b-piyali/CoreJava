package algo.coursera.part1.week1;

public class QuickFindUF {
    private int[] id;

    public QuickFindUF(int n){
        id = new int[n];
        for(int i=0; i<n; i++){
            id[i] = i;
        }
    }

    public boolean connected(int p, int q){
        return (id[p] == id[q]);
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        int len = id.length;
        for(int i=0; i<len; i++){
            if(id[i] == pid)
                id[i] = qid;
        }
    }
}
