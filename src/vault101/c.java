package b.c.a;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static int f823a;

    public static char a(char c, int i) {
        return (char) (c & ((1 << i) ^ 65535));
    }

    public static char b(char c, int i) {
        return (char) (c | (1 << i));
    }

    public static char c(char c, int i) {
        return (char) ((c & (1 << i)) >> i);
    }

    public static String d(CharSequence charSequence, int i) {
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            return sb.toString();
        }
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            char charAt = charSequence.charAt(i2);
            char c = (char) (i >> (i2 % 4));
            int i3 = i2 % 3;
            if (i3 == 0) {
                for (int i4 = 0; i4 < 8; i4 += 2) {
                    char c2 = c(charAt, i4) ^ c(c, i4);
                    if (c2 == 0) {
                        charAt = a(charAt, i4);
                    } else if (c2 == 1) {
                        charAt = b(charAt, i4);
                    }
                }
            } else if (i3 == 1) {
                for (int i5 = 1; i5 < 8; i5 += 2) {
                    char c3 = c(charAt, i5) ^ c(c, i5);
                    if (c3 == 0) {
                        charAt = a(charAt, i5);
                    } else if (c3 == 1) {
                        charAt = b(charAt, i5);
                    }
                }
            } else if (i3 == 2) {
                for (int i6 = 0; i6 < 8; i6++) {
                    char c4 = c(charAt, i6) ^ c(c, i6);
                    if (c4 == 0) {
                        charAt = a(charAt, i6);
                    } else if (c4 == 1) {
                        charAt = b(charAt, i6);
                    }
                }
            }
            sb.append((char) (charAt ^ f823a));
        }
        return sb.toString();
    }
}
