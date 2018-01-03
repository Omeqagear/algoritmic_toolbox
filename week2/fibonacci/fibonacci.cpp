#include <iostream>
#include <string.h>
#include <vector>

using std::vector;

int fibonacci(int n) {
    vector<int> result(n+1);

    result[0] = 0;
    result[1] = 1;

    for(int i = 2; i< result.size(); ++i)
        result[i] = result[i-1] + result[i-2];
    
    return result[n];
}





int main() {
    int n = 0;
    
    std::cin >> n;
    
    std::cout<<fibonacci(n)<<"\n";
    
    return 0;
}
