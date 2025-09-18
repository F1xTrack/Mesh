package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.C2787gm;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.fm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class RunnableC2762fm implements Runnable {
    final /* synthetic */ WeakReference a;
    final /* synthetic */ List b;
    final /* synthetic */ Il c;
    final /* synthetic */ C2662bm d;
    final /* synthetic */ C2686cl e;
    final /* synthetic */ boolean f;
    final /* synthetic */ C2787gm g;

    public RunnableC2762fm(C2787gm c2787gm, WeakReference weakReference, List list, Il il, C2662bm c2662bm, C2686cl c2686cl, boolean z) {
        this.g = c2787gm;
        this.a = weakReference;
        this.b = list;
        this.c = il;
        this.d = c2662bm;
        this.e = c2686cl;
        this.f = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        InterfaceC2835il qk;
        Gl glA;
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            return;
        }
        C2787gm.a aVar = this.g.f;
        List list = this.b;
        List list2 = this.g.g;
        Il il = this.c;
        aVar.getClass();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((InterfaceC2637am) it2.next()).a(il)) {
                    }
                }
                qk = new Qk();
            } else if (((InterfaceC2637am) it.next()).a(il)) {
                break;
            }
        }
        qk = new C3189wl();
        InterfaceC2835il interfaceC2835il = qk;
        long jA = this.g.c.a();
        C2787gm.a(this.g, activity, jA);
        try {
            glA = this.g.d.a(activity, this.d, this.e.c(), interfaceC2835il, this.f);
        } catch (Throwable th) {
            C2787gm.a(this.g, this.b, th, this.d);
            glA = null;
        }
        Gl gl = glA;
        if (gl != null) {
            C2787gm.a(this.g, this.b, gl, interfaceC2835il.a(), activity, this.c, this.e, jA);
        }
    }
}
