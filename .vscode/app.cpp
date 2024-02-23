#include <iostream>
#include <conio.h>
#include <windows.h>
using namespace std;
void print()
{
    cout << '\r' << i;
    i++;
    Sleep(100);
}
int main()
{
    // while(1)
    // {
    //     print();
    //     if (kbhit())
    //     {
    //         char x = getch();
    //         if (x == 32)
    //             cout << endl;
    //     }
    // }
    for (int i = 0; i < 10; i++)
    {
        cout << i << endl;
    }
    cout << i ;
    return EXIT_SUCCESS;
}