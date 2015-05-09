#include <iostream>
#include <string>
using namespace std;

int main(){
	string setence;
	getline(cin,setence);
	bool answer = true;

	for (int i = 0; i < setence.length(); ++i)
	{
		for (int j = i+1; j < setence.length(); ++j)
		{
			if(setence[i]==setence[j]){
				answer = false;
			}
		}
	}
	cout << boolalpha;
	cout << "is? " << answer << endl;	
}