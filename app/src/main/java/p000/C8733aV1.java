package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: aV1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8733aV1 extends RP1 implements RandomAccess {

    /* renamed from: d */
    public static final Object[] f15538d;

    /* renamed from: e */
    public static final C8733aV1 f15539e;

    /* renamed from: b */
    public Object[] f15540b;

    /* renamed from: c */
    public int f15541c;

    static {
        Object[] objArr = new Object[0];
        f15538d = objArr;
        f15539e = new C8733aV1(objArr, 0, false);
    }

    public C8733aV1(Object[] objArr, int i, boolean z) {
        super(z);
        this.f15540b = objArr;
        this.f15541c = i;
    }

    @Override // p000.LS1
    /* renamed from: a */
    public final /* synthetic */ LS1 mo724a(int i) {
        if (i >= this.f15541c) {
            return new C8733aV1(i == 0 ? f15538d : Arrays.copyOf(this.f15540b, i), this.f15541c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.f15541c)) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f15541c, ", Size:"));
        }
        Object[] objArr = this.f15540b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((objArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f15540b, 0, objArr2, 0, i);
            System.arraycopy(this.f15540b, i, objArr2, i + 1, this.f15541c - i);
            this.f15540b = objArr2;
        }
        this.f15540b[i] = obj;
        this.f15541c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: d */
    public final void m9755d(int i) {
        if (i < 0 || i >= this.f15541c) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f15541c, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m9755d(i);
        return this.f15540b[i];
    }

    @Override // p000.RP1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        m9755d(i);
        Object[] objArr = this.f15540b;
        Object obj = objArr[i];
        if (i < this.f15541c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f15541c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        m9755d(i);
        Object[] objArr = this.f15540b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15541c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i = this.f15541c;
        Object[] objArr = this.f15540b;
        if (i == objArr.length) {
            this.f15540b = Arrays.copyOf(this.f15540b, Math.max(((objArr.length * 3) / 2) + 1, 10));
        }
        Object[] objArr2 = this.f15540b;
        int i2 = this.f15541c;
        this.f15541c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
