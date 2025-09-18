package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class T90 extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a */
    public final int[] f11182a;

    /* renamed from: b */
    public final int f11183b;

    /* renamed from: c */
    public final int f11184c;

    public T90(int i, int i2, int[] iArr) {
        this.f11182a = iArr;
        this.f11183b = i;
        this.f11184c = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Integer) {
            if (AbstractC10983s22.m24583e(this.f11182a, ((Integer) obj).intValue(), this.f11183b, this.f11184c) != -1) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof T90)) {
            return super.equals(obj);
        }
        T90 t90 = (T90) obj;
        int size = size();
        if (t90.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.f11182a[this.f11183b + i] != t90.f11182a[t90.f11183b + i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        QL1.m6667c(i, size());
        return Integer.valueOf(this.f11182a[this.f11183b + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.f11183b; i2 < this.f11184c; i2++) {
            i = (i * 31) + this.f11182a[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int[] iArr = this.f11182a;
        int i = this.f11183b;
        int iM24583e = AbstractC10983s22.m24583e(iArr, iIntValue, i, this.f11184c);
        if (iM24583e >= 0) {
            return iM24583e - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i2 = this.f11184c;
            while (true) {
                i2--;
                i = this.f11183b;
                if (i2 < i) {
                    i2 = -1;
                    break;
                }
                if (this.f11182a[i2] == iIntValue) {
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Integer num = (Integer) obj;
        QL1.m6667c(i, size());
        int i2 = this.f11183b + i;
        int[] iArr = this.f11182a;
        int i3 = iArr[i2];
        num.getClass();
        iArr[i2] = num.intValue();
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11184c - this.f11183b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        QL1.m6670f(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int i3 = this.f11183b;
        return new T90(i + i3, i3 + i2, this.f11182a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuilder sb = new StringBuilder(size() * 5);
        sb.append('[');
        int[] iArr = this.f11182a;
        int i = this.f11183b;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= this.f11184c) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }
}
