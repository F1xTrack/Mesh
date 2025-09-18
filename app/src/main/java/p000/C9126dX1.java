package p000;

/* renamed from: dX1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9126dX1 {

    /* renamed from: a */
    public final char f26135a;

    public C9126dX1(char c) {
        this.f26135a = c;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i = this.f26135a;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return AbstractC7222ym.m26234k("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }
}
