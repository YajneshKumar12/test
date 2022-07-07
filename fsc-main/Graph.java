package graph;
import java.io.*;
import java.util.*;
import java.util.Iterator;
public class Graph
{
		int Node,V;
		Queue<Integer> q;
		LinkedList <Integer> adjlist[];
		Graph(int v)
		{
			V=v;
			Node = v;
			adjlist=new LinkedList[Node];
			for(int i=0;i<v;i++)
			{
				adjlist[i]=new LinkedList<>();
			}
			q = new LinkedList<Integer>();
		}
		public void addEdge(int u, int v)
		{
			adjlist[v].add(u);
			//adjlist[v].add(u);	
		}
	/*	public void printAdjList()
		{
				for(int i=0;i<adjlist; i++)
				{
					System.out.println("Adj list :\n" +i);
					for(int j=0;j<adjlist.get(i).size(); j++) // no of edges connected to the vertex
					{
						System.out.println(" "+adjlist.get(i).get(j));
					}
				}

		} */
		void BFS(int n)
		{
			boolean nodes[] = new boolean[Node];
			int a=0 ;
			//LinkedList<Integer> q = new LinkedList<Integer>();
			nodes[n]=true;
			q.add(n);
			while(q.size()!=0)
			{
				n=q.poll();
				System.out.println(n+ " ");
				for(int i=0;i<adjlist[n].size();i++)
				{
					a=adjlist[n].get(i);
					if(!nodes[a])
					{
						nodes[a]=true;
						q.add(a); 
					}
				} 
			/*	Iterator<ArrayList<Integer>> i = new Iterator<Integer>();
				while(i.hasNext())
				{
					a=adjlist.get(i).size;
					if(!nodes[a])
					{
						nodes[a]=true;
						q.add(n);
					}
				} */
			}
		}
}

	
