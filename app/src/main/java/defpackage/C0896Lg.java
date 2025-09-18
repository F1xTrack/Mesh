package defpackage;

import java.util.Arrays;

/* renamed from: Lg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896Lg {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public C0896Lg(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0896Lg)) {
            return false;
        }
        C0896Lg c0896Lg = (C0896Lg) obj;
        return this.c == c0896Lg.c && this.d == c0896Lg.d && AbstractC5465kE1.a(this.a, c0896Lg.a) && AbstractC5465kE1.a(this.b, c0896Lg.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
