#include <bits/stdc++.h>
using namespace std;
const int MAX = 1e5;
const int OO = 0x3f3f3f3f;
typedef pair<int, int> ii;
typedef pair<int, ii> iii;

int n, m;
vector<ii> G[MAX]; 
int dist[MAX], edge[MAX];
bool visit[MAX];

void prim(int s)
{
    memset(visit, 0, sizeof(visit));
    memset(dist, 63, sizeof(dist));
    dist[s] = 0;
    priority_queue<ii> pq;
    pq.push({0, s});
    while(!pq.empty())
    {
        int u = pq.top().second;
        pq.pop();
        if(visit[u]) continue;        
        for(int i = 0; i < G[u].size(); i++)
        {
            int v = G[u][i].second, d = G[u][i].first;
            if(!visit[v] and dist[v] > d)
            {
                dist[v] = d;
                edge[v] = u;
                pq.push({-d, v});
            }
        }
        visit[u] = true;
    }
    int ans = 0;
    edge[s] = -2;
    for(int i = 0; i < n; i++)
    {
        cout << edge[i]+1 << ' ';
        ans += dist[i];
    }
    cout << '\n';
    cout << ans << '\n';
}

int main()
{
    int u, v, w;

    cin >> n >> m;
    while(m--)
    {
        cin >> u >> v >> w; u--; v--;
        G[u].push_back({w, v});
        G[v].push_back({w, u});
    }
    prim(0);

    return 0;
}
