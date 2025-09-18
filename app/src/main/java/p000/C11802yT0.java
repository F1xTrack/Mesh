package p000;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: yT0 */
/* loaded from: classes2.dex */
public final class C11802yT0 extends AbstractC0488Hk {

    /* renamed from: h */
    public static final int[] f46264h;

    /* renamed from: b */
    public final int f46265b;

    /* renamed from: c */
    public final AbstractC0488Hk f46266c;

    /* renamed from: d */
    public final AbstractC0488Hk f46267d;

    /* renamed from: e */
    public final int f46268e;

    /* renamed from: f */
    public final int f46269f;

    /* renamed from: g */
    public int f46270g = 0;

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
        f46264h = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f46264h;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public C11802yT0(AbstractC0488Hk abstractC0488Hk, AbstractC0488Hk abstractC0488Hk2) {
        this.f46266c = abstractC0488Hk;
        this.f46267d = abstractC0488Hk2;
        int size = abstractC0488Hk.size();
        this.f46268e = size;
        this.f46265b = abstractC0488Hk2.size() + size;
        this.f46269f = Math.max(abstractC0488Hk.mo3576k(), abstractC0488Hk2.mo3576k()) + 1;
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: A */
    public final void mo3572A(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        AbstractC0488Hk abstractC0488Hk = this.f46266c;
        int i4 = this.f46268e;
        if (i3 <= i4) {
            abstractC0488Hk.mo3572A(outputStream, i, i2);
            return;
        }
        AbstractC0488Hk abstractC0488Hk2 = this.f46267d;
        if (i >= i4) {
            abstractC0488Hk2.mo3572A(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        abstractC0488Hk.mo3572A(outputStream, i, i5);
        abstractC0488Hk2.mo3572A(outputStream, 0, i2 - i5);
    }

    public final boolean equals(Object obj) {
        int iMo3581v;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0488Hk)) {
            return false;
        }
        AbstractC0488Hk abstractC0488Hk = (AbstractC0488Hk) obj;
        int size = abstractC0488Hk.size();
        int i = this.f46265b;
        if (i != size) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        if (this.f46270g != 0 && (iMo3581v = abstractC0488Hk.mo3581v()) != 0 && this.f46270g != iMo3581v) {
            return false;
        }
        C11548wT0 c11548wT0 = new C11548wT0(this);
        C8580Yj0 c8580Yj0M25632a = c11548wT0.m25632a();
        C11548wT0 c11548wT02 = new C11548wT0(abstractC0488Hk);
        C8580Yj0 c8580Yj0M25632a2 = c11548wT02.m25632a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int length = c8580Yj0M25632a.f14490b.length - i2;
            int length2 = c8580Yj0M25632a2.f14490b.length - i3;
            int iMin = Math.min(length, length2);
            if (!(i2 == 0 ? c8580Yj0M25632a.m9345B(c8580Yj0M25632a2, i3, iMin) : c8580Yj0M25632a2.m9345B(c8580Yj0M25632a, i2, iMin))) {
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
                c8580Yj0M25632a = c11548wT0.m25632a();
                i2 = 0;
            } else {
                i2 += iMin;
            }
            if (iMin == length2) {
                c8580Yj0M25632a2 = c11548wT02.m25632a();
                i3 = 0;
            } else {
                i3 += iMin;
            }
        }
    }

    public final int hashCode() {
        int iMo3579t = this.f46270g;
        if (iMo3579t == 0) {
            int i = this.f46265b;
            iMo3579t = mo3579t(i, 0, i);
            if (iMo3579t == 0) {
                iMo3579t = 1;
            }
            this.f46270g = iMo3579t;
        }
        return iMo3579t;
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: i */
    public final void mo3575i(int i, byte[] bArr, int i2, int i3) {
        int i4 = i + i3;
        AbstractC0488Hk abstractC0488Hk = this.f46266c;
        int i5 = this.f46268e;
        if (i4 <= i5) {
            abstractC0488Hk.mo3575i(i, bArr, i2, i3);
            return;
        }
        AbstractC0488Hk abstractC0488Hk2 = this.f46267d;
        if (i >= i5) {
            abstractC0488Hk2.mo3575i(i - i5, bArr, i2, i3);
            return;
        }
        int i6 = i5 - i;
        abstractC0488Hk.mo3575i(i, bArr, i2, i6);
        abstractC0488Hk2.mo3575i(0, bArr, i2 + i6, i3 - i6);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C11675xT0(this);
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: k */
    public final int mo3576k() {
        return this.f46269f;
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: q */
    public final boolean mo3577q() {
        return this.f46265b >= f46264h[this.f46269f];
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: r */
    public final boolean mo3578r() {
        int iMo3580u = this.f46266c.mo3580u(0, 0, this.f46268e);
        AbstractC0488Hk abstractC0488Hk = this.f46267d;
        return abstractC0488Hk.mo3580u(iMo3580u, 0, abstractC0488Hk.size()) == 0;
    }

    @Override // p000.AbstractC0488Hk
    public final int size() {
        return this.f46265b;
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: t */
    public final int mo3579t(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC0488Hk abstractC0488Hk = this.f46266c;
        int i5 = this.f46268e;
        if (i4 <= i5) {
            return abstractC0488Hk.mo3579t(i, i2, i3);
        }
        AbstractC0488Hk abstractC0488Hk2 = this.f46267d;
        if (i2 >= i5) {
            return abstractC0488Hk2.mo3579t(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC0488Hk2.mo3579t(abstractC0488Hk.mo3579t(i, i2, i6), 0, i3 - i6);
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: u */
    public final int mo3580u(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC0488Hk abstractC0488Hk = this.f46266c;
        int i5 = this.f46268e;
        if (i4 <= i5) {
            return abstractC0488Hk.mo3580u(i, i2, i3);
        }
        AbstractC0488Hk abstractC0488Hk2 = this.f46267d;
        if (i2 >= i5) {
            return abstractC0488Hk2.mo3580u(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC0488Hk2.mo3580u(abstractC0488Hk.mo3580u(i, i2, i6), 0, i3 - i6);
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: v */
    public final int mo3581v() {
        return this.f46270g;
    }

    @Override // p000.AbstractC0488Hk
    /* renamed from: y */
    public final String mo3582y() {
        byte[] bArr;
        int i = this.f46265b;
        if (i == 0) {
            bArr = AbstractC11762y90.f46105a;
        } else {
            byte[] bArr2 = new byte[i];
            mo3575i(0, bArr2, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }
}
