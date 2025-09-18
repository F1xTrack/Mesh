package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: aG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8702aG0 extends AbstractC1133S0 implements RandomAccess {

    /* renamed from: d */
    public static final C8702aG0 f15409d = new C8702aG0(new Object[0], 0, false);

    /* renamed from: b */
    public Object[] f15410b;

    /* renamed from: c */
    public int f15411c;

    public C8702aG0(Object[] objArr, int i, boolean z) {
        super(z);
        this.f15410b = objArr;
        this.f15411c = i;
    }

    @Override // p000.AbstractC1133S0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7144b();
        int i = this.f15411c;
        Object[] objArr = this.f15410b;
        if (i == objArr.length) {
            this.f15410b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f15410b;
        int i2 = this.f15411c;
        this.f15411c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: d */
    public final void m9685d(int i) {
        if (i < 0 || i >= this.f15411c) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Index:", ", Size:");
            sbM26237n.append(this.f15411c);
            throw new IndexOutOfBoundsException(sbM26237n.toString());
        }
    }

    @Override // p000.InterfaceC11381v90
    /* renamed from: e */
    public final InterfaceC11381v90 mo9686e(int i) {
        if (i >= this.f15411c) {
            return new C8702aG0(Arrays.copyOf(this.f15410b, i), this.f15411c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m9685d(i);
        return this.f15410b[i];
    }

    @Override // p000.AbstractC1133S0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7144b();
        m9685d(i);
        Object[] objArr = this.f15410b;
        Object obj = objArr[i];
        if (i < this.f15411c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f15411c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m7144b();
        m9685d(i);
        Object[] objArr = this.f15410b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15411c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m7144b();
        if (i >= 0 && i <= (i2 = this.f15411c)) {
            Object[] objArr = this.f15410b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f15410b, i, objArr2, i + 1, this.f15411c - i);
                this.f15410b = objArr2;
            }
            this.f15410b[i] = obj;
            this.f15411c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Index:", ", Size:");
        sbM26237n.append(this.f15411c);
        throw new IndexOutOfBoundsException(sbM26237n.toString());
    }
}
