package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: vS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11420vS1 extends RP1 implements FS1, HU1, RandomAccess {

    /* renamed from: d */
    public static final int[] f44382d;

    /* renamed from: e */
    public static final C11420vS1 f44383e;

    /* renamed from: b */
    public int[] f44384b;

    /* renamed from: c */
    public int f44385c;

    static {
        int[] iArr = new int[0];
        f44382d = iArr;
        f44383e = new C11420vS1(iArr, 0, false);
    }

    public C11420vS1(int[] iArr, int i, boolean z) {
        super(z);
        this.f44384b = iArr;
        this.f44385c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i < 0 || i > (i2 = this.f44385c)) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f44385c, ", Size:"));
        }
        int[] iArr = this.f44384b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[Math.max(((iArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f44384b, 0, iArr2, 0, i);
            System.arraycopy(this.f44384b, i, iArr2, i + 1, this.f44385c - i);
            this.f44384b = iArr2;
        }
        this.f44384b[i] = iIntValue;
        this.f44385c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.RP1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = BS1.f826a;
        collection.getClass();
        if (!(collection instanceof C11420vS1)) {
            return super.addAll(collection);
        }
        C11420vS1 c11420vS1 = (C11420vS1) collection;
        int i = c11420vS1.f44385c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f44385c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f44384b;
        if (i3 > iArr.length) {
            this.f44384b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c11420vS1.f44384b, 0, this.f44384b, this.f44385c, c11420vS1.f44385c);
        this.f44385c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final int m25424d(int i) {
        m25428q(i);
        return this.f44384b[i];
    }

    @Override // p000.RP1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11420vS1)) {
            return super.equals(obj);
        }
        C11420vS1 c11420vS1 = (C11420vS1) obj;
        if (this.f44385c != c11420vS1.f44385c) {
            return false;
        }
        int[] iArr = c11420vS1.f44384b;
        for (int i = 0; i < this.f44385c; i++) {
            if (this.f44384b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(m25424d(i));
    }

    @Override // p000.LS1
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final C11420vS1 mo724a(int i) {
        if (i >= this.f44385c) {
            return new C11420vS1(i == 0 ? f44382d : Arrays.copyOf(this.f44384b, i), this.f44385c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // p000.RP1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f44385c; i2++) {
            i = (i * 31) + this.f44384b[i2];
        }
        return i;
    }

    /* renamed from: i */
    public final void m25426i(int i) {
        zza();
        int i2 = this.f44385c;
        int[] iArr = this.f44384b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[Math.max(((iArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f44384b, 0, iArr2, 0, this.f44385c);
            this.f44384b = iArr2;
        }
        int[] iArr3 = this.f44384b;
        int i3 = this.f44385c;
        this.f44385c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f44385c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f44384b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void m25427k(int i) {
        int[] iArr = this.f44384b;
        if (i <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.f44384b = new int[Math.max(i, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.f44384b = Arrays.copyOf(this.f44384b, length);
    }

    /* renamed from: q */
    public final void m25428q(int i) {
        if (i < 0 || i >= this.f44385c) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f44385c, ", Size:"));
        }
    }

    @Override // p000.RP1, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        m25428q(i);
        int[] iArr = this.f44384b;
        int i2 = iArr[i];
        if (i < this.f44385c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f44385c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f44384b;
        System.arraycopy(iArr, i2, iArr, i, this.f44385c - i2);
        this.f44385c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        m25428q(i);
        int[] iArr = this.f44384b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44385c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m25426i(((Integer) obj).intValue());
        return true;
    }
}
