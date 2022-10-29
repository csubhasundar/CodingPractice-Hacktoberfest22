#include <iostream>
using namespace std;

int main() {
 
  int size = 5;
  
  for (int i = 0; i < size; i++) {
    // print column
    for (int j = 0; j <= i; j++) {
      cout << "*";
    }
    cout << endl;
  }
  return 0;
}
