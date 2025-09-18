package p000;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class U41 implements InterfaceC6658q5, InterfaceC0006A5 {

    /* renamed from: a */
    public Object f11644a;

    /* renamed from: b */
    public Object f11645b;

    /* renamed from: c */
    public Object f11646c;

    /* renamed from: d */
    public Object f11647d;

    /* renamed from: e */
    public Object f11648e;

    /* renamed from: f */
    public Object f11649f;

    public U41(String str, String str2, String str3, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(str, str3, bool, reactApplicationContext);
        this.f11647d = str2;
    }

    /* renamed from: n */
    public static final AbstractC0249Dx m7873n(U41 u41, C8340Tt0 c8340Tt0, Object obj) {
        AbstractC0249Dx abstractC0249DxM920j = C7408Bv0.f1078c.m920j(obj, (C7454Cs0) u41.f11646c);
        if (abstractC0249DxM920j != null) {
            return abstractC0249DxM920j;
        }
        String str = "Unsupported annotation argument: " + c8340Tt0;
        O90.m5968f(str, "message");
        return new C6361lP(str);
    }

    /* renamed from: q */
    public static /* synthetic */ List m7874q(U41 u41, AbstractC7598Fm0 abstractC7598Fm0, C10315mq0 c10315mq0, boolean z, Boolean bool, boolean z2, int i) {
        boolean z3 = (i & 4) != 0 ? false : z;
        if ((i & 16) != 0) {
            bool = null;
        }
        return u41.m7883p(abstractC7598Fm0, c10315mq0, z3, false, bool, (i & 32) != 0 ? false : z2);
    }

    /* renamed from: r */
    public static C10315mq0 m7875r(AbstractC11487w00 abstractC11487w00, InterfaceC8392Ut0 interfaceC8392Ut0, C10226m71 c10226m71, int i, boolean z) {
        O90.m5968f(abstractC11487w00, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        O90.m5968f(c10226m71, "typeTable");
        AbstractC0852NX.m5764m(i, "kind");
        if (abstractC11487w00 instanceof VE0) {
            C0217DR c0217dr = C7788Jd0.f5651a;
            C10289md0 c10289md0M4370a = C7788Jd0.m4370a((VE0) abstractC11487w00, interfaceC8392Ut0, c10226m71);
            if (c10289md0M4370a == null) {
                return null;
            }
            return MA1.m5280a(c10289md0M4370a);
        }
        if (abstractC11487w00 instanceof C9729iF0) {
            C0217DR c0217dr2 = C7788Jd0.f5651a;
            C10289md0 c10289md0M4372c = C7788Jd0.m4372c((C9729iF0) abstractC11487w00, interfaceC8392Ut0, c10226m71);
            if (c10289md0M4372c == null) {
                return null;
            }
            return MA1.m5280a(c10289md0M4372c);
        }
        if (!(abstractC11487w00 instanceof C10753qF0)) {
            return null;
        }
        C11741y00 c11741y00 = AbstractC7736Id0.f5052d;
        O90.m5967e(c11741y00, "propertySignature");
        C7424Cd0 c7424Cd0 = (C7424Cd0) XM1.m8993a(abstractC11487w00, c11741y00);
        if (c7424Cd0 == null) {
            return null;
        }
        int iM26247x = AbstractC7222ym.m26247x(i);
        if (iM26247x == 1) {
            return RL1.m7001b((C10753qF0) abstractC11487w00, interfaceC8392Ut0, c10226m71, true, true, z);
        }
        if (iM26247x == 2) {
            if ((c7424Cd0.f1496b & 4) != 4) {
                return null;
            }
            C7320Ad0 c7320Ad0 = c7424Cd0.f1499e;
            O90.m5967e(c7320Ad0, "getGetter(...)");
            return new C10315mq0(interfaceC8392Ut0.getString(c7320Ad0.f293c).concat(interfaceC8392Ut0.getString(c7320Ad0.f294d)));
        }
        if (iM26247x != 3 || (c7424Cd0.f1496b & 8) != 8) {
            return null;
        }
        C7320Ad0 c7320Ad02 = c7424Cd0.f1500f;
        O90.m5967e(c7320Ad02, "getSetter(...)");
        return new C10315mq0(interfaceC8392Ut0.getString(c7320Ad02.f293c).concat(interfaceC8392Ut0.getString(c7320Ad02.f294d)));
    }

    /* renamed from: A */
    public C10030kb1 m7876A(C0055As c0055As, UO0 uo0, List list) {
        O90.m5968f(list, "result");
        if (AbstractC9833j31.f34894a.contains(c0055As)) {
            return null;
        }
        return m7891z(c0055As, uo0, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0038  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m7877B(p000.AbstractC7598Fm0 r10, p000.C10753qF0 r11, int r12, p000.AbstractC7742Ig0 r13, kotlin.jvm.functions.Function2 r14) {
        /*
            r9 = this;
            WV r0 = p000.AbstractC1605ZV.f14912B
            int r1 = r11.f40688d
            java.lang.Boolean r5 = r0.m8799c(r1)
            boolean r6 = p000.C7788Jd0.m4373d(r11)
            java.lang.Object r0 = r9.f11649f
            r8 = r0
            nd0 r8 = (p000.C10417nd0) r8
            java.lang.Object r0 = r9.f11644a
            r7 = r0
            Tu0 r7 = (p000.C8342Tu0) r7
            r3 = 1
            r4 = 1
            r2 = r10
            xP0 r0 = p000.QL1.m6672h(r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            if (r0 != 0) goto L39
            boolean r0 = r10 instanceof p000.PF0
            if (r0 == 0) goto L38
            r0 = r10
            PF0 r0 = (p000.PF0) r0
            java.lang.Object r0 = r0.f3416d
            W21 r0 = (p000.W21) r0
            boolean r2 = r0 instanceof p000.C7534Eg0
            if (r2 == 0) goto L32
            Eg0 r0 = (p000.C7534Eg0) r0
            goto L33
        L32:
            r0 = r1
        L33:
            if (r0 == 0) goto L38
            xP0 r0 = r0.f2836a
            goto L39
        L38:
            r0 = r1
        L39:
            if (r0 != 0) goto L3c
            return r1
        L3c:
            je r2 = r0.f45573b
            java.lang.Object r2 = r2.f35300e
            nd0 r2 = (p000.C10417nd0) r2
            nd0 r3 = p000.C0712LI.f6601e
            java.lang.String r4 = "version"
            p000.O90.m5968f(r3, r4)
            int r4 = r3.f43217b
            int r5 = r3.f43218c
            int r3 = r3.f43219d
            boolean r2 = r2.m24967a(r4, r5, r3)
            java.lang.Object r3 = r10.f3414b
            Ut0 r3 = (p000.InterfaceC8392Ut0) r3
            java.lang.Object r10 = r10.f3415c
            m71 r10 = (p000.C10226m71) r10
            mq0 r10 = m7875r(r11, r3, r10, r12, r2)
            if (r10 != 0) goto L62
            return r1
        L62:
            java.lang.Object r11 = r9.f11645b
            Sk0 r11 = (p000.C8270Sk0) r11
            java.lang.Object r11 = r11.invoke(r0)
            java.lang.Object r10 = r14.invoke(r11, r10)
            if (r10 != 0) goto L71
            return r1
        L71:
            boolean r11 = p000.AbstractC8211Rg1.m7086a(r13)
            if (r11 == 0) goto Lca
            Dx r10 = (p000.AbstractC0249Dx) r10
            boolean r11 = r10 instanceof p000.C0614Jk
            if (r11 == 0) goto L8e
            Ve1 r11 = new Ve1
            Jk r10 = (p000.C0614Jk) r10
            java.lang.Object r10 = r10.f2329a
            java.lang.Number r10 = (java.lang.Number) r10
            byte r10 = r10.byteValue()
            r11.<init>(r10)
        L8c:
            r10 = r11
            goto Lca
        L8e:
            boolean r11 = r10 instanceof p000.C11360v01
            if (r11 == 0) goto La2
            Ve1 r11 = new Ve1
            v01 r10 = (p000.C11360v01) r10
            java.lang.Object r10 = r10.f2329a
            java.lang.Number r10 = (java.lang.Number) r10
            short r10 = r10.shortValue()
            r11.<init>(r10)
            goto L8c
        La2:
            boolean r11 = r10 instanceof p000.C9589h90
            if (r11 == 0) goto Lb6
            Ve1 r11 = new Ve1
            h90 r10 = (p000.C9589h90) r10
            java.lang.Object r10 = r10.f2329a
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r11.<init>(r10)
            goto L8c
        Lb6:
            boolean r11 = r10 instanceof p000.C7596Fl0
            if (r11 == 0) goto Lca
            Ve1 r11 = new Ve1
            Fl0 r10 = (p000.C7596Fl0) r10
            java.lang.Object r10 = r10.f2329a
            java.lang.Number r10 = (java.lang.Number) r10
            long r12 = r10.longValue()
            r11.<init>(r12)
            goto L8c
        Lca:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.U41.m7877B(Fm0, qF0, int, Ig0, kotlin.jvm.functions.Function2):java.lang.Object");
    }

    /* renamed from: C */
    public List m7878C(AbstractC7598Fm0 abstractC7598Fm0, C10753qF0 c10753qF0, EnumC0000A enumC0000A) {
        Boolean boolM8799c = AbstractC1605ZV.f14912B.m8799c(c10753qF0.f40688d);
        boolean zM4373d = C7788Jd0.m4373d(c10753qF0);
        EnumC0000A enumC0000A2 = EnumC0000A.f0a;
        C0779MN c0779mn = C0779MN.f7117a;
        if (enumC0000A == enumC0000A2) {
            C10315mq0 c10315mq0M7001b = RL1.m7001b(c10753qF0, (InterfaceC8392Ut0) abstractC7598Fm0.f3414b, (C10226m71) abstractC7598Fm0.f3415c, (40 & 8) != 0 ? false : false, (40 & 16) != 0 ? false : true, true);
            return c10315mq0M7001b == null ? c0779mn : m7874q(this, abstractC7598Fm0, c10315mq0M7001b, true, boolM8799c, zM4373d, 8);
        }
        C10315mq0 c10315mq0M7001b2 = RL1.m7001b(c10753qF0, (InterfaceC8392Ut0) abstractC7598Fm0.f3414b, (C10226m71) abstractC7598Fm0.f3415c, (40 & 8) != 0 ? false : true, (40 & 16) != 0 ? false : false, true);
        if (c10315mq0M7001b2 == null) {
            return c0779mn;
        }
        return AbstractC11374v51.m25351p(c10315mq0M7001b2.f37960a, "$delegate", false) != (enumC0000A == EnumC0000A.f2c) ? c0779mn : m7883p(abstractC7598Fm0, c10315mq0M7001b2, true, true, boolM8799c, zM4373d);
    }

    /* renamed from: D */
    public void m7879D(E71 e71) {
        synchronized (this.f11644a) {
            ((LinkedHashSet) this.f11648e).add(e71);
        }
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: a */
    public List mo41a(AbstractC7598Fm0 abstractC7598Fm0, AbstractC11487w00 abstractC11487w00, int i) {
        O90.m5968f(abstractC11487w00, "proto");
        AbstractC0852NX.m5764m(i, "kind");
        C10315mq0 c10315mq0M7875r = m7875r(abstractC11487w00, (InterfaceC8392Ut0) abstractC7598Fm0.f3414b, (C10226m71) abstractC7598Fm0.f3415c, i, false);
        return c10315mq0M7875r != null ? m7874q(this, abstractC7598Fm0, new C10315mq0(AbstractC1374Vq.m8593l(new StringBuilder(), c10315mq0M7875r.f37960a, "@0")), false, null, false, 60) : C0779MN.f7117a;
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: b */
    public List mo42b(AbstractC7598Fm0 abstractC7598Fm0, C10753qF0 c10753qF0) {
        O90.m5968f(c10753qF0, "proto");
        return m7878C(abstractC7598Fm0, c10753qF0, EnumC0000A.f1b);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x002d  */
    @Override // p000.InterfaceC0006A5
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List mo43c(p000.AbstractC7598Fm0 r9, p000.AbstractC11487w00 r10, int r11, int r12, p000.IF0 r13) {
        /*
            r8 = this;
            java.lang.String r13 = "callableProto"
            p000.O90.m5968f(r10, r13)
            java.lang.String r13 = "kind"
            p000.AbstractC0852NX.m5764m(r11, r13)
            java.lang.Object r13 = r9.f3414b
            Ut0 r13 = (p000.InterfaceC8392Ut0) r13
            java.lang.Object r0 = r9.f3415c
            m71 r0 = (p000.C10226m71) r0
            r1 = 0
            mq0 r11 = m7875r(r10, r13, r0, r11, r1)
            if (r11 == 0) goto L93
            boolean r13 = r10 instanceof p000.C9729iF0
            r0 = 64
            r2 = 1
            if (r13 == 0) goto L2f
            iF0 r10 = (p000.C9729iF0) r10
            boolean r13 = r10.m18989p()
            if (r13 != 0) goto L2d
            int r10 = r10.f28982c
            r10 = r10 & r0
            if (r10 != r0) goto L55
        L2d:
            r1 = r2
            goto L55
        L2f:
            boolean r13 = r10 instanceof p000.C10753qF0
            if (r13 == 0) goto L41
            qF0 r10 = (p000.C10753qF0) r10
            boolean r13 = r10.m23957p()
            if (r13 != 0) goto L2d
            int r10 = r10.f40687c
            r10 = r10 & r0
            if (r10 != r0) goto L55
            goto L2d
        L41:
            boolean r13 = r10 instanceof p000.VE0
            if (r13 == 0) goto L7b
            r10 = r9
            PF0 r10 = (p000.PF0) r10
            SE0 r13 = p000.SE0.ENUM_CLASS
            SE0 r3 = r10.f8948h
            if (r3 != r13) goto L50
            r1 = 2
            goto L55
        L50:
            boolean r10 = r10.f8949i
            if (r10 == 0) goto L55
            goto L2d
        L55:
            int r12 = r12 + r1
            mq0 r3 = new mq0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r11.f37960a
            r10.append(r11)
            r10.append(r0)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r3.<init>(r10)
            r5 = 0
            r6 = 0
            r4 = 0
            r7 = 60
            r1 = r8
            r2 = r9
            java.util.List r9 = m7874q(r1, r2, r3, r4, r5, r6, r7)
            return r9
        L7b:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported message: "
            r11.<init>(r12)
            java.lang.Class r10 = r10.getClass()
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L93:
            MN r9 = p000.C0779MN.f7117a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.U41.mo43c(Fm0, w00, int, int, IF0):java.util.List");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:81|83|(2:85|(1:87)(1:88))(0)|89|(1:(1:92)(2:93|94))(2:95|(2:97|(1:99)(1:100))(19:102|103|(2:111|(1:113)(1:114))(2:108|(1:110)(0))|115|(1:123)(2:160|120)|124|(1:131)(3:126|(1:129)|(0))|132|(2:137|(1:141))(1:136)|143|(1:145)|146|(1:148)|(1:150)(1:151)|152|158|153|156|157))|101|103|(3:105|111|(0)(0))(0)|115|(2:117|123)(0)|124|(0)(0)|132|(3:134|137|(2:139|141)(1:142))(0)|143|(0)|146|(0)|(0)(0)|152|158|153|156|157) */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0223, code lost:
    
        com.vk.push.common.Logger.DefaultImpls.warn$default(r12, "Post notification permission is missing", null, 2, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0017  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m7880d(com.p019vk.push.common.messaging.NotificationPayload r19, int r20, kotlin.Pair r21, com.p019vk.push.common.messaging.NotificationAnalyticsPayload r22, p000.AbstractC1571Yy r23) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.U41.m7880d(com.vk.push.common.messaging.NotificationPayload, int, kotlin.Pair, com.vk.push.common.messaging.NotificationAnalyticsPayload, Yy):java.lang.Object");
    }

    @Override // p000.InterfaceC6658q5
    /* renamed from: e */
    public Object mo2292e(AbstractC7598Fm0 abstractC7598Fm0, C10753qF0 c10753qF0, AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(c10753qF0, "proto");
        return m7877B(abstractC7598Fm0, c10753qF0, 3, abstractC7742Ig0, C7173y.f45976f);
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: f */
    public ArrayList mo44f(AF0 af0, InterfaceC8392Ut0 interfaceC8392Ut0) {
        O90.m5968f(af0, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        Object objM25537k = af0.m25537k(AbstractC7736Id0.f5054f);
        O90.m5967e(objM25537k, "getExtension(...)");
        Iterable<QE0> iterable = (Iterable) objM25537k;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(iterable));
        for (QE0 qe0 : iterable) {
            O90.m5965c(qe0);
            arrayList.add(((C9108dO1) this.f11648e).m17575s(qe0, interfaceC8392Ut0));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: g */
    public ArrayList mo45g(FF0 ff0, InterfaceC8392Ut0 interfaceC8392Ut0) {
        O90.m5968f(ff0, "proto");
        O90.m5968f(interfaceC8392Ut0, "nameResolver");
        Object objM25537k = ff0.m25537k(AbstractC7736Id0.f5056h);
        O90.m5967e(objM25537k, "getExtension(...)");
        Iterable<QE0> iterable = (Iterable) objM25537k;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(iterable));
        for (QE0 qe0 : iterable) {
            O90.m5965c(qe0);
            arrayList.add(((C9108dO1) this.f11648e).m17575s(qe0, interfaceC8392Ut0));
        }
        return arrayList;
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: h */
    public List mo46h(AbstractC7598Fm0 abstractC7598Fm0, AbstractC11487w00 abstractC11487w00, int i) {
        O90.m5968f(abstractC11487w00, "proto");
        AbstractC0852NX.m5764m(i, "kind");
        if (i == 2) {
            return m7878C(abstractC7598Fm0, (C10753qF0) abstractC11487w00, EnumC0000A.f0a);
        }
        C10315mq0 c10315mq0M7875r = m7875r(abstractC11487w00, (InterfaceC8392Ut0) abstractC7598Fm0.f3414b, (C10226m71) abstractC7598Fm0.f3415c, i, false);
        return c10315mq0M7875r == null ? C0779MN.f7117a : m7874q(this, abstractC7598Fm0, c10315mq0M7875r, false, null, false, 60);
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: i */
    public List mo47i(AbstractC7598Fm0 abstractC7598Fm0, C10753qF0 c10753qF0) {
        O90.m5968f(c10753qF0, "proto");
        return m7878C(abstractC7598Fm0, c10753qF0, EnumC0000A.f2c);
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: j */
    public ArrayList mo48j(PF0 pf0) {
        O90.m5968f(pf0, "container");
        W21 w21 = (W21) pf0.f3416d;
        C7534Eg0 c7534Eg0 = w21 instanceof C7534Eg0 ? (C7534Eg0) w21 : null;
        C11667xP0 c11667xP0 = c7534Eg0 != null ? c7534Eg0.f2836a : null;
        if (c11667xP0 == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + pf0.f8947g.m359b()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        Class cls = c11667xP0.f45572a;
        O90.m5968f(cls, "klass");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        O90.m5967e(declaredAnnotations, "getDeclaredAnnotations(...)");
        for (Annotation annotation : declaredAnnotations) {
            O90.m5965c(annotation);
            Class clsM6213b = P22.m6213b(P22.m6212a(annotation));
            C10030kb1 c10030kb1M7876A = m7876A(VO0.m8433a(clsM6213b), new UO0(annotation), arrayList);
            if (c10030kb1M7876A != null) {
                AbstractC9494gP1.m18520b(c10030kb1M7876A, annotation, clsM6213b);
            }
        }
        return arrayList;
    }

    @Override // p000.InterfaceC0006A5
    /* renamed from: k */
    public List mo49k(PF0 pf0, C9089dF0 c9089dF0) {
        O90.m5968f(pf0, "container");
        String string = ((InterfaceC8392Ut0) pf0.f3414b).getString(c9089dF0.f25901d);
        String strM1919b = AbstractC0244Ds.m1919b(pf0.f8947g.m360c());
        O90.m5968f(strM1919b, "desc");
        return m7874q(this, pf0, new C10315mq0(string + '#' + strM1919b), false, null, false, 60);
    }

    @Override // p000.InterfaceC6658q5
    /* renamed from: l */
    public Object mo2293l(AbstractC7598Fm0 abstractC7598Fm0, C10753qF0 c10753qF0, AbstractC7742Ig0 abstractC7742Ig0) {
        O90.m5968f(c10753qF0, "proto");
        return m7877B(abstractC7598Fm0, c10753qF0, 2, abstractC7742Ig0, C7173y.f45977g);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m7881m(java.lang.String r6, p000.AbstractC1571Yy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p000.C8651Zs1
            if (r0 == 0) goto L13
            r0 = r7
            Zs1 r0 = (p000.C8651Zs1) r0
            int r1 = r0.f15192d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15192d = r1
            goto L18
        L13:
            Zs1 r0 = new Zs1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f15190b
            Mz r1 = p000.EnumC0817Mz.f7418a
            int r2 = r0.f15192d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            U41 r6 = r0.f15189a
            p000.RQ1.m7017d(r7)     // Catch: p000.C7575Fa1 -> L4e
            goto L49
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            p000.RQ1.m7017d(r7)
            Vr1 r7 = new Vr1     // Catch: p000.C7575Fa1 -> L4d
            r2 = 1
            r7.<init>(r5, r6, r4, r2)     // Catch: p000.C7575Fa1 -> L4d
            r0.f15189a = r5     // Catch: p000.C7575Fa1 -> L4d
            r0.f15192d = r3     // Catch: p000.C7575Fa1 -> L4d
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r7 = p000.GY1.m3082a(r2, r7, r0)     // Catch: p000.C7575Fa1 -> L4d
            if (r7 != r1) goto L48
            return r1
        L48:
            r6 = r5
        L49:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch: p000.C7575Fa1 -> L4e
            r4 = r7
            goto L58
        L4d:
            r6 = r5
        L4e:
            java.lang.Object r6 = r6.f11649f
            com.vk.push.common.Logger r6 = (com.p019vk.push.common.Logger) r6
            java.lang.String r7 = "Unable to download image for 5000 ms"
            r0 = 2
            com.vk.push.common.Logger.DefaultImpls.warn$default(r6, r7, r4, r0, r4)
        L58:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.U41.m7881m(java.lang.String, Yy):java.lang.Object");
    }

    /* renamed from: o */
    public C6754rc m7882o() {
        String strM26232i = ((String) this.f11644a) == null ? " mimeType" : "";
        if (((Integer) this.f11645b) == null) {
            strM26232i = strM26232i.concat(" profile");
        }
        if (((EnumC11690xa1) this.f11646c) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " inputTimebase");
        }
        if (((Integer) this.f11647d) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " bitrate");
        }
        if (((Integer) this.f11648e) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " sampleRate");
        }
        if (((Integer) this.f11649f) == null) {
            strM26232i = AbstractC7222ym.m26232i(strM26232i, " channelCount");
        }
        if (!strM26232i.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strM26232i));
        }
        String str = (String) this.f11644a;
        int iIntValue = ((Integer) this.f11645b).intValue();
        C6754rc c6754rc = new C6754rc(str, iIntValue, (EnumC11690xa1) this.f11646c, ((Integer) this.f11647d).intValue(), ((Integer) this.f11648e).intValue(), ((Integer) this.f11649f).intValue());
        if (Objects.equals(str, "audio/mp4a-latm") && iIntValue == -1) {
            throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
        }
        return c6754rc;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List m7883p(p000.AbstractC7598Fm0 r9, p000.C10315mq0 r10, boolean r11, boolean r12, java.lang.Boolean r13, boolean r14) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f11649f
            r7 = r0
            nd0 r7 = (p000.C10417nd0) r7
            java.lang.Object r0 = r8.f11644a
            r6 = r0
            Tu0 r6 = (p000.C8342Tu0) r6
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            xP0 r11 = p000.QL1.m6672h(r1, r2, r3, r4, r5, r6, r7)
            if (r11 != 0) goto L2f
            boolean r11 = r9 instanceof p000.PF0
            r12 = 0
            if (r11 == 0) goto L2e
            PF0 r9 = (p000.PF0) r9
            java.lang.Object r9 = r9.f3416d
            W21 r9 = (p000.W21) r9
            boolean r11 = r9 instanceof p000.C7534Eg0
            if (r11 == 0) goto L27
            Eg0 r9 = (p000.C7534Eg0) r9
            goto L28
        L27:
            r9 = r12
        L28:
            if (r9 == 0) goto L2e
            xP0 r9 = r9.f2836a
            r11 = r9
            goto L2f
        L2e:
            r11 = r12
        L2f:
            MN r9 = p000.C0779MN.f7117a
            if (r11 != 0) goto L34
            return r9
        L34:
            java.lang.Object r12 = r8.f11645b
            Sk0 r12 = (p000.C8270Sk0) r12
            java.lang.Object r11 = r12.invoke(r11)
            J5 r11 = (p000.C0573J5) r11
            java.util.HashMap r11 = r11.f5331a
            java.lang.Object r10 = r11.get(r10)
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L49
            goto L4a
        L49:
            r9 = r10
        L4a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.U41.m7883p(Fm0, mq0, boolean, boolean, java.lang.Boolean, boolean):java.util.List");
    }

    /* renamed from: s */
    public ArrayList m7884s() {
        ArrayList arrayList;
        synchronized (this.f11644a) {
            arrayList = new ArrayList((LinkedHashSet) this.f11646c);
        }
        return arrayList;
    }

    /* renamed from: t */
    public ArrayList m7885t() {
        ArrayList arrayList;
        synchronized (this.f11644a) {
            arrayList = new ArrayList((LinkedHashSet) this.f11648e);
        }
        return arrayList;
    }

    /* renamed from: u */
    public ArrayList m7886u() {
        ArrayList arrayList;
        synchronized (this.f11644a) {
            arrayList = new ArrayList();
            arrayList.addAll(m7884s());
            arrayList.addAll(m7885t());
        }
        return arrayList;
    }

    /* renamed from: v */
    public Uri m7887v() throws IOException {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String str = (String) this.f11647d;
        if (str == null) {
            str = "*/*";
        }
        String extensionFromMimeType = singleton.getExtensionFromMimeType(str);
        boolean zM7888w = m7888w();
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.f11644a;
        if (zM7888w) {
            String strSubstring = ((Uri) this.f11646c).toString().substring(((String) this.f11647d).length() + 13);
            String str2 = (String) this.f11648e;
            if (str2 == null) {
                str2 = System.nanoTime() + "";
            }
            try {
                File file = new File(((Boolean) this.f11649f).booleanValue() ? reactApplicationContext.getCacheDir() : reactApplicationContext.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                }
                File file2 = new File(file, str2 + "." + extensionFromMimeType);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(Base64.decode(strSubstring, 0));
                fileOutputStream.flush();
                fileOutputStream.close();
                return RI0.m6934a(reactApplicationContext, file2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (m7890y()) {
            Uri uri = Uri.parse((String) this.f11645b);
            if (uri.getPath() == null) {
                return null;
            }
            return RI0.m6934a(reactApplicationContext, new File(uri.getPath()));
        }
        return null;
    }

    /* renamed from: w */
    public boolean m7888w() {
        Uri uri = (Uri) this.f11646c;
        if (uri.getScheme() == null || !uri.getScheme().equals("data")) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : uri.toString().substring(5).toCharArray()) {
            if (c == ';') {
                break;
            }
            sb.append(c);
        }
        this.f11647d = sb.toString();
        return true;
    }

    /* renamed from: x */
    public boolean m7889x(C0055As c0055As) {
        if (c0055As.m362f() == null || !O90.m5963a(c0055As.m365i().m7801b(), "Container")) {
            return false;
        }
        C11667xP0 c11667xP0M24605d = AbstractC6800s4.m24605d((C8342Tu0) this.f11644a, c0055As, (C10417nd0) this.f11649f);
        if (c11667xP0M24605d != null) {
            LinkedHashSet linkedHashSet = AbstractC9833j31.f34894a;
            Class cls = c11667xP0M24605d.f45572a;
            O90.m5968f(cls, "klass");
            Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
            O90.m5967e(declaredAnnotations, "getDeclaredAnnotations(...)");
            boolean z = false;
            for (Annotation annotation : declaredAnnotations) {
                O90.m5965c(annotation);
                if (VO0.m8433a(P22.m6213b(P22.m6212a(annotation))).equals(AbstractC7994Nc0.f7912b)) {
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public boolean m7890y() {
        Uri uri = (Uri) this.f11646c;
        if (uri.getScheme() == null || !(uri.getScheme().equals(RemoteMessageConst.Notification.CONTENT) || uri.getScheme().equals("file"))) {
            return false;
        }
        if (((String) this.f11647d) != null) {
            return true;
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null;
        this.f11647d = mimeTypeFromExtension;
        if (mimeTypeFromExtension == null) {
            String strM6936c = RI0.m6936c((ReactApplicationContext) this.f11644a, uri, (Boolean) this.f11649f);
            if (strM6936c == null) {
                return false;
            }
            String fileExtensionFromUrl2 = MimeTypeMap.getFileExtensionFromUrl(strM6936c);
            this.f11647d = fileExtensionFromUrl2 != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl2) : null;
        }
        if (((String) this.f11647d) == null) {
            this.f11647d = "*/*";
        }
        return true;
    }

    /* renamed from: z */
    public C10030kb1 m7891z(C0055As c0055As, W21 w21, List list) {
        O90.m5968f(list, "result");
        return new C10030kb1(this, AbstractC9060d12.m17467d((C7454Cs0) this.f11646c, c0055As, (T71) this.f11647d), c0055As, list, w21);
    }

    public U41(String str, String str2, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f11645b = str;
        this.f11646c = Uri.parse(str);
        this.f11648e = str2;
        this.f11649f = bool;
        this.f11644a = reactApplicationContext;
    }
}
