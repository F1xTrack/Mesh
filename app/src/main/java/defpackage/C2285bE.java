package defpackage;

import android.text.TextUtils;

/* renamed from: bE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2285bE {
    public final String a;
    public final C6666qX b;
    public final C6666qX c;
    public final int d;
    public final int e;

    public C2285bE(String str, C6666qX c6666qX, C6666qX c6666qX2, int i, int i2) {
        YN1.c(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        c6666qX.getClass();
        this.b = c6666qX;
        c6666qX2.getClass();
        this.c = c6666qX2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2285bE.class != obj.getClass()) {
            return false;
        }
        C2285bE c2285bE = (C2285bE) obj;
        return this.d == c2285bE.d && this.e == c2285bE.e && this.a.equals(c2285bE.a) && this.b.equals(c2285bE.b) && this.c.equals(c2285bE.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + AbstractC1705Vq.e((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
