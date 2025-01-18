#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int m[1000000] = { 0 };
#define s 1000001
#define ss -1000001
int main(void) {
	int n, k=ss, x=s;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &m[i]);
		
	}
	for (int i = 0; i < n; i++) {
		if (k < m[i]) {
			k = m[i];
		}
		if (x > m[i])
			x = m[i];
	}
	printf("%d %d", x, k);
	return 0;
}