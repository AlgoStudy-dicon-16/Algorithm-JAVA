package shortest_path;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class BJ_13549_���ٲ���3 {
    //���� (���5)

    //ť�� ���ο� ��带 ���� �� ����
    //������ ������ ������������ �����ϰ�,
    //���� ����� ���� ��带 ������ �ִܰŸ��� �����Ѵ�.
    static int n, k;
    static int[] distance;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        //n : �����̰� �ִ� ��ġ
        n = Integer.parseInt(str[0]);
        //k : ������ �ִ� ��ġ
        k = Integer.parseInt(str[1]);

        distance = new int[100001];
        Arrays.fill(distance, Integer.MAX_VALUE);
        visited = new int[100001];


    }

//    public static void dijkstra(int start){
//        PriorityQueue<Node> pq = new PriorityQueue<>();
//        //���� ���� ���� ���� �ִ� ��θ� 0���� �����Ͽ�, ť�� ����
//        pq.offer(new Node(start, 0));
//        d[n] = 0;
//        while(!pq.isEmpty()){
//
//        }
//    }
}

class Node {
    private int index;
    private int distance;

    public Node(int index, int distance){
        this.index = index;
        this.distance = distance;
    }
}
