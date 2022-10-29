#include<bits/stdc++.h>
using namespace std;

/*
1-> create a visited array for all the vertices and marks all as visited.
2->start a loop and push the first vertice of graph.
3->check for its adjacent if there are any print it along with them and mark it as visited.

*/


void BFSDin(vector<int> adj[], int V) {
	bool visited[V];
	for (int i = 0; i < V; i++)
		visited[i] = false;

	for (int i = 0; i < V; i++) {
		if (visited[i] == false)
		{
			queue<int>  q;
			//mark it true and push to queue
			visited[i] = true;
			q.push(i);
			//if the queue is not empty
			while (q.empty() == false)
			{
				//store its value to u and print it
				int u = q.front();
				q.pop();
				cout << u << " ";

				for (int v : adj[u]) {
					if (visited[v] == false) {
						visited[v] = true;
						q.push(v);
					}
				}
			}
		}
	}
}

void addEdge(vector<int> adj[], int u, int v) {
	adj[u].push_back(v);
	adj[v].push_back(u);
}
void printGraph(vector<int> adj[], int V)
{
	for (int i = 0; i < V; i++)
	{
		for (int x : adj[i])
			cout << x << " ";
		cout << "\n";
	}
}
int main()
{
	int V = 7;
	vector<int> adj[V];
	addEdge(adj, 0, 1);
	addEdge(adj, 0, 2);
	addEdge(adj, 2, 3);
	addEdge(adj, 1, 3);
	addEdge(adj, 4, 5);
	addEdge(adj, 5, 6);
	addEdge(adj, 4, 6);
	printGraph(adj, V);;
	cout << "Breadth First Traversal for Disconnected: " << endl;
	BFSDin(adj, V);

	return 0;
}
