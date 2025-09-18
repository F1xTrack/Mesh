package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: Fk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0440Fk implements Iterable, Serializable {
    public static final C0440Fk c = new C0440Fk(AbstractC8309z90.b);
    public static final InterfaceC0284Dk d;
    public int a = 0;
    public final byte[] b;

    static {
        d = AbstractC3321d4.a() ? new C3759fN(9) : new C7304tt(9);
    }

    public C0440Fk(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static C0440Fk b(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        int length = bArr.length;
        if (((i3 - i) | i | i3 | (length - i3)) >= 0) {
            return new C0440Fk(d.b(bArr, i, i2));
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.g(i, "Beginning index: ", " < 0"));
        }
        if (i3 < i) {
            throw new IndexOutOfBoundsException(AbstractC8235ym.f(i, "Beginning index larger than ending index: ", i3, ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC8235ym.f(i3, "End index: ", length, " >= "));
    }

    public int d() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0440Fk) || size() != ((C0440Fk) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0440Fk)) {
            return obj.equals(this);
        }
        C0440Fk c0440Fk = (C0440Fk) obj;
        int i = this.a;
        int i2 = c0440Fk.a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c0440Fk.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0440Fk.size()) {
            StringBuilder sbN = AbstractC8235ym.n(size, "Ran off end of other: 0, ", ", ");
            sbN.append(c0440Fk.size());
            throw new IllegalArgumentException(sbN.toString());
        }
        int iD = d() + size;
        int iD2 = d();
        int iD3 = c0440Fk.d();
        while (iD2 < iD) {
            if (this.b[iD2] != c0440Fk.b[iD3]) {
                return false;
            }
            iD2++;
            iD3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int size = size();
            int iD = d();
            int i2 = size;
            for (int i3 = iD; i3 < iD + size; i3++) {
                i2 = (i2 * 31) + this.b[i3];
            }
            i = i2 == 0 ? 1 : i2;
            this.a = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0128Bk(this);
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
