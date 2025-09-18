package defpackage;

/* renamed from: sr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7107sr extends AbstractC6916rr {
    public final char a;

    public C7107sr(char c) {
        this.a = c;
    }

    @Override // defpackage.AbstractC6916rr
    public final boolean a(char c) {
        return c == this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.a;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
