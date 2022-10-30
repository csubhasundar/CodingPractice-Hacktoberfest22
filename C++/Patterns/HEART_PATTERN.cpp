#include <iostream>
using namespace std;

int main() {
  
  int size = 6;

  for (int i = size / 2; i < size; i += 2) {
   
    for (int j = 1; j < size - i; j += 2) {
      cout << " ";
    }

    for (int j = 1; j < i + 1; j++) {
      cout << "*";
    }
   
    for (int j = 1; j < size - i + 1; j++) {
      cout << " ";
    }
   
    for (int j = 1; j < i + 1; j++) {
      cout << "*";
    }
    cout <<endl;
  }
 
  for (int i = size; i > 0; i--) {
    for (int j = 0; j < size - i; j++) {
      cout << " ";
    }
    for (int j = 1; j < i * 2; j++) {
      cout << "*";
    }
    cout << endl;
  }
  return 0;
}
