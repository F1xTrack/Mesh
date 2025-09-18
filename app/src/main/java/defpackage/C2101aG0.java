package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: aG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2101aG0 extends S0 implements RandomAccess {
    public static final C2101aG0 d = new C2101aG0(new Object[0], 0, false);
    public Object[] b;
    public int c;

    public C2101aG0(Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.c = i;
    }

    @Override // defpackage.S0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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

    @Override // defpackage.InterfaceC7549v90
    public final InterfaceC7549v90 e(int i) {
        if (i >= this.c) {
            return new C2101aG0(Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return this.b[i];
    }

    @Override // defpackage.S0, java.util.AbstractList, java.util.List
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
