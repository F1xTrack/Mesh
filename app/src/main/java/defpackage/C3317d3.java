package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3317d3 {
    public final int a;
    public final int b;
    public final Uri[] c;
    public final C6721qp0[] d;
    public final int[] e;
    public final long[] f;

    static {
        AbstractC8235ym.t(0, 1, 2, 3, 4);
        AbstractC0277Dh1.L(5);
        AbstractC0277Dh1.L(6);
        AbstractC0277Dh1.L(7);
        AbstractC0277Dh1.L(8);
    }

    public C3317d3(int i, int i2, int[] iArr, C6721qp0[] c6721qp0Arr, long[] jArr) {
        Uri uri;
        int i3 = 0;
        YN1.c(iArr.length == c6721qp0Arr.length);
        this.a = i;
        this.b = i2;
        this.e = iArr;
        this.d = c6721qp0Arr;
        this.f = jArr;
        this.c = new Uri[c6721qp0Arr.length];
        while (true) {
            Uri[] uriArr = this.c;
            if (i3 >= uriArr.length) {
                return;
            }
            C6721qp0 c6721qp0 = c6721qp0Arr[i3];
            if (c6721qp0 == null) {
                uri = null;
            } else {
                C5957mp0 c5957mp0 = c6721qp0.b;
                c5957mp0.getClass();
                uri = c5957mp0.a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3317d3.class != obj.getClass()) {
            return false;
        }
        C3317d3 c3317d3 = (C3317d3) obj;
        return this.a == c3317d3.a && this.b == c3317d3.b && Arrays.equals(this.d, c3317d3.d) && Arrays.equals(this.e, c3317d3.e) && Arrays.equals(this.f, c3317d3.f);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        int i2 = (int) 0;
        return (((Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + ((i + i2) * 31)) * 31)) * 31)) * 31) + i2) * 31;
    }
}
