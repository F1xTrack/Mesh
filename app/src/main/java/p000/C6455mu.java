package p000;

import android.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;

/* renamed from: mu */
/* loaded from: classes.dex */
public final class C6455mu {

    /* renamed from: a */
    public int f37981a;

    /* renamed from: b */
    public int f37982b;

    /* renamed from: c */
    public int f37983c;

    /* renamed from: d */
    public Object f37984d;

    /* renamed from: T */
    public static void m22970T(int i) throws Z90 {
        if ((i & 3) != 0) {
            throw Z90.m9500e();
        }
    }

    /* renamed from: U */
    public static void m22971U(int i) throws Z90 {
        if ((i & 7) != 0) {
            throw Z90.m9500e();
        }
    }

    /* renamed from: A */
    public int m22972A() throws W90 {
        m22989R(5);
        return ((C6329ku) this.f37984d).m22307v();
    }

    /* renamed from: B */
    public void m22973B(List list) throws Z90 {
        int iM22311z;
        boolean z = list instanceof AbstractC8944c90;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f37981a & 7;
            if (i == 2) {
                m22970T(c6329ku.m22279A());
                c6329ku.m22307v();
                throw null;
            }
            if (i != 5) {
                throw Z90.m9497b();
            }
            c6329ku.m22307v();
            throw null;
        }
        int i2 = this.f37981a & 7;
        if (i2 == 2) {
            int iM22279A = c6329ku.m22279A();
            m22970T(iM22279A);
            int iM22287b = c6329ku.m22287b() + iM22279A;
            do {
                list.add(Integer.valueOf(c6329ku.m22307v()));
            } while (c6329ku.m22287b() < iM22287b);
            return;
        }
        if (i2 != 5) {
            throw Z90.m9497b();
        }
        do {
            list.add(Integer.valueOf(c6329ku.m22307v()));
            if (c6329ku.m22288c()) {
                return;
            } else {
                iM22311z = c6329ku.m22311z();
            }
        } while (iM22311z == this.f37981a);
        this.f37983c = iM22311z;
    }

    /* renamed from: C */
    public long m22974C() throws W90 {
        m22989R(1);
        return ((C6329ku) this.f37984d).m22308w();
    }

    /* renamed from: D */
    public void m22975D(List list) throws Z90 {
        int iM22311z;
        boolean z = list instanceof AbstractC11711xl0;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f37981a & 7;
            if (i == 1) {
                c6329ku.m22308w();
                throw null;
            }
            if (i != 2) {
                throw Z90.m9497b();
            }
            m22971U(c6329ku.m22279A());
            c6329ku.m22308w();
            throw null;
        }
        int i2 = this.f37981a & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(c6329ku.m22308w()));
                if (c6329ku.m22288c()) {
                    return;
                } else {
                    iM22311z = c6329ku.m22311z();
                }
            } while (iM22311z == this.f37981a);
            this.f37983c = iM22311z;
            return;
        }
        if (i2 != 2) {
            throw Z90.m9497b();
        }
        int iM22279A = c6329ku.m22279A();
        m22971U(iM22279A);
        int iM22287b = c6329ku.m22287b() + iM22279A;
        do {
            list.add(Long.valueOf(c6329ku.m22308w()));
        } while (c6329ku.m22287b() < iM22287b);
    }

    /* renamed from: E */
    public int m22976E() throws W90 {
        m22989R(0);
        return ((C6329ku) this.f37984d).m22309x();
    }

    /* renamed from: F */
    public void m22977F(List list) throws Z90 {
        int iM22311z;
        boolean z = list instanceof AbstractC8944c90;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f37981a & 7;
            if (i == 0) {
                c6329ku.m22309x();
                throw null;
            }
            if (i != 2) {
                throw Z90.m9497b();
            }
            c6329ku.m22279A();
            c6329ku.m22309x();
            throw null;
        }
        int i2 = this.f37981a & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(c6329ku.m22309x()));
                if (c6329ku.m22288c()) {
                    return;
                } else {
                    iM22311z = c6329ku.m22311z();
                }
            } while (iM22311z == this.f37981a);
            this.f37983c = iM22311z;
            return;
        }
        if (i2 != 2) {
            throw Z90.m9497b();
        }
        int iM22287b = c6329ku.m22287b() + c6329ku.m22279A();
        do {
            list.add(Integer.valueOf(c6329ku.m22309x()));
        } while (c6329ku.m22287b() < iM22287b);
        m22988Q(iM22287b);
    }

    /* renamed from: G */
    public long m22978G() throws W90 {
        m22989R(0);
        return ((C6329ku) this.f37984d).m22310y();
    }

    /* renamed from: H */
    public void m22979H(List list) throws Z90 {
        int iM22311z;
        boolean z = list instanceof AbstractC11711xl0;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f37981a & 7;
            if (i == 0) {
                c6329ku.m22310y();
                throw null;
            }
            if (i != 2) {
                throw Z90.m9497b();
            }
            c6329ku.m22279A();
            c6329ku.m22310y();
            throw null;
        }
        int i2 = this.f37981a & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(c6329ku.m22310y()));
                if (c6329ku.m22288c()) {
                    return;
                } else {
                    iM22311z = c6329ku.m22311z();
                }
            } while (iM22311z == this.f37981a);
            this.f37983c = iM22311z;
            return;
        }
        if (i2 != 2) {
            throw Z90.m9497b();
        }
        int iM22287b = c6329ku.m22287b() + c6329ku.m22279A();
        do {
            list.add(Long.valueOf(c6329ku.m22310y()));
        } while (c6329ku.m22287b() < iM22287b);
        m22988Q(iM22287b);
    }

    /* renamed from: I */
    public String m22980I() throws Z90 {
        m22989R(2);
        C6329ku c6329ku = (C6329ku) this.f37984d;
        int iM22304s = c6329ku.m22304s();
        byte[] bArr = c6329ku.f36748d;
        if (iM22304s > 0) {
            int i = c6329ku.f36749e;
            int i2 = c6329ku.f36751g;
            if (iM22304s <= i - i2) {
                String str = new String(bArr, i2, iM22304s, AbstractC11889z90.f46666a);
                c6329ku.f36751g += iM22304s;
                return str;
            }
        }
        if (iM22304s == 0) {
            return "";
        }
        if (iM22304s > c6329ku.f36749e) {
            return new String(c6329ku.m22299n(iM22304s), AbstractC11889z90.f46666a);
        }
        c6329ku.m22282D(iM22304s);
        String str2 = new String(bArr, c6329ku.f36751g, iM22304s, AbstractC11889z90.f46666a);
        c6329ku.f36751g += iM22304s;
        return str2;
    }

    /* renamed from: J */
    public void m22981J(List list, boolean z) throws Z90 {
        int iM22311z;
        int iM22311z2;
        if ((this.f37981a & 7) != 2) {
            throw Z90.m9497b();
        }
        boolean z2 = list instanceof InterfaceC9403fi0;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (!z2 || z) {
            do {
                list.add(z ? m22982K() : m22980I());
                if (c6329ku.m22288c()) {
                    return;
                } else {
                    iM22311z = c6329ku.m22311z();
                }
            } while (iM22311z == this.f37981a);
            this.f37983c = iM22311z;
            return;
        }
        InterfaceC9403fi0 interfaceC9403fi0 = (InterfaceC9403fi0) list;
        do {
            interfaceC9403fi0.mo10830f(m22996f());
            if (c6329ku.m22288c()) {
                return;
            } else {
                iM22311z2 = c6329ku.m22311z();
            }
        } while (iM22311z2 == this.f37981a);
        this.f37983c = iM22311z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m22982K() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6455mu.m22982K():java.lang.String");
    }

    /* renamed from: L */
    public int m22983L() throws W90 {
        m22989R(0);
        return ((C6329ku) this.f37984d).m22279A();
    }

    /* renamed from: M */
    public void m22984M(List list) throws Z90 {
        int iM22311z;
        boolean z = list instanceof AbstractC8944c90;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f37981a & 7;
            if (i == 0) {
                c6329ku.m22279A();
                throw null;
            }
            if (i != 2) {
                throw Z90.m9497b();
            }
            c6329ku.m22279A();
            c6329ku.m22279A();
            throw null;
        }
        int i2 = this.f37981a & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(c6329ku.m22279A()));
                if (c6329ku.m22288c()) {
                    return;
                } else {
                    iM22311z = c6329ku.m22311z();
                }
            } while (iM22311z == this.f37981a);
            this.f37983c = iM22311z;
            return;
        }
        if (i2 != 2) {
            throw Z90.m9497b();
        }
        int iM22287b = c6329ku.m22287b() + c6329ku.m22279A();
        do {
            list.add(Integer.valueOf(c6329ku.m22279A()));
        } while (c6329ku.m22287b() < iM22287b);
        m22988Q(iM22287b);
    }

    /* renamed from: N */
    public long m22985N() throws W90 {
        m22989R(0);
        return ((C6329ku) this.f37984d).m22280B();
    }

    /* renamed from: O */
    public void m22986O(List list) throws Z90 {
        int iM22311z;
        boolean z = list instanceof AbstractC11711xl0;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f37981a & 7;
            if (i == 0) {
                c6329ku.m22280B();
                throw null;
            }
            if (i != 2) {
                throw Z90.m9497b();
            }
            c6329ku.m22279A();
            c6329ku.m22280B();
            throw null;
        }
        int i2 = this.f37981a & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(c6329ku.m22280B()));
                if (c6329ku.m22288c()) {
                    return;
                } else {
                    iM22311z = c6329ku.m22311z();
                }
            } while (iM22311z == this.f37981a);
            this.f37983c = iM22311z;
            return;
        }
        if (i2 != 2) {
            throw Z90.m9497b();
        }
        int iM22287b = c6329ku.m22287b() + c6329ku.m22279A();
        do {
            list.add(Long.valueOf(c6329ku.m22280B()));
        } while (c6329ku.m22287b() < iM22287b);
        m22988Q(iM22287b);
    }

    /* renamed from: P */
    public long m22987P() {
        int i = this.f37982b;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = this.f37981a;
        long j = ((long[]) this.f37984d)[i2];
        this.f37981a = (i2 + 1) & this.f37983c;
        this.f37982b = i - 1;
        return j;
    }

    /* renamed from: Q */
    public void m22988Q(int i) throws Z90 {
        if (((C6329ku) this.f37984d).m22287b() != i) {
            throw Z90.m9501f();
        }
    }

    /* renamed from: R */
    public void m22989R(int i) throws W90 {
        if ((this.f37981a & 7) != i) {
            throw Z90.m9497b();
        }
    }

    /* renamed from: S */
    public boolean m22990S() {
        int i;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (c6329ku.m22288c() || (i = this.f37981a) == this.f37982b) {
            return false;
        }
        return c6329ku.m22283E(i);
    }

    /* renamed from: a */
    public void m22991a() {
        int i = this.f37983c;
        View view = (View) this.f37984d;
        int top = i - (view.getTop() - this.f37981a);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f37982b));
    }

    /* renamed from: b */
    public int m22992b() {
        int i = this.f37983c;
        if (i != 0) {
            this.f37981a = i;
            this.f37983c = 0;
        } else {
            this.f37981a = ((C6329ku) this.f37984d).m22311z();
        }
        int i2 = this.f37981a;
        if (i2 == 0 || i2 == this.f37982b) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* renamed from: c */
    public int m22993c() {
        return this.f37981a;
    }

    /* renamed from: d */
    public boolean m22994d() throws W90 {
        m22989R(0);
        return ((C6329ku) this.f37984d).m22291f();
    }

    /* renamed from: e */
    public void m22995e(List list) throws Z90 {
        int iM22311z;
        boolean z = list instanceof AbstractC0549Ii;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f37981a & 7;
            if (i == 0) {
                c6329ku.m22291f();
                throw null;
            }
            if (i != 2) {
                throw Z90.m9497b();
            }
            c6329ku.m22279A();
            c6329ku.m22291f();
            throw null;
        }
        int i2 = this.f37981a & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(c6329ku.m22291f()));
                if (c6329ku.m22288c()) {
                    return;
                } else {
                    iM22311z = c6329ku.m22311z();
                }
            } while (iM22311z == this.f37981a);
            this.f37983c = iM22311z;
            return;
        }
        if (i2 != 2) {
            throw Z90.m9497b();
        }
        int iM22287b = c6329ku.m22287b() + c6329ku.m22279A();
        do {
            list.add(Boolean.valueOf(c6329ku.m22291f()));
        } while (c6329ku.m22287b() < iM22287b);
        m22988Q(iM22287b);
    }

    /* renamed from: f */
    public C0362Fk m22996f() throws IOException {
        C0362Fk c0362Fk;
        m22989R(2);
        C6329ku c6329ku = (C6329ku) this.f37984d;
        int iM22304s = c6329ku.m22304s();
        int i = c6329ku.f36749e;
        int i2 = c6329ku.f36751g;
        int i3 = i - i2;
        byte[] bArr = c6329ku.f36748d;
        if (iM22304s <= i3 && iM22304s > 0) {
            C0362Fk c0362FkM2764b = C0362Fk.m2764b(bArr, i2, iM22304s);
            c6329ku.f36751g += iM22304s;
            return c0362FkM2764b;
        }
        if (iM22304s == 0) {
            return C0362Fk.f3403c;
        }
        byte[] bArrM22300o = c6329ku.m22300o(iM22304s);
        if (bArrM22300o != null) {
            c0362Fk = C0362Fk.m2764b(bArrM22300o, 0, bArrM22300o.length);
        } else {
            int i4 = c6329ku.f36751g;
            int i5 = c6329ku.f36749e;
            int length = i5 - i4;
            c6329ku.f36753i += i5;
            c6329ku.f36751g = 0;
            c6329ku.f36749e = 0;
            ArrayList arrayListM22301p = c6329ku.m22301p(iM22304s - length);
            byte[] bArr2 = new byte[iM22304s];
            System.arraycopy(bArr, i4, bArr2, 0, length);
            Iterator it = arrayListM22301p.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            C0362Fk c0362Fk2 = C0362Fk.f3403c;
            c0362Fk = new C0362Fk(bArr2);
        }
        return c0362Fk;
    }

    /* renamed from: g */
    public void m22997g(List list) throws Z90 {
        int iM22311z;
        if ((this.f37981a & 7) != 2) {
            throw Z90.m9497b();
        }
        do {
            list.add(m22996f());
            C6329ku c6329ku = (C6329ku) this.f37984d;
            if (c6329ku.m22288c()) {
                return;
            } else {
                iM22311z = c6329ku.m22311z();
            }
        } while (iM22311z == this.f37981a);
        this.f37983c = iM22311z;
    }

    /* renamed from: h */
    public double m22998h() throws W90 {
        m22989R(1);
        return ((C6329ku) this.f37984d).m22292g();
    }

    /* renamed from: i */
    public void m22999i(List list) throws Z90 {
        int iM22311z;
        boolean z = list instanceof AbstractC1405WK;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f37981a & 7;
            if (i == 1) {
                c6329ku.m22292g();
                throw null;
            }
            if (i != 2) {
                throw Z90.m9497b();
            }
            m22971U(c6329ku.m22279A());
            c6329ku.m22292g();
            throw null;
        }
        int i2 = this.f37981a & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(c6329ku.m22292g()));
                if (c6329ku.m22288c()) {
                    return;
                } else {
                    iM22311z = c6329ku.m22311z();
                }
            } while (iM22311z == this.f37981a);
            this.f37983c = iM22311z;
            return;
        }
        if (i2 != 2) {
            throw Z90.m9497b();
        }
        int iM22279A = c6329ku.m22279A();
        m22971U(iM22279A);
        int iM22287b = c6329ku.m22287b() + iM22279A;
        do {
            list.add(Double.valueOf(c6329ku.m22292g()));
        } while (c6329ku.m22287b() < iM22287b);
    }

    /* renamed from: j */
    public int m23000j() throws W90 {
        m22989R(0);
        return ((C6329ku) this.f37984d).m22293h();
    }

    /* renamed from: k */
    public void m23001k(List list) throws Z90 {
        int iM22311z;
        boolean z = list instanceof AbstractC8944c90;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f37981a & 7;
            if (i == 0) {
                c6329ku.m22293h();
                throw null;
            }
            if (i != 2) {
                throw Z90.m9497b();
            }
            c6329ku.m22279A();
            c6329ku.m22293h();
            throw null;
        }
        int i2 = this.f37981a & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(c6329ku.m22293h()));
                if (c6329ku.m22288c()) {
                    return;
                } else {
                    iM22311z = c6329ku.m22311z();
                }
            } while (iM22311z == this.f37981a);
            this.f37983c = iM22311z;
            return;
        }
        if (i2 != 2) {
            throw Z90.m9497b();
        }
        int iM22287b = c6329ku.m22287b() + c6329ku.m22279A();
        do {
            list.add(Integer.valueOf(c6329ku.m22293h()));
        } while (c6329ku.m22287b() < iM22287b);
        m22988Q(iM22287b);
    }

    /* renamed from: l */
    public Object m23002l(EnumC10696po1 enumC10696po1, Class cls, C0280ER c0280er) throws W90 {
        switch (enumC10696po1.ordinal()) {
            case 0:
                return Double.valueOf(m22998h());
            case 1:
                return Float.valueOf(m23007q());
            case 2:
                return Long.valueOf(m23013w());
            case 3:
                return Long.valueOf(m22985N());
            case 4:
                return Integer.valueOf(m23011u());
            case 5:
                return Long.valueOf(m23005o());
            case 6:
                return Integer.valueOf(m23003m());
            case 7:
                return Boolean.valueOf(m22994d());
            case 8:
                return m22982K();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                m22989R(2);
                return m23015y(ZF0.f14820c.m9517a(cls), c0280er);
            case 11:
                return m22996f();
            case 12:
                return Integer.valueOf(m22983L());
            case 13:
                return Integer.valueOf(m23000j());
            case 14:
                return Integer.valueOf(m22972A());
            case 15:
                return Long.valueOf(m22974C());
            case 16:
                return Integer.valueOf(m22976E());
            case 17:
                return Long.valueOf(m22978G());
        }
    }

    /* renamed from: m */
    public int m23003m() throws W90 {
        m22989R(5);
        return ((C6329ku) this.f37984d).m22294i();
    }

    /* renamed from: n */
    public void m23004n(List list) throws Z90 {
        int iM22311z;
        boolean z = list instanceof AbstractC8944c90;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f37981a & 7;
            if (i == 2) {
                m22970T(c6329ku.m22279A());
                c6329ku.m22294i();
                throw null;
            }
            if (i != 5) {
                throw Z90.m9497b();
            }
            c6329ku.m22294i();
            throw null;
        }
        int i2 = this.f37981a & 7;
        if (i2 == 2) {
            int iM22279A = c6329ku.m22279A();
            m22970T(iM22279A);
            int iM22287b = c6329ku.m22287b() + iM22279A;
            do {
                list.add(Integer.valueOf(c6329ku.m22294i()));
            } while (c6329ku.m22287b() < iM22287b);
            return;
        }
        if (i2 != 5) {
            throw Z90.m9497b();
        }
        do {
            list.add(Integer.valueOf(c6329ku.m22294i()));
            if (c6329ku.m22288c()) {
                return;
            } else {
                iM22311z = c6329ku.m22311z();
            }
        } while (iM22311z == this.f37981a);
        this.f37983c = iM22311z;
    }

    /* renamed from: o */
    public long m23005o() throws W90 {
        m22989R(1);
        return ((C6329ku) this.f37984d).m22295j();
    }

    /* renamed from: p */
    public void m23006p(List list) throws Z90 {
        int iM22311z;
        boolean z = list instanceof AbstractC11711xl0;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f37981a & 7;
            if (i == 1) {
                c6329ku.m22295j();
                throw null;
            }
            if (i != 2) {
                throw Z90.m9497b();
            }
            m22971U(c6329ku.m22279A());
            c6329ku.m22295j();
            throw null;
        }
        int i2 = this.f37981a & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(c6329ku.m22295j()));
                if (c6329ku.m22288c()) {
                    return;
                } else {
                    iM22311z = c6329ku.m22311z();
                }
            } while (iM22311z == this.f37981a);
            this.f37983c = iM22311z;
            return;
        }
        if (i2 != 2) {
            throw Z90.m9497b();
        }
        int iM22279A = c6329ku.m22279A();
        m22971U(iM22279A);
        int iM22287b = c6329ku.m22287b() + iM22279A;
        do {
            list.add(Long.valueOf(c6329ku.m22295j()));
        } while (c6329ku.m22287b() < iM22287b);
    }

    /* renamed from: q */
    public float m23007q() throws W90 {
        m22989R(5);
        return ((C6329ku) this.f37984d).m22296k();
    }

    /* renamed from: r */
    public void m23008r(List list) throws Z90 {
        int iM22311z;
        boolean z = list instanceof AbstractC6431mW;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f37981a & 7;
            if (i == 2) {
                m22970T(c6329ku.m22279A());
                c6329ku.m22296k();
                throw null;
            }
            if (i != 5) {
                throw Z90.m9497b();
            }
            c6329ku.m22296k();
            throw null;
        }
        int i2 = this.f37981a & 7;
        if (i2 == 2) {
            int iM22279A = c6329ku.m22279A();
            m22970T(iM22279A);
            int iM22287b = c6329ku.m22287b() + iM22279A;
            do {
                list.add(Float.valueOf(c6329ku.m22296k()));
            } while (c6329ku.m22287b() < iM22287b);
            return;
        }
        if (i2 != 5) {
            throw Z90.m9497b();
        }
        do {
            list.add(Float.valueOf(c6329ku.m22296k()));
            if (c6329ku.m22288c()) {
                return;
            } else {
                iM22311z = c6329ku.m22311z();
            }
        } while (iM22311z == this.f37981a);
        this.f37983c = iM22311z;
    }

    /* renamed from: s */
    public Object m23009s(EV0 ev0, C0280ER c0280er) {
        int i = this.f37982b;
        this.f37982b = ((this.f37981a >>> 3) << 3) | 4;
        try {
            Object objMo2317a = ev0.mo2317a();
            ev0.mo2321e(objMo2317a, this, c0280er);
            ev0.mo2318b(objMo2317a);
            if (this.f37981a == this.f37982b) {
                return objMo2317a;
            }
            throw Z90.m9500e();
        } finally {
            this.f37982b = i;
        }
    }

    /* renamed from: t */
    public Object m23010t(EV0 ev0, C0280ER c0280er) throws W90 {
        m22989R(3);
        return m23009s(ev0, c0280er);
    }

    /* renamed from: u */
    public int m23011u() throws W90 {
        m22989R(0);
        return ((C6329ku) this.f37984d).m22297l();
    }

    /* renamed from: v */
    public void m23012v(List list) throws Z90 {
        int iM22311z;
        boolean z = list instanceof AbstractC8944c90;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f37981a & 7;
            if (i == 0) {
                c6329ku.m22297l();
                throw null;
            }
            if (i != 2) {
                throw Z90.m9497b();
            }
            c6329ku.m22279A();
            c6329ku.m22297l();
            throw null;
        }
        int i2 = this.f37981a & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(c6329ku.m22297l()));
                if (c6329ku.m22288c()) {
                    return;
                } else {
                    iM22311z = c6329ku.m22311z();
                }
            } while (iM22311z == this.f37981a);
            this.f37983c = iM22311z;
            return;
        }
        if (i2 != 2) {
            throw Z90.m9497b();
        }
        int iM22287b = c6329ku.m22287b() + c6329ku.m22279A();
        do {
            list.add(Integer.valueOf(c6329ku.m22297l()));
        } while (c6329ku.m22287b() < iM22287b);
        m22988Q(iM22287b);
    }

    /* renamed from: w */
    public long m23013w() throws W90 {
        m22989R(0);
        return ((C6329ku) this.f37984d).m22298m();
    }

    /* renamed from: x */
    public void m23014x(List list) throws Z90 {
        int iM22311z;
        boolean z = list instanceof AbstractC11711xl0;
        C6329ku c6329ku = (C6329ku) this.f37984d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.f37981a & 7;
            if (i == 0) {
                c6329ku.m22298m();
                throw null;
            }
            if (i != 2) {
                throw Z90.m9497b();
            }
            c6329ku.m22279A();
            c6329ku.m22298m();
            throw null;
        }
        int i2 = this.f37981a & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(c6329ku.m22298m()));
                if (c6329ku.m22288c()) {
                    return;
                } else {
                    iM22311z = c6329ku.m22311z();
                }
            } while (iM22311z == this.f37981a);
            this.f37983c = iM22311z;
            return;
        }
        if (i2 != 2) {
            throw Z90.m9497b();
        }
        int iM22287b = c6329ku.m22287b() + c6329ku.m22279A();
        do {
            list.add(Long.valueOf(c6329ku.m22298m()));
        } while (c6329ku.m22287b() < iM22287b);
        m22988Q(iM22287b);
    }

    /* renamed from: y */
    public Object m23015y(EV0 ev0, C0280ER c0280er) throws Z90 {
        C6329ku c6329ku = (C6329ku) this.f37984d;
        int iM22279A = c6329ku.m22279A();
        if (c6329ku.f36745a >= 100) {
            throw new Z90("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iM22290e = c6329ku.m22290e(iM22279A);
        Object objMo2317a = ev0.mo2317a();
        c6329ku.f36745a++;
        ev0.mo2321e(objMo2317a, this, c0280er);
        ev0.mo2318b(objMo2317a);
        c6329ku.m22286a(0);
        c6329ku.f36745a--;
        c6329ku.m22289d(iM22290e);
        return objMo2317a;
    }

    /* renamed from: z */
    public Object m23016z(EV0 ev0, C0280ER c0280er) throws W90 {
        m22989R(2);
        return m23015y(ev0, c0280er);
    }
}
