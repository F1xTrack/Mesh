package p000;

import android.os.Looper;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.p019vk.push.core.filedatastore.JsonDeserializer;
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
public final class C6914tt implements V01, C21, InterfaceC0750Lv, InterfaceC0236Dk, InterfaceC1127Rv, InterfaceC8398Uw0, InterfaceC1091RL, InterfaceC6364lS, JsonDeserializer, InterfaceC8088Ox0, InterfaceC10378nJ1 {

    /* renamed from: b */
    public static final C6914tt f43391b = new C6914tt(1);

    /* renamed from: c */
    public static final C6914tt f43392c = new C6914tt(2);

    /* renamed from: d */
    public static final C6914tt f43393d = new C6914tt(3);

    /* renamed from: e */
    public static final C6914tt f43394e = new C6914tt(3);

    /* renamed from: f */
    public static final C6914tt f43395f = new C6914tt(4);

    /* renamed from: g */
    public static final C6914tt f43396g = new C6914tt(6);

    /* renamed from: h */
    public static final /* synthetic */ C6914tt f43397h = new C6914tt(7);

    /* renamed from: a */
    public final /* synthetic */ int f43398a;

    public /* synthetic */ C6914tt(int i) {
        this.f43398a = i;
    }

    /* renamed from: k */
    public static final boolean m25016k(InterfaceC0810Ms interfaceC0810Ms, Z01 z01) {
        if (!interfaceC0810Ms.mo1032O(z01)) {
            if (z01 instanceof InterfaceC6642pq) {
                AbstractC10804qe1 abstractC10804qe1Mo1104s = interfaceC0810Ms.mo1104s(interfaceC0810Ms.mo1092n((InterfaceC6642pq) z01));
                if (interfaceC0810Ms.mo1096o0(abstractC10804qe1Mo1104s) || !interfaceC0810Ms.mo1032O(interfaceC0810Ms.mo1045V(interfaceC0810Ms.mo1038R(abstractC10804qe1Mo1104s)))) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static final boolean m25017l(InterfaceC0810Ms interfaceC0810Ms, C1622Zm c1622Zm, Z01 z01, Z01 z012, boolean z) {
        Set<InterfaceC7950Mg0> setMo1012C = interfaceC0810Ms.mo1012C(z01);
        if ((setMo1012C instanceof Collection) && setMo1012C.isEmpty()) {
            return false;
        }
        for (InterfaceC7950Mg0 interfaceC7950Mg0 : setMo1012C) {
            if (O90.m5963a(interfaceC0810Ms.mo1101q0(interfaceC7950Mg0), interfaceC0810Ms.mo1047W(z012)) || (z && m25024s(f43391b, c1622Zm, z012, interfaceC7950Mg0))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static List m25018m(C1622Zm c1622Zm, Z01 z01, InterfaceC8153Qd1 interfaceC8153Qd1) {
        AbstractC10154lZ1 abstractC10154lZ1Mo1024J;
        InterfaceC0810Ms interfaceC0810Ms = (InterfaceC0810Ms) c1622Zm.f15116d;
        interfaceC0810Ms.mo1013C0(z01, interfaceC8153Qd1);
        boolean zMo1105t = interfaceC0810Ms.mo1105t(interfaceC8153Qd1);
        C0779MN c0779mn = C0779MN.f7117a;
        if (!zMo1105t && interfaceC0810Ms.mo1100q(z01)) {
            return c0779mn;
        }
        if (interfaceC0810Ms.mo1115y0(interfaceC8153Qd1)) {
            if (!interfaceC0810Ms.mo1075h0(interfaceC0810Ms.mo1047W(z01), interfaceC8153Qd1)) {
                return c0779mn;
            }
            EnumC6262jq enumC6262jq = EnumC6262jq.f35417a;
            X01 x01Mo1036Q = interfaceC0810Ms.mo1036Q(z01);
            if (x01Mo1036Q != null) {
                z01 = x01Mo1036Q;
            }
            return AbstractC7230yu.m26274e(z01);
        }
        C11494w21 c11494w21 = new C11494w21();
        c1622Zm.m9595h();
        ArrayDeque arrayDeque = (ArrayDeque) c1622Zm.f15119g;
        O90.m5965c(arrayDeque);
        C11748y21 c11748y21 = (C11748y21) c1622Zm.f15120h;
        O90.m5965c(c11748y21);
        arrayDeque.push(z01);
        while (!arrayDeque.isEmpty()) {
            if (c11748y21.f46049b > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + z01 + ". Supertypes = " + AbstractC7167xu.m25962H(c11748y21, null, null, null, null, 63)).toString());
            }
            Z01 z012 = (Z01) arrayDeque.pop();
            O90.m5965c(z012);
            if (c11748y21.add(z012)) {
                EnumC6262jq enumC6262jq2 = EnumC6262jq.f35417a;
                X01 x01Mo1036Q2 = interfaceC0810Ms.mo1036Q(z012);
                if (x01Mo1036Q2 == null) {
                    x01Mo1036Q2 = z012;
                }
                boolean zMo1075h0 = interfaceC0810Ms.mo1075h0(interfaceC0810Ms.mo1047W(x01Mo1036Q2), interfaceC8153Qd1);
                C7997Nd1 c7997Nd1 = C7997Nd1.f7929c;
                if (zMo1075h0) {
                    c11494w21.add(x01Mo1036Q2);
                    abstractC10154lZ1Mo1024J = c7997Nd1;
                } else {
                    abstractC10154lZ1Mo1024J = interfaceC0810Ms.mo1054a(x01Mo1036Q2) == 0 ? C7997Nd1.f7928b : interfaceC0810Ms.mo1024J(x01Mo1036Q2);
                }
                if (abstractC10154lZ1Mo1024J.equals(c7997Nd1)) {
                    abstractC10154lZ1Mo1024J = null;
                }
                if (abstractC10154lZ1Mo1024J != null) {
                    Iterator it = interfaceC0810Ms.mo1116z(interfaceC0810Ms.mo1047W(z012)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(abstractC10154lZ1Mo1024J.mo5127b(c1622Zm, (InterfaceC7950Mg0) it.next()));
                    }
                }
            }
        }
        c1622Zm.m9593f();
        return c11494w21;
    }

    /* renamed from: n */
    public static List m25019n(C1622Zm c1622Zm, Z01 z01, InterfaceC8153Qd1 interfaceC8153Qd1) {
        int i;
        List listM25018m = m25018m(c1622Zm, z01, interfaceC8153Qd1);
        if (listM25018m.size() < 2) {
            return listM25018m;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM25018m) {
            InterfaceC0810Ms interfaceC0810Ms = (InterfaceC0810Ms) c1622Zm.f15116d;
            InterfaceC7737Id1 interfaceC7737Id1Mo1077i = interfaceC0810Ms.mo1077i((Z01) obj);
            int iMo1074h = interfaceC0810Ms.mo1074h(interfaceC7737Id1Mo1077i);
            while (true) {
                if (i >= iMo1074h) {
                    arrayList.add(obj);
                    break;
                }
                i = interfaceC0810Ms.mo1099p0(interfaceC0810Ms.mo1038R(interfaceC0810Ms.mo1113x0(interfaceC7737Id1Mo1077i, i))) == null ? i + 1 : 0;
            }
        }
        return !arrayList.isEmpty() ? arrayList : listM25018m;
    }

    /* renamed from: o */
    public static boolean m25020o(C1622Zm c1622Zm, InterfaceC7950Mg0 interfaceC7950Mg0, InterfaceC7950Mg0 interfaceC7950Mg02) {
        O90.m5968f(interfaceC7950Mg0, "a");
        O90.m5968f(interfaceC7950Mg02, "b");
        if (interfaceC7950Mg0 == interfaceC7950Mg02) {
            return true;
        }
        C6914tt c6914tt = f43391b;
        InterfaceC0810Ms interfaceC0810Ms = (InterfaceC0810Ms) c1622Zm.f15116d;
        if (m25022q(interfaceC0810Ms, interfaceC7950Mg0) && m25022q(interfaceC0810Ms, interfaceC7950Mg02)) {
            AbstractC8315Tg1 abstractC8315Tg1M9596k = c1622Zm.m9596k(c1622Zm.m9597l(interfaceC7950Mg0));
            AbstractC8315Tg1 abstractC8315Tg1M9596k2 = c1622Zm.m9596k(c1622Zm.m9597l(interfaceC7950Mg02));
            X01 x01Mo1112x = interfaceC0810Ms.mo1112x(abstractC8315Tg1M9596k);
            if (!interfaceC0810Ms.mo1075h0(interfaceC0810Ms.mo1101q0(abstractC8315Tg1M9596k), interfaceC0810Ms.mo1101q0(abstractC8315Tg1M9596k2))) {
                return false;
            }
            if (interfaceC0810Ms.mo1054a(x01Mo1112x) == 0) {
                return interfaceC0810Ms.mo1107u(abstractC8315Tg1M9596k) || interfaceC0810Ms.mo1107u(abstractC8315Tg1M9596k2) || interfaceC0810Ms.mo1090m0(x01Mo1112x) == interfaceC0810Ms.mo1090m0(interfaceC0810Ms.mo1112x(abstractC8315Tg1M9596k2));
            }
        }
        return m25024s(c6914tt, c1622Zm, interfaceC7950Mg0, interfaceC7950Mg02) && m25024s(c6914tt, c1622Zm, interfaceC7950Mg02, interfaceC7950Mg0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0062, code lost:
    
        return r6.mo1072g0(r6.mo1101q0(r7), r2);
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.InterfaceC10292me1 m25021p(p000.InterfaceC0810Ms r6, p000.InterfaceC7950Mg0 r7, p000.Z01 r8) {
        /*
            int r0 = r6.mo1054a(r7)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L66
            qe1 r4 = r6.mo1009A0(r7, r2)
            boolean r5 = r6.mo1096o0(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L63
            Tg1 r3 = r6.mo1038R(r3)
            if (r3 != 0) goto L1d
            goto L63
        L1d:
            X01 r4 = r6.mo1112x(r3)
            Z01 r4 = r6.mo1117z0(r4)
            boolean r4 = r6.mo1049X(r4)
            if (r4 == 0) goto L3b
            X01 r4 = r6.mo1112x(r8)
            Z01 r4 = r6.mo1117z0(r4)
            boolean r4 = r6.mo1049X(r4)
            if (r4 == 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r5 = r3.equals(r8)
            if (r5 != 0) goto L5a
            if (r4 == 0) goto L53
            Pd1 r4 = r6.mo1101q0(r3)
            Pd1 r5 = r6.mo1101q0(r8)
            boolean r4 = p000.O90.m5963a(r4, r5)
            if (r4 == 0) goto L53
            goto L5a
        L53:
            me1 r3 = m25021p(r6, r3, r8)
            if (r3 == 0) goto L63
            return r3
        L5a:
            Pd1 r7 = r6.mo1101q0(r7)
            me1 r6 = r6.mo1072g0(r7, r2)
            return r6
        L63:
            int r2 = r2 + 1
            goto L6
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6914tt.m25021p(Ms, Mg0, Z01):me1");
    }

    /* renamed from: q */
    public static boolean m25022q(InterfaceC0810Ms interfaceC0810Ms, InterfaceC7950Mg0 interfaceC7950Mg0) {
        if (interfaceC0810Ms.mo1008A(interfaceC0810Ms.mo1101q0(interfaceC7950Mg0))) {
            interfaceC0810Ms.mo1080j(interfaceC7950Mg0);
            if (!interfaceC0810Ms.mo1021H(interfaceC7950Mg0) && !interfaceC0810Ms.mo1087l0(interfaceC7950Mg0) && O90.m5963a(interfaceC0810Ms.mo1047W(interfaceC0810Ms.mo1112x(interfaceC7950Mg0)), interfaceC0810Ms.mo1047W(interfaceC0810Ms.mo1045V(interfaceC7950Mg0)))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m25023r(C1622Zm c1622Zm, InterfaceC7737Id1 interfaceC7737Id1, Z01 z01) {
        boolean zM25024s;
        O90.m5968f(interfaceC7737Id1, "capturedSubArguments");
        InterfaceC0810Ms interfaceC0810Ms = (InterfaceC0810Ms) c1622Zm.f15116d;
        InterfaceC8101Pd1 interfaceC8101Pd1Mo1047W = interfaceC0810Ms.mo1047W(z01);
        int iMo1074h = interfaceC0810Ms.mo1074h(interfaceC7737Id1);
        int iMo1040S = interfaceC0810Ms.mo1040S(interfaceC8101Pd1Mo1047W);
        if (iMo1074h != iMo1040S || iMo1074h != interfaceC0810Ms.mo1054a(z01)) {
            return false;
        }
        for (int i = 0; i < iMo1040S; i++) {
            AbstractC10804qe1 abstractC10804qe1Mo1009A0 = interfaceC0810Ms.mo1009A0(z01, i);
            if (!interfaceC0810Ms.mo1096o0(abstractC10804qe1Mo1009A0)) {
                AbstractC8315Tg1 abstractC8315Tg1Mo1038R = interfaceC0810Ms.mo1038R(abstractC10804qe1Mo1009A0);
                AbstractC10804qe1 abstractC10804qe1Mo1113x0 = interfaceC0810Ms.mo1113x0(interfaceC7737Id1, i);
                interfaceC0810Ms.mo1028M(abstractC10804qe1Mo1113x0);
                EnumC7531Ee1 enumC7531Ee1 = EnumC7531Ee1.f2821d;
                AbstractC8315Tg1 abstractC8315Tg1Mo1038R2 = interfaceC0810Ms.mo1038R(abstractC10804qe1Mo1113x0);
                EnumC7531Ee1 enumC7531Ee1Mo1098p = interfaceC0810Ms.mo1098p(interfaceC0810Ms.mo1072g0(interfaceC8101Pd1Mo1047W, i));
                EnumC7531Ee1 enumC7531Ee1Mo1028M = interfaceC0810Ms.mo1028M(abstractC10804qe1Mo1009A0);
                if (enumC7531Ee1Mo1098p == enumC7531Ee1) {
                    enumC7531Ee1Mo1098p = enumC7531Ee1Mo1028M;
                } else if (enumC7531Ee1Mo1028M != enumC7531Ee1 && enumC7531Ee1Mo1098p != enumC7531Ee1Mo1028M) {
                    enumC7531Ee1Mo1098p = null;
                }
                if (enumC7531Ee1Mo1098p == null) {
                    return c1622Zm.f15114b;
                }
                C6914tt c6914tt = f43391b;
                if (enumC7531Ee1Mo1098p == enumC7531Ee1) {
                    m25025t(interfaceC0810Ms, abstractC8315Tg1Mo1038R2, abstractC8315Tg1Mo1038R);
                    m25025t(interfaceC0810Ms, abstractC8315Tg1Mo1038R, abstractC8315Tg1Mo1038R2);
                }
                int i2 = c1622Zm.f15113a;
                if (i2 > 100) {
                    throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + abstractC8315Tg1Mo1038R2).toString());
                }
                c1622Zm.f15113a = i2 + 1;
                int iOrdinal = enumC7531Ee1Mo1098p.ordinal();
                if (iOrdinal == 0) {
                    zM25024s = m25024s(c6914tt, c1622Zm, abstractC8315Tg1Mo1038R, abstractC8315Tg1Mo1038R2);
                } else if (iOrdinal == 1) {
                    zM25024s = m25024s(c6914tt, c1622Zm, abstractC8315Tg1Mo1038R2, abstractC8315Tg1Mo1038R);
                } else {
                    if (iOrdinal != 2) {
                        throw new C6838sg();
                    }
                    zM25024s = m25020o(c1622Zm, abstractC8315Tg1Mo1038R2, abstractC8315Tg1Mo1038R);
                }
                c1622Zm.f15113a--;
                if (!zM25024s) {
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
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m25024s(p000.C6914tt r24, p000.C1622Zm r25, p000.InterfaceC7950Mg0 r26, p000.InterfaceC7950Mg0 r27) {
        /*
            Method dump skipped, instructions count: 1436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C6914tt.m25024s(tt, Zm, Mg0, Mg0):boolean");
    }

    /* renamed from: t */
    public static void m25025t(InterfaceC0810Ms interfaceC0810Ms, InterfaceC7950Mg0 interfaceC7950Mg0, InterfaceC7950Mg0 interfaceC7950Mg02) {
        InterfaceC6595p5 interfaceC6595p5Mo1102r = interfaceC0810Ms.mo1102r(interfaceC7950Mg0);
        if (interfaceC6595p5Mo1102r instanceof InterfaceC6642pq) {
            InterfaceC6642pq interfaceC6642pq = (InterfaceC6642pq) interfaceC6595p5Mo1102r;
            if (!interfaceC0810Ms.mo1057b(interfaceC6642pq) && interfaceC0810Ms.mo1096o0(interfaceC0810Ms.mo1104s(interfaceC0810Ms.mo1092n(interfaceC6642pq))) && interfaceC0810Ms.mo1018F(interfaceC6642pq) == EnumC6262jq.f35417a) {
                interfaceC0810Ms.mo1101q0(interfaceC7950Mg02);
            }
        }
    }

    /* renamed from: u */
    public static EnumC10575os0 m25026u(EnumC9985kF0 enumC9985kF0) {
        int i = enumC9985kF0 == null ? -1 : UF0.f11706a[enumC9985kF0.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? EnumC10575os0.f39323b : EnumC10575os0.f39324c : EnumC10575os0.f39326e : EnumC10575os0.f39325d : EnumC10575os0.f39323b;
    }

    /* renamed from: v */
    public static int m25027v(EnumC10561ol0 enumC10561ol0) {
        switch (enumC10561ol0.ordinal()) {
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
                throw new C6838sg();
        }
    }

    @Override // p000.InterfaceC1091RL
    /* renamed from: a */
    public InterfaceC0715LL mo6995a(C0903OL c0903ol, C6686qX c6686qX) {
        if (c6686qX.f40978q == null) {
            return null;
        }
        return new C4114gP(new C0652KL(AuthCode.StatusCode.WAITING_CONNECT, new C8263Sg1()));
    }

    @Override // p000.InterfaceC0236Dk
    /* renamed from: b */
    public byte[] mo1864b(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // p000.InterfaceC8398Uw0
    /* renamed from: c */
    public Object mo913c() {
        return new LinkedHashMap();
    }

    @Override // p000.InterfaceC1091RL
    /* renamed from: d */
    public /* synthetic */ InterfaceC1029QL mo6996d(C0903OL c0903ol, C6686qX c6686qX) {
        return InterfaceC1029QL.f9589p0;
    }

    @Override // p000.InterfaceC1091RL
    /* renamed from: e */
    public /* synthetic */ void mo6997e() {
    }

    @Override // p000.InterfaceC6364lS
    /* renamed from: f */
    public void mo22428f(Object obj) {
        ((List) obj).clear();
    }

    @Override // com.p019vk.push.core.filedatastore.JsonDeserializer
    public Object fromJson(JSONObject jSONObject) throws JSONException {
        O90.m5968f(jSONObject, "<this>");
        String string = jSONObject.getString("push_token");
        O90.m5967e(string, "getString(\"push_token\")");
        return new C10446nr1(string);
    }

    @Override // p000.InterfaceC0750Lv
    /* renamed from: g */
    public Object mo390g(C8128Pr0 c8128Pr0) {
        switch (this.f43398a) {
            case 7:
                return new C9937jt0(c8128Pr0.m6460z(AbstractC9809it0.class));
            default:
                return new MO1((C8906bs0) c8128Pr0.mo4066a(C8906bs0.class));
        }
    }

    @Override // p000.InterfaceC1127Rv
    public int getId() {
        return 2;
    }

    @Override // p000.InterfaceC1127Rv
    /* renamed from: h */
    public boolean mo7128h(ArrayList arrayList, long j) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC6700ql interfaceC6700ql = (InterfaceC6700ql) it.next();
            if (interfaceC6700ql != null && !interfaceC6700ql.mo7464S(j)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC1091RL
    /* renamed from: j */
    public int mo6999j(C6686qX c6686qX) {
        return c6686qX.f40978q != null ? 1 : 0;
    }

    @Override // p000.InterfaceC1091RL
    public /* synthetic */ void release() {
    }

    @Override // p000.InterfaceC10378nJ1
    public Object zza() {
        switch (this.f43398a) {
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                PW1.f9104b.get();
                return Integer.valueOf((int) ((Long) UW1.f11839G.m8754a()).longValue());
            default:
                C10022kX1.f36525b.get();
                Boolean bool = (Boolean) C10790qX1.f41019a.m8754a();
                bool.getClass();
                return bool;
        }
    }

    public /* synthetic */ C6914tt(int i, Object obj) {
        this.f43398a = i;
    }

    @Override // p000.V01
    public void lock() {
    }

    @Override // p000.V01
    public void unlock() {
    }

    @Override // p000.InterfaceC8088Ox0
    public void onComplete(Throwable th) {
    }

    @Override // p000.InterfaceC1091RL
    /* renamed from: i */
    public void mo6998i(Looper looper, NB0 nb0) {
    }
}
