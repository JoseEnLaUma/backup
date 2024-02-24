#include <iostream>
#include <array>
#include <string>

using namespace std;

const string FIN = "FIN";
const int MAX = 350;

typedef array <string, 350> TArray;
struct Palabras{
    int size = 0;
    TArray palabras;
    string elem;
};


int main(){
    string palabra;
    Palabras palabrotas;
    cout << "Pon un mensaje de amor para tu cuchufleta..... (todo en mayusculas y escribe FIN para terminar)";
    cin >> palabra;
    while (palabra != FIN){
        
    }
}