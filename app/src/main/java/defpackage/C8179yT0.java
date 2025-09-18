package defpackage;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yT0 */
/* loaded from: classes2.dex */
public final class C8179yT0 extends AbstractC0596Hk {
    public static final int[] h;
    public final int b;
    public final AbstractC0596Hk c;
    public final AbstractC0596Hk d;
    public final int e;
    public final int f;
    public int g = 0;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        h = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = h;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public C8179yT0(AbstractC0596Hk abstractC0596Hk, AbstractC0596Hk abstractC0596Hk2) {
        this.c = abstractC0596Hk;
        this.d = abstractC0596Hk2;
        int size = abstractC0596Hk.size();
        this.e = size;
        this.b = abstractC0596Hk2.size() + size;
        this.f = Math.max(abstractC0596Hk.k(), abstractC0596Hk2.k()) + 1;
    }

    @Override // defpackage.AbstractC0596Hk
    public final void A(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        AbstractC0596Hk abstractC0596Hk = this.c;
        int i4 = this.e;
        if (i3 <= i4) {
            abstractC0596Hk.A(outputStream, i, i2);
            return;
        }
        AbstractC0596Hk abstractC0596Hk2 = this.d;
        if (i >= i4) {
            abstractC0596Hk2.A(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        abstractC0596Hk.A(outputStream, i, i5);
        abstractC0596Hk2.A(outputStream, 0, i2 - i5);
    }

    public final boolean equals(Object obj) {
        int iV;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0596Hk)) {
            return false;
        }
        AbstractC0596Hk abstractC0596Hk = (AbstractC0596Hk) obj;
        int size = abstractC0596Hk.size();
        int i = this.b;
        if (i != size) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        if (this.g != 0 && (iV = abstractC0596Hk.v()) != 0 && this.g != iV) {
            return false;
        }
        C7799wT0 c7799wT0 = new C7799wT0(this);
        C1919Yj0 c1919Yj0A = c7799wT0.a();
        C7799wT0 c7799wT02 = new C7799wT0(abstractC0596Hk);
        C1919Yj0 c1919Yj0A2 = c7799wT02.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int length = c1919Yj0A.b.length - i2;
            int length2 = c1919Yj0A2.b.length - i3;
            int iMin = Math.min(length, length2);
            if (!(i2 == 0 ? c1919Yj0A.B(c1919Yj0A2, i3, iMin) : c1919Yj0A2.B(c1919Yj0A, i2, iMin))) {
                return false;
            }
            i4 += iMin;
            if (i4 >= i) {
                if (i4 == i) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == length) {
                c1919Yj0A = c7799wT0.a();
                i2 = 0;
            } else {
                i2 += iMin;
            }
            if (iMin == length2) {
                c1919Yj0A2 = c7799wT02.a();
                i3 = 0;
            } else {
                i3 += iMin;
            }
        }
    }

    public final int hashCode() {
        int iT = this.g;
        if (iT == 0) {
            int i = this.b;
            iT = t(i, 0, i);
            if (iT == 0) {
                iT = 1;
            }
            this.g = iT;
        }
        return iT;
    }

    @Override // defpackage.AbstractC0596Hk
    public final void i(int i, byte[] bArr, int i2, int i3) {
        int i4 = i + i3;
        AbstractC0596Hk abstractC0596Hk = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            abstractC0596Hk.i(i, bArr, i2, i3);
            return;
        }
        AbstractC0596Hk abstractC0596Hk2 = this.d;
        if (i >= i5) {
            abstractC0596Hk2.i(i - i5, bArr, i2, i3);
            return;
        }
        int i6 = i5 - i;
        abstractC0596Hk.i(i, bArr, i2, i6);
        abstractC0596Hk2.i(0, bArr, i2 + i6, i3 - i6);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C7989xT0(this);
    }

    @Override // defpackage.AbstractC0596Hk
    public final int k() {
        return this.f;
    }

    @Override // defpackage.AbstractC0596Hk
    public final boolean q() {
        return this.b >= h[this.f];
    }

    @Override // defpackage.AbstractC0596Hk
    public final boolean r() {
        int iU = this.c.u(0, 0, this.e);
        AbstractC0596Hk abstractC0596Hk = this.d;
        return abstractC0596Hk.u(iU, 0, abstractC0596Hk.size()) == 0;
    }

    @Override // defpackage.AbstractC0596Hk
    public final int size() {
        return this.b;
    }

    @Override // defpackage.AbstractC0596Hk
    public final int t(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC0596Hk abstractC0596Hk = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            return abstractC0596Hk.t(i, i2, i3);
        }
        AbstractC0596Hk abstractC0596Hk2 = this.d;
        if (i2 >= i5) {
            return abstractC0596Hk2.t(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC0596Hk2.t(abstractC0596Hk.t(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.AbstractC0596Hk
    public final int u(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC0596Hk abstractC0596Hk = this.c;
        int i5 = this.e;
        if (i4 <= i5) {
            return abstractC0596Hk.u(i, i2, i3);
        }
        AbstractC0596Hk abstractC0596Hk2 = this.d;
        if (i2 >= i5) {
            return abstractC0596Hk2.u(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC0596Hk2.u(abstractC0596Hk.u(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.AbstractC0596Hk
    public final int v() {
        return this.g;
    }

    @Override // defpackage.AbstractC0596Hk
    public final String y() {
        byte[] bArr;
        int i = this.b;
        if (i == 0) {
            bArr = AbstractC8119y90.a;
        } else {
            byte[] bArr2 = new byte[i];
            i(0, bArr2, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }
}
