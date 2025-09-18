package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class UG1 extends LD1 implements RandomAccess, InterfaceC10374nH1 {

    /* renamed from: d */
    public static final UG1 f11711d = new UG1(new int[0], 0, false);

    /* renamed from: b */
    public int[] f11712b;

    /* renamed from: c */
    public int f11713c;

    public UG1(int[] iArr, int i, boolean z) {
        super(z);
        this.f11712b = iArr;
        this.f11713c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i < 0 || i > (i2 = this.f11713c)) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f11713c, ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.f11712b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f11712b, i, iArr2, i3, this.f11713c - i);
            this.f11712b = iArr2;
        }
        this.f11712b[i] = iIntValue;
        this.f11713c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.LD1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = AbstractC11398vH1.f44320a;
        collection.getClass();
        if (!(collection instanceof UG1)) {
            return super.addAll(collection);
        }
        UG1 ug1 = (UG1) collection;
        int i = ug1.f11713c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f11713c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f11712b;
        if (i3 > iArr.length) {
            this.f11712b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(ug1.f11712b, 0, this.f11712b, this.f11713c, ug1.f11713c);
        this.f11713c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.InterfaceC11270uH1
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC11270uH1 mo7949c(int i) {
        if (i >= this.f11713c) {
            return new UG1(Arrays.copyOf(this.f11712b, i), this.f11713c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.LD1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UG1)) {
            return super.equals(obj);
        }
        UG1 ug1 = (UG1) obj;
        if (this.f11713c != ug1.f11713c) {
            return false;
        }
        int[] iArr = ug1.f11712b;
        for (int i = 0; i < this.f11713c; i++) {
            if (this.f11712b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m7952k(i);
        return Integer.valueOf(this.f11712b[i]);
    }

    /* renamed from: h */
    public final int m7950h(int i) {
        m7952k(i);
        return this.f11712b[i];
    }

    @Override // p000.LD1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f11713c; i2++) {
            i = (i * 31) + this.f11712b[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final void m7951i(int i) {
        zza();
        int i2 = this.f11713c;
        int[] iArr = this.f11712b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f11712b = iArr2;
        }
        int[] iArr3 = this.f11712b;
        int i3 = this.f11713c;
        this.f11713c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f11713c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f11712b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void m7952k(int i) {
        if (i < 0 || i >= this.f11713c) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f11713c, ", Size:"));
        }
    }

    @Override // p000.LD1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        m7952k(i);
        int[] iArr = this.f11712b;
        int i2 = iArr[i];
        if (i < this.f11713c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f11713c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f11712b;
        System.arraycopy(iArr, i2, iArr, i, this.f11713c - i2);
        this.f11713c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        m7952k(i);
        int[] iArr = this.f11712b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11713c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m7951i(((Integer) obj).intValue());
        return true;
    }
}
