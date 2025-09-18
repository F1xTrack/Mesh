package defpackage;

import android.os.Looper;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.vk.push.core.filedatastore.JsonDeserializer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: tt */
/* loaded from: classes.dex */
public final class C7304tt implements V01, C21, InterfaceC0940Lv, InterfaceC0284Dk, InterfaceC1408Rv, InterfaceC1646Uw0, RL, InterfaceC5696lS, JsonDeserializer, InterfaceC1181Ox0, InterfaceC6053nJ1 {
    public static final C7304tt b = new C7304tt(1);
    public static final C7304tt c = new C7304tt(2);
    public static final C7304tt d = new C7304tt(3);
    public static final C7304tt e = new C7304tt(3);
    public static final C7304tt f = new C7304tt(4);
    public static final C7304tt g = new C7304tt(6);
    public static final /* synthetic */ C7304tt h = new C7304tt(7);
    public final /* synthetic */ int a;

    public /* synthetic */ C7304tt(int i) {
        this.a = i;
    }

    public static final boolean k(InterfaceC1009Ms interfaceC1009Ms, Z01 z01) {
        if (!interfaceC1009Ms.O(z01)) {
            if (z01 instanceof InterfaceC6532pq) {
                AbstractC6689qe1 abstractC6689qe1S = interfaceC1009Ms.s(interfaceC1009Ms.n((InterfaceC6532pq) z01));
                if (interfaceC1009Ms.o0(abstractC6689qe1S) || !interfaceC1009Ms.O(interfaceC1009Ms.V(interfaceC1009Ms.R(abstractC6689qe1S)))) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean l(InterfaceC1009Ms interfaceC1009Ms, C2005Zm c2005Zm, Z01 z01, Z01 z012, boolean z) {
        Set<InterfaceC0974Mg0> setC = interfaceC1009Ms.C(z01);
        if ((setC instanceof Collection) && setC.isEmpty()) {
            return false;
        }
        for (InterfaceC0974Mg0 interfaceC0974Mg0 : setC) {
            if (O90.a(interfaceC1009Ms.q0(interfaceC0974Mg0), interfaceC1009Ms.W(z012)) || (z && s(b, c2005Zm, z012, interfaceC0974Mg0))) {
                return true;
            }
        }
        return false;
    }

    public static List m(C2005Zm c2005Zm, Z01 z01, InterfaceC1278Qd1 interfaceC1278Qd1) {
        AbstractC5719lZ1 abstractC5719lZ1J;
        InterfaceC1009Ms interfaceC1009Ms = (InterfaceC1009Ms) c2005Zm.d;
        interfaceC1009Ms.C0(z01, interfaceC1278Qd1);
        boolean zT = interfaceC1009Ms.t(interfaceC1278Qd1);
        MN mn = MN.a;
        if (!zT && interfaceC1009Ms.q(z01)) {
            return mn;
        }
        if (interfaceC1009Ms.y0(interfaceC1278Qd1)) {
            if (!interfaceC1009Ms.h0(interfaceC1009Ms.W(z01), interfaceC1278Qd1)) {
                return mn;
            }
            EnumC5386jq enumC5386jq = EnumC5386jq.a;
            X01 x01Q = interfaceC1009Ms.Q(z01);
            if (x01Q != null) {
                z01 = x01Q;
            }
            return AbstractC8259yu.e(z01);
        }
        C7718w21 c7718w21 = new C7718w21();
        c2005Zm.h();
        ArrayDeque arrayDeque = (ArrayDeque) c2005Zm.g;
        O90.c(arrayDeque);
        C8098y21 c8098y21 = (C8098y21) c2005Zm.h;
        O90.c(c8098y21);
        arrayDeque.push(z01);
        while (!arrayDeque.isEmpty()) {
            if (c8098y21.b > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + z01 + ". Supertypes = " + AbstractC8069xu.H(c8098y21, null, null, null, null, 63)).toString());
            }
            Z01 z012 = (Z01) arrayDeque.pop();
            O90.c(z012);
            if (c8098y21.add(z012)) {
                EnumC5386jq enumC5386jq2 = EnumC5386jq.a;
                X01 x01Q2 = interfaceC1009Ms.Q(z012);
                if (x01Q2 == null) {
                    x01Q2 = z012;
                }
                boolean zH0 = interfaceC1009Ms.h0(interfaceC1009Ms.W(x01Q2), interfaceC1278Qd1);
                C1044Nd1 c1044Nd1 = C1044Nd1.c;
                if (zH0) {
                    c7718w21.add(x01Q2);
                    abstractC5719lZ1J = c1044Nd1;
                } else {
                    abstractC5719lZ1J = interfaceC1009Ms.a(x01Q2) == 0 ? C1044Nd1.b : interfaceC1009Ms.J(x01Q2);
                }
                if (abstractC5719lZ1J.equals(c1044Nd1)) {
                    abstractC5719lZ1J = null;
                }
                if (abstractC5719lZ1J != null) {
                    Iterator it = interfaceC1009Ms.z(interfaceC1009Ms.W(z012)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(abstractC5719lZ1J.b(c2005Zm, (InterfaceC0974Mg0) it.next()));
                    }
                }
            }
        }
        c2005Zm.f();
        return c7718w21;
    }

    public static List n(C2005Zm c2005Zm, Z01 z01, InterfaceC1278Qd1 interfaceC1278Qd1) {
        int i;
        List listM = m(c2005Zm, z01, interfaceC1278Qd1);
        if (listM.size() < 2) {
            return listM;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            InterfaceC1009Ms interfaceC1009Ms = (InterfaceC1009Ms) c2005Zm.d;
            InterfaceC0655Id1 interfaceC0655Id1I = interfaceC1009Ms.i((Z01) obj);
            int iH = interfaceC1009Ms.h(interfaceC0655Id1I);
            while (true) {
                if (i >= iH) {
                    arrayList.add(obj);
                    break;
                }
                i = interfaceC1009Ms.p0(interfaceC1009Ms.R(interfaceC1009Ms.x0(interfaceC0655Id1I, i))) == null ? i + 1 : 0;
            }
        }
        return !arrayList.isEmpty() ? arrayList : listM;
    }

    public static boolean o(C2005Zm c2005Zm, InterfaceC0974Mg0 interfaceC0974Mg0, InterfaceC0974Mg0 interfaceC0974Mg02) {
        O90.f(interfaceC0974Mg0, "a");
        O90.f(interfaceC0974Mg02, "b");
        if (interfaceC0974Mg0 == interfaceC0974Mg02) {
            return true;
        }
        C7304tt c7304tt = b;
        InterfaceC1009Ms interfaceC1009Ms = (InterfaceC1009Ms) c2005Zm.d;
        if (q(interfaceC1009Ms, interfaceC0974Mg0) && q(interfaceC1009Ms, interfaceC0974Mg02)) {
            AbstractC1521Tg1 abstractC1521Tg1K = c2005Zm.k(c2005Zm.l(interfaceC0974Mg0));
            AbstractC1521Tg1 abstractC1521Tg1K2 = c2005Zm.k(c2005Zm.l(interfaceC0974Mg02));
            X01 x01X = interfaceC1009Ms.x(abstractC1521Tg1K);
            if (!interfaceC1009Ms.h0(interfaceC1009Ms.q0(abstractC1521Tg1K), interfaceC1009Ms.q0(abstractC1521Tg1K2))) {
                return false;
            }
            if (interfaceC1009Ms.a(x01X) == 0) {
                return interfaceC1009Ms.u(abstractC1521Tg1K) || interfaceC1009Ms.u(abstractC1521Tg1K2) || interfaceC1009Ms.m0(x01X) == interfaceC1009Ms.m0(interfaceC1009Ms.x(abstractC1521Tg1K2));
            }
        }
        return s(c7304tt, c2005Zm, interfaceC0974Mg0, interfaceC0974Mg02) && s(c7304tt, c2005Zm, interfaceC0974Mg02, interfaceC0974Mg0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0062, code lost:
    
        return r6.g0(r6.q0(r7), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.InterfaceC5925me1 p(defpackage.InterfaceC1009Ms r6, defpackage.InterfaceC0974Mg0 r7, defpackage.Z01 r8) {
        /*
            int r0 = r6.a(r7)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L66
            qe1 r4 = r6.A0(r7, r2)
            boolean r5 = r6.o0(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L63
            Tg1 r3 = r6.R(r3)
            if (r3 != 0) goto L1d
            goto L63
        L1d:
            X01 r4 = r6.x(r3)
            Z01 r4 = r6.z0(r4)
            boolean r4 = r6.X(r4)
            if (r4 == 0) goto L3b
            X01 r4 = r6.x(r8)
            Z01 r4 = r6.z0(r4)
            boolean r4 = r6.X(r4)
            if (r4 == 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r5 = r3.equals(r8)
            if (r5 != 0) goto L5a
            if (r4 == 0) goto L53
            Pd1 r4 = r6.q0(r3)
            Pd1 r5 = r6.q0(r8)
            boolean r4 = defpackage.O90.a(r4, r5)
            if (r4 == 0) goto L53
            goto L5a
        L53:
            me1 r3 = p(r6, r3, r8)
            if (r3 == 0) goto L63
            return r3
        L5a:
            Pd1 r7 = r6.q0(r7)
            me1 r6 = r6.g0(r7, r2)
            return r6
        L63:
            int r2 = r2 + 1
            goto L6
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7304tt.p(Ms, Mg0, Z01):me1");
    }

    public static boolean q(InterfaceC1009Ms interfaceC1009Ms, InterfaceC0974Mg0 interfaceC0974Mg0) {
        if (interfaceC1009Ms.A(interfaceC1009Ms.q0(interfaceC0974Mg0))) {
            interfaceC1009Ms.j(interfaceC0974Mg0);
            if (!interfaceC1009Ms.H(interfaceC0974Mg0) && !interfaceC1009Ms.l0(interfaceC0974Mg0) && O90.a(interfaceC1009Ms.W(interfaceC1009Ms.x(interfaceC0974Mg0)), interfaceC1009Ms.W(interfaceC1009Ms.V(interfaceC0974Mg0)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean r(C2005Zm c2005Zm, InterfaceC0655Id1 interfaceC0655Id1, Z01 z01) {
        boolean zS;
        O90.f(interfaceC0655Id1, "capturedSubArguments");
        InterfaceC1009Ms interfaceC1009Ms = (InterfaceC1009Ms) c2005Zm.d;
        InterfaceC1200Pd1 interfaceC1200Pd1W = interfaceC1009Ms.W(z01);
        int iH = interfaceC1009Ms.h(interfaceC0655Id1);
        int iS = interfaceC1009Ms.S(interfaceC1200Pd1W);
        if (iH != iS || iH != interfaceC1009Ms.a(z01)) {
            return false;
        }
        for (int i = 0; i < iS; i++) {
            AbstractC6689qe1 abstractC6689qe1A0 = interfaceC1009Ms.A0(z01, i);
            if (!interfaceC1009Ms.o0(abstractC6689qe1A0)) {
                AbstractC1521Tg1 abstractC1521Tg1R = interfaceC1009Ms.R(abstractC6689qe1A0);
                AbstractC6689qe1 abstractC6689qe1X0 = interfaceC1009Ms.x0(interfaceC0655Id1, i);
                interfaceC1009Ms.M(abstractC6689qe1X0);
                EnumC0346Ee1 enumC0346Ee1 = EnumC0346Ee1.d;
                AbstractC1521Tg1 abstractC1521Tg1R2 = interfaceC1009Ms.R(abstractC6689qe1X0);
                EnumC0346Ee1 enumC0346Ee1P = interfaceC1009Ms.p(interfaceC1009Ms.g0(interfaceC1200Pd1W, i));
                EnumC0346Ee1 enumC0346Ee1M = interfaceC1009Ms.M(abstractC6689qe1A0);
                if (enumC0346Ee1P == enumC0346Ee1) {
                    enumC0346Ee1P = enumC0346Ee1M;
                } else if (enumC0346Ee1M != enumC0346Ee1 && enumC0346Ee1P != enumC0346Ee1M) {
                    enumC0346Ee1P = null;
                }
                if (enumC0346Ee1P == null) {
                    return c2005Zm.b;
                }
                C7304tt c7304tt = b;
                if (enumC0346Ee1P == enumC0346Ee1) {
                    t(interfaceC1009Ms, abstractC1521Tg1R2, abstractC1521Tg1R);
                    t(interfaceC1009Ms, abstractC1521Tg1R, abstractC1521Tg1R2);
                }
                int i2 = c2005Zm.a;
                if (i2 > 100) {
                    throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + abstractC1521Tg1R2).toString());
                }
                c2005Zm.a = i2 + 1;
                int iOrdinal = enumC0346Ee1P.ordinal();
                if (iOrdinal == 0) {
                    zS = s(c7304tt, c2005Zm, abstractC1521Tg1R, abstractC1521Tg1R2);
                } else if (iOrdinal == 1) {
                    zS = s(c7304tt, c2005Zm, abstractC1521Tg1R2, abstractC1521Tg1R);
                } else {
                    if (iOrdinal != 2) {
                        throw new C7074sg();
                    }
                    zS = o(c2005Zm, abstractC1521Tg1R2, abstractC1521Tg1R);
                }
                c2005Zm.a--;
                if (!zS) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x02e0 A[EDGE_INSN: B:681:0x02e0->B:517:0x02e0 BREAK  A[LOOP:10: B:508:0x02c1->B:682:0x02c1]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean s(defpackage.C7304tt r24, defpackage.C2005Zm r25, defpackage.InterfaceC0974Mg0 r26, defpackage.InterfaceC0974Mg0 r27) {
        /*
            Method dump skipped, instructions count: 1436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7304tt.s(tt, Zm, Mg0, Mg0):boolean");
    }

    public static void t(InterfaceC1009Ms interfaceC1009Ms, InterfaceC0974Mg0 interfaceC0974Mg0, InterfaceC0974Mg0 interfaceC0974Mg02) {
        InterfaceC6391p5 interfaceC6391p5R = interfaceC1009Ms.r(interfaceC0974Mg0);
        if (interfaceC6391p5R instanceof InterfaceC6532pq) {
            InterfaceC6532pq interfaceC6532pq = (InterfaceC6532pq) interfaceC6391p5R;
            if (!interfaceC1009Ms.b(interfaceC6532pq) && interfaceC1009Ms.o0(interfaceC1009Ms.s(interfaceC1009Ms.n(interfaceC6532pq))) && interfaceC1009Ms.F(interfaceC6532pq) == EnumC5386jq.a) {
                interfaceC1009Ms.q0(interfaceC0974Mg02);
            }
        }
    }

    public static EnumC6348os0 u(EnumC5467kF0 enumC5467kF0) {
        int i = enumC5467kF0 == null ? -1 : UF0.a[enumC5467kF0.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? EnumC6348os0.b : EnumC6348os0.c : EnumC6348os0.e : EnumC6348os0.d : EnumC6348os0.b;
    }

    public static int v(EnumC6327ol0 enumC6327ol0) {
        switch (enumC6327ol0.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                throw new C7074sg();
        }
    }

    @Override // defpackage.RL
    public LL a(OL ol, C6666qX c6666qX) {
        if (c6666qX.q == null) {
            return null;
        }
        return new C3956gP(new KL(AuthCode.StatusCode.WAITING_CONNECT, new C1443Sg1()));
    }

    @Override // defpackage.InterfaceC0284Dk
    public byte[] b(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.InterfaceC1646Uw0
    public Object c() {
        return new LinkedHashMap();
    }

    @Override // defpackage.RL
    public /* synthetic */ QL d(OL ol, C6666qX c6666qX) {
        return QL.p0;
    }

    @Override // defpackage.RL
    public /* synthetic */ void e() {
    }

    @Override // defpackage.InterfaceC5696lS
    public void f(Object obj) {
        ((List) obj).clear();
    }

    @Override // com.vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) throws JSONException {
        O90.f(jSONObject, "<this>");
        String string = jSONObject.getString("push_token");
        O90.e(string, "getString(\"push_token\")");
        return new C6155nr1(string);
    }

    @Override // defpackage.InterfaceC0940Lv
    public Object g(C1241Pr0 c1241Pr0) {
        switch (this.a) {
            case 7:
                return new C5396jt0(c1241Pr0.z(AbstractC5205it0.class));
            default:
                return new MO1((C2406bs0) c1241Pr0.a(C2406bs0.class));
        }
    }

    @Override // defpackage.InterfaceC1408Rv
    public int getId() {
        return 2;
    }

    @Override // defpackage.InterfaceC1408Rv
    public boolean h(ArrayList arrayList, long j) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC6708ql interfaceC6708ql = (InterfaceC6708ql) it.next();
            if (interfaceC6708ql != null && !interfaceC6708ql.S(j)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.RL
    public int j(C6666qX c6666qX) {
        return c6666qX.q != null ? 1 : 0;
    }

    @Override // defpackage.RL
    public /* synthetic */ void release() {
    }

    @Override // defpackage.InterfaceC6053nJ1
    public Object zza() {
        switch (this.a) {
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.b.get();
                return Integer.valueOf((int) ((Long) UW1.G.a()).longValue());
            default:
                C5522kX1.b.get();
                Boolean bool = (Boolean) C6668qX1.a.a();
                bool.getClass();
                return bool;
        }
    }

    public /* synthetic */ C7304tt(int i, Object obj) {
        this.a = i;
    }

    @Override // defpackage.V01
    public void lock() {
    }

    @Override // defpackage.V01
    public void unlock() {
    }

    @Override // defpackage.InterfaceC1181Ox0
    public void onComplete(Throwable th) {
    }

    @Override // defpackage.RL
    public void i(Looper looper, NB0 nb0) {
    }
}
