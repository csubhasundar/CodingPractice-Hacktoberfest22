#include <bits/stdc++.h>
using namespace std;

void topo(int N, vector<int> adj[])
{

	// indegree set first
	vector<int> indegree(N, 0);
	for (int i = 0; i < N; i++)
	{
		for (auto it : adj[i])
		{
			indegree[it]++;
		}
	}
	queue<int> q;
	for (int i = 0; i < N; i++)
	{
		if (indegree[i] == 0)
		{
			q.push(i);
		}
	}
	int count = 0;
	// if the queue is not emty
	while (q.empty() == false)
	{
		int node = q.front();
		q.pop();
		// all the adjacent of the current
		for (auto it : adj[node])
		{
			indegree[it]--;
			if (indegree[it] == 0)
			{
				q.push(it);
			}
		}
		count++;
	}
	if (count != N)
	{
		cout << "There exists a cycle in the graph\n";
	}
	else
	{
		cout << "There exists no cycle in the graph\n";
	}
}

// t-O(n+e)
// s-O(n)+O(n)
void addEdge(vector<int> adj[], int u, int v)
{
	adj[u].push_back(v);
}
int main()
{

	// vector<int> adj[6];
	// adj[5].push_back(2);
	// adj[5].push_back(0);
	// adj[4].push_back(0);
	// adj[4].push_back(1);
	// adj[3].push_back(1);
	// adj[2].push_back(3);

	// Solution obj;
	// vector<int> v = obj.topo(6, adj);
	// for (auto it : v)
	// 	cout << it << " ";
	int V = 5;
	vector<int> adj[V];
	addEdge(adj, 0, 1);
	addEdge(adj, 4, 1);
	addEdge(adj, 1, 2);
	addEdge(adj, 2, 3);
	addEdge(adj, 3, 1);

	topo(V, adj);

	return 0;
}
