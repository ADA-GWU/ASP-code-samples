#include <iostream>

using namespace std;

int divide(int x, int y) {
    if (y == 0)
        throw 0;
        //throw("Division by zero");
        //throw 'x';
        
    return x/y;
}

int main()
{
    int i = 1;
    try {
        cout<<divide(5,--i)<<endl;
    }
    catch (int) { cout << "int exception: "<< endl; }
    catch (char param) { cout << "char exception" << endl; }
    catch (const char* msg) { cerr << msg << endl; }
    catch (...) { cout << "Some other error"; }


    return 0;
}
