package defpackage;

/* renamed from: a21, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2058a21 {
    public static final C2058a21 c = new C2058a21(-1, -1);
    public final int a;
    public final int b;

    static {
        new C2058a21(0, 0);
    }

    public C2058a21(int i, int i2) {
        YN1.c((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2058a21)) {
            return false;
        }
        C2058a21 c2058a21 = (C2058a21) obj;
        return this.a == c2058a21.a && this.b == c2058a21.b;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i >>> 16) | (i << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
