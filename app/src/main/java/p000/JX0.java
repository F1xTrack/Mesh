package p000;

/* loaded from: classes2.dex */
public final class JX0 {

    /* renamed from: a */
    public final byte[] f5579a;

    /* renamed from: b */
    public int f5580b;

    /* renamed from: c */
    public int f5581c;

    /* renamed from: d */
    public boolean f5582d;

    /* renamed from: e */
    public final boolean f5583e;

    /* renamed from: f */
    public JX0 f5584f;

    /* renamed from: g */
    public JX0 f5585g;

    public JX0() {
        this.f5579a = new byte[8192];
        this.f5583e = true;
        this.f5582d = false;
    }

    /* renamed from: a */
    public final JX0 m4339a() {
        JX0 jx0 = this.f5584f;
        if (jx0 == this) {
            jx0 = null;
        }
        JX0 jx02 = this.f5585g;
        O90.m5965c(jx02);
        jx02.f5584f = this.f5584f;
        JX0 jx03 = this.f5584f;
        O90.m5965c(jx03);
        jx03.f5585g = this.f5585g;
        this.f5584f = null;
        this.f5585g = null;
        return jx0;
    }

    /* renamed from: b */
    public final void m4340b(JX0 jx0) {
        O90.m5968f(jx0, "segment");
        jx0.f5585g = this;
        jx0.f5584f = this.f5584f;
        JX0 jx02 = this.f5584f;
        O90.m5965c(jx02);
        jx02.f5585g = jx0;
        this.f5584f = jx0;
    }

    /* renamed from: c */
    public final JX0 m4341c() {
        this.f5582d = true;
        return new JX0(this.f5579a, this.f5580b, this.f5581c, true, false);
    }

    /* renamed from: d */
    public final void m4342d(JX0 jx0, int i) {
        O90.m5968f(jx0, "sink");
        if (!jx0.f5583e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = jx0.f5581c;
        int i3 = i2 + i;
        byte[] bArr = jx0.f5579a;
        if (i3 > 8192) {
            if (jx0.f5582d) {
                throw new IllegalArgumentException();
            }
            int i4 = jx0.f5580b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC0576J8.m4181h(bArr, 0, i4, bArr, i2);
            jx0.f5581c -= jx0.f5580b;
            jx0.f5580b = 0;
        }
        int i5 = jx0.f5581c;
        int i6 = this.f5580b;
        AbstractC0576J8.m4181h(this.f5579a, i5, i6, bArr, i6 + i);
        jx0.f5581c += i;
        this.f5580b += i;
    }

    public JX0(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        O90.m5968f(bArr, "data");
        this.f5579a = bArr;
        this.f5580b = i;
        this.f5581c = i2;
        this.f5582d = z;
        this.f5583e = z2;
    }
}
