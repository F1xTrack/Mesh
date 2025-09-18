package p000;

import java.io.Writer;

/* renamed from: ql0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10817ql0 extends Writer {

    /* renamed from: a */
    public final StringBuilder f41127a = new StringBuilder(128);

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m24056m();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m24056m();
    }

    /* renamed from: m */
    public final void m24056m() {
        StringBuilder sb = this.f41127a;
        if (sb.length() > 0) {
            sb.toString();
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m24056m();
            } else {
                this.f41127a.append(c);
            }
        }
    }
}
