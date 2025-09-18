package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: th */
/* loaded from: classes2.dex */
public abstract class AbstractC7268th {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    public AbstractC7268th(int... iArr) {
        List listB0;
        O90.f(iArr, "numbers");
        this.a = iArr;
        Integer numQ = J8.q(0, iArr);
        this.b = numQ != null ? numQ.intValue() : -1;
        Integer numQ2 = J8.q(1, iArr);
        this.c = numQ2 != null ? numQ2.intValue() : -1;
        Integer numQ3 = J8.q(2, iArr);
        this.d = numQ3 != null ? numQ3.intValue() : -1;
        if (iArr.length <= 3) {
            listB0 = MN.a;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException(AbstractC8235ym.l(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
            }
            listB0 = AbstractC8069xu.b0(new K8(iArr).subList(3, iArr.length));
        }
        this.e = listB0;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.d >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            AbstractC7268th abstractC7268th = (AbstractC7268th) obj;
            if (this.b == abstractC7268th.b && this.c == abstractC7268th.c && this.d == abstractC7268th.d && O90.a(this.e, abstractC7268th.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC8069xu.H(arrayList, ".", null, null, null, 62);
    }
}
