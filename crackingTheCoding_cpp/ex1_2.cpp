#include <iostream>
#include <string>
#include <cstring>
using namespace std;

void reverse(char* cstr, int size){
	int sizeDiv2 = (int)(size/2);
	for (int i = 0; i < sizeDiv2; ++i)
	{
		char aux = cstr[i];
		cstr[i] = cstr[size-i-1];
		cstr[size-i-1] = aux;

	}

}
int main(){

	std::string setence;
	getline(cin, setence);
	int size = setence.length();
	char *cstr = new char[size + 1];
	strcpy(cstr, setence.c_str());
	cout << cstr << endl;
	reverse(cstr,size);
	cout << cstr << endl;

}