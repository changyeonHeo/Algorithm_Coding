#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

int main(void) {
	int n, m, s[101] = { 0 }, i, j, a, b, t=0;
	scanf("%d %d", &n, &m);
	for (int k = 1; k <= n; k++) {
		s[k] = k;
	}
	for (i = 0; i < m; i++) {
		scanf("%d %d", &a, &b);
		s[t] = s[a];
		s[a] = s[b];
		s[b] = s[t];
	}
	for (j = 1; j <= n; j++) {
		printf("%d ", s[j]);
	}
	return 0;
}