package defpackage;

import java.util.Arrays;

/* renamed from: Tb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1506Tb1 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public C1506Tb1(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1506Tb1.class != obj.getClass()) {
            return false;
        }
        C1506Tb1 c1506Tb1 = (C1506Tb1) obj;
        return this.a == c1506Tb1.a && this.c == c1506Tb1.c && this.d == c1506Tb1.d && Arrays.equals(this.b, c1506Tb1.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
