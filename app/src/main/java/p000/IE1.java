package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class IE1 extends HB1 implements RandomAccess, SE1, FH1 {

    /* renamed from: d */
    public static final IE1 f4847d = new IE1(new int[0], 0, false);

    /* renamed from: b */
    public int[] f4848b;

    /* renamed from: c */
    public int f4849c;

    public IE1(int[] iArr, int i, boolean z) {
        super(z);
        this.f4848b = iArr;
        this.f4849c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i < 0 || i > (i2 = this.f4849c)) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f4849c, ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.f4848b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f4848b, i, iArr2, i3, this.f4849c - i);
            this.f4848b = iArr2;
        }
        this.f4848b[i] = iIntValue;
        this.f4849c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.HB1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = AbstractC9090dF1.f25904a;
        collection.getClass();
        if (!(collection instanceof IE1)) {
            return super.addAll(collection);
        }
        IE1 ie1 = (IE1) collection;
        int i = ie1.f4849c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4849c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f4848b;
        if (i3 > iArr.length) {
            this.f4848b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(ie1.f4848b, 0, this.f4848b, this.f4849c, ie1.f4849c);
        this.f4849c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.YE1
    /* renamed from: c */
    public final YE1 mo137c(int i) {
        if (i >= this.f4849c) {
            return new IE1(Arrays.copyOf(this.f4848b, i), this.f4849c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void m3789d(int i) {
        zza();
        int i2 = this.f4849c;
        int[] iArr = this.f4848b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f4848b = iArr2;
        }
        int[] iArr3 = this.f4848b;
        int i3 = this.f4849c;
        this.f4849c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // p000.HB1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IE1)) {
            return super.equals(obj);
        }
        IE1 ie1 = (IE1) obj;
        if (this.f4849c != ie1.f4849c) {
            return false;
        }
        int[] iArr = ie1.f4848b;
        for (int i = 0; i < this.f4849c; i++) {
            if (this.f4848b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m3790h(i);
        return Integer.valueOf(this.f4848b[i]);
    }

    /* renamed from: h */
    public final void m3790h(int i) {
        if (i < 0 || i >= this.f4849c) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f4849c, ", Size:"));
        }
    }

    @Override // p000.HB1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4849c; i2++) {
            i = (i * 31) + this.f4848b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f4849c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f4848b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.HB1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        m3790h(i);
        int[] iArr = this.f4848b;
        int i2 = iArr[i];
        if (i < this.f4849c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f4849c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f4848b;
        System.arraycopy(iArr, i2, iArr, i, this.f4849c - i2);
        this.f4849c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        m3790h(i);
        int[] iArr = this.f4848b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4849c;
    }

    @Override // p000.HB1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m3789d(((Integer) obj).intValue());
        return true;
    }
}
