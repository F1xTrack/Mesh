package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.ListenerHolder;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Cv0 */
/* loaded from: classes.dex */
public final class C0240Cv0 implements InterfaceC0095Az, InterfaceC0940Lv, InterfaceC1009Ms, JB1, InterfaceC6696qh, InterfaceC1490Sw0, InterfaceC7117su0, Y31, InterfaceC0741Jg0, InterfaceC5303jO0, W3, InterfaceC3660er1, InterfaceC6053nJ1 {
    public static C0240Cv0 b;
    public static final /* synthetic */ C0240Cv0 c = new C0240Cv0(1);
    public static final C0240Cv0 d = new C0240Cv0(2);
    public static final C0240Cv0 e = new C0240Cv0(3);
    public static final C0240Cv0 f = new C0240Cv0(4);
    public static final C0240Cv0 g = new C0240Cv0(5);
    public static final /* synthetic */ C0240Cv0 h = new C0240Cv0(6);
    public final /* synthetic */ int a;

    public /* synthetic */ C0240Cv0(int i) {
        this.a = i;
    }

    public static C6618qH B0(AbstractC1521Tg1 abstractC1521Tg1, boolean z) {
        boolean zE;
        O90.f(abstractC1521Tg1, "type");
        if (abstractC1521Tg1 instanceof C6618qH) {
            return (C6618qH) abstractC1521Tg1;
        }
        abstractC1521Tg1.E();
        if ((abstractC1521Tg1.E().a() instanceof InterfaceC5925me1) || (abstractC1521Tg1 instanceof C6357ov0)) {
            InterfaceC1087Ns interfaceC1087NsA = abstractC1521Tg1.E().a();
            C6116ne1 c6116ne1 = interfaceC1087NsA instanceof C6116ne1 ? (C6116ne1) interfaceC1087NsA : null;
            zE = true;
            if (c6116ne1 == null || c6116ne1.m) {
                zE = (z && (abstractC1521Tg1.E().a() instanceof InterfaceC5925me1)) ? AbstractC0112Be1.e(abstractC1521Tg1) : true ^ AbstractC6062nM1.b(QS1.a(false, true, g, null, null, 24), AbstractC4075h12.e(abstractC1521Tg1), C1044Nd1.b);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (abstractC1521Tg1 instanceof AbstractC3405dW) {
            AbstractC3405dW abstractC3405dW = (AbstractC3405dW) abstractC1521Tg1;
            O90.a(abstractC3405dW.b.E(), abstractC3405dW.c.E());
        }
        return new C6618qH(AbstractC4075h12.e(abstractC1521Tg1).P(false), z);
    }

    public static /* synthetic */ void d0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static String e0(String str) {
        String string;
        try {
            string = new JSONObject(str).getString("short_segments");
        } catch (JSONException unused) {
            string = null;
        }
        return string == null ? "" : string;
    }

    public static final String j0(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = -1;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = (i6 + length) / 2;
            while (i7 > i5 && bArr[i7] != 10) {
                i7 += i5;
            }
            int i8 = i7 + 1;
            int i9 = 1;
            while (true) {
                i2 = i8 + i9;
                if (bArr[i2] == 10) {
                    break;
                }
                i9++;
            }
            int i10 = i2 - i8;
            int i11 = i;
            boolean z2 = false;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b2 = bArr2[i11][i12];
                    byte[] bArr4 = AbstractC0199Ch1.a;
                    int i14 = b2 & 255;
                    z = z2;
                    i3 = i14;
                }
                byte b3 = bArr[i8 + i13];
                byte[] bArr5 = AbstractC0199Ch1.a;
                i4 = i3 - (b3 & 255);
                if (i4 != 0) {
                    break;
                }
                i13++;
                i12++;
                if (i13 == i10) {
                    break;
                }
                if (bArr2[i11].length != i12) {
                    z2 = z;
                } else {
                    if (i11 == bArr2.length - 1) {
                        break;
                    }
                    i11++;
                    z2 = true;
                    i12 = -1;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i15 = i10 - i13;
                    int length2 = bArr2[i11].length - i12;
                    int length3 = bArr2.length;
                    for (int i16 = i11 + 1; i16 < length3; i16++) {
                        length2 += bArr2[i16].length;
                    }
                    if (length2 >= i15) {
                        if (length2 <= i15) {
                            Charset charset = StandardCharsets.UTF_8;
                            O90.e(charset, "UTF_8");
                            return new String(bArr, i8, i10, charset);
                        }
                    }
                    length = i7;
                }
                i6 = i2 + 1;
            } else {
                length = i7;
            }
            i5 = -1;
        }
        return null;
    }

    public static final C3509e31 k0(String str, String str2, String str3, String str4) {
        ArrayList arrayList = AbstractC4273i31.a;
        return new C3509e31(str, C1559Tt0.e(str2), str3, str4);
    }

    public static synchronized C0240Cv0 s0() {
        try {
            if (b == null) {
                b = new C0240Cv0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean A(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.w(interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC6689qe1 A0(InterfaceC0974Mg0 interfaceC0974Mg0, int i) {
        return US1.l(interfaceC0974Mg0, i);
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 B(AbstractC3405dW abstractC3405dW) {
        return US1.J(abstractC3405dW);
    }

    @Override // defpackage.InterfaceC1009Ms
    public Set C(Z01 z01) {
        return US1.P(this, z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean D(Z01 z01) {
        return US1.x(z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC1521Tg1 D0(Z01 z01, Z01 z012) {
        return US1.k(this, z01, z012);
    }

    @Override // defpackage.Y31
    public StackTraceElement[] E(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // defpackage.InterfaceC1009Ms
    public InterfaceC0974Mg0 E0(InterfaceC0974Mg0 interfaceC0974Mg0) {
        return US1.W(this, interfaceC0974Mg0);
    }

    @Override // defpackage.InterfaceC1009Ms
    public EnumC5386jq F(InterfaceC6532pq interfaceC6532pq) {
        return US1.j(interfaceC6532pq);
    }

    public InterfaceC0974Mg0 F0(InterfaceC0974Mg0 interfaceC0974Mg0) {
        X01 x01X;
        O90.f(interfaceC0974Mg0, "<this>");
        X01 x01G = US1.g(interfaceC0974Mg0);
        return (x01G == null || (x01X = US1.X(x01G, true)) == null) ? interfaceC0974Mg0 : x01X;
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 G(C6618qH c6618qH) {
        return US1.M(c6618qH);
    }

    @Override // defpackage.InterfaceC1009Ms
    public C6618qH G0(Z01 z01) {
        return US1.e(z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean H(InterfaceC0974Mg0 interfaceC0974Mg0) {
        O90.f(interfaceC0974Mg0, "<this>");
        X01 x01G = US1.g(interfaceC0974Mg0);
        return (x01G != null ? US1.e(x01G) : null) != null;
    }

    @Override // defpackage.InterfaceC1009Ms
    public void I(Z01 z01) {
        US1.H(z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public C0931Ls J(Z01 z01) {
        return US1.R(this, z01);
    }

    @Override // defpackage.InterfaceC0741Jg0
    public boolean K(InterfaceC1200Pd1 interfaceC1200Pd1, InterfaceC1200Pd1 interfaceC1200Pd12) {
        if (interfaceC1200Pd1 == null) {
            d0(0);
            throw null;
        }
        if (interfaceC1200Pd12 != null) {
            return interfaceC1200Pd1.equals(interfaceC1200Pd12);
        }
        d0(1);
        throw null;
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 L(Z01 z01, boolean z) {
        return US1.X(z01, z);
    }

    @Override // defpackage.InterfaceC1009Ms
    public EnumC0346Ee1 M(AbstractC6689qe1 abstractC6689qe1) {
        return US1.p(abstractC6689qe1);
    }

    @Override // defpackage.InterfaceC7117su0
    public File N() {
        return null;
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean O(Z01 z01) {
        O90.f(z01, "<this>");
        return US1.z(US1.U(z01));
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC1521Tg1 P(InterfaceC0974Mg0 interfaceC0974Mg0) {
        return US1.L(interfaceC0974Mg0);
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 Q(Z01 z01) {
        EnumC5386jq enumC5386jq = EnumC5386jq.a;
        return US1.i(z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC1521Tg1 R(AbstractC6689qe1 abstractC6689qe1) {
        return US1.n(abstractC6689qe1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public int S(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.N(interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean T(InterfaceC5925me1 interfaceC5925me1, InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.r(interfaceC5925me1, interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC7117su0
    public File U() {
        return null;
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 V(InterfaceC0974Mg0 interfaceC0974Mg0) {
        X01 x01V;
        O90.f(interfaceC0974Mg0, "<this>");
        AbstractC3405dW abstractC3405dWF = US1.f(interfaceC0974Mg0);
        if (abstractC3405dWF != null && (x01V = US1.V(abstractC3405dWF)) != null) {
            return x01V;
        }
        X01 x01G = US1.g(interfaceC0974Mg0);
        O90.c(x01G);
        return x01G;
    }

    @Override // defpackage.InterfaceC1009Ms
    public InterfaceC1200Pd1 W(Z01 z01) {
        return US1.U(z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean X(Z01 z01) {
        O90.f(z01, "<this>");
        X01 x01G = US1.g(z01);
        return (x01G != null ? US1.d(this, x01G) : null) != null;
    }

    @Override // defpackage.InterfaceC1009Ms
    public InterfaceC6532pq Y(Z01 z01) {
        return US1.d(this, z01);
    }

    @Override // defpackage.JB1
    public void Z(C8325zE1 c8325zE1, ListenerHolder.ListenerKey listenerKey, boolean z, S81 s81) {
        c8325zE1.d(listenerKey, z, s81);
    }

    @Override // defpackage.InterfaceC4042gr1
    public /* synthetic */ Object a() {
        return new C0085Av1("IntegrityService");
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean a0(Z01 z01) {
        O90.f(z01, "<this>");
        return US1.C(q0(z01)) && !US1.D(z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean b(InterfaceC6532pq interfaceC6532pq) {
        O90.f(interfaceC6532pq, "$receiver");
        return interfaceC6532pq instanceof C5577kq;
    }

    @Override // defpackage.InterfaceC7117su0
    public File b0() {
        return null;
    }

    @Override // defpackage.InterfaceC1490Sw0
    public Object c() {
        return new ArrayList();
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC1521Tg1 c0(ArrayList arrayList) {
        X01 x01;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (AbstractC1521Tg1) AbstractC8069xu.R(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC1521Tg1 abstractC1521Tg1 = (AbstractC1521Tg1) it.next();
            z = z || S8.b(abstractC1521Tg1);
            if (abstractC1521Tg1 instanceof X01) {
                x01 = (X01) abstractC1521Tg1;
            } else {
                if (!(abstractC1521Tg1 instanceof AbstractC3405dW)) {
                    throw new C7074sg();
                }
                O90.f(abstractC1521Tg1, "<this>");
                x01 = ((AbstractC3405dW) abstractC1521Tg1).b;
                z2 = true;
            }
            arrayList2.add(x01);
        }
        if (z) {
            return C5496kP.c(EnumC5305jP.x, arrayList.toString());
        }
        C5352je1 c5352je1 = C5352je1.a;
        if (!z2) {
            return c5352je1.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC8449zu.k(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC4075h12.j((AbstractC1521Tg1) it2.next()));
        }
        return NV1.t(c5352je1.b(arrayList2), c5352je1.b(arrayList3));
    }

    @Override // defpackage.InterfaceC7117su0
    public File d() {
        return null;
    }

    @Override // defpackage.InterfaceC7117su0
    public File e() {
        return null;
    }

    @Override // defpackage.InterfaceC1009Ms
    public C6962s41 f0(InterfaceC0974Mg0 interfaceC0974Mg0) {
        return US1.h(interfaceC0974Mg0);
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        switch (this.a) {
            case 2:
                Object objH = c1241Pr0.h(new C6997sG0(InterfaceC0122Bi.class, Executor.class));
                O90.e(objH, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return N02.e((Executor) objH);
            default:
                return new C4150hQ(c1241Pr0.c(C3471ds0.class));
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public InterfaceC5925me1 g0(InterfaceC1278Qd1 interfaceC1278Qd1, int i) {
        return US1.m(interfaceC1278Qd1, i);
    }

    @Override // defpackage.InterfaceC1009Ms
    public int h(InterfaceC0655Id1 interfaceC0655Id1) {
        O90.f(interfaceC0655Id1, "<this>");
        if (interfaceC0655Id1 instanceof Z01) {
            return US1.b((InterfaceC0974Mg0) interfaceC0655Id1);
        }
        if (interfaceC0655Id1 instanceof C5636l8) {
            return ((C5636l8) interfaceC0655Id1).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC0655Id1 + ", " + BP0.a.b(interfaceC0655Id1.getClass())).toString());
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean h0(InterfaceC1278Qd1 interfaceC1278Qd1, InterfaceC1278Qd1 interfaceC1278Qd12) {
        return US1.a(interfaceC1278Qd1, interfaceC1278Qd12);
    }

    @Override // defpackage.InterfaceC1009Ms
    public InterfaceC0655Id1 i(Z01 z01) {
        return US1.c(z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean i0(Z01 z01, Z01 z012) {
        return US1.s(z01, z012);
    }

    @Override // defpackage.InterfaceC1009Ms
    public void j(InterfaceC0974Mg0 interfaceC0974Mg0) {
        O90.f(interfaceC0974Mg0, "<this>");
        US1.f(interfaceC0974Mg0);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean k(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.A(interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC7117su0
    public File l() {
        return null;
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean l0(InterfaceC0974Mg0 interfaceC0974Mg0) {
        O90.f(interfaceC0974Mg0, "$receiver");
        return interfaceC0974Mg0 instanceof C1487Sv0;
    }

    @Override // defpackage.InterfaceC1009Ms
    public void m(Z01 z01) {
        US1.I(z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean m0(Z01 z01) {
        return US1.B(z01);
    }

    @Override // defpackage.InterfaceC1009Ms
    public C6548pv0 n(InterfaceC6532pq interfaceC6532pq) {
        return US1.T(interfaceC6532pq);
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC6689qe1 n0(Z01 z01, int i) {
        O90.f(z01, "<this>");
        if (i < 0 || i >= US1.b(z01)) {
            return null;
        }
        return US1.l(z01, i);
    }

    @Override // defpackage.InterfaceC7117su0
    public AbstractC7551vA o() {
        return null;
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean o0(AbstractC6689qe1 abstractC6689qe1) {
        return US1.G(abstractC6689qe1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public EnumC0346Ee1 p(InterfaceC5925me1 interfaceC5925me1) {
        O90.f(interfaceC5925me1, "$receiver");
        EnumC4015gi1 enumC4015gi1O = interfaceC5925me1.O();
        O90.e(enumC4015gi1O, "getVariance(...)");
        return AZ1.a(enumC4015gi1O);
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC3405dW p0(InterfaceC0974Mg0 interfaceC0974Mg0) {
        return US1.f(interfaceC0974Mg0);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean q(Z01 z01) {
        O90.f(z01, "<this>");
        return US1.u(US1.U(z01));
    }

    @Override // defpackage.InterfaceC1009Ms
    public InterfaceC1200Pd1 q0(InterfaceC0974Mg0 interfaceC0974Mg0) {
        O90.f(interfaceC0974Mg0, "<this>");
        X01 x01G = US1.g(interfaceC0974Mg0);
        if (x01G == null) {
            x01G = x(interfaceC0974Mg0);
        }
        return US1.U(x01G);
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 r(InterfaceC0974Mg0 interfaceC0974Mg0) {
        return US1.g(interfaceC0974Mg0);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean r0(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.z(interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC6689qe1 s(InterfaceC5959mq interfaceC5959mq) {
        return US1.Q(interfaceC5959mq);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean t(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.u(interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean t0(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.t(interfaceC1278Qd1);
    }

    public String toString() {
        switch (this.a) {
            case 23:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean u(AbstractC1521Tg1 abstractC1521Tg1) {
        O90.f(abstractC1521Tg1, "<this>");
        return US1.B(x(abstractC1521Tg1)) != US1.B(V(abstractC1521Tg1));
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean u0(InterfaceC6532pq interfaceC6532pq) {
        return US1.F(interfaceC6532pq);
    }

    @Override // defpackage.InterfaceC5303jO0
    public boolean v(UnsatisfiedLinkError unsatisfiedLinkError, H21[] h21Arr) {
        G21 g21;
        String message;
        if (!(unsatisfiedLinkError instanceof G21) || (unsatisfiedLinkError instanceof F21) || (message = (g21 = (G21) unsatisfiedLinkError).getMessage()) == null || (!message.contains("/app/") && !message.contains("/mnt/"))) {
            return false;
        }
        Objects.toString(unsatisfiedLinkError);
        String str = g21.a;
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (H21 h21 : h21Arr) {
            if (h21 instanceof C8214yf) {
                C8214yf c8214yf = (C8214yf) h21;
                try {
                    c8214yf.getClass();
                    c8214yf.d(2);
                } catch (Exception unused) {
                    c8214yf.getClass();
                    return false;
                }
            }
        }
        return true;
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean v0(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.C(interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 w(AbstractC3405dW abstractC3405dW) {
        return US1.V(abstractC3405dW);
    }

    @Override // defpackage.InterfaceC1009Ms
    public X01 x(InterfaceC0974Mg0 interfaceC0974Mg0) {
        X01 x01J;
        O90.f(interfaceC0974Mg0, "<this>");
        AbstractC3405dW abstractC3405dWF = US1.f(interfaceC0974Mg0);
        if (abstractC3405dWF != null && (x01J = US1.J(abstractC3405dWF)) != null) {
            return x01J;
        }
        X01 x01G = US1.g(interfaceC0974Mg0);
        O90.c(x01G);
        return x01G;
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC6689qe1 x0(InterfaceC0655Id1 interfaceC0655Id1, int i) {
        O90.f(interfaceC0655Id1, "<this>");
        if (interfaceC0655Id1 instanceof Z01) {
            return US1.l((InterfaceC0974Mg0) interfaceC0655Id1, i);
        }
        if (interfaceC0655Id1 instanceof C5636l8) {
            Object obj = ((C5636l8) interfaceC0655Id1).get(i);
            O90.e(obj, "get(...)");
            return (AbstractC6689qe1) obj;
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC0655Id1 + ", " + BP0.a.b(interfaceC0655Id1.getClass())).toString());
    }

    @Override // defpackage.InterfaceC1009Ms
    public AbstractC1521Tg1 y(InterfaceC6532pq interfaceC6532pq) {
        return US1.K(interfaceC6532pq);
    }

    @Override // defpackage.InterfaceC1009Ms
    public boolean y0(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.v(interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public Collection z(InterfaceC1278Qd1 interfaceC1278Qd1) {
        return US1.S(interfaceC1278Qd1);
    }

    @Override // defpackage.InterfaceC1009Ms
    public Z01 z0(Z01 z01) {
        X01 x01M;
        O90.f(z01, "<this>");
        C6618qH c6618qHE = US1.e(z01);
        return (c6618qHE == null || (x01M = US1.M(c6618qHE)) == null) ? z01 : x01M;
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case 26:
                C7434uY1.b.get();
                Boolean bool = (Boolean) HY1.j.a();
                bool.getClass();
                return bool;
            case 27:
                PW1.b.get();
                return (String) UW1.l.a();
            default:
                EW1.b.get();
                Boolean bool2 = (Boolean) IW1.a.a();
                bool2.getClass();
                return bool2;
        }
    }

    @Override // defpackage.InterfaceC1009Ms
    public int a(InterfaceC0974Mg0 interfaceC0974Mg0) {
        return US1.b(interfaceC0974Mg0);
    }

    @Override // defpackage.InterfaceC6696qh
    public long f(long j) {
        return j;
    }

    @Override // defpackage.W3
    public void w0(Bundle bundle) {
    }

    @Override // defpackage.InterfaceC1009Ms
    public void C0(Z01 z01, InterfaceC1278Qd1 interfaceC1278Qd1) {
    }
}
