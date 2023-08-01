#include<stdio.h>
main(){
    int vehicles, wheels, two_wheels, four_wheels;
    scanf("%d, %d", &vehicles, &wheels);
    two_wheels=(4*vehicles-wheels)/2;
    four_wheels=vehicles-two_wheels;
    printf("%d, %d", two_wheels, four_wheels);
}