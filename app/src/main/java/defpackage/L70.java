package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class L70 implements Serializable {
    public static final /* synthetic */ int c = 0;
    public final int[] a;
    public final int b;

    static {
        new L70(new int[0]);
    }

    public L70(int[] iArr) {
        int length = iArr.length;
        this.a = iArr;
        this.b = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L70)) {
            return false;
        }
        L70 l70 = (L70) obj;
        int i = l70.b;
        int i2 = this.b;
        if (i2 != i) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            QL1.c(i3, i2);
            int i4 = this.a[i3];
            QL1.c(i3, l70.b);
            if (i4 != l70.a[i3]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
