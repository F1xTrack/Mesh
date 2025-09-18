package p000;

import java.util.Arrays;

/* renamed from: Lg */
/* loaded from: classes.dex */
public final class C0735Lg {

    /* renamed from: a */
    public final String f6792a;

    /* renamed from: b */
    public final String f6793b;

    /* renamed from: c */
    public final int f6794c;

    /* renamed from: d */
    public final int f6795d;

    public C0735Lg(String str, String str2, int i, int i2) {
        this.f6792a = str;
        this.f6793b = str2;
        this.f6794c = i;
        this.f6795d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0735Lg)) {
            return false;
        }
        C0735Lg c0735Lg = (C0735Lg) obj;
        return this.f6794c == c0735Lg.f6794c && this.f6795d == c0735Lg.f6795d && AbstractC9984kE1.m22173a(this.f6792a, c0735Lg.f6792a) && AbstractC9984kE1.m22173a(this.f6793b, c0735Lg.f6793b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6792a, this.f6793b, Integer.valueOf(this.f6794c), Integer.valueOf(this.f6795d)});
    }
}
