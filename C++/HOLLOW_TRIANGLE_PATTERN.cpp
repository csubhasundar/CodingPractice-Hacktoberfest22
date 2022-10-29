#include <iostream>
using namespace std;

int main() {
  
  int size = 5;
  for (int i = 1; i <= size; i++) {
    for (int j = 0; j < i; j++) {
     
      if (i != size) {
        if (j == 0 || j == i - 1) {
          cout << "*";
        } else {
          cout << " ";
        }
      }
      // last row
      else {
        cout << "*";
      }
    }
    cout <<endl;
  }
  return 0;
}
