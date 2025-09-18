package p000;

/* renamed from: sr */
/* loaded from: classes.dex */
public final class C6849sr extends AbstractC6769rr {

    /* renamed from: a */
    public final char f42642a;

    public C6849sr(char c) {
        this.f42642a = c;
    }

    @Override // p000.AbstractC6769rr
    /* renamed from: a */
    public final boolean mo24490a(char c) {
        return c == this.f42642a;
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
        char c = this.f42642a;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
