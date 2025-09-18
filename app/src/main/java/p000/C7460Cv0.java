package p000;

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
public final class C7460Cv0 implements InterfaceC0062Az, InterfaceC0750Lv, InterfaceC0810Ms, JB1, InterfaceC6696qh, InterfaceC8294Sw0, InterfaceC11091su0, Y31, InterfaceC7794Jg0, InterfaceC9875jO0, InterfaceC1388W3, InterfaceC9294er1, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static C7460Cv0 f1752b;

    /* renamed from: c */
    public static final /* synthetic */ C7460Cv0 f1753c = new C7460Cv0(1);

    /* renamed from: d */
    public static final C7460Cv0 f1754d = new C7460Cv0(2);

    /* renamed from: e */
    public static final C7460Cv0 f1755e = new C7460Cv0(3);

    /* renamed from: f */
    public static final C7460Cv0 f1756f = new C7460Cv0(4);

    /* renamed from: g */
    public static final C7460Cv0 f1757g = new C7460Cv0(5);

    /* renamed from: h */
    public static final /* synthetic */ C7460Cv0 f1758h = new C7460Cv0(6);

    /* renamed from: a */
    public final /* synthetic */ int f1759a;

    public /* synthetic */ C7460Cv0(int i) {
        this.f1759a = i;
    }

    /* renamed from: B0 */
    public static C6670qH m1456B0(AbstractC8315Tg1 abstractC8315Tg1, boolean z) {
        boolean zM787e;
        O90.m5968f(abstractC8315Tg1, "type");
        if (abstractC8315Tg1 instanceof C6670qH) {
            return (C6670qH) abstractC8315Tg1;
        }
        abstractC8315Tg1.mo3797E();
        if ((abstractC8315Tg1.mo3797E().mo1962a() instanceof InterfaceC10292me1) || (abstractC8315Tg1 instanceof C10581ov0)) {
            InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC8315Tg1.mo3797E().mo1962a();
            C10420ne1 c10420ne1 = interfaceC0873NsMo1962a instanceof C10420ne1 ? (C10420ne1) interfaceC0873NsMo1962a : null;
            zM787e = true;
            if (c10420ne1 == null || c10420ne1.f38432m) {
                zM787e = (z && (abstractC8315Tg1.mo3797E().mo1962a() instanceof InterfaceC10292me1)) ? AbstractC7375Be1.m787e(abstractC8315Tg1) : true ^ AbstractC10384nM1.m23133b(QS1.m6717a(false, true, f1757g, null, null, 24), AbstractC9572h12.m18697e(abstractC8315Tg1), C7997Nd1.f7928b);
            }
        } else {
            zM787e = false;
        }
        if (!zM787e) {
            return null;
        }
        if (abstractC8315Tg1 instanceof AbstractC3933dW) {
            AbstractC3933dW abstractC3933dW = (AbstractC3933dW) abstractC8315Tg1;
            O90.m5963a(abstractC3933dW.f26126b.mo3797E(), abstractC3933dW.f26127c.mo3797E());
        }
        return new C6670qH(AbstractC9572h12.m18697e(abstractC8315Tg1).mo250P(false), z);
    }

    /* renamed from: d0 */
    public static /* synthetic */ void m1457d0(int i) {
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

    /* renamed from: e0 */
    public static String m1458e0(String str) {
        String string;
        try {
            string = new JSONObject(str).getString("short_segments");
        } catch (JSONException unused) {
            string = null;
        }
        return string == null ? "" : string;
    }

    /* renamed from: j0 */
    public static final String m1459j0(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f39211e;
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
                    byte b = bArr2[i11][i12];
                    byte[] bArr4 = AbstractC7433Ch1.f1577a;
                    int i14 = b & 255;
                    z = z2;
                    i3 = i14;
                }
                byte b2 = bArr[i8 + i13];
                byte[] bArr5 = AbstractC7433Ch1.f1577a;
                i4 = i3 - (b2 & 255);
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
                            O90.m5967e(charset, "UTF_8");
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

    /* renamed from: k0 */
    public static final C9193e31 m1460k0(String str, String str2, String str3, String str4) {
        ArrayList arrayList = AbstractC9705i31.f28788a;
        return new C9193e31(str, C8340Tt0.m7798e(str2), str3, str4);
    }

    /* renamed from: s0 */
    public static synchronized C7460Cv0 m1461s0() {
        try {
            if (f1752b == null) {
                f1752b = new C7460Cv0(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1752b;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: A */
    public boolean mo1008A(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8063w(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: A0 */
    public AbstractC10804qe1 mo1009A0(InterfaceC7950Mg0 interfaceC7950Mg0, int i) {
        return US1.m8052l(interfaceC7950Mg0, i);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: B */
    public X01 mo1010B(AbstractC3933dW abstractC3933dW) {
        return US1.m8026J(abstractC3933dW);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: C */
    public Set mo1012C(Z01 z01) {
        return US1.m8032P(this, z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: D */
    public boolean mo1014D(Z01 z01) {
        return US1.m8064x(z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: D0 */
    public AbstractC8315Tg1 mo1015D0(Z01 z01, Z01 z012) {
        return US1.m8051k(this, z01, z012);
    }

    @Override // p000.Y31
    /* renamed from: E */
    public StackTraceElement[] mo1462E(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: E0 */
    public InterfaceC7950Mg0 mo1017E0(InterfaceC7950Mg0 interfaceC7950Mg0) {
        return US1.m8039W(this, interfaceC7950Mg0);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: F */
    public EnumC6262jq mo1018F(InterfaceC6642pq interfaceC6642pq) {
        return US1.m8050j(interfaceC6642pq);
    }

    /* renamed from: F0 */
    public InterfaceC7950Mg0 m1463F0(InterfaceC7950Mg0 interfaceC7950Mg0) {
        X01 x01M8040X;
        O90.m5968f(interfaceC7950Mg0, "<this>");
        X01 x01M8047g = US1.m8047g(interfaceC7950Mg0);
        return (x01M8047g == null || (x01M8040X = US1.m8040X(x01M8047g, true)) == null) ? interfaceC7950Mg0 : x01M8040X;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: G */
    public X01 mo1019G(C6670qH c6670qH) {
        return US1.m8029M(c6670qH);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: G0 */
    public C6670qH mo1020G0(Z01 z01) {
        return US1.m8045e(z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: H */
    public boolean mo1021H(InterfaceC7950Mg0 interfaceC7950Mg0) {
        O90.m5968f(interfaceC7950Mg0, "<this>");
        X01 x01M8047g = US1.m8047g(interfaceC7950Mg0);
        return (x01M8047g != null ? US1.m8045e(x01M8047g) : null) != null;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: I */
    public void mo1022I(Z01 z01) {
        US1.m8024H(z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: J */
    public C0747Ls mo1024J(Z01 z01) {
        return US1.m8034R(this, z01);
    }

    @Override // p000.InterfaceC7794Jg0
    /* renamed from: K */
    public boolean mo1464K(InterfaceC8101Pd1 interfaceC8101Pd1, InterfaceC8101Pd1 interfaceC8101Pd12) {
        if (interfaceC8101Pd1 == null) {
            m1457d0(0);
            throw null;
        }
        if (interfaceC8101Pd12 != null) {
            return interfaceC8101Pd1.equals(interfaceC8101Pd12);
        }
        m1457d0(1);
        throw null;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: L */
    public X01 mo1026L(Z01 z01, boolean z) {
        return US1.m8040X(z01, z);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: M */
    public EnumC7531Ee1 mo1028M(AbstractC10804qe1 abstractC10804qe1) {
        return US1.m8056p(abstractC10804qe1);
    }

    @Override // p000.InterfaceC11091su0
    /* renamed from: N */
    public File mo1465N() {
        return null;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: O */
    public boolean mo1032O(Z01 z01) {
        O90.m5968f(z01, "<this>");
        return US1.m8066z(US1.m8037U(z01));
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: P */
    public AbstractC8315Tg1 mo1034P(InterfaceC7950Mg0 interfaceC7950Mg0) {
        return US1.m8028L(interfaceC7950Mg0);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: Q */
    public X01 mo1036Q(Z01 z01) {
        EnumC6262jq enumC6262jq = EnumC6262jq.f35417a;
        return US1.m8049i(z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: R */
    public AbstractC8315Tg1 mo1038R(AbstractC10804qe1 abstractC10804qe1) {
        return US1.m8054n(abstractC10804qe1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: S */
    public int mo1040S(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8030N(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: T */
    public boolean mo1042T(InterfaceC10292me1 interfaceC10292me1, InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8058r(interfaceC10292me1, interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC11091su0
    /* renamed from: U */
    public File mo1466U() {
        return null;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: V */
    public X01 mo1045V(InterfaceC7950Mg0 interfaceC7950Mg0) {
        X01 x01M8038V;
        O90.m5968f(interfaceC7950Mg0, "<this>");
        AbstractC3933dW abstractC3933dWM8046f = US1.m8046f(interfaceC7950Mg0);
        if (abstractC3933dWM8046f != null && (x01M8038V = US1.m8038V(abstractC3933dWM8046f)) != null) {
            return x01M8038V;
        }
        X01 x01M8047g = US1.m8047g(interfaceC7950Mg0);
        O90.m5965c(x01M8047g);
        return x01M8047g;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: W */
    public InterfaceC8101Pd1 mo1047W(Z01 z01) {
        return US1.m8037U(z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: X */
    public boolean mo1049X(Z01 z01) {
        O90.m5968f(z01, "<this>");
        X01 x01M8047g = US1.m8047g(z01);
        return (x01M8047g != null ? US1.m8044d(this, x01M8047g) : null) != null;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: Y */
    public InterfaceC6642pq mo1051Y(Z01 z01) {
        return US1.m8044d(this, z01);
    }

    @Override // p000.JB1
    /* renamed from: Z */
    public void mo1467Z(C11900zE1 c11900zE1, ListenerHolder.ListenerKey listenerKey, boolean z, S81 s81) {
        c11900zE1.m26337d(listenerKey, z, s81);
    }

    @Override // p000.InterfaceC9550gr1
    /* renamed from: a */
    public /* synthetic */ Object mo1468a() {
        return new C7357Av1("IntegrityService");
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: a0 */
    public boolean mo1055a0(Z01 z01) {
        O90.m5968f(z01, "<this>");
        return US1.m8019C(mo1101q0(z01)) && !US1.m8020D(z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: b */
    public boolean mo1057b(InterfaceC6642pq interfaceC6642pq) {
        O90.m5968f(interfaceC6642pq, "$receiver");
        return interfaceC6642pq instanceof C6325kq;
    }

    @Override // p000.InterfaceC11091su0
    /* renamed from: b0 */
    public File mo1469b0() {
        return null;
    }

    @Override // p000.InterfaceC8294Sw0
    /* renamed from: c */
    public Object mo386c() {
        return new ArrayList();
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: c0 */
    public AbstractC8315Tg1 mo1060c0(ArrayList arrayList) {
        X01 x01;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (AbstractC8315Tg1) AbstractC7167xu.m25972R(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractC8315Tg1 abstractC8315Tg1 = (AbstractC8315Tg1) it.next();
            z = z || AbstractC1141S8.m7182b(abstractC8315Tg1);
            if (abstractC8315Tg1 instanceof X01) {
                x01 = (X01) abstractC8315Tg1;
            } else {
                if (!(abstractC8315Tg1 instanceof AbstractC3933dW)) {
                    throw new C6838sg();
                }
                O90.m5968f(abstractC8315Tg1, "<this>");
                x01 = ((AbstractC3933dW) abstractC8315Tg1).f26126b;
                z2 = true;
            }
            arrayList2.add(x01);
        }
        if (z) {
            return C6298kP.m22197c(EnumC6235jP.f35139x, arrayList.toString());
        }
        C9908je1 c9908je1 = C9908je1.f35304a;
        if (!z2) {
            return c9908je1.m22085b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC7293zu.m26586k(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC9572h12.m18698j((AbstractC8315Tg1) it2.next()));
        }
        return NV1.m5738t(c9908je1.m22085b(arrayList2), c9908je1.m22085b(arrayList3));
    }

    @Override // p000.InterfaceC11091su0
    /* renamed from: d */
    public File mo1470d() {
        return null;
    }

    @Override // p000.InterfaceC11091su0
    /* renamed from: e */
    public File mo1471e() {
        return null;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: f0 */
    public C10988s41 mo1069f0(InterfaceC7950Mg0 interfaceC7950Mg0) {
        return US1.m8048h(interfaceC7950Mg0);
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        switch (this.f1759a) {
            case 2:
                Object objMo4071h = c8128Pr0.mo4071h(new C11011sG0(InterfaceC0108Bi.class, Executor.class));
                O90.m5967e(objMo4071h, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return N02.m5507e((Executor) objMo4071h);
            default:
                return new C4178hQ(c8128Pr0.mo4068c(C9167ds0.class));
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: g0 */
    public InterfaceC10292me1 mo1072g0(InterfaceC8153Qd1 interfaceC8153Qd1, int i) {
        return US1.m8053m(interfaceC8153Qd1, i);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: h */
    public int mo1074h(InterfaceC7737Id1 interfaceC7737Id1) {
        O90.m5968f(interfaceC7737Id1, "<this>");
        if (interfaceC7737Id1 instanceof Z01) {
            return US1.m8042b((InterfaceC7950Mg0) interfaceC7737Id1);
        }
        if (interfaceC7737Id1 instanceof C6344l8) {
            return ((C6344l8) interfaceC7737Id1).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC7737Id1 + ", " + BP0.f799a.mo3846b(interfaceC7737Id1.getClass())).toString());
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: h0 */
    public boolean mo1075h0(InterfaceC8153Qd1 interfaceC8153Qd1, InterfaceC8153Qd1 interfaceC8153Qd12) {
        return US1.m8041a(interfaceC8153Qd1, interfaceC8153Qd12);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: i */
    public InterfaceC7737Id1 mo1077i(Z01 z01) {
        return US1.m8043c(z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: i0 */
    public boolean mo1078i0(Z01 z01, Z01 z012) {
        return US1.m8059s(z01, z012);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: j */
    public void mo1080j(InterfaceC7950Mg0 interfaceC7950Mg0) {
        O90.m5968f(interfaceC7950Mg0, "<this>");
        US1.m8046f(interfaceC7950Mg0);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: k */
    public boolean mo1083k(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8017A(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC11091su0
    /* renamed from: l */
    public File mo1473l() {
        return null;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: l0 */
    public boolean mo1087l0(InterfaceC7950Mg0 interfaceC7950Mg0) {
        O90.m5968f(interfaceC7950Mg0, "$receiver");
        return interfaceC7950Mg0 instanceof C8292Sv0;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: m */
    public void mo1089m(Z01 z01) {
        US1.m8025I(z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: m0 */
    public boolean mo1090m0(Z01 z01) {
        return US1.m8018B(z01);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: n */
    public C10709pv0 mo1092n(InterfaceC6642pq interfaceC6642pq) {
        return US1.m8036T(interfaceC6642pq);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: n0 */
    public AbstractC10804qe1 mo1093n0(Z01 z01, int i) {
        O90.m5968f(z01, "<this>");
        if (i < 0 || i >= US1.m8042b(z01)) {
            return null;
        }
        return US1.m8052l(z01, i);
    }

    @Override // p000.InterfaceC11091su0
    /* renamed from: o */
    public AbstractC6995vA mo1474o() {
        return null;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: o0 */
    public boolean mo1096o0(AbstractC10804qe1 abstractC10804qe1) {
        return US1.m8023G(abstractC10804qe1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: p */
    public EnumC7531Ee1 mo1098p(InterfaceC10292me1 interfaceC10292me1) {
        O90.m5968f(interfaceC10292me1, "$receiver");
        EnumC9532gi1 enumC9532gi1Mo22918O = interfaceC10292me1.mo22918O();
        O90.m5967e(enumC9532gi1Mo22918O, "getVariance(...)");
        return AZ1.m233a(enumC9532gi1Mo22918O);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: p0 */
    public AbstractC3933dW mo1099p0(InterfaceC7950Mg0 interfaceC7950Mg0) {
        return US1.m8046f(interfaceC7950Mg0);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: q */
    public boolean mo1100q(Z01 z01) {
        O90.m5968f(z01, "<this>");
        return US1.m8061u(US1.m8037U(z01));
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: q0 */
    public InterfaceC8101Pd1 mo1101q0(InterfaceC7950Mg0 interfaceC7950Mg0) {
        O90.m5968f(interfaceC7950Mg0, "<this>");
        X01 x01M8047g = US1.m8047g(interfaceC7950Mg0);
        if (x01M8047g == null) {
            x01M8047g = mo1112x(interfaceC7950Mg0);
        }
        return US1.m8037U(x01M8047g);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: r */
    public X01 mo1102r(InterfaceC7950Mg0 interfaceC7950Mg0) {
        return US1.m8047g(interfaceC7950Mg0);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: r0 */
    public boolean mo1103r0(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8066z(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: s */
    public AbstractC10804qe1 mo1104s(InterfaceC6451mq interfaceC6451mq) {
        return US1.m8033Q(interfaceC6451mq);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: t */
    public boolean mo1105t(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8061u(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: t0 */
    public boolean mo1106t0(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8060t(interfaceC8153Qd1);
    }

    public String toString() {
        switch (this.f1759a) {
            case 23:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: u */
    public boolean mo1107u(AbstractC8315Tg1 abstractC8315Tg1) {
        O90.m5968f(abstractC8315Tg1, "<this>");
        return US1.m8018B(mo1112x(abstractC8315Tg1)) != US1.m8018B(mo1045V(abstractC8315Tg1));
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: u0 */
    public boolean mo1108u0(InterfaceC6642pq interfaceC6642pq) {
        return US1.m8022F(interfaceC6642pq);
    }

    @Override // p000.InterfaceC9875jO0
    /* renamed from: v */
    public boolean mo1475v(UnsatisfiedLinkError unsatisfiedLinkError, H21[] h21Arr) {
        G21 g21;
        String message;
        if (!(unsatisfiedLinkError instanceof G21) || (unsatisfiedLinkError instanceof F21) || (message = (g21 = (G21) unsatisfiedLinkError).getMessage()) == null || (!message.contains("/app/") && !message.contains("/mnt/"))) {
            return false;
        }
        Objects.toString(unsatisfiedLinkError);
        String str = g21.f3550a;
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (H21 h21 : h21Arr) {
            if (h21 instanceof C7215yf) {
                C7215yf c7215yf = (C7215yf) h21;
                try {
                    c7215yf.getClass();
                    c7215yf.mo3244d(2);
                } catch (Exception unused) {
                    c7215yf.getClass();
                    return false;
                }
            }
        }
        return true;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: v0 */
    public boolean mo1110v0(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8019C(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: w */
    public X01 mo1111w(AbstractC3933dW abstractC3933dW) {
        return US1.m8038V(abstractC3933dW);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: x */
    public X01 mo1112x(InterfaceC7950Mg0 interfaceC7950Mg0) {
        X01 x01M8026J;
        O90.m5968f(interfaceC7950Mg0, "<this>");
        AbstractC3933dW abstractC3933dWM8046f = US1.m8046f(interfaceC7950Mg0);
        if (abstractC3933dWM8046f != null && (x01M8026J = US1.m8026J(abstractC3933dWM8046f)) != null) {
            return x01M8026J;
        }
        X01 x01M8047g = US1.m8047g(interfaceC7950Mg0);
        O90.m5965c(x01M8047g);
        return x01M8047g;
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: x0 */
    public AbstractC10804qe1 mo1113x0(InterfaceC7737Id1 interfaceC7737Id1, int i) {
        O90.m5968f(interfaceC7737Id1, "<this>");
        if (interfaceC7737Id1 instanceof Z01) {
            return US1.m8052l((InterfaceC7950Mg0) interfaceC7737Id1, i);
        }
        if (interfaceC7737Id1 instanceof C6344l8) {
            Object obj = ((C6344l8) interfaceC7737Id1).get(i);
            O90.m5967e(obj, "get(...)");
            return (AbstractC10804qe1) obj;
        }
        throw new IllegalStateException(("unknown type argument list type: " + interfaceC7737Id1 + ", " + BP0.f799a.mo3846b(interfaceC7737Id1.getClass())).toString());
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: y */
    public AbstractC8315Tg1 mo1114y(InterfaceC6642pq interfaceC6642pq) {
        return US1.m8027K(interfaceC6642pq);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: y0 */
    public boolean mo1115y0(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8062v(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: z */
    public Collection mo1116z(InterfaceC8153Qd1 interfaceC8153Qd1) {
        return US1.m8035S(interfaceC8153Qd1);
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: z0 */
    public Z01 mo1117z0(Z01 z01) {
        X01 x01M8029M;
        O90.m5968f(z01, "<this>");
        C6670qH c6670qHM8045e = US1.m8045e(z01);
        return (c6670qHM8045e == null || (x01M8029M = US1.m8029M(c6670qHM8045e)) == null) ? z01 : x01M8029M;
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f1759a) {
            case 26:
                C11304uY1.f43748b.get();
                Boolean bool = (Boolean) HY1.f4349j.m8754a();
                bool.getClass();
                return bool;
            case 27:
                PW1.f9104b.get();
                return (String) UW1.f11881l.m8754a();
            default:
                EW1.f2734b.get();
                Boolean bool2 = (Boolean) IW1.f4971a.m8754a();
                bool2.getClass();
                return bool2;
        }
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: a */
    public int mo1054a(InterfaceC7950Mg0 interfaceC7950Mg0) {
        return US1.m8042b(interfaceC7950Mg0);
    }

    @Override // p000.InterfaceC6696qh
    /* renamed from: f */
    public long mo1472f(long j) {
        return j;
    }

    @Override // p000.InterfaceC1388W3
    /* renamed from: w0 */
    public void mo1476w0(Bundle bundle) {
    }

    @Override // p000.InterfaceC0810Ms
    /* renamed from: C0 */
    public void mo1013C0(Z01 z01, InterfaceC8153Qd1 interfaceC8153Qd1) {
    }
}
