#include <iostream>
#include <string>
#include <cstring>

using namespace std;

int main(){

	string setence;
	getline(cin,setence);
	char* cstr = new char[setence.length()+1];
	strcpy(cstr,setence.c_str());
	int newsize, size = setence.length();
	for (int i = 0; i < size; ++i)
	{
		if(cstr[i]== ' '){
			++newsize;
		}
	}
	newsize = (newsize*2)+size;
	cstr[newsize] = '\0';
	for (int i = 0; i < newsize; ++i)
	{
		if(cstr[size] == ' '){
			cstr[newsize-i] = '0';
			++i;
			cstr[newsize-i] = '2';
			++i;
			cstr[newsize-i] = '%';
			--size;
		}else{
			cstr[newsize-i] = cstr[size];
			--size;
		}
			
	}

	cout << cstr << endl;



}

