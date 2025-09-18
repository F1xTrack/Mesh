package p000;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: d3 */
/* loaded from: classes.dex */
public final class C3904d3 {

    /* renamed from: a */
    public final int f25777a;

    /* renamed from: b */
    public final int f25778b;

    /* renamed from: c */
    public final Uri[] f25779c;

    /* renamed from: d */
    public final C10825qp0[] f25780d;

    /* renamed from: e */
    public final int[] f25781e;

    /* renamed from: f */
    public final long[] f25782f;

    static {
        AbstractC7222ym.m26243t(0, 1, 2, 3, 4);
        AbstractC7485Dh1.m1797L(5);
        AbstractC7485Dh1.m1797L(6);
        AbstractC7485Dh1.m1797L(7);
        AbstractC7485Dh1.m1797L(8);
    }

    public C3904d3(int i, int i2, int[] iArr, C10825qp0[] c10825qp0Arr, long[] jArr) {
        Uri uri;
        int i3 = 0;
        YN1.m9278c(iArr.length == c10825qp0Arr.length);
        this.f25777a = i;
        this.f25778b = i2;
        this.f25781e = iArr;
        this.f25780d = c10825qp0Arr;
        this.f25782f = jArr;
        this.f25779c = new Uri[c10825qp0Arr.length];
        while (true) {
            Uri[] uriArr = this.f25779c;
            if (i3 >= uriArr.length) {
                return;
            }
            C10825qp0 c10825qp0 = c10825qp0Arr[i3];
            if (c10825qp0 == null) {
                uri = null;
            } else {
                C10313mp0 c10313mp0 = c10825qp0.f41186b;
                c10313mp0.getClass();
                uri = c10313mp0.f37951a;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }

    /* renamed from: a */
    public final int m17481a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.f25781e;
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
        if (obj == null || C3904d3.class != obj.getClass()) {
            return false;
        }
        C3904d3 c3904d3 = (C3904d3) obj;
        return this.f25777a == c3904d3.f25777a && this.f25778b == c3904d3.f25778b && Arrays.equals(this.f25780d, c3904d3.f25780d) && Arrays.equals(this.f25781e, c3904d3.f25781e) && Arrays.equals(this.f25782f, c3904d3.f25782f);
    }

    public final int hashCode() {
        int i = ((this.f25777a * 31) + this.f25778b) * 31;
        int i2 = (int) 0;
        return (((Arrays.hashCode(this.f25782f) + ((Arrays.hashCode(this.f25781e) + ((Arrays.hashCode(this.f25780d) + ((i + i2) * 31)) * 31)) * 31)) * 31) + i2) * 31;
    }
}
