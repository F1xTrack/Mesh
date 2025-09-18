package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class LH1 extends HB1 implements RandomAccess {

    /* renamed from: d */
    public static final LH1 f6595d = new LH1(new Object[0], 0, false);

    /* renamed from: b */
    public Object[] f6596b;

    /* renamed from: c */
    public int f6597c;

    public LH1(Object[] objArr, int i, boolean z) {
        super(z);
        this.f6596b = objArr;
        this.f6597c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.f6597c)) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f6597c, ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.f6596b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f6596b, i, objArr2, i3, this.f6597c - i);
            this.f6596b = objArr2;
        }
        this.f6596b[i] = obj;
        this.f6597c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.YE1
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ YE1 mo137c(int i) {
        if (i >= this.f6597c) {
            return new LH1(Arrays.copyOf(this.f6596b, i), this.f6597c, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public final void m4941d(int i) {
        if (i < 0 || i >= this.f6597c) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f6597c, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m4941d(i);
        return this.f6596b[i];
    }

    @Override // p000.HB1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        m4941d(i);
        Object[] objArr = this.f6596b;
        Object obj = objArr[i];
        if (i < this.f6597c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f6597c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        m4941d(i);
        Object[] objArr = this.f6596b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6597c;
    }

    @Override // p000.HB1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i = this.f6597c;
        Object[] objArr = this.f6596b;
        if (i == objArr.length) {
            this.f6596b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f6596b;
        int i2 = this.f6597c;
        this.f6597c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
