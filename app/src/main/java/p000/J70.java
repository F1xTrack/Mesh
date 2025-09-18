package p000;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class J70 extends AbstractCollection implements Serializable {

    /* renamed from: a */
    public static final Object[] f5350a = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public abstract P70 mo4159b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    /* renamed from: d */
    public abstract int mo4160d(int i, Object[] objArr);

    /* renamed from: h */
    public Object[] mo4161h() {
        return null;
    }

    /* renamed from: i */
    public int mo4162i() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: k */
    public int mo4163k() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: q */
    public abstract boolean mo4164q();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC10168lg1 iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f5350a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrMo4161h = mo4161h();
            if (objArrMo4161h != null) {
                return Arrays.copyOfRange(objArrMo4161h, mo4163k(), mo4162i(), objArr.getClass());
            }
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        mo4160d(0, objArr);
        return objArr;
    }
}
