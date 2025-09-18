package defpackage;

import android.view.View;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;

/* renamed from: mu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5971mu {
    public int a;
    public int b;
    public int c;
    public Object d;

    public static void T(int i) throws Z90 {
        if ((i & 3) != 0) {
            throw Z90.e();
        }
    }

    public static void U(int i) throws Z90 {
        if ((i & 7) != 0) {
            throw Z90.e();
        }
    }

    public int A() throws W90 {
        R(5);
        return ((C5589ku) this.d).v();
    }

    public void B(List list) throws Z90 {
        int iZ;
        boolean z = list instanceof AbstractC2461c90;
        C5589ku c5589ku = (C5589ku) this.d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.a & 7;
            if (i == 2) {
                T(c5589ku.A());
                c5589ku.v();
                throw null;
            }
            if (i != 5) {
                throw Z90.b();
            }
            c5589ku.v();
            throw null;
        }
        int i2 = this.a & 7;
        if (i2 == 2) {
            int iA = c5589ku.A();
            T(iA);
            int iB = c5589ku.b() + iA;
            do {
                list.add(Integer.valueOf(c5589ku.v()));
            } while (c5589ku.b() < iB);
            return;
        }
        if (i2 != 5) {
            throw Z90.b();
        }
        do {
            list.add(Integer.valueOf(c5589ku.v()));
            if (c5589ku.c()) {
                return;
            } else {
                iZ = c5589ku.z();
            }
        } while (iZ == this.a);
        this.c = iZ;
    }

    public long C() throws W90 {
        R(1);
        return ((C5589ku) this.d).w();
    }

    public void D(List list) throws Z90 {
        int iZ;
        boolean z = list instanceof AbstractC8043xl0;
        C5589ku c5589ku = (C5589ku) this.d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.a & 7;
            if (i == 1) {
                c5589ku.w();
                throw null;
            }
            if (i != 2) {
                throw Z90.b();
            }
            U(c5589ku.A());
            c5589ku.w();
            throw null;
        }
        int i2 = this.a & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(c5589ku.w()));
                if (c5589ku.c()) {
                    return;
                } else {
                    iZ = c5589ku.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i2 != 2) {
            throw Z90.b();
        }
        int iA = c5589ku.A();
        U(iA);
        int iB = c5589ku.b() + iA;
        do {
            list.add(Long.valueOf(c5589ku.w()));
        } while (c5589ku.b() < iB);
    }

    public int E() throws W90 {
        R(0);
        return ((C5589ku) this.d).x();
    }

    public void F(List list) throws Z90 {
        int iZ;
        boolean z = list instanceof AbstractC2461c90;
        C5589ku c5589ku = (C5589ku) this.d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.a & 7;
            if (i == 0) {
                c5589ku.x();
                throw null;
            }
            if (i != 2) {
                throw Z90.b();
            }
            c5589ku.A();
            c5589ku.x();
            throw null;
        }
        int i2 = this.a & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(c5589ku.x()));
                if (c5589ku.c()) {
                    return;
                } else {
                    iZ = c5589ku.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i2 != 2) {
            throw Z90.b();
        }
        int iB = c5589ku.b() + c5589ku.A();
        do {
            list.add(Integer.valueOf(c5589ku.x()));
        } while (c5589ku.b() < iB);
        Q(iB);
    }

    public long G() throws W90 {
        R(0);
        return ((C5589ku) this.d).y();
    }

    public void H(List list) throws Z90 {
        int iZ;
        boolean z = list instanceof AbstractC8043xl0;
        C5589ku c5589ku = (C5589ku) this.d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.a & 7;
            if (i == 0) {
                c5589ku.y();
                throw null;
            }
            if (i != 2) {
                throw Z90.b();
            }
            c5589ku.A();
            c5589ku.y();
            throw null;
        }
        int i2 = this.a & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(c5589ku.y()));
                if (c5589ku.c()) {
                    return;
                } else {
                    iZ = c5589ku.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i2 != 2) {
            throw Z90.b();
        }
        int iB = c5589ku.b() + c5589ku.A();
        do {
            list.add(Long.valueOf(c5589ku.y()));
        } while (c5589ku.b() < iB);
        Q(iB);
    }

    public String I() throws Z90 {
        R(2);
        C5589ku c5589ku = (C5589ku) this.d;
        int iS = c5589ku.s();
        byte[] bArr = c5589ku.d;
        if (iS > 0) {
            int i = c5589ku.e;
            int i2 = c5589ku.g;
            if (iS <= i - i2) {
                String str = new String(bArr, i2, iS, AbstractC8309z90.a);
                c5589ku.g += iS;
                return str;
            }
        }
        if (iS == 0) {
            return "";
        }
        if (iS > c5589ku.e) {
            return new String(c5589ku.n(iS), AbstractC8309z90.a);
        }
        c5589ku.D(iS);
        String str2 = new String(bArr, c5589ku.g, iS, AbstractC8309z90.a);
        c5589ku.g += iS;
        return str2;
    }

    public void J(List list, boolean z) throws Z90 {
        int iZ;
        int iZ2;
        if ((this.a & 7) != 2) {
            throw Z90.b();
        }
        boolean z2 = list instanceof InterfaceC3823fi0;
        C5589ku c5589ku = (C5589ku) this.d;
        if (!z2 || z) {
            do {
                list.add(z ? K() : I());
                if (c5589ku.c()) {
                    return;
                } else {
                    iZ = c5589ku.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        InterfaceC3823fi0 interfaceC3823fi0 = (InterfaceC3823fi0) list;
        do {
            interfaceC3823fi0.f(f());
            if (c5589ku.c()) {
                return;
            } else {
                iZ2 = c5589ku.z();
            }
        } while (iZ2 == this.a);
        this.c = iZ2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String K() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5971mu.K():java.lang.String");
    }

    public int L() throws W90 {
        R(0);
        return ((C5589ku) this.d).A();
    }

    public void M(List list) throws Z90 {
        int iZ;
        boolean z = list instanceof AbstractC2461c90;
        C5589ku c5589ku = (C5589ku) this.d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.a & 7;
            if (i == 0) {
                c5589ku.A();
                throw null;
            }
            if (i != 2) {
                throw Z90.b();
            }
            c5589ku.A();
            c5589ku.A();
            throw null;
        }
        int i2 = this.a & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(c5589ku.A()));
                if (c5589ku.c()) {
                    return;
                } else {
                    iZ = c5589ku.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i2 != 2) {
            throw Z90.b();
        }
        int iB = c5589ku.b() + c5589ku.A();
        do {
            list.add(Integer.valueOf(c5589ku.A()));
        } while (c5589ku.b() < iB);
        Q(iB);
    }

    public long N() throws W90 {
        R(0);
        return ((C5589ku) this.d).B();
    }

    public void O(List list) throws Z90 {
        int iZ;
        boolean z = list instanceof AbstractC8043xl0;
        C5589ku c5589ku = (C5589ku) this.d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.a & 7;
            if (i == 0) {
                c5589ku.B();
                throw null;
            }
            if (i != 2) {
                throw Z90.b();
            }
            c5589ku.A();
            c5589ku.B();
            throw null;
        }
        int i2 = this.a & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(c5589ku.B()));
                if (c5589ku.c()) {
                    return;
                } else {
                    iZ = c5589ku.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i2 != 2) {
            throw Z90.b();
        }
        int iB = c5589ku.b() + c5589ku.A();
        do {
            list.add(Long.valueOf(c5589ku.B()));
        } while (c5589ku.b() < iB);
        Q(iB);
    }

    public long P() {
        int i = this.b;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int i2 = this.a;
        long j = ((long[]) this.d)[i2];
        this.a = (i2 + 1) & this.c;
        this.b = i - 1;
        return j;
    }

    public void Q(int i) throws Z90 {
        if (((C5589ku) this.d).b() != i) {
            throw Z90.f();
        }
    }

    public void R(int i) throws W90 {
        if ((this.a & 7) != i) {
            throw Z90.b();
        }
    }

    public boolean S() {
        int i;
        C5589ku c5589ku = (C5589ku) this.d;
        if (c5589ku.c() || (i = this.a) == this.b) {
            return false;
        }
        return c5589ku.E(i);
    }

    public void a() {
        int i = this.c;
        View view = (View) this.d;
        int top = i - (view.getTop() - this.a);
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.b));
    }

    public int b() {
        int i = this.c;
        if (i != 0) {
            this.a = i;
            this.c = 0;
        } else {
            this.a = ((C5589ku) this.d).z();
        }
        int i2 = this.a;
        if (i2 == 0 || i2 == this.b) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public int c() {
        return this.a;
    }

    public boolean d() throws W90 {
        R(0);
        return ((C5589ku) this.d).f();
    }

    public void e(List list) throws Z90 {
        int iZ;
        boolean z = list instanceof AbstractC0668Ii;
        C5589ku c5589ku = (C5589ku) this.d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.a & 7;
            if (i == 0) {
                c5589ku.f();
                throw null;
            }
            if (i != 2) {
                throw Z90.b();
            }
            c5589ku.A();
            c5589ku.f();
            throw null;
        }
        int i2 = this.a & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(c5589ku.f()));
                if (c5589ku.c()) {
                    return;
                } else {
                    iZ = c5589ku.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i2 != 2) {
            throw Z90.b();
        }
        int iB = c5589ku.b() + c5589ku.A();
        do {
            list.add(Boolean.valueOf(c5589ku.f()));
        } while (c5589ku.b() < iB);
        Q(iB);
    }

    public C0440Fk f() throws IOException {
        C0440Fk c0440Fk;
        R(2);
        C5589ku c5589ku = (C5589ku) this.d;
        int iS = c5589ku.s();
        int i = c5589ku.e;
        int i2 = c5589ku.g;
        int i3 = i - i2;
        byte[] bArr = c5589ku.d;
        if (iS <= i3 && iS > 0) {
            C0440Fk c0440FkB = C0440Fk.b(bArr, i2, iS);
            c5589ku.g += iS;
            return c0440FkB;
        }
        if (iS == 0) {
            return C0440Fk.c;
        }
        byte[] bArrO = c5589ku.o(iS);
        if (bArrO != null) {
            c0440Fk = C0440Fk.b(bArrO, 0, bArrO.length);
        } else {
            int i4 = c5589ku.g;
            int i5 = c5589ku.e;
            int length = i5 - i4;
            c5589ku.i += i5;
            c5589ku.g = 0;
            c5589ku.e = 0;
            ArrayList arrayListP = c5589ku.p(iS - length);
            byte[] bArr2 = new byte[iS];
            System.arraycopy(bArr, i4, bArr2, 0, length);
            Iterator it = arrayListP.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = (byte[]) it.next();
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            C0440Fk c0440Fk2 = C0440Fk.c;
            c0440Fk = new C0440Fk(bArr2);
        }
        return c0440Fk;
    }

    public void g(List list) throws Z90 {
        int iZ;
        if ((this.a & 7) != 2) {
            throw Z90.b();
        }
        do {
            list.add(f());
            C5589ku c5589ku = (C5589ku) this.d;
            if (c5589ku.c()) {
                return;
            } else {
                iZ = c5589ku.z();
            }
        } while (iZ == this.a);
        this.c = iZ;
    }

    public double h() throws W90 {
        R(1);
        return ((C5589ku) this.d).g();
    }

    public void i(List list) throws Z90 {
        int iZ;
        boolean z = list instanceof WK;
        C5589ku c5589ku = (C5589ku) this.d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.a & 7;
            if (i == 1) {
                c5589ku.g();
                throw null;
            }
            if (i != 2) {
                throw Z90.b();
            }
            U(c5589ku.A());
            c5589ku.g();
            throw null;
        }
        int i2 = this.a & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(c5589ku.g()));
                if (c5589ku.c()) {
                    return;
                } else {
                    iZ = c5589ku.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i2 != 2) {
            throw Z90.b();
        }
        int iA = c5589ku.A();
        U(iA);
        int iB = c5589ku.b() + iA;
        do {
            list.add(Double.valueOf(c5589ku.g()));
        } while (c5589ku.b() < iB);
    }

    public int j() throws W90 {
        R(0);
        return ((C5589ku) this.d).h();
    }

    public void k(List list) throws Z90 {
        int iZ;
        boolean z = list instanceof AbstractC2461c90;
        C5589ku c5589ku = (C5589ku) this.d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.a & 7;
            if (i == 0) {
                c5589ku.h();
                throw null;
            }
            if (i != 2) {
                throw Z90.b();
            }
            c5589ku.A();
            c5589ku.h();
            throw null;
        }
        int i2 = this.a & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(c5589ku.h()));
                if (c5589ku.c()) {
                    return;
                } else {
                    iZ = c5589ku.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i2 != 2) {
            throw Z90.b();
        }
        int iB = c5589ku.b() + c5589ku.A();
        do {
            list.add(Integer.valueOf(c5589ku.h()));
        } while (c5589ku.b() < iB);
        Q(iB);
    }

    public Object l(EnumC6528po1 enumC6528po1, Class cls, ER er) throws W90 {
        switch (enumC6528po1.ordinal()) {
            case 0:
                return Double.valueOf(h());
            case 1:
                return Float.valueOf(q());
            case 2:
                return Long.valueOf(w());
            case 3:
                return Long.valueOf(N());
            case 4:
                return Integer.valueOf(u());
            case 5:
                return Long.valueOf(o());
            case 6:
                return Integer.valueOf(m());
            case 7:
                return Boolean.valueOf(d());
            case 8:
                return K();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                R(2);
                return y(ZF0.c.a(cls), er);
            case 11:
                return f();
            case 12:
                return Integer.valueOf(L());
            case 13:
                return Integer.valueOf(j());
            case 14:
                return Integer.valueOf(A());
            case 15:
                return Long.valueOf(C());
            case 16:
                return Integer.valueOf(E());
            case 17:
                return Long.valueOf(G());
        }
    }

    public int m() throws W90 {
        R(5);
        return ((C5589ku) this.d).i();
    }

    public void n(List list) throws Z90 {
        int iZ;
        boolean z = list instanceof AbstractC2461c90;
        C5589ku c5589ku = (C5589ku) this.d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.a & 7;
            if (i == 2) {
                T(c5589ku.A());
                c5589ku.i();
                throw null;
            }
            if (i != 5) {
                throw Z90.b();
            }
            c5589ku.i();
            throw null;
        }
        int i2 = this.a & 7;
        if (i2 == 2) {
            int iA = c5589ku.A();
            T(iA);
            int iB = c5589ku.b() + iA;
            do {
                list.add(Integer.valueOf(c5589ku.i()));
            } while (c5589ku.b() < iB);
            return;
        }
        if (i2 != 5) {
            throw Z90.b();
        }
        do {
            list.add(Integer.valueOf(c5589ku.i()));
            if (c5589ku.c()) {
                return;
            } else {
                iZ = c5589ku.z();
            }
        } while (iZ == this.a);
        this.c = iZ;
    }

    public long o() throws W90 {
        R(1);
        return ((C5589ku) this.d).j();
    }

    public void p(List list) throws Z90 {
        int iZ;
        boolean z = list instanceof AbstractC8043xl0;
        C5589ku c5589ku = (C5589ku) this.d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.a & 7;
            if (i == 1) {
                c5589ku.j();
                throw null;
            }
            if (i != 2) {
                throw Z90.b();
            }
            U(c5589ku.A());
            c5589ku.j();
            throw null;
        }
        int i2 = this.a & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(c5589ku.j()));
                if (c5589ku.c()) {
                    return;
                } else {
                    iZ = c5589ku.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i2 != 2) {
            throw Z90.b();
        }
        int iA = c5589ku.A();
        U(iA);
        int iB = c5589ku.b() + iA;
        do {
            list.add(Long.valueOf(c5589ku.j()));
        } while (c5589ku.b() < iB);
    }

    public float q() throws W90 {
        R(5);
        return ((C5589ku) this.d).k();
    }

    public void r(List list) throws Z90 {
        int iZ;
        boolean z = list instanceof AbstractC5899mW;
        C5589ku c5589ku = (C5589ku) this.d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.a & 7;
            if (i == 2) {
                T(c5589ku.A());
                c5589ku.k();
                throw null;
            }
            if (i != 5) {
                throw Z90.b();
            }
            c5589ku.k();
            throw null;
        }
        int i2 = this.a & 7;
        if (i2 == 2) {
            int iA = c5589ku.A();
            T(iA);
            int iB = c5589ku.b() + iA;
            do {
                list.add(Float.valueOf(c5589ku.k()));
            } while (c5589ku.b() < iB);
            return;
        }
        if (i2 != 5) {
            throw Z90.b();
        }
        do {
            list.add(Float.valueOf(c5589ku.k()));
            if (c5589ku.c()) {
                return;
            } else {
                iZ = c5589ku.z();
            }
        } while (iZ == this.a);
        this.c = iZ;
    }

    public Object s(EV0 ev0, ER er) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            Object objA = ev0.a();
            ev0.e(objA, this, er);
            ev0.b(objA);
            if (this.a == this.b) {
                return objA;
            }
            throw Z90.e();
        } finally {
            this.b = i;
        }
    }

    public Object t(EV0 ev0, ER er) throws W90 {
        R(3);
        return s(ev0, er);
    }

    public int u() throws W90 {
        R(0);
        return ((C5589ku) this.d).l();
    }

    public void v(List list) throws Z90 {
        int iZ;
        boolean z = list instanceof AbstractC2461c90;
        C5589ku c5589ku = (C5589ku) this.d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.a & 7;
            if (i == 0) {
                c5589ku.l();
                throw null;
            }
            if (i != 2) {
                throw Z90.b();
            }
            c5589ku.A();
            c5589ku.l();
            throw null;
        }
        int i2 = this.a & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(c5589ku.l()));
                if (c5589ku.c()) {
                    return;
                } else {
                    iZ = c5589ku.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i2 != 2) {
            throw Z90.b();
        }
        int iB = c5589ku.b() + c5589ku.A();
        do {
            list.add(Integer.valueOf(c5589ku.l()));
        } while (c5589ku.b() < iB);
        Q(iB);
    }

    public long w() throws W90 {
        R(0);
        return ((C5589ku) this.d).m();
    }

    public void x(List list) throws Z90 {
        int iZ;
        boolean z = list instanceof AbstractC8043xl0;
        C5589ku c5589ku = (C5589ku) this.d;
        if (z) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i = this.a & 7;
            if (i == 0) {
                c5589ku.m();
                throw null;
            }
            if (i != 2) {
                throw Z90.b();
            }
            c5589ku.A();
            c5589ku.m();
            throw null;
        }
        int i2 = this.a & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(c5589ku.m()));
                if (c5589ku.c()) {
                    return;
                } else {
                    iZ = c5589ku.z();
                }
            } while (iZ == this.a);
            this.c = iZ;
            return;
        }
        if (i2 != 2) {
            throw Z90.b();
        }
        int iB = c5589ku.b() + c5589ku.A();
        do {
            list.add(Long.valueOf(c5589ku.m()));
        } while (c5589ku.b() < iB);
        Q(iB);
    }

    public Object y(EV0 ev0, ER er) throws Z90 {
        C5589ku c5589ku = (C5589ku) this.d;
        int iA = c5589ku.A();
        if (c5589ku.a >= 100) {
            throw new Z90("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iE = c5589ku.e(iA);
        Object objA = ev0.a();
        c5589ku.a++;
        ev0.e(objA, this, er);
        ev0.b(objA);
        c5589ku.a(0);
        c5589ku.a--;
        c5589ku.d(iE);
        return objA;
    }

    public Object z(EV0 ev0, ER er) throws W90 {
        R(2);
        return y(ev0, er);
    }
}
