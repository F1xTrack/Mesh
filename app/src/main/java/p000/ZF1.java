package p000;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class ZF1 extends LD1 implements RandomAccess, InterfaceC9862jH1 {

    /* renamed from: d */
    public static final ZF1 f14823d = new ZF1(new float[0], 0, false);

    /* renamed from: b */
    public float[] f14824b;

    /* renamed from: c */
    public int f14825c;

    public ZF1(float[] fArr, int i, boolean z) {
        super(z);
        this.f14824b = fArr;
        this.f14825c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        if (i < 0 || i > (i2 = this.f14825c)) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f14825c, ", Size:"));
        }
        int i3 = i + 1;
        float[] fArr = this.f14824b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i3, i2 - i);
        } else {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f14824b, i, fArr2, i3, this.f14825c - i);
            this.f14824b = fArr2;
        }
        this.f14824b[i] = fFloatValue;
        this.f14825c++;
        ((AbstractList) this).modCount++;
    }

    @Override // p000.LD1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        Charset charset = AbstractC11398vH1.f44320a;
        collection.getClass();
        if (!(collection instanceof ZF1)) {
            return super.addAll(collection);
        }
        ZF1 zf1 = (ZF1) collection;
        int i = zf1.f14825c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14825c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f14824b;
        if (i3 > fArr.length) {
            this.f14824b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(zf1.f14824b, 0, this.f14824b, this.f14825c, zf1.f14825c);
        this.f14825c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p000.InterfaceC11270uH1
    /* renamed from: c */
    public final InterfaceC11270uH1 mo7949c(int i) {
        if (i >= this.f14825c) {
            return new ZF1(Arrays.copyOf(this.f14824b, i), this.f14825c, true);
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
        if (!(obj instanceof ZF1)) {
            return super.equals(obj);
        }
        ZF1 zf1 = (ZF1) obj;
        if (this.f14825c != zf1.f14825c) {
            return false;
        }
        float[] fArr = zf1.f14824b;
        for (int i = 0; i < this.f14825c; i++) {
            if (Float.floatToIntBits(this.f14824b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m9519i(i);
        return Float.valueOf(this.f14824b[i]);
    }

    /* renamed from: h */
    public final void m9518h(float f) {
        zza();
        int i = this.f14825c;
        float[] fArr = this.f14824b;
        if (i == fArr.length) {
            float[] fArr2 = new float[((i * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f14824b = fArr2;
        }
        float[] fArr3 = this.f14824b;
        int i2 = this.f14825c;
        this.f14825c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // p000.LD1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f14825c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f14824b[i]);
        }
        return iFloatToIntBits;
    }

    /* renamed from: i */
    public final void m9519i(int i) {
        if (i < 0 || i >= this.f14825c) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Index:", this.f14825c, ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f14825c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f14824b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p000.LD1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        m9519i(i);
        float[] fArr = this.f14824b;
        float f = fArr[i];
        if (i < this.f14825c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f14825c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f14824b;
        System.arraycopy(fArr, i2, fArr, i, this.f14825c - i2);
        this.f14825c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zza();
        m9519i(i);
        float[] fArr = this.f14824b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14825c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m9518h(((Float) obj).floatValue());
        return true;
    }
}
