package defpackage;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: vS1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7607vS1 extends RP1 implements FS1, HU1, RandomAccess {
    public static final int[] d;
    public static final C7607vS1 e;
    public int[] b;
    public int c;

    static {
        int[] iArr = new int[0];
        d = iArr;
        e = new C7607vS1(iArr, 0, false);
    }

    public C7607vS1(int[] iArr, int i, boolean z) {
        super(z);
        this.b = iArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        zza();
        if (i < 0 || i > (i2 = this.c)) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "Index:", this.c, ", Size:"));
        }
        int[] iArr = this.b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[Math.max(((iArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, iArr2, 0, i);
            System.arraycopy(this.b, i, iArr2, i + 1, this.c - i);
            this.b = iArr2;
        }
        this.b[i] = iIntValue;
        this.c++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.RP1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = BS1.a;
        collection.getClass();
        if (!(collection instanceof C7607vS1)) {
            return super.addAll(collection);
        }
        C7607vS1 c7607vS1 = (C7607vS1) collection;
        int i = c7607vS1.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.b;
        if (i3 > iArr.length) {
            this.b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c7607vS1.b, 0, this.b, this.c, c7607vS1.c);
        this.c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        q(i);
        return this.b[i];
    }

    @Override // defpackage.RP1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7607vS1)) {
            return super.equals(obj);
        }
        C7607vS1 c7607vS1 = (C7607vS1) obj;
        if (this.c != c7607vS1.c) {
            return false;
        }
        int[] iArr = c7607vS1.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(d(i));
    }

    @Override // defpackage.LS1
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final C7607vS1 a(int i) {
        if (i >= this.c) {
            return new C7607vS1(i == 0 ? d : Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.RP1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    public final void i(int i) {
        zza();
        int i2 = this.c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[Math.max(((iArr.length * 3) / 2) + 1, 10)];
            System.arraycopy(this.b, 0, iArr2, 0, this.c);
            this.b = iArr2;
        }
        int[] iArr3 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void k(int i) {
        int[] iArr = this.b;
        if (i <= iArr.length) {
            return;
        }
        if (iArr.length == 0) {
            this.b = new int[Math.max(i, 10)];
            return;
        }
        int length = iArr.length;
        while (length < i) {
            length = Math.max(((length * 3) / 2) + 1, 10);
        }
        this.b = Arrays.copyOf(this.b, length);
    }

    public final void q(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "Index:", this.c, ", Size:"));
        }
    }

    @Override // defpackage.RP1, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zza();
        q(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        if (i < this.c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.b;
        System.arraycopy(iArr, i2, iArr, i, this.c - i2);
        this.c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        zza();
        q(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
