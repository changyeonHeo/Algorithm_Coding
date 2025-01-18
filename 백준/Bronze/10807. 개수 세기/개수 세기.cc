#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main(void) {
	int n, v, s[101],c=0;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &s[i]);
	}
	scanf("%d", &v);
	for (int i = 0; i < n; i++) {
		if (v == s[i])
			c += 1;
	}
	printf("%d", c);
	return 0;
}