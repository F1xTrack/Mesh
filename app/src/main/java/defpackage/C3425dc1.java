package defpackage;

import java.util.Arrays;

/* renamed from: dc1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3425dc1 {
    public final int a;
    public final C1272Qb1 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        AbstractC0277Dh1.L(0);
        AbstractC0277Dh1.L(1);
        AbstractC0277Dh1.L(3);
        AbstractC0277Dh1.L(4);
    }

    public C3425dc1(C1272Qb1 c1272Qb1, boolean z, int[] iArr, boolean[] zArr) {
        int i = c1272Qb1.a;
        this.a = i;
        boolean z2 = false;
        YN1.c(i == iArr.length && i == zArr.length);
        this.b = c1272Qb1;
        if (z && i > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final C6666qX a(int i) {
        return this.b.d[i];
    }

    public final boolean b(int i) {
        return this.e[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3425dc1.class != obj.getClass()) {
            return false;
        }
        C3425dc1 c3425dc1 = (C3425dc1) obj;
        return this.c == c3425dc1.c && this.b.equals(c3425dc1.b) && Arrays.equals(this.d, c3425dc1.d) && Arrays.equals(this.e, c3425dc1.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
