package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class BT1 extends RP1 implements OS1, HU1, RandomAccess {

    /* renamed from: d */
    public static final long[] f836d;

    /* renamed from: e */
    public static final BT1 f837e;

    /* renamed from: b */
    public long[] f838b;

    /* renamed from: c */
    public int f839c;

    static {
        long[] jArr = new long[0];
        f836d = jArr;
        f837e = new BT1(jArr, 0, false);
    }

    public BT1(long[] jArr, int i, boolean z) {
        super(z);
        this.f838b = jArr;
        this.f839c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        zza();
        if (i < 0 || i > (i2 = this.f839c)) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f839c, ", Size:"));
        }
        long[] jArr = this.f838b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[Math.max(((jArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f838b, 0, jArr2, 0, i);
            System.arraycopy(this.f838b, i, jArr2, i + 1, this.f839c - i);
            this.f838b = jArr2;
        }
        this.f838b[i] = jLongValue;
        this.f839c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.RP1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = BS1.f826a;
        collection.getClass();
        if (!(collection instanceof BT1)) {
            return super.addAll(collection);
        }
        BT1 bt1 = (BT1) collection;
        int i = bt1.f839c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f839c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f838b;
        if (i3 > jArr.length) {
            this.f838b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(bt1.f838b, 0, this.f838b, this.f839c, bt1.f839c);
        this.f839c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void m725d(long j) {
        zza();
        int i = this.f839c;
        long[] jArr = this.f838b;
        if (i == jArr.length) {
            long[] jArr2 = new long[Math.max(((jArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f838b, 0, jArr2, 0, this.f839c);
            this.f838b = jArr2;
        }
        long[] jArr3 = this.f838b;
        int i2 = this.f839c;
        this.f839c = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // p000.RP1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BT1)) {
            return super.equals(obj);
        }
        BT1 bt1 = (BT1) obj;
        if (this.f839c != bt1.f839c) {
            return false;
        }
        long[] jArr = bt1.f838b;
        for (int i = 0; i < this.f839c; i++) {
            if (this.f838b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(m726h(i));
    }

    /* renamed from: h */
    public final long m726h(int i) {
        m729q(i);
        return this.f838b[i];
    }

    @Override // p000.RP1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM719a = 1;
        for (int i = 0; i < this.f839c; i++) {
            iM719a = (iM719a * 31) + BS1.m719a(this.f838b[i]);
        }
        return iM719a;
    }

    @Override // p000.LS1
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final BT1 mo724a(int i) {
        if (i >= this.f839c) {
            return new BT1(i == 0 ? f836d : Arrays.copyOf(this.f838b, i), this.f839c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f839c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f838b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public final void m728k(int i) {
        long[] jArr = this.f838b;
        if (i <= jArr.length) {
            return;
        }
        if (jArr.length == 0) {
            this.f838b = new long[Math.max(i, 10)];
            return;
        }
        int length = jArr.length;
        while (length < i) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.f838b = Arrays.copyOf(this.f838b, length);
    }

    /* renamed from: q */
    public final void m729q(int i) {
        if (i < 0 || i >= this.f839c) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f839c, ", Size:"));
        }
    }

    @Override // p000.RP1, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        m729q(i);
        long[] jArr = this.f838b;
        long j = jArr[i];
        if (i < this.f839c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f839c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f838b;
        System.arraycopy(jArr, i2, jArr, i, this.f839c - i2);
        this.f839c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        zza();
        m729q(i);
        long[] jArr = this.f838b;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f839c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m725d(((Long) obj).longValue());
        return true;
    }
}
