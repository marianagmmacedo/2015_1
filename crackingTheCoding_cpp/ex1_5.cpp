#include <iostream>
#include <string>
#include <cstring>
#include <stdlib.h>

using namespace std;

int main(){

    //a1b2c3

    string setence;
    getline(cin,setence);
    int length_set = setence.length;
    char* stce = new char[setence.length()+1];
    strcpy(stce, setence.c_str());
    char aux;int number = 1;

    for (int i = 0; i < length_set;)
    {
        
        for (int j = i+1; j < length_set; ++j)
        {
            
            if(stce[i]==stce[j]){
                ++number;
                stce[j] = ' ';
            }

        
        }
    
                
            ++i;
            int j = 0;
            string aux = number.to_string();
            if(stce[i]!=' '){
                
                do
                {
                    stce[i] = aux.at(j);

                }while(aux.at(j)!='\0');
                
            }else{
                do{
                    j++;
                }while(stce[j]==' ');
                char* aux;
                itoa(number,aux,10);
                stce[j] = aux;

            }
            i++;
                
        
    }

    cout << stce << endl;
    return 0;

}