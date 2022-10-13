#include <iostream>
using namespace std;

int main(){
	int banyakPas;
	
	int k=0;
	do {
            cout<<"=";
            k++;
        }
        while(k<=40);
    cout<<"\n           KLINK SEHAT MULU        "<<endl;
    cout<<"========================================="<<endl;
    cout<<"Masukan banyak pasien : ";
	cin>>banyakPas;
	
	string pasien[banyakPas][4];
	
	cout<<"Masukan data pasien klink :"<<endl;
	for (int i=0;i<banyakPas;i++)
        {
			cout<<""<<endl;
            cout<<"Pasien ke-"<<i+1<<endl;
            for (int j=0;j<4;j++)
            {
                if (j==0)
                {
                    cout<<"Nama Pasien : ";
                }
                else if(j==1)
                {
                    cout<<"NIK : ";
                }
                else if(j==2)
                {
                    cout<<"Umur : ";
                }
                else
                {
                    cout<<"Keluhan : ";
                }
                cin>>pasien[i][j];
            }
        }
	cout<<"----------------------------------------"<<endl;
    cout<<"\ndata pasien klink "<<endl;
    cout<<"----------------------------------------"<<endl;
    cout<<"NAMA \t\tNIK \t\tUMUR \t\tKeluhan \t"<<endl;
    for(int i=0;i<banyakPas;i++)
    {
        for (int j=0; j<4;j++)
        {
            cout<<pasien[i][j]<<"\t\t";
        }
        cout<<endl;
    }
    return 0;
}
