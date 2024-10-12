#include <iostream>
using namespace std;

class A {
public:
	virtual void test() {
		cout<<"A test()"<<endl;
	}
	void show() {
		cout<<"A show()"<<endl;
	}
};

class B : public A{
public:
	void test() {
		cout<<"B test()"<<endl;
	}
	void show() {
		cout<<"B show()"<<endl;
	}
};

int main() {
	B bClass;
	A* aPtr = new B();// or = &bClass;

	// bound at runtime
	aPtr->test();
	// bound at compile time
	aPtr->show();
	bClass.test();
	bClass.show();
}

