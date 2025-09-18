package com.yandex.metrica.impl.p022ob;

import android.app.Activity;
import com.yandex.metrica.impl.p022ob.C3294gm;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.fm */
/* loaded from: classes2.dex */
class RunnableC3268fm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WeakReference f23448a;

    /* renamed from: b */
    final /* synthetic */ List f23449b;

    /* renamed from: c */
    final /* synthetic */ C2688Il f23450c;

    /* renamed from: d */
    final /* synthetic */ C3164bm f23451d;

    /* renamed from: e */
    final /* synthetic */ C3189cl f23452e;

    /* renamed from: f */
    final /* synthetic */ boolean f23453f;

    /* renamed from: g */
    final /* synthetic */ C3294gm f23454g;

    public RunnableC3268fm(C3294gm c3294gm, WeakReference weakReference, List list, C2688Il c2688Il, C3164bm c3164bm, C3189cl c3189cl, boolean z) {
        this.f23454g = c3294gm;
        this.f23448a = weakReference;
        this.f23449b = list;
        this.f23450c = c2688Il;
        this.f23451d = c3164bm;
        this.f23452e = c3189cl;
        this.f23453f = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC3345il c2887Qk;
        C2638Gl c2638GlM14271a;
        Activity activity = (Activity) this.f23448a.get();
        if (activity == null) {
            return;
        }
        C3294gm.a aVar = this.f23454g.f23536f;
        List list = this.f23449b;
        List list2 = this.f23454g.f23537g;
        C2688Il c2688Il = this.f23450c;
        aVar.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((InterfaceC3138am) it2.next()).mo14270a(c2688Il)) {
                    }
                }
                c2887Qk = new C2887Qk();
            } else if (((InterfaceC3138am) it.next()).mo14270a(c2688Il)) {
                break;
            }
        }
        c2887Qk = new C3709wl();
        InterfaceC3345il interfaceC3345il = c2887Qk;
        long jM14628a = this.f23454g.f23533c.m14628a();
        C3294gm.m16008a(this.f23454g, activity, jM14628a);
        try {
            c2638GlM14271a = this.f23454g.f23534d.m14271a(activity, this.f23451d, this.f23452e.m15716c(), interfaceC3345il, this.f23453f);
        } catch (Throwable th) {
            C3294gm.m16010a(this.f23454g, this.f23449b, th, this.f23451d);
            c2638GlM14271a = null;
        }
        C2638Gl c2638Gl = c2638GlM14271a;
        if (c2638Gl != null) {
            C3294gm.m16009a(this.f23454g, this.f23449b, c2638Gl, interfaceC3345il.mo14957a(), activity, this.f23450c, this.f23452e, jM14628a);
        }
    }
}
