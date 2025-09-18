package p000;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: yC1 */
/* loaded from: classes.dex */
public class C11769yC1 implements Iterable, Serializable {

    /* renamed from: c */
    public static final C11769yC1 f46138c = new C11769yC1(AbstractC9090dF1.f25905b);

    /* renamed from: a */
    public int f46139a = 0;

    /* renamed from: b */
    public final byte[] f46140b;

    static {
        int i = MB1.f7033a;
    }

    public C11769yC1(byte[] bArr) {
        bArr.getClass();
        this.f46140b = bArr;
    }

    /* renamed from: i */
    public static int m26093i(int i, int i2, int i3) {
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

    /* renamed from: k */
    public static C11769yC1 m26094k(byte[] bArr, int i, int i2) {
        m26093i(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C11769yC1(bArr2);
    }

    /* renamed from: b */
    public byte mo23953b(int i) {
        return this.f46140b[i];
    }

    /* renamed from: d */
    public byte mo23954d(int i) {
        return this.f46140b[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C11769yC1) || mo23955h() != ((C11769yC1) obj).mo23955h()) {
            return false;
        }
        if (mo23955h() == 0) {
            return true;
        }
        if (!(obj instanceof C11769yC1)) {
            return obj.equals(this);
        }
        C11769yC1 c11769yC1 = (C11769yC1) obj;
        int i = this.f46139a;
        int i2 = c11769yC1.f46139a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int iMo23955h = mo23955h();
        if (iMo23955h > c11769yC1.mo23955h()) {
            throw new IllegalArgumentException("Length too large: " + iMo23955h + mo23955h());
        }
        if (iMo23955h > c11769yC1.mo23955h()) {
            throw new IllegalArgumentException(AbstractC7222ym.m26229f(iMo23955h, "Ran off end of other: 0, ", c11769yC1.mo23955h(), ", "));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < iMo23955h) {
            if (this.f46140b[i3] != c11769yC1.f46140b[i4]) {
                return false;
            }
            i3++;
            i4++;
        }
        return true;
    }

    /* renamed from: h */
    public int mo23955h() {
        return this.f46140b.length;
    }

    public final int hashCode() {
        int i = this.f46139a;
        if (i != 0) {
            return i;
        }
        int iMo23955h = mo23955h();
        int i2 = iMo23955h;
        for (int i3 = 0; i3 < iMo23955h; i3++) {
            i2 = (i2 * 31) + this.f46140b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.f46139a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0110Bk(this);
    }

    public final String toString() {
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iMo23955h = mo23955h();
        if (mo23955h() <= 50) {
            strConcat = AbstractC10215m22.m22644b(this);
        } else {
            int iM26093i = m26093i(0, 47, mo23955h());
            strConcat = AbstractC10215m22.m22644b(iM26093i == 0 ? f46138c : new C10748qC1(this.f46140b, iM26093i)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iMo23955h);
        sb.append(" contents=\"");
        return AbstractC1374Vq.m8593l(sb, strConcat, "\">");
    }
}
