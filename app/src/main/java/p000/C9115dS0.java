package p000;

import java.util.Arrays;

/* renamed from: dS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9115dS0 {

    /* renamed from: a */
    public final int f26115a;

    /* renamed from: b */
    public final int f26116b;

    public C9115dS0(int i, int i2) {
        this.f26115a = i;
        this.f26116b = i2;
        if (i <= 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 <= 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9115dS0) {
            C9115dS0 c9115dS0 = (C9115dS0) obj;
            if (this.f26115a == c9115dS0.f26115a && this.f26116b == c9115dS0.f26116b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f26115a + 31) * 31) + this.f26116b;
    }

    public final String toString() {
        return String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f26115a), Integer.valueOf(this.f26116b)}, 2));
    }
}
