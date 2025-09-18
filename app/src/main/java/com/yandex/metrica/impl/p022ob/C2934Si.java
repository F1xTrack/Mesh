package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C2610Fi;
import com.yandex.metrica.impl.p022ob.C2885Qi;
import com.yandex.metrica.impl.p022ob.C2909Ri;
import com.yandex.metrica.impl.p022ob.C3393kh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.InterfaceC6434mZ;

/* renamed from: com.yandex.metrica.impl.ob.Si */
/* loaded from: classes2.dex */
public class C2934Si {

    /* renamed from: a */
    private final C3172c4 f22319a;

    /* renamed from: b */
    private final InterfaceC2860Pi f22320b;

    /* renamed from: c */
    private final C2885Qi.b f22321c;

    /* renamed from: d */
    private volatile C2719K2 f22322d;

    /* renamed from: e */
    private C2635Gi f22323e;

    /* renamed from: f */
    private final InterfaceC2839Om f22324f;

    /* renamed from: g */
    private final C2866Q f22325g;

    /* renamed from: h */
    private final C3576ri f22326h;

    /* renamed from: i */
    private final C2595F3 f22327i;

    /* renamed from: com.yandex.metrica.impl.ob.Si$a */
    public class a implements InterfaceC6434mZ {
        public a() {
        }

        @Override // p000.InterfaceC6434mZ
        public Object invoke() {
            return C2934Si.this.f22325g;
        }
    }

    public C2934Si(Context context, String str, C3393kh.b bVar, InterfaceC2860Pi interfaceC2860Pi) {
        this(context, new C3069Y3(str), bVar, interfaceC2860Pi, new C2885Qi.b(context), new C3658um(context), new C2814Nm(), C2842P0.m14728i().m14735e(), new C3576ri(), C2595F3.m14055a());
    }

    /* renamed from: b */
    public synchronized C2719K2 m15134b() {
        try {
            if (!m15136d()) {
                return null;
            }
            if (this.f22322d == null) {
                this.f22322d = new C2719K2(this, this.f22323e.m15942b());
            }
            return this.f22322d;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public C2885Qi m15135c() {
        return this.f22323e.m15944d();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x002f  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean m15136d() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.yandex.metrica.impl.ob.Gi r0 = r5.f22323e     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.Qi r0 = r0.m15944d()     // Catch: java.lang.Throwable -> L2d
            boolean r1 = com.yandex.metrica.impl.p022ob.C2835Oi.m14718b(r0)     // Catch: java.lang.Throwable -> L2d
            if (r1 != 0) goto L30
            boolean r1 = com.yandex.metrica.impl.p022ob.C2835Oi.m14715a(r0)     // Catch: java.lang.Throwable -> L2d
            r2 = r1 ^ 1
            if (r1 == 0) goto L2f
            com.yandex.metrica.impl.ob.ri r1 = r5.f22326h     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.Gi r3 = r5.f22323e     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.dh r3 = r3.m15942b()     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.kh r3 = (com.yandex.metrica.impl.p022ob.C3393kh) r3     // Catch: java.lang.Throwable -> L2d
            java.util.Map r3 = r3.m16315D()     // Catch: java.lang.Throwable -> L2d
            com.yandex.metrica.impl.ob.Q r4 = r5.f22325g     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r1.m16696a(r3, r0, r4)     // Catch: java.lang.Throwable -> L2d
            if (r0 != 0) goto L2f
            r1 = 1
            goto L30
        L2d:
            r0 = move-exception
            goto L32
        L2f:
            r1 = r2
        L30:
            monitor-exit(r5)
            return r1
        L32:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C2934Si.m15136d():boolean");
    }

    /* renamed from: a */
    private void m15126a(C3658um c3658um, C2586Ej c2586Ej, C2885Qi c2885Qi) {
        C2885Qi.a aVarM14875a = c2885Qi.m14875a();
        if (!C2835Oi.m14717a(c2885Qi.m14873V())) {
            aVarM14875a = aVarM14875a.m14949l(c2586Ej.m14045a().f23462a);
        }
        String strM16939a = c3658um.m16939a();
        if (!C2835Oi.m14717a(c2885Qi.m14883i())) {
            aVarM14875a = aVarM14875a.m14931c(strM16939a).m14936e("");
        }
        if (!C2835Oi.m14717a(c2885Qi.m14884j())) {
            aVarM14875a = aVarM14875a.m14934d(strM16939a);
        }
        C2885Qi c2885QiM14923a = aVarM14875a.m14923a();
        m15127b(c2885QiM14923a);
        m15125a(c2885QiM14923a);
    }

    private C2934Si(Context context, C3172c4 c3172c4, C3393kh.b bVar, InterfaceC2860Pi interfaceC2860Pi, C2885Qi.b bVar2, C3658um c3658um, InterfaceC2839Om interfaceC2839Om, C2866Q c2866q, C3576ri c3576ri, C2595F3 c2595f3) {
        this(context, c3172c4, bVar, interfaceC2860Pi, bVar2, bVar2.m14950a(), c3658um, interfaceC2839Om, c2866q, c3576ri, c2595f3);
    }

    private C2934Si(Context context, C3172c4 c3172c4, C3393kh.b bVar, InterfaceC2860Pi interfaceC2860Pi, C2885Qi.b bVar2, C2885Qi c2885Qi, C3658um c3658um, InterfaceC2839Om interfaceC2839Om, C2866Q c2866q, C3576ri c3576ri, C2595F3 c2595f3) {
        this(context, c3172c4, interfaceC2860Pi, bVar2, c2885Qi, c3658um, new C2635Gi(new C3393kh.c(context, c3172c4.m15701b()), c2885Qi, bVar), interfaceC2839Om, c2866q, c3576ri, C2611Fj.m14141a(context).m14142a(context, new C2711Jj(bVar2)), c2595f3);
    }

    /* renamed from: b */
    private synchronized void m15127b(C2885Qi c2885Qi) {
        this.f22323e.m15939a(c2885Qi);
        this.f22321c.m14951a(c2885Qi);
        C2842P0.m14728i().m14731a(c2885Qi);
        this.f22327i.m14057a((C2645H3) new C2720K3(this.f22319a.m15701b(), c2885Qi));
    }

    public C2934Si(Context context, C3172c4 c3172c4, InterfaceC2860Pi interfaceC2860Pi, C2885Qi.b bVar, C2885Qi c2885Qi, C3658um c3658um, C2635Gi c2635Gi, InterfaceC2839Om interfaceC2839Om, C2866Q c2866q, C3576ri c3576ri, C2586Ej c2586Ej, C2595F3 c2595f3) {
        this.f22319a = c3172c4;
        this.f22320b = interfaceC2860Pi;
        this.f22321c = bVar;
        this.f22323e = c2635Gi;
        this.f22324f = interfaceC2839Om;
        this.f22325g = c2866q;
        this.f22326h = c3576ri;
        this.f22327i = c2595f3;
        m15126a(c3658um, c2586Ej, c2885Qi);
    }

    /* renamed from: a */
    public C3172c4 m15129a() {
        return this.f22319a;
    }

    /* renamed from: a */
    public void m15130a(EnumC2660Hi enumC2660Hi) {
        ArrayList arrayList;
        synchronized (this) {
            this.f22322d = null;
        }
        InterfaceC2860Pi interfaceC2860Pi = this.f22320b;
        String strM15701b = this.f22319a.m15701b();
        C2885Qi c2885QiM15944d = this.f22323e.m15944d();
        C2610Fi.a aVar = (C2610Fi.a) interfaceC2860Pi;
        synchronized (C2610Fi.this.f21226b) {
            try {
                Collection collectionM15566a = C2610Fi.this.f21225a.m15566a(strM15701b);
                if (collectionM15566a == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collectionM15566a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC2760Li) it.next()).mo14543a(enumC2660Hi, c2885QiM15944d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m15132a(com.yandex.metrica.impl.p022ob.C3681vj r6, com.yandex.metrica.impl.p022ob.C3393kh r7, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = com.yandex.metrica.impl.p022ob.C2968U2.m15250b(r8)     // Catch: java.lang.Throwable -> L33
            r1 = 0
            if (r0 != 0) goto L35
            java.lang.String r0 = "Date"
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L33
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L33
            boolean r0 = com.yandex.metrica.impl.p022ob.C2968U2.m15249b(r8)     // Catch: java.lang.Throwable -> L33
            if (r0 != 0) goto L35
            r0 = 0
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L35
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "E, d MMM yyyy HH:mm:ss z"
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Throwable -> L35
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L35
            java.util.Date r8 = r0.parse(r8)     // Catch: java.lang.Throwable -> L35
            long r2 = r8.getTime()     // Catch: java.lang.Throwable -> L35
            java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L35
            goto L36
        L33:
            r6 = move-exception
            goto L61
        L35:
            r8 = r1
        L36:
            r2 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L33
            if (r8 != 0) goto L3f
            r8 = r0
        L3f:
            java.lang.Long r0 = r6.m17026M()     // Catch: java.lang.Throwable -> L33
            com.yandex.metrica.impl.ob.Lm r2 = com.yandex.metrica.impl.p022ob.C2764Lm.m14551c()     // Catch: java.lang.Throwable -> L33
            long r3 = r8.longValue()     // Catch: java.lang.Throwable -> L33
            r2.m14552a(r3, r0)     // Catch: java.lang.Throwable -> L33
            com.yandex.metrica.impl.ob.Qi r6 = r5.m15128a(r6, r7, r8)     // Catch: java.lang.Throwable -> L33
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L33
            r5.f22322d = r1     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            r5.m15127b(r6)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            r5.m15125a(r6)
            return
        L5e:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            throw r6     // Catch: java.lang.Throwable -> L33
        L61:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L33
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p022ob.C2934Si.m15132a(com.yandex.metrica.impl.ob.vj, com.yandex.metrica.impl.ob.kh, java.util.Map):void");
    }

    /* renamed from: a */
    public C2885Qi m15128a(C3681vj c3681vj, C3393kh c3393kh, Long l) {
        boolean zEquals;
        String strM17295c = C3762ym.m17295c(c3393kh.m16315D());
        Map<String, String> mapM14761b = c3393kh.m16314C().m14761b();
        String strM17083n = c3681vj.m17083n();
        String strM14889o = this.f22323e.m15944d().m14889o();
        if (!C3762ym.m17299d(C3762ym.m17274a(strM17083n))) {
            strM17083n = C3762ym.m17299d(C3762ym.m17274a(strM14889o)) ? strM14889o : null;
        }
        String strM14883i = this.f22323e.m15944d().m14883i();
        if (TextUtils.isEmpty(strM14883i)) {
            strM14883i = c3681vj.m17078i();
        }
        C2885Qi c2885QiM15944d = this.f22323e.m15944d();
        C2885Qi.a aVarM14944i = new C2885Qi.a(new C2909Ri.b(c3681vj.m17066e())).m14931c(strM14883i).m14936e(c3681vj.m17075h()).m14929c(this.f22324f.mo14675b()).m14934d(c2885QiM15944d.m14884j()).m14949l(c2885QiM15944d.m14873V()).m14940g(c3681vj.m17084o()).m14932c(c3681vj.m17019F()).m14927b(c3393kh.m16322K()).m14945i(c3681vj.m17093x()).m14937e(c3681vj.m17087r()).m14946j(c3681vj.m17092w()).m14948k(c3681vj.m17016C()).m14919a(c3681vj.m17063d()).m14920a(c3681vj.m17079j()).m14941g(c3681vj.m17089t()).m14921a(c3681vj.m17072g()).m14938f(strM17083n).m14944i(strM17295c);
        this.f22326h.getClass();
        Map<String, String> mapM17274a = C3762ym.m17274a(strM17083n);
        if (C2968U2.m15250b(mapM14761b)) {
            zEquals = C2968U2.m15250b(mapM17274a);
        } else {
            zEquals = mapM17274a.equals(mapM14761b);
        }
        C2885Qi.a aVarM14922a = aVarM14944i.m14933c(zEquals).m14942h(C3762ym.m17295c(mapM14761b)).m14906a(c3681vj.m17017D()).m14935d(c3681vj.m17086q()).m14905a(c3681vj.m17027N()).m14947j(c3681vj.m17094y()).m14926b(c3681vj.m17069f()).m14902a(c3681vj.m17091v()).m14943h(c3681vj.m17090u()).m14904a(c3681vj.m17015B()).m14910a(c3681vj.m17020G()).m14922a(true);
        Long lValueOf = Long.valueOf((System.currentTimeMillis() / 1000) * 1000);
        if (l != null) {
            lValueOf = l;
        }
        return aVarM14922a.m14924b(lValueOf.longValue()).m14901a(this.f22323e.m15942b().m16325a(l.longValue())).m14928b(false).m14918a(c3681vj.m17085p()).m14903a(c3681vj.m17014A()).m14913a(c3681vj.m17024K()).m14925b(c3681vj.m17023J()).m14930c(c3681vj.m17025L()).m14908a(c3681vj.m17022I()).m14911a(c3681vj.m17021H()).m14916a(c3681vj.m17059c()).m14912a(c3681vj.m17080k()).m14939f(c3681vj.m17088s()).m14915a(c3681vj.m17055b()).m14914a(c3681vj.m17029a()).m14907a(c3681vj.m17081l()).m14917a(c3681vj.m17082m()).m14909a(c3681vj.m17018E()).m14923a();
    }

    /* renamed from: a */
    private void m15125a(C2885Qi c2885Qi) {
        ArrayList arrayList;
        InterfaceC2860Pi interfaceC2860Pi = this.f22320b;
        String strM15701b = this.f22319a.m15701b();
        C2610Fi.a aVar = (C2610Fi.a) interfaceC2860Pi;
        synchronized (C2610Fi.this.f21226b) {
            try {
                C2610Fi.this.f21227c = c2885Qi;
                Collection collectionM15566a = C2610Fi.this.f21225a.m15566a(strM15701b);
                if (collectionM15566a == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = new ArrayList(collectionM15566a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC2760Li) it.next()).mo14544a(c2885Qi);
        }
    }

    /* renamed from: a */
    public synchronized boolean m15133a(List<String> list, Map<String, String> map) {
        return !C2835Oi.m14716a(this.f22323e.m15944d(), list, map, new a());
    }

    /* renamed from: a */
    public synchronized void m15131a(C3393kh.b bVar) {
        boolean z;
        try {
            this.f22323e.m14203a(bVar);
            C3393kh c3393khM15942b = this.f22323e.m15942b();
            if (c3393khM15942b.m16323L()) {
                List<String> listM16319H = c3393khM15942b.m16319H();
                boolean z2 = true;
                C2885Qi.a aVarM14927b = null;
                if (!C2968U2.m15249b(listM16319H) || C2968U2.m15249b(c3393khM15942b.m16322K())) {
                    z = false;
                } else {
                    aVarM14927b = this.f22323e.m15944d().m14875a().m14927b((List<String>) null);
                    z = true;
                }
                if (C2968U2.m15249b(listM16319H) || C2968U2.m15245a(listM16319H, c3393khM15942b.m16322K())) {
                    z2 = z;
                } else {
                    aVarM14927b = this.f22323e.m15944d().m14875a().m14927b(listM16319H);
                }
                if (z2) {
                    C2885Qi c2885QiM14923a = aVarM14927b.m14923a();
                    m15127b(c2885QiM14923a);
                    m15125a(c2885QiM14923a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
