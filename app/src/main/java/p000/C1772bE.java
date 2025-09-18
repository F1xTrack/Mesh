package p000;

import android.text.TextUtils;

/* renamed from: bE */
/* loaded from: classes.dex */
public final class C1772bE {

    /* renamed from: a */
    public final String f16869a;

    /* renamed from: b */
    public final C6686qX f16870b;

    /* renamed from: c */
    public final C6686qX f16871c;

    /* renamed from: d */
    public final int f16872d;

    /* renamed from: e */
    public final int f16873e;

    public C1772bE(String str, C6686qX c6686qX, C6686qX c6686qX2, int i, int i2) {
        YN1.m9278c(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f16869a = str;
        c6686qX.getClass();
        this.f16870b = c6686qX;
        c6686qX2.getClass();
        this.f16871c = c6686qX2;
        this.f16872d = i;
        this.f16873e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1772bE.class != obj.getClass()) {
            return false;
        }
        C1772bE c1772bE = (C1772bE) obj;
        return this.f16872d == c1772bE.f16872d && this.f16873e == c1772bE.f16873e && this.f16869a.equals(c1772bE.f16869a) && this.f16870b.equals(c1772bE.f16870b) && this.f16871c.equals(c1772bE.f16871c);
    }

    public final int hashCode() {
        return this.f16871c.hashCode() + ((this.f16870b.hashCode() + AbstractC1374Vq.m8586e((((527 + this.f16872d) * 31) + this.f16873e) * 31, 31, this.f16869a)) * 31);
    }
}
