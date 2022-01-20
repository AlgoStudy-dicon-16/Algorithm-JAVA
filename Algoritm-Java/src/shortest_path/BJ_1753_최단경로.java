package shortest_path;

import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_1753_�ִܰ�� {

    static int v, e; //v:������ ����, e:������ ����
    static int k; //k:���� ������ ��ȣ
    static final int INF = Integer.MAX_VALUE;
    static ArrayList<Node>[] list;
    static int[] distance;
    static int start;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        v = Integer.parseInt(st.nextToken());
        e = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(br.readLine());

        list = new ArrayList[v+1]; //���� ������ŭ �ʱ�ȭ
        distance = new int[v+1]; //���� ������ŭ �ʱ�ȭ
        for(int i=1;i<=v;i++){
            list[i] = new ArrayList<>();
        }

        Arrays.fill(distance, INF); //�ִ����� �ʱ�ȭ
        distance[k] = 0;
        //����Ʈ�� �׷��� ������ �ʱ�ȭ
        for(int i=0;i<e;i++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());
            //start���� end�� ���� �Ÿ�
            list[start].add(new Node(end, distance));
        }
       dijkstra();
        for(int i=1;i<=v;i++){
            //dist�� �ʱⰪ �״�� INF��� "INF"���
            if(distance[i]==INF) {
                System.out.println("INF");
            }
            else System.out.println(distance[i]);
        }



    }

    private static void dijkstra(){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));

        while(!pq.isEmpty()){
            Node node = pq.poll();
            int vertex = node.index;
            int weight = node.distance;

            if(distance[vertex]<weight){
                continue;
            }

            for(Node n:list[vertex]){
                if(distance[n.index]>distance[vertex]+n.distance){
                    distance[n.index] = distance[vertex]+n.distance;
                    pq.add(new Node(n.index, distance[n.index]));
                }
            }
//            for(int i=0;i<list[vertex].size();i++){
//                int vertex2 = list[vertex].get(i).index;
//                int weight2 = list[vertex].get(i).distance + weight;
//                if(distance[vertex2]>weight2){
//                    //���粲 �� �ִܰ�θ� ����
//                    distance[vertex2] = weight2;
//                    pq.add(new Node_1753(vertex2, weight2));
//                }
//            }
        }
    }

static class Node implements Comparable<Node>{
     int index;
     int distance;

    public Node(int index, int distance){
        this.index = index;
        this.distance = distance;
    }
    @Override
    public int compareTo(Node o) {
        return distance-o.distance;
    }
}

}


