package p000;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Q10 {

    /* renamed from: a */
    public final float[] f9403a;

    /* renamed from: b */
    public final int[] f9404b;

    public Q10(float[] fArr, int[] iArr) {
        this.f9403a = fArr;
        this.f9404b = iArr;
    }

    /* renamed from: a */
    public final void m6545a(Q10 q10) {
        int i = 0;
        while (true) {
            int[] iArr = q10.f9404b;
            if (i >= iArr.length) {
                return;
            }
            this.f9403a[i] = q10.f9403a[i];
            this.f9404b[i] = iArr[i];
            i++;
        }
    }

    /* renamed from: b */
    public final Q10 m6546b(float[] fArr) {
        int iM950d;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.f9403a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.f9404b;
            if (iBinarySearch >= 0) {
                iM950d = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iM950d = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iM950d = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iM950d = C12.m950d(iArr2[i3], (f - f2) / (fArr2[i2] - f2), iArr2[i2]);
                }
            }
            iArr[i] = iM950d;
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
        return Arrays.equals(this.f9403a, q10.f9403a) && Arrays.equals(this.f9404b, q10.f9404b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9404b) + (Arrays.hashCode(this.f9403a) * 31);
    }
}
