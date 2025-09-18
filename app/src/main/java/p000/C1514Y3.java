package p000;

import java.util.Arrays;

/* renamed from: Y3 */
/* loaded from: classes.dex */
public final class C1514Y3 {

    /* renamed from: a */
    public final long f14126a;

    /* renamed from: b */
    public final AbstractC7419Ca1 f14127b;

    /* renamed from: c */
    public final int f14128c;

    /* renamed from: d */
    public final C7604Fp0 f14129d;

    /* renamed from: e */
    public final long f14130e;

    /* renamed from: f */
    public final AbstractC7419Ca1 f14131f;

    /* renamed from: g */
    public final int f14132g;

    /* renamed from: h */
    public final C7604Fp0 f14133h;

    /* renamed from: i */
    public final long f14134i;

    /* renamed from: j */
    public final long f14135j;

    public C1514Y3(long j, AbstractC7419Ca1 abstractC7419Ca1, int i, C7604Fp0 c7604Fp0, long j2, AbstractC7419Ca1 abstractC7419Ca12, int i2, C7604Fp0 c7604Fp02, long j3, long j4) {
        this.f14126a = j;
        this.f14127b = abstractC7419Ca1;
        this.f14128c = i;
        this.f14129d = c7604Fp0;
        this.f14130e = j2;
        this.f14131f = abstractC7419Ca12;
        this.f14132g = i2;
        this.f14133h = c7604Fp02;
        this.f14134i = j3;
        this.f14135j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1514Y3.class != obj.getClass()) {
            return false;
        }
        C1514Y3 c1514y3 = (C1514Y3) obj;
        return this.f14126a == c1514y3.f14126a && this.f14128c == c1514y3.f14128c && this.f14130e == c1514y3.f14130e && this.f14132g == c1514y3.f14132g && this.f14134i == c1514y3.f14134i && this.f14135j == c1514y3.f14135j && AbstractC9984kE1.m22173a(this.f14127b, c1514y3.f14127b) && AbstractC9984kE1.m22173a(this.f14129d, c1514y3.f14129d) && AbstractC9984kE1.m22173a(this.f14131f, c1514y3.f14131f) && AbstractC9984kE1.m22173a(this.f14133h, c1514y3.f14133h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f14126a), this.f14127b, Integer.valueOf(this.f14128c), this.f14129d, Long.valueOf(this.f14130e), this.f14131f, Integer.valueOf(this.f14132g), this.f14133h, Long.valueOf(this.f14134i), Long.valueOf(this.f14135j)});
    }
}
