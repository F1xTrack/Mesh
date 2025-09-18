package defpackage;

import java.util.Arrays;

/* renamed from: dS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3394dS0 {
    public final int a;
    public final int b;

    public C3394dS0(int i, int i2) {
        this.a = i;
        this.b = i2;
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
        if (obj instanceof C3394dS0) {
            C3394dS0 c3394dS0 = (C3394dS0) obj;
            if (this.a == c3394dS0.a && this.b == c3394dS0.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final String toString() {
        return String.format(null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)}, 2));
    }
}
