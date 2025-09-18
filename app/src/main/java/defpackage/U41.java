package defpackage;

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
public final class U41 implements InterfaceC6582q5, A5 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public U41(String str, String str2, String str3, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(str, str3, bool, reactApplicationContext);
        this.d = str2;
    }

    public static final AbstractC0323Dx n(U41 u41, C1559Tt0 c1559Tt0, Object obj) {
        AbstractC0323Dx abstractC0323DxJ = C0162Bv0.c.j(obj, (C0231Cs0) u41.c);
        if (abstractC0323DxJ != null) {
            return abstractC0323DxJ;
        }
        String str = "Unsupported annotation argument: " + c1559Tt0;
        O90.f(str, "message");
        return new C5687lP(str);
    }

    public static /* synthetic */ List q(U41 u41, AbstractC0447Fm0 abstractC0447Fm0, C5960mq0 c5960mq0, boolean z, Boolean bool, boolean z2, int i) {
        boolean z3 = (i & 4) != 0 ? false : z;
        if ((i & 16) != 0) {
            bool = null;
        }
        return u41.p(abstractC0447Fm0, c5960mq0, z3, false, bool, (i & 32) != 0 ? false : z2);
    }

    public static C5960mq0 r(AbstractC7709w00 abstractC7709w00, InterfaceC1637Ut0 interfaceC1637Ut0, C5826m71 c5826m71, int i, boolean z) {
        O90.f(abstractC7709w00, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        O90.f(c5826m71, "typeTable");
        NX.m(i, "kind");
        if (abstractC7709w00 instanceof VE0) {
            DR dr = C0732Jd0.a;
            C5921md0 c5921md0A = C0732Jd0.a((VE0) abstractC7709w00, interfaceC1637Ut0, c5826m71);
            if (c5921md0A == null) {
                return null;
            }
            return MA1.a(c5921md0A);
        }
        if (abstractC7709w00 instanceof C4309iF0) {
            DR dr2 = C0732Jd0.a;
            C5921md0 c5921md0C = C0732Jd0.c((C4309iF0) abstractC7709w00, interfaceC1637Ut0, c5826m71);
            if (c5921md0C == null) {
                return null;
            }
            return MA1.a(c5921md0C);
        }
        if (!(abstractC7709w00 instanceof C6613qF0)) {
            return null;
        }
        C8089y00 c8089y00 = AbstractC0654Id0.d;
        O90.e(c8089y00, "propertySignature");
        C0186Cd0 c0186Cd0 = (C0186Cd0) XM1.a(abstractC7709w00, c8089y00);
        if (c0186Cd0 == null) {
            return null;
        }
        int iX = AbstractC8235ym.x(i);
        if (iX == 1) {
            return RL1.b((C6613qF0) abstractC7709w00, interfaceC1637Ut0, c5826m71, true, true, z);
        }
        if (iX == 2) {
            if ((c0186Cd0.b & 4) != 4) {
                return null;
            }
            C0030Ad0 c0030Ad0 = c0186Cd0.e;
            O90.e(c0030Ad0, "getGetter(...)");
            return new C5960mq0(interfaceC1637Ut0.getString(c0030Ad0.c).concat(interfaceC1637Ut0.getString(c0030Ad0.d)));
        }
        if (iX != 3 || (c0186Cd0.b & 8) != 8) {
            return null;
        }
        C0030Ad0 c0030Ad02 = c0186Cd0.f;
        O90.e(c0030Ad02, "getSetter(...)");
        return new C5960mq0(interfaceC1637Ut0.getString(c0030Ad02.c).concat(interfaceC1637Ut0.getString(c0030Ad02.d)));
    }

    public C5534kb1 A(C0074As c0074As, UO0 uo0, List list) {
        O90.f(list, "result");
        if (AbstractC5240j31.a.contains(c0074As)) {
            return null;
        }
        return z(c0074As, uo0, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object B(defpackage.AbstractC0447Fm0 r10, defpackage.C6613qF0 r11, int r12, defpackage.AbstractC0663Ig0 r13, kotlin.jvm.functions.Function2 r14) {
        /*
            r9 = this;
            WV r0 = defpackage.ZV.B
            int r1 = r11.d
            java.lang.Boolean r5 = r0.c(r1)
            boolean r6 = defpackage.C0732Jd0.d(r11)
            java.lang.Object r0 = r9.f
            r8 = r0
            nd0 r8 = (defpackage.C6112nd0) r8
            java.lang.Object r0 = r9.a
            r7 = r0
            Tu0 r7 = (defpackage.C1562Tu0) r7
            r3 = 1
            r4 = 1
            r2 = r10
            xP0 r0 = defpackage.QL1.h(r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            if (r0 != 0) goto L39
            boolean r0 = r10 instanceof defpackage.PF0
            if (r0 == 0) goto L38
            r0 = r10
            PF0 r0 = (defpackage.PF0) r0
            java.lang.Object r0 = r0.d
            W21 r0 = (defpackage.W21) r0
            boolean r2 = r0 instanceof defpackage.C0351Eg0
            if (r2 == 0) goto L32
            Eg0 r0 = (defpackage.C0351Eg0) r0
            goto L33
        L32:
            r0 = r1
        L33:
            if (r0 == 0) goto L38
            xP0 r0 = r0.a
            goto L39
        L38:
            r0 = r1
        L39:
            if (r0 != 0) goto L3c
            return r1
        L3c:
            je r2 = r0.b
            java.lang.Object r2 = r2.e
            nd0 r2 = (defpackage.C6112nd0) r2
            nd0 r3 = defpackage.LI.e
            java.lang.String r4 = "version"
            defpackage.O90.f(r3, r4)
            int r4 = r3.b
            int r5 = r3.c
            int r3 = r3.d
            boolean r2 = r2.a(r4, r5, r3)
            java.lang.Object r3 = r10.b
            Ut0 r3 = (defpackage.InterfaceC1637Ut0) r3
            java.lang.Object r10 = r10.c
            m71 r10 = (defpackage.C5826m71) r10
            mq0 r10 = r(r11, r3, r10, r12, r2)
            if (r10 != 0) goto L62
            return r1
        L62:
            java.lang.Object r11 = r9.b
            Sk0 r11 = (defpackage.C1454Sk0) r11
            java.lang.Object r11 = r11.invoke(r0)
            java.lang.Object r10 = r14.invoke(r11, r10)
            if (r10 != 0) goto L71
            return r1
        L71:
            boolean r11 = defpackage.AbstractC1365Rg1.a(r13)
            if (r11 == 0) goto Lca
            Dx r10 = (defpackage.AbstractC0323Dx) r10
            boolean r11 = r10 instanceof defpackage.C0752Jk
            if (r11 == 0) goto L8e
            Ve1 r11 = new Ve1
            Jk r10 = (defpackage.C0752Jk) r10
            java.lang.Object r10 = r10.a
            java.lang.Number r10 = (java.lang.Number) r10
            byte r10 = r10.byteValue()
            r11.<init>(r10)
        L8c:
            r10 = r11
            goto Lca
        L8e:
            boolean r11 = r10 instanceof defpackage.C7519v01
            if (r11 == 0) goto La2
            Ve1 r11 = new Ve1
            v01 r10 = (defpackage.C7519v01) r10
            java.lang.Object r10 = r10.a
            java.lang.Number r10 = (java.lang.Number) r10
            short r10 = r10.shortValue()
            r11.<init>(r10)
            goto L8c
        La2:
            boolean r11 = r10 instanceof defpackage.C4100h90
            if (r11 == 0) goto Lb6
            Ve1 r11 = new Ve1
            h90 r10 = (defpackage.C4100h90) r10
            java.lang.Object r10 = r10.a
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r11.<init>(r10)
            goto L8c
        Lb6:
            boolean r11 = r10 instanceof defpackage.C0444Fl0
            if (r11 == 0) goto Lca
            Ve1 r11 = new Ve1
            Fl0 r10 = (defpackage.C0444Fl0) r10
            java.lang.Object r10 = r10.a
            java.lang.Number r10 = (java.lang.Number) r10
            long r12 = r10.longValue()
            r11.<init>(r12)
            goto L8c
        Lca:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.U41.B(Fm0, qF0, int, Ig0, kotlin.jvm.functions.Function2):java.lang.Object");
    }

    public List C(AbstractC0447Fm0 abstractC0447Fm0, C6613qF0 c6613qF0, A a) {
        Boolean boolC = ZV.B.c(c6613qF0.d);
        boolean zD = C0732Jd0.d(c6613qF0);
        A a2 = A.a;
        MN mn = MN.a;
        if (a == a2) {
            C5960mq0 c5960mq0B = RL1.b(c6613qF0, (InterfaceC1637Ut0) abstractC0447Fm0.b, (C5826m71) abstractC0447Fm0.c, (40 & 8) != 0 ? false : false, (40 & 16) != 0 ? false : true, true);
            return c5960mq0B == null ? mn : q(this, abstractC0447Fm0, c5960mq0B, true, boolC, zD, 8);
        }
        C5960mq0 c5960mq0B2 = RL1.b(c6613qF0, (InterfaceC1637Ut0) abstractC0447Fm0.b, (C5826m71) abstractC0447Fm0.c, (40 & 8) != 0 ? false : true, (40 & 16) != 0 ? false : false, true);
        if (c5960mq0B2 == null) {
            return mn;
        }
        return AbstractC7538v51.p(c5960mq0B2.a, "$delegate", false) != (a == A.c) ? mn : p(abstractC0447Fm0, c5960mq0B2, true, true, boolC, zD);
    }

    public void D(E71 e71) {
        synchronized (this.a) {
            ((LinkedHashSet) this.e).add(e71);
        }
    }

    @Override // defpackage.A5
    public List a(AbstractC0447Fm0 abstractC0447Fm0, AbstractC7709w00 abstractC7709w00, int i) {
        O90.f(abstractC7709w00, "proto");
        NX.m(i, "kind");
        C5960mq0 c5960mq0R = r(abstractC7709w00, (InterfaceC1637Ut0) abstractC0447Fm0.b, (C5826m71) abstractC0447Fm0.c, i, false);
        return c5960mq0R != null ? q(this, abstractC0447Fm0, new C5960mq0(AbstractC1705Vq.l(new StringBuilder(), c5960mq0R.a, "@0")), false, null, false, 60) : MN.a;
    }

    @Override // defpackage.A5
    public List b(AbstractC0447Fm0 abstractC0447Fm0, C6613qF0 c6613qF0) {
        O90.f(c6613qF0, "proto");
        return C(abstractC0447Fm0, c6613qF0, A.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x002d  */
    @Override // defpackage.A5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List c(defpackage.AbstractC0447Fm0 r9, defpackage.AbstractC7709w00 r10, int r11, int r12, defpackage.IF0 r13) {
        /*
            r8 = this;
            java.lang.String r13 = "callableProto"
            defpackage.O90.f(r10, r13)
            java.lang.String r13 = "kind"
            defpackage.NX.m(r11, r13)
            java.lang.Object r13 = r9.b
            Ut0 r13 = (defpackage.InterfaceC1637Ut0) r13
            java.lang.Object r0 = r9.c
            m71 r0 = (defpackage.C5826m71) r0
            r1 = 0
            mq0 r11 = r(r10, r13, r0, r11, r1)
            if (r11 == 0) goto L93
            boolean r13 = r10 instanceof defpackage.C4309iF0
            r0 = 64
            r2 = 1
            if (r13 == 0) goto L2f
            iF0 r10 = (defpackage.C4309iF0) r10
            boolean r13 = r10.p()
            if (r13 != 0) goto L2d
            int r10 = r10.c
            r10 = r10 & r0
            if (r10 != r0) goto L55
        L2d:
            r1 = r2
            goto L55
        L2f:
            boolean r13 = r10 instanceof defpackage.C6613qF0
            if (r13 == 0) goto L41
            qF0 r10 = (defpackage.C6613qF0) r10
            boolean r13 = r10.p()
            if (r13 != 0) goto L2d
            int r10 = r10.c
            r10 = r10 & r0
            if (r10 != r0) goto L55
            goto L2d
        L41:
            boolean r13 = r10 instanceof defpackage.VE0
            if (r13 == 0) goto L7b
            r10 = r9
            PF0 r10 = (defpackage.PF0) r10
            SE0 r13 = defpackage.SE0.ENUM_CLASS
            SE0 r3 = r10.h
            if (r3 != r13) goto L50
            r1 = 2
            goto L55
        L50:
            boolean r10 = r10.i
            if (r10 == 0) goto L55
            goto L2d
        L55:
            int r12 = r12 + r1
            mq0 r3 = new mq0
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r11.a
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
            java.util.List r9 = q(r1, r2, r3, r4, r5, r6, r7)
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
            MN r9 = defpackage.MN.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.U41.c(Fm0, w00, int, int, IF0):java.util.List");
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(com.vk.push.common.messaging.NotificationPayload r19, int r20, kotlin.Pair r21, com.vk.push.common.messaging.NotificationAnalyticsPayload r22, defpackage.AbstractC1963Yy r23) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.U41.d(com.vk.push.common.messaging.NotificationPayload, int, kotlin.Pair, com.vk.push.common.messaging.NotificationAnalyticsPayload, Yy):java.lang.Object");
    }

    @Override // defpackage.InterfaceC6582q5
    public Object e(AbstractC0447Fm0 abstractC0447Fm0, C6613qF0 c6613qF0, AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(c6613qF0, "proto");
        return B(abstractC0447Fm0, c6613qF0, 3, abstractC0663Ig0, C8087y.f);
    }

    @Override // defpackage.A5
    public ArrayList f(AF0 af0, InterfaceC1637Ut0 interfaceC1637Ut0) {
        O90.f(af0, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        Object objK = af0.k(AbstractC0654Id0.f);
        O90.e(objK, "getExtension(...)");
        Iterable<QE0> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(iterable));
        for (QE0 qe0 : iterable) {
            O90.c(qe0);
            arrayList.add(((C3383dO1) this.e).s(qe0, interfaceC1637Ut0));
        }
        return arrayList;
    }

    @Override // defpackage.A5
    public ArrayList g(FF0 ff0, InterfaceC1637Ut0 interfaceC1637Ut0) {
        O90.f(ff0, "proto");
        O90.f(interfaceC1637Ut0, "nameResolver");
        Object objK = ff0.k(AbstractC0654Id0.h);
        O90.e(objK, "getExtension(...)");
        Iterable<QE0> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(iterable));
        for (QE0 qe0 : iterable) {
            O90.c(qe0);
            arrayList.add(((C3383dO1) this.e).s(qe0, interfaceC1637Ut0));
        }
        return arrayList;
    }

    @Override // defpackage.A5
    public List h(AbstractC0447Fm0 abstractC0447Fm0, AbstractC7709w00 abstractC7709w00, int i) {
        O90.f(abstractC7709w00, "proto");
        NX.m(i, "kind");
        if (i == 2) {
            return C(abstractC0447Fm0, (C6613qF0) abstractC7709w00, A.a);
        }
        C5960mq0 c5960mq0R = r(abstractC7709w00, (InterfaceC1637Ut0) abstractC0447Fm0.b, (C5826m71) abstractC0447Fm0.c, i, false);
        return c5960mq0R == null ? MN.a : q(this, abstractC0447Fm0, c5960mq0R, false, null, false, 60);
    }

    @Override // defpackage.A5
    public List i(AbstractC0447Fm0 abstractC0447Fm0, C6613qF0 c6613qF0) {
        O90.f(c6613qF0, "proto");
        return C(abstractC0447Fm0, c6613qF0, A.c);
    }

    @Override // defpackage.A5
    public ArrayList j(PF0 pf0) {
        O90.f(pf0, "container");
        W21 w21 = (W21) pf0.d;
        C0351Eg0 c0351Eg0 = w21 instanceof C0351Eg0 ? (C0351Eg0) w21 : null;
        C7977xP0 c7977xP0 = c0351Eg0 != null ? c0351Eg0.a : null;
        if (c7977xP0 == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + pf0.g.b()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        Class cls = c7977xP0.a;
        O90.f(cls, "klass");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        O90.e(declaredAnnotations, "getDeclaredAnnotations(...)");
        for (Annotation annotation : declaredAnnotations) {
            O90.c(annotation);
            Class clsB = P22.b(P22.a(annotation));
            C5534kb1 c5534kb1A = A(VO0.a(clsB), new UO0(annotation), arrayList);
            if (c5534kb1A != null) {
                AbstractC3958gP1.b(c5534kb1A, annotation, clsB);
            }
        }
        return arrayList;
    }

    @Override // defpackage.A5
    public List k(PF0 pf0, C3355dF0 c3355dF0) {
        O90.f(pf0, "container");
        String string = ((InterfaceC1637Ut0) pf0.b).getString(c3355dF0.d);
        String strB = AbstractC0308Ds.b(pf0.g.c());
        O90.f(strB, "desc");
        return q(this, pf0, new C5960mq0(string + '#' + strB), false, null, false, 60);
    }

    @Override // defpackage.InterfaceC6582q5
    public Object l(AbstractC0447Fm0 abstractC0447Fm0, C6613qF0 c6613qF0, AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(c6613qF0, "proto");
        return B(abstractC0447Fm0, c6613qF0, 2, abstractC0663Ig0, C8087y.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(java.lang.String r6, defpackage.AbstractC1963Yy r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C2025Zs1
            if (r0 == 0) goto L13
            r0 = r7
            Zs1 r0 = (defpackage.C2025Zs1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            Zs1 r0 = new Zs1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            Mz r1 = defpackage.EnumC1030Mz.a
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            U41 r6 = r0.a
            defpackage.RQ1.d(r7)     // Catch: defpackage.C0412Fa1 -> L4e
            goto L49
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            defpackage.RQ1.d(r7)
            Vr1 r7 = new Vr1     // Catch: defpackage.C0412Fa1 -> L4d
            r2 = 1
            r7.<init>(r5, r6, r4, r2)     // Catch: defpackage.C0412Fa1 -> L4d
            r0.a = r5     // Catch: defpackage.C0412Fa1 -> L4d
            r0.d = r3     // Catch: defpackage.C0412Fa1 -> L4d
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r7 = defpackage.GY1.a(r2, r7, r0)     // Catch: defpackage.C0412Fa1 -> L4d
            if (r7 != r1) goto L48
            return r1
        L48:
            r6 = r5
        L49:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7     // Catch: defpackage.C0412Fa1 -> L4e
            r4 = r7
            goto L58
        L4d:
            r6 = r5
        L4e:
            java.lang.Object r6 = r6.f
            com.vk.push.common.Logger r6 = (com.vk.push.common.Logger) r6
            java.lang.String r7 = "Unable to download image for 5000 ms"
            r0 = 2
            com.vk.push.common.Logger.DefaultImpls.warn$default(r6, r7, r4, r0, r4)
        L58:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.U41.m(java.lang.String, Yy):java.lang.Object");
    }

    public C6871rc o() {
        String strI = ((String) this.a) == null ? " mimeType" : "";
        if (((Integer) this.b) == null) {
            strI = strI.concat(" profile");
        }
        if (((EnumC8011xa1) this.c) == null) {
            strI = AbstractC8235ym.i(strI, " inputTimebase");
        }
        if (((Integer) this.d) == null) {
            strI = AbstractC8235ym.i(strI, " bitrate");
        }
        if (((Integer) this.e) == null) {
            strI = AbstractC8235ym.i(strI, " sampleRate");
        }
        if (((Integer) this.f) == null) {
            strI = AbstractC8235ym.i(strI, " channelCount");
        }
        if (!strI.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strI));
        }
        String str = (String) this.a;
        int iIntValue = ((Integer) this.b).intValue();
        C6871rc c6871rc = new C6871rc(str, iIntValue, (EnumC8011xa1) this.c, ((Integer) this.d).intValue(), ((Integer) this.e).intValue(), ((Integer) this.f).intValue());
        if (Objects.equals(str, "audio/mp4a-latm") && iIntValue == -1) {
            throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
        }
        return c6871rc;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List p(defpackage.AbstractC0447Fm0 r9, defpackage.C5960mq0 r10, boolean r11, boolean r12, java.lang.Boolean r13, boolean r14) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f
            r7 = r0
            nd0 r7 = (defpackage.C6112nd0) r7
            java.lang.Object r0 = r8.a
            r6 = r0
            Tu0 r6 = (defpackage.C1562Tu0) r6
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            xP0 r11 = defpackage.QL1.h(r1, r2, r3, r4, r5, r6, r7)
            if (r11 != 0) goto L2f
            boolean r11 = r9 instanceof defpackage.PF0
            r12 = 0
            if (r11 == 0) goto L2e
            PF0 r9 = (defpackage.PF0) r9
            java.lang.Object r9 = r9.d
            W21 r9 = (defpackage.W21) r9
            boolean r11 = r9 instanceof defpackage.C0351Eg0
            if (r11 == 0) goto L27
            Eg0 r9 = (defpackage.C0351Eg0) r9
            goto L28
        L27:
            r9 = r12
        L28:
            if (r9 == 0) goto L2e
            xP0 r9 = r9.a
            r11 = r9
            goto L2f
        L2e:
            r11 = r12
        L2f:
            MN r9 = defpackage.MN.a
            if (r11 != 0) goto L34
            return r9
        L34:
            java.lang.Object r12 = r8.b
            Sk0 r12 = (defpackage.C1454Sk0) r12
            java.lang.Object r11 = r12.invoke(r11)
            J5 r11 = (defpackage.J5) r11
            java.util.HashMap r11 = r11.a
            java.lang.Object r10 = r11.get(r10)
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L49
            goto L4a
        L49:
            r9 = r10
        L4a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.U41.p(Fm0, mq0, boolean, boolean, java.lang.Boolean, boolean):java.util.List");
    }

    public ArrayList s() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList((LinkedHashSet) this.c);
        }
        return arrayList;
    }

    public ArrayList t() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList((LinkedHashSet) this.e);
        }
        return arrayList;
    }

    public ArrayList u() {
        ArrayList arrayList;
        synchronized (this.a) {
            arrayList = new ArrayList();
            arrayList.addAll(s());
            arrayList.addAll(t());
        }
        return arrayList;
    }

    public Uri v() throws IOException {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String str = (String) this.d;
        if (str == null) {
            str = "*/*";
        }
        String extensionFromMimeType = singleton.getExtensionFromMimeType(str);
        boolean zW = w();
        ReactApplicationContext reactApplicationContext = (ReactApplicationContext) this.a;
        if (zW) {
            String strSubstring = ((Uri) this.c).toString().substring(((String) this.d).length() + 13);
            String str2 = (String) this.e;
            if (str2 == null) {
                str2 = System.nanoTime() + "";
            }
            try {
                File file = new File(((Boolean) this.f).booleanValue() ? reactApplicationContext.getCacheDir() : reactApplicationContext.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                }
                File file2 = new File(file, str2 + "." + extensionFromMimeType);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(Base64.decode(strSubstring, 0));
                fileOutputStream.flush();
                fileOutputStream.close();
                return RI0.a(reactApplicationContext, file2);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (y()) {
            Uri uri = Uri.parse((String) this.b);
            if (uri.getPath() == null) {
                return null;
            }
            return RI0.a(reactApplicationContext, new File(uri.getPath()));
        }
        return null;
    }

    public boolean w() {
        Uri uri = (Uri) this.c;
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
        this.d = sb.toString();
        return true;
    }

    public boolean x(C0074As c0074As) {
        if (c0074As.f() == null || !O90.a(c0074As.i().b(), "Container")) {
            return false;
        }
        C7977xP0 c7977xP0D = AbstractC6960s4.d((C1562Tu0) this.a, c0074As, (C6112nd0) this.f);
        if (c7977xP0D != null) {
            LinkedHashSet linkedHashSet = AbstractC5240j31.a;
            Class cls = c7977xP0D.a;
            O90.f(cls, "klass");
            Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
            O90.e(declaredAnnotations, "getDeclaredAnnotations(...)");
            boolean z = false;
            for (Annotation annotation : declaredAnnotations) {
                O90.c(annotation);
                if (VO0.a(P22.b(P22.a(annotation))).equals(AbstractC1040Nc0.b)) {
                    z = true;
                }
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean y() {
        Uri uri = (Uri) this.c;
        if (uri.getScheme() == null || !(uri.getScheme().equals(RemoteMessageConst.Notification.CONTENT) || uri.getScheme().equals("file"))) {
            return false;
        }
        if (((String) this.d) != null) {
            return true;
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        String mimeTypeFromExtension = fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null;
        this.d = mimeTypeFromExtension;
        if (mimeTypeFromExtension == null) {
            String strC = RI0.c((ReactApplicationContext) this.a, uri, (Boolean) this.f);
            if (strC == null) {
                return false;
            }
            String fileExtensionFromUrl2 = MimeTypeMap.getFileExtensionFromUrl(strC);
            this.d = fileExtensionFromUrl2 != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl2) : null;
        }
        if (((String) this.d) == null) {
            this.d = "*/*";
        }
        return true;
    }

    public C5534kb1 z(C0074As c0074As, W21 w21, List list) {
        O90.f(list, "result");
        return new C5534kb1(this, AbstractC3312d12.d((C0231Cs0) this.c, c0074As, (T71) this.d), c0074As, list, w21);
    }

    public U41(String str, String str2, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.b = str;
        this.c = Uri.parse(str);
        this.e = str2;
        this.f = bool;
        this.a = reactApplicationContext;
    }
}
