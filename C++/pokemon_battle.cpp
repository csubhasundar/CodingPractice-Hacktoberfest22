#include<bits/stdc++.h>
#define int long long
using namespace std;
int n,t,m;
vector<int> discrete(vector<int> m) {
  vector<int> arr=m;
  sort(arr.begin(),arr.end());
  arr.erase(unique(arr.begin(),arr.end()),arr.end());
  for (int i=0;i<(int)m.size();++i){
    m[i]=lower_bound(arr.begin(),arr.end(),m[i])-arr.begin();
}
  return m;
}
void Calc() {
  vector<int> a1,b1,c,s,p,r;
  cin >> n;
  t=0;
  m=0;
  for(int i=1,x;i<=n;++i){
  	cin >> x;a1.push_back(x);
  }
  for(int i=1,x;i<=n;++i){
  	cin >> x;b1.push_back(x);
  }
  a1=discrete(a1);
  b1=discrete(b1);
  c.resize(n);
  s.resize(n);
  r.resize(n);
  for(int i=0;i<n;++i){
  	c[a1[i]]=b1[i];
  	s[i]=a1[i]+b1[i];
  	r[b1[i]]=i;
  }
  for(int i=0;i<n;++i) {
    p.insert(upper_bound(p.begin(),p.end(),c[i]),c[i]);
    s[r[c[i]]]-=lower_bound(p.begin(),p.end(),c[i])-p.begin();
  }
  for(int i:s) t=max(t,i);
  for(int i:s) m+=(i==t);
  cout << m << endl;
  return;
  cout << " " << endl;
}
signed main() {
  int T;cin >> T;
  while(T--) Calc();
}