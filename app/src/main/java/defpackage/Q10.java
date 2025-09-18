package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Q10 {
    public final float[] a;
    public final int[] b;

    public Q10(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public final void a(Q10 q10) {
        int i = 0;
        while (true) {
            int[] iArr = q10.b;
            if (i >= iArr.length) {
                return;
            }
            this.a[i] = q10.a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final Q10 b(float[] fArr) {
        int iD;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iD = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iD = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iD = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iD = C12.d(iArr2[i3], (f - f2) / (fArr2[i2] - f2), iArr2[i2]);
                }
            }
            iArr[i] = iD;
        }
        return new Q10(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q10.class != obj.getClass()) {
            return false;
        }
        Q10 q10 = (Q10) obj;
        return Arrays.equals(this.a, q10.a) && Arrays.equals(this.b, q10.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }
}
