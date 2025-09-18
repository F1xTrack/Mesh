package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: bG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2292bG0 extends T0 implements RandomAccess {
    public static final C2292bG0 d;
    public Object[] b;
    public int c;

    static {
        C2292bG0 c2292bG0 = new C2292bG0(0, new Object[0]);
        d = c2292bG0;
        c2292bG0.a = false;
    }

    public C2292bG0(int i, Object[] objArr) {
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.T0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            this.b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.c) {
            StringBuilder sbN = AbstractC8235ym.n(i, "Index:", ", Size:");
            sbN.append(this.c);
            throw new IndexOutOfBoundsException(sbN.toString());
        }
    }

    @Override // defpackage.InterfaceC7739w90
    public final InterfaceC7739w90 e(int i) {
        if (i < this.c) {
            throw new IllegalArgumentException();
        }
        return new C2292bG0(this.c, Arrays.copyOf(this.b, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return this.b[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        d(i);
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i < this.c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        d(i);
        Object[] objArr = this.b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b();
        if (i >= 0 && i <= (i2 = this.c)) {
            Object[] objArr = this.b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.b, i, objArr2, i + 1, this.c - i);
                this.b = objArr2;
            }
            this.b[i] = obj;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbN = AbstractC8235ym.n(i, "Index:", ", Size:");
        sbN.append(this.c);
        throw new IndexOutOfBoundsException(sbN.toString());
    }
}
