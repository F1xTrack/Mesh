package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: bG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8830bG0 extends AbstractC1196T0 implements RandomAccess {

    /* renamed from: d */
    public static final C8830bG0 f16923d;

    /* renamed from: b */
    public Object[] f16924b;

    /* renamed from: c */
    public int f16925c;

    static {
        C8830bG0 c8830bG0 = new C8830bG0(0, new Object[0]);
        f16923d = c8830bG0;
        c8830bG0.f11086a = false;
    }

    public C8830bG0(int i, Object[] objArr) {
        this.f16924b = objArr;
        this.f16925c = i;
    }

    @Override // p000.AbstractC1196T0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m7506b();
        int i = this.f16925c;
        Object[] objArr = this.f16924b;
        if (i == objArr.length) {
            this.f16924b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f16924b;
        int i2 = this.f16925c;
        this.f16925c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: d */
    public final void m10441d(int i) {
        if (i < 0 || i >= this.f16925c) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Index:", ", Size:");
            sbM26237n.append(this.f16925c);
            throw new IndexOutOfBoundsException(sbM26237n.toString());
        }
    }

    @Override // p000.InterfaceC11508w90
    /* renamed from: e */
    public final InterfaceC11508w90 mo10442e(int i) {
        if (i < this.f16925c) {
            throw new IllegalArgumentException();
        }
        return new C8830bG0(this.f16925c, Arrays.copyOf(this.f16924b, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m10441d(i);
        return this.f16924b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m7506b();
        m10441d(i);
        Object[] objArr = this.f16924b;
        Object obj = objArr[i];
        if (i < this.f16925c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f16925c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m7506b();
        m10441d(i);
        Object[] objArr = this.f16924b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16925c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m7506b();
        if (i >= 0 && i <= (i2 = this.f16925c)) {
            Object[] objArr = this.f16924b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f16924b, i, objArr2, i + 1, this.f16925c - i);
                this.f16924b = objArr2;
            }
            this.f16924b[i] = obj;
            this.f16925c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM26237n = AbstractC7222ym.m26237n(i, "Index:", ", Size:");
        sbM26237n.append(this.f16925c);
        throw new IndexOutOfBoundsException(sbM26237n.toString());
    }
}
