package defpackage;

/* renamed from: dX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3410dX1 {
    public final char a;

    public C3410dX1(char c) {
        this.a = c;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.a;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return AbstractC8235ym.k("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }
}
