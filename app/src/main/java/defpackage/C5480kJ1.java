package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: kJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5480kJ1 extends LD1 implements RandomAccess {
    public static final C5480kJ1 d = new C5480kJ1(new Object[0], 0, false);
    public Object[] b;
    public int c;

    public C5480kJ1(Object[] objArr, int i, boolean z) {
        super(z);
        this.b = objArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "Index:", this.c, ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.b, i, objArr2, i3, this.c - i);
            this.b = objArr2;
        }
        this.b[i] = obj;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.InterfaceC7383uH1
    public final /* bridge */ /* synthetic */ InterfaceC7383uH1 c(int i) {
        if (i >= this.c) {
            return new C5480kJ1(Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h(i);
        return this.b[i];
    }

    public final void h(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "Index:", this.c, ", Size:"));
        }
    }

    @Override // defpackage.LD1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        h(i);
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
        zza();
        h(i);
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

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
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
}
