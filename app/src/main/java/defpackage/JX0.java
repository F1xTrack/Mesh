package defpackage;

/* loaded from: classes2.dex */
public final class JX0 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public JX0 f;
    public JX0 g;

    public JX0() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final JX0 a() {
        JX0 jx0 = this.f;
        if (jx0 == this) {
            jx0 = null;
        }
        JX0 jx02 = this.g;
        O90.c(jx02);
        jx02.f = this.f;
        JX0 jx03 = this.f;
        O90.c(jx03);
        jx03.g = this.g;
        this.f = null;
        this.g = null;
        return jx0;
    }

    public final void b(JX0 jx0) {
        O90.f(jx0, "segment");
        jx0.g = this;
        jx0.f = this.f;
        JX0 jx02 = this.f;
        O90.c(jx02);
        jx02.g = jx0;
        this.f = jx0;
    }

    public final JX0 c() {
        this.d = true;
        return new JX0(this.a, this.b, this.c, true, false);
    }

    public final void d(JX0 jx0, int i) {
        O90.f(jx0, "sink");
        if (!jx0.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = jx0.c;
        int i3 = i2 + i;
        byte[] bArr = jx0.a;
        if (i3 > 8192) {
            if (jx0.d) {
                throw new IllegalArgumentException();
            }
            int i4 = jx0.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            J8.h(bArr, 0, i4, bArr, i2);
            jx0.c -= jx0.b;
            jx0.b = 0;
        }
        int i5 = jx0.c;
        int i6 = this.b;
        J8.h(this.a, i5, i6, bArr, i6 + i);
        jx0.c += i;
        this.b += i;
    }

    public JX0(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        O90.f(bArr, "data");
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
