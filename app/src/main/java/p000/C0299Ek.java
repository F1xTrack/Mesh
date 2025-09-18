package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: Ek */
/* loaded from: classes.dex */
public class C0299Ek implements Iterable, Serializable {

    /* renamed from: c */
    public static final C0299Ek f2870c = new C0299Ek(AbstractC11635x90.f45426b);

    /* renamed from: a */
    public int f2871a = 0;

    /* renamed from: b */
    public final byte[] f2872b;

    static {
        Class cls = AbstractC1824c4.f17277a;
    }

    public C0299Ek(byte[] bArr) {
        bArr.getClass();
        this.f2872b = bArr;
    }

    /* renamed from: d */
    public static int m2371d(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26230g(i, "Beginning index: ", " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i, "Beginning index larger than ending index: ", i2, ", "));
        }
        throw new IndexOutOfBoundsException(AbstractC7222ym.m26229f(i2, "End index: ", i3, " >= "));
    }

    /* renamed from: b */
    public byte mo1302b(int i) {
        return this.f2872b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0299Ek) || size() != ((C0299Ek) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0299Ek)) {
            return obj.equals(this);
        }
        C0299Ek c0299Ek = (C0299Ek) obj;
        int i = this.f2871a;
        int i2 = c0299Ek.f2871a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c0299Ek.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c0299Ek.size()) {
            StringBuilder sbM26237n = AbstractC7222ym.m26237n(size, "Ran off end of other: 0, ", ", ");
            sbM26237n.append(c0299Ek.size());
            throw new IllegalArgumentException(sbM26237n.toString());
        }
        int iMo1303h = mo1303h() + size;
        int iMo1303h2 = mo1303h();
        int iMo1303h3 = c0299Ek.mo1303h();
        while (iMo1303h2 < iMo1303h) {
            if (this.f2872b[iMo1303h2] != c0299Ek.f2872b[iMo1303h3]) {
                return false;
            }
            iMo1303h2++;
            iMo1303h3++;
        }
        return true;
    }

    /* renamed from: h */
    public int mo1303h() {
        return 0;
    }

    public final int hashCode() {
        int i = this.f2871a;
        if (i == 0) {
            int size = size();
            int iMo1303h = mo1303h();
            int i2 = size;
            for (int i3 = iMo1303h; i3 < iMo1303h + size; i3++) {
                i2 = (i2 * 31) + this.f2872b[i3];
            }
            i = i2 == 0 ? 1 : i2;
            this.f2871a = i;
        }
        return i;
    }

    /* renamed from: i */
    public byte mo1304i(int i) {
        return this.f2872b[i];
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0110Bk(this);
    }

    public int size() {
        return this.f2872b.length;
    }

    public final String toString() {
        C0299Ek c0173Ck;
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = AbstractC10784qU1.m24014a(this);
        } else {
            StringBuilder sb = new StringBuilder();
            int iM2371d = m2371d(0, 47, size());
            if (iM2371d == 0) {
                c0173Ck = f2870c;
            } else {
                c0173Ck = new C0173Ck(this.f2872b, mo1303h(), iM2371d);
            }
            sb.append(AbstractC10784qU1.m24014a(c0173Ck));
            sb.append("...");
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return AbstractC1374Vq.m8593l(sb2, string, "\">");
    }
}
