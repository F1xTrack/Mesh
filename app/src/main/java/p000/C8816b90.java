package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: b90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8816b90 extends AbstractC1133S0 implements InterfaceC11125t90, RandomAccess, InterfaceC10621pD0 {

    /* renamed from: d */
    public static final C8816b90 f16825d = new C8816b90(new int[0], 0, false);

    /* renamed from: b */
    public int[] f16826b;

    /* renamed from: c */
    public int f16827c;

    public C8816b90(int[] iArr, int i, boolean z) {
        super(z);
        this.f16826b = iArr;
        this.f16827c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m7144b();
        if (i < 0 || i > (i2 = this.f16827c)) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Index:", ", Size:");
            sbM26237n.append(this.f16827c);
            throw new IndexOutOfBoundsException(sbM26237n.toString());
        }
        int[] iArr = this.f16826b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f16826b, i, iArr2, i + 1, this.f16827c - i);
            this.f16826b = iArr2;
        }
        this.f16826b[i] = iIntValue;
        this.f16827c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC1133S0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m7144b();
        Charset charset = AbstractC11635x90.f45425a;
        collection.getClass();
        if (!(collection instanceof C8816b90)) {
            return super.addAll(collection);
        }
        C8816b90 c8816b90 = (C8816b90) collection;
        int i = c8816b90.f16827c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f16827c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f16826b;
        if (i3 > iArr.length) {
            this.f16826b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c8816b90.f16826b, 0, this.f16826b, this.f16827c, c8816b90.f16827c);
        this.f16827c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void m10423d(int i) {
        m7144b();
        int i2 = this.f16827c;
        int[] iArr = this.f16826b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f16826b = iArr2;
        }
        int[] iArr3 = this.f16826b;
        int i3 = this.f16827c;
        this.f16827c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // p000.InterfaceC11381v90
    /* renamed from: e */
    public final InterfaceC11381v90 mo9686e(int i) {
        if (i >= this.f16827c) {
            return new C8816b90(Arrays.copyOf(this.f16826b, i), this.f16827c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.AbstractC1133S0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8816b90)) {
            return super.equals(obj);
        }
        C8816b90 c8816b90 = (C8816b90) obj;
        if (this.f16827c != c8816b90.f16827c) {
            return false;
        }
        int[] iArr = c8816b90.f16826b;
        for (int i = 0; i < this.f16827c; i++) {
            if (this.f16826b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    public final int getInt(int i) {
        m10424h(i);
        return this.f16826b[i];
    }

    /* renamed from: h */
    public final void m10424h(int i) {
        if (i < 0 || i >= this.f16827c) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Index:", ", Size:");
            sbM26237n.append(this.f16827c);
            throw new IndexOutOfBoundsException(sbM26237n.toString());
        }
    }

    @Override // p000.AbstractC1133S0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f16827c; i2++) {
            i = (i * 31) + this.f16826b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f16827c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f16826b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.AbstractC1133S0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7144b();
        m10424h(i);
        int[] iArr = this.f16826b;
        int i2 = iArr[i];
        if (i < this.f16827c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f16827c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m7144b();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f16826b;
        System.arraycopy(iArr, i2, iArr, i, this.f16827c - i2);
        this.f16827c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m7144b();
        m10424h(i);
        int[] iArr = this.f16826b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16827c;
    }

    @Override // p000.AbstractC1133S0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m10423d(((Integer) obj).intValue());
        return true;
    }
}
