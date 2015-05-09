#include <iostream>
#include <string>
#include <cstring>
using namespace std;

int main(){

	string setence1;
	string setence2;
	bool answer = true;
	getline(cin,setence1);
	getline(cin,setence2);
	if(setence1.length()==setence2.length()){
	setence1 = setence1+setence2;
	for (int i = 0; i < setence1.length(); ++i)
	{
		int sum = 0;
		for (int j = 0; j < setence1.length(); ++j)
		{
			
			if(setence1[i]==setence1[j]){
				++sum;
			}
		}
		if(sum%2!=0){
			answer = false;break;
		}
	}
	}else{ answer = false;}
	cout << boolalpha;
	cout << "is? " << answer << endl;
	return 0;
}