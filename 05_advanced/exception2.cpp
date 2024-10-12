#include <iostream>
using namespace std;

class NegativeException {
    public:
        NegativeException(string reason) {
           cout<<"Negative number is not allowed: "<<reason<<endl;
           }
    };

int main() {
    int x;
    cin>>x;

    try {
        if (x<0)
            throw NegativeException(to_string(x));
        if (x==0)
            throw 0;
        int a = 5/x;
    }
    catch (int param) { cout << "int exception"; }
    catch (NegativeException nex) { cout<<"NEG"<<endl; }
    catch (...) { cout << "default exception"; }
}
