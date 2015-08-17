/*
 * hello.c
 *
 *  Created on: Jun 29, 2015
 *      Author: Anu
 */

#include <stdio.h>

int main(int argc, char *argv[]){
	int a,b,c,d,e, n, *arr;
	char f;
	scanf("%d", &n);
	scanf("%d:%d;%d:%d;%c%d", &a,&b,&c,&d,&f,&e);
	printf("Hello world!\n");
	printf("%d\n",a);
	printf("%d:%d;%d:%d;%c%d", a,b,c,d,f,e);

	return 0;
}

