package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class V70 extends J70 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient P70 b;

    public static int s(int i) {
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

    public static V70 t(int i, Object... objArr) {
        if (i == 0) {
            return C5691lQ0.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new Y11(obj);
        }
        int iS = s(i);
        Object[] objArr2 = new Object[iS];
        int i2 = iS - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC7209tN0.u(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iA = J12.a(iHashCode);
            while (true) {
                int i6 = iA & i2;
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
                iA++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new Y11(obj4);
        }
        if (s(i4) < iS / 2) {
            return t(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new C5691lQ0(i3, i2, i4, objArr, objArr2);
    }

    public static V70 u(Collection collection) {
        if ((collection instanceof V70) && !(collection instanceof SortedSet)) {
            V70 v70 = (V70) collection;
            if (!v70.q()) {
                return v70;
            }
        }
        Object[] array = collection.toArray();
        return t(array.length, array);
    }

    @Override // defpackage.J70
    public P70 b() {
        P70 p70 = this.b;
        if (p70 != null) {
            return p70;
        }
        P70 p70V = v();
        this.b = p70V;
        return p70V;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof V70) && (this instanceof C5691lQ0)) {
            V70 v70 = (V70) obj;
            v70.getClass();
            if ((v70 instanceof C5691lQ0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return QR1.b(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return QR1.d(this);
    }

    public P70 v() {
        Object[] array = toArray(J70.a);
        N70 n70 = P70.b;
        return P70.s(array.length, array);
    }
}
