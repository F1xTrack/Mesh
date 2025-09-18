package p000;

import java.io.Serializable;
import java.util.Iterator;

/* renamed from: Fk */
/* loaded from: classes.dex */
public class C0362Fk implements Iterable, Serializable {

    /* renamed from: c */
    public static final C0362Fk f3403c = new C0362Fk(AbstractC11889z90.f46667b);

    /* renamed from: d */
    public static final InterfaceC0236Dk f3404d;

    /* renamed from: a */
    public int f3405a = 0;

    /* renamed from: b */
    public final byte[] f3406b;

    static {
        f3404d = AbstractC3905d4.m17482a() ? new C4049fN(9) : new C6914tt(9);
    }

    public C0362Fk(byte[] bArr) {
        bArr.getClass();
        this.f3406b = bArr;
    }

    /* renamed from: b */
    public static C0362Fk m2764b(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        int length = bArr.length;
        if (((i3 - i) | i | i3 | (length - i3)) >= 0) {
            return new C0362Fk(f3404d.mo1864b(bArr, i, i2));
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26230g(i, "Beginning index: ", " < 0"));
        }
        if (i3 < i) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Beginning index larger than ending index: ", i3, ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i3, "End index: ", length, " >= "));
    }

    /* renamed from: d */
    public int m2765d() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0362Fk) || size() != ((C0362Fk) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0362Fk)) {
            return obj.equals(this);
        }
        C0362Fk c0362Fk = (C0362Fk) obj;
        int i = this.f3405a;
        int i2 = c0362Fk.f3405a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c0362Fk.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0362Fk.size()) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(size, "Ran off end of other: 0, ", ", ");
            sbM26237n.append(c0362Fk.size());
            throw new IllegalArgumentException(sbM26237n.toString());
        }
        int iM2765d = m2765d() + size;
        int iM2765d2 = m2765d();
        int iM2765d3 = c0362Fk.m2765d();
        while (iM2765d2 < iM2765d) {
            if (this.f3406b[iM2765d2] != c0362Fk.f3406b[iM2765d3]) {
                return false;
            }
            iM2765d2++;
            iM2765d3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f3405a;
        if (i == 0) {
            int size = size();
            int iM2765d = m2765d();
            int i2 = size;
            for (int i3 = iM2765d; i3 < iM2765d + size; i3++) {
                i2 = (i2 * 31) + this.f3406b[i3];
            }
            i = i2 == 0 ? 1 : i2;
            this.f3405a = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0110Bk(this);
    }

    public int size() {
        return this.f3406b.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
