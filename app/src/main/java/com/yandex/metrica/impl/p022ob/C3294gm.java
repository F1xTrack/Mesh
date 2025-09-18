package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import com.yandex.metrica.impl.p022ob.C3189cl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.gm */
/* loaded from: classes2.dex */
class C3294gm {

    /* renamed from: a */
    private Runnable f23531a;

    /* renamed from: b */
    private final InterfaceExecutorC3607sn f23532b;

    /* renamed from: c */
    private final C2787Mk f23533c;

    /* renamed from: d */
    private final C2663Hl f23534d;

    /* renamed from: e */
    private final C3137al f23535e;

    /* renamed from: f */
    private final a f23536f;

    /* renamed from: g */
    private final List<InterfaceC3190cm> f23537g;

    /* renamed from: h */
    private final List<C3735xl> f23538h;

    /* renamed from: i */
    private final C3189cl.a f23539i;

    /* renamed from: com.yandex.metrica.impl.ob.gm$a */
    public static class a {
    }

    public C3294gm(InterfaceExecutorC3607sn interfaceExecutorC3607sn, C2787Mk c2787Mk, C3137al c3137al) {
        this(interfaceExecutorC3607sn, c2787Mk, c3137al, new C2663Hl(), new a(), Collections.emptyList(), new C3189cl.a());
    }

    /* renamed from: a */
    public static void m16010a(C3294gm c3294gm, List list, Throwable th, C3164bm c3164bm) {
        c3294gm.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC3138am) it.next()).mo14269a(th, c3164bm);
        }
        Iterator<InterfaceC3190cm> it2 = c3294gm.f23537g.iterator();
        while (it2.hasNext()) {
            it2.next().mo14269a(th, c3164bm);
        }
    }

    public C3294gm(InterfaceExecutorC3607sn interfaceExecutorC3607sn, C2787Mk c2787Mk, C3137al c3137al, C2663Hl c2663Hl, a aVar, List<C3735xl> list, C3189cl.a aVar2) {
        this.f23537g = new ArrayList();
        this.f23532b = interfaceExecutorC3607sn;
        this.f23533c = c2787Mk;
        this.f23535e = c3137al;
        this.f23534d = c2663Hl;
        this.f23536f = aVar;
        this.f23538h = list;
        this.f23539i = aVar2;
    }

    /* renamed from: a */
    public static void m16009a(C3294gm c3294gm, List list, C2638Gl c2638Gl, List list2, Activity activity, C2688Il c2688Il, C3189cl c3189cl, long j) {
        c3294gm.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC3138am) it.next()).mo14268a(j, activity, c2638Gl, list2, c2688Il, c3189cl);
        }
        Iterator<InterfaceC3190cm> it2 = c3294gm.f23537g.iterator();
        while (it2.hasNext()) {
            it2.next().mo14268a(j, activity, c2638Gl, list2, c2688Il, c3189cl);
        }
    }

    /* renamed from: a */
    public void m16015a(InterfaceC3190cm... interfaceC3190cmArr) {
        this.f23537g.addAll(Arrays.asList(interfaceC3190cmArr));
    }

    /* renamed from: a */
    public static void m16008a(C3294gm c3294gm, Activity activity, long j) {
        Iterator<InterfaceC3190cm> it = c3294gm.f23537g.iterator();
        while (it.hasNext()) {
            it.next().mo14671a(activity, j);
        }
    }

    /* renamed from: a */
    public void m16014a(Activity activity, long j, C2688Il c2688Il, C3164bm c3164bm, List<InterfaceC3138am> list) {
        boolean z;
        Iterator<C3735xl> it = this.f23538h.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (it.next().m17195a(activity, c3164bm)) {
                z = true;
                break;
            }
        }
        boolean z2 = z;
        WeakReference weakReference = new WeakReference(activity);
        C3189cl.a aVar = this.f23539i;
        C3137al c3137al = this.f23535e;
        aVar.getClass();
        RunnableC3268fm runnableC3268fm = new RunnableC3268fm(this, weakReference, list, c2688Il, c3164bm, new C3189cl(c3137al, c2688Il), z2);
        Runnable runnable = this.f23531a;
        if (runnable != null) {
            ((C3581rn) this.f23532b).m16703a(runnable);
        }
        this.f23531a = runnableC3268fm;
        Iterator<InterfaceC3190cm> it2 = this.f23537g.iterator();
        while (it2.hasNext()) {
            it2.next().mo14672a(activity, z2);
        }
        ((C3581rn) this.f23532b).m16704a(runnableC3268fm, j);
    }
}
