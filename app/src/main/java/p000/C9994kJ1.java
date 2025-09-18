package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: kJ1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9994kJ1 extends LD1 implements RandomAccess {

    /* renamed from: d */
    public static final C9994kJ1 f36425d = new C9994kJ1(new Object[0], 0, false);

    /* renamed from: b */
    public Object[] f36426b;

    /* renamed from: c */
    public int f36427c;

    public C9994kJ1(Object[] objArr, int i, boolean z) {
        super(z);
        this.f36426b = objArr;
        this.f36427c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.f36427c)) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f36427c, ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.f36426b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f36426b, i, objArr2, i3, this.f36427c - i);
            this.f36426b = objArr2;
        }
        this.f36426b[i] = obj;
        this.f36427c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.InterfaceC11270uH1
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC11270uH1 mo7949c(int i) {
        if (i >= this.f36427c) {
            return new C9994kJ1(Arrays.copyOf(this.f36426b, i), this.f36427c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m22190h(i);
        return this.f36426b[i];
    }

    /* renamed from: h */
    public final void m22190h(int i) {
        if (i < 0 || i >= this.f36427c) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f36427c, ", Size:"));
        }
    }

    @Override // p000.LD1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        m22190h(i);
        Object[] objArr = this.f36426b;
        Object obj = objArr[i];
        if (i < this.f36427c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f36427c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zza();
        m22190h(i);
        Object[] objArr = this.f36426b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36427c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zza();
        int i = this.f36427c;
        Object[] objArr = this.f36426b;
        if (i == objArr.length) {
            this.f36426b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f36426b;
        int i2 = this.f36427c;
        this.f36427c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
