package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class V70 extends J70 implements Set {

    /* renamed from: c */
    public static final /* synthetic */ int f12378c = 0;

    /* renamed from: b */
    public transient P70 f12379b;

    /* renamed from: s */
    public static int m8306s(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* renamed from: t */
    public static V70 m8307t(int i, Object... objArr) {
        if (i == 0) {
            return C10135lQ0.f37051j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new Y11(obj);
        }
        int iM8306s = m8306s(i);
        Object[] objArr2 = new Object[iM8306s];
        int i2 = iM8306s - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC11153tN0.m24909u(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iM4131a = J12.m4131a(iHashCode);
            while (true) {
                int i6 = iM4131a & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iM4131a++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new Y11(obj4);
        }
        if (m8306s(i4) < iM8306s / 2) {
            return m8307t(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C10135lQ0(i3, i2, i4, objArr, objArr2);
    }

    /* renamed from: u */
    public static V70 m8308u(Collection collection) {
        if ((collection instanceof V70) && !(collection instanceof SortedSet)) {
            V70 v70 = (V70) collection;
            if (!v70.mo4164q()) {
                return v70;
            }
        }
        Object[] array = collection.toArray();
        return m8307t(array.length, array);
    }

    @Override // p000.J70
    /* renamed from: b */
    public P70 mo4159b() {
        P70 p70 = this.f12379b;
        if (p70 != null) {
            return p70;
        }
        P70 p70Mo8309v = mo8309v();
        this.f12379b = p70Mo8309v;
        return p70Mo8309v;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof V70) && (this instanceof C10135lQ0)) {
            V70 v70 = (V70) obj;
            v70.getClass();
            if ((v70 instanceof C10135lQ0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return QR1.m6704b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return QR1.m6706d(this);
    }

    /* renamed from: v */
    public P70 mo8309v() {
        Object[] array = toArray(J70.f5350a);
        N70 n70 = P70.f8867b;
        return P70.m6232s(array.length, array);
    }
}
