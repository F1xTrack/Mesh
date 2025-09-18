package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.C2686cl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.gm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2787gm {
    private Runnable a;
    private final InterfaceExecutorC3086sn b;
    private final Mk c;
    private final Hl d;
    private final C2636al e;
    private final a f;
    private final List<InterfaceC2687cm> g;
    private final List<C3214xl> h;
    private final C2686cl.a i;

    /* renamed from: com.yandex.metrica.impl.ob.gm$a */
    public static class a {
    }

    public C2787gm(InterfaceExecutorC3086sn interfaceExecutorC3086sn, Mk mk, C2636al c2636al) {
        this(interfaceExecutorC3086sn, mk, c2636al, new Hl(), new a(), Collections.emptyList(), new C2686cl.a());
    }

    public static void a(C2787gm c2787gm, List list, Throwable th, C2662bm c2662bm) {
        c2787gm.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC2637am) it.next()).a(th, c2662bm);
        }
        Iterator<InterfaceC2687cm> it2 = c2787gm.g.iterator();
        while (it2.hasNext()) {
            it2.next().a(th, c2662bm);
        }
    }

    public C2787gm(InterfaceExecutorC3086sn interfaceExecutorC3086sn, Mk mk, C2636al c2636al, Hl hl, a aVar, List<C3214xl> list, C2686cl.a aVar2) {
        this.g = new ArrayList();
        this.b = interfaceExecutorC3086sn;
        this.c = mk;
        this.e = c2636al;
        this.d = hl;
        this.f = aVar;
        this.h = list;
        this.i = aVar2;
    }

    public static void a(C2787gm c2787gm, List list, Gl gl, List list2, Activity activity, Il il, C2686cl c2686cl, long j) {
        c2787gm.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC2637am) it.next()).a(j, activity, gl, list2, il, c2686cl);
        }
        Iterator<InterfaceC2687cm> it2 = c2787gm.g.iterator();
        while (it2.hasNext()) {
            it2.next().a(j, activity, gl, list2, il, c2686cl);
        }
    }

    public void a(InterfaceC2687cm... interfaceC2687cmArr) {
        this.g.addAll(Arrays.asList(interfaceC2687cmArr));
    }

    public static void a(C2787gm c2787gm, Activity activity, long j) {
        Iterator<InterfaceC2687cm> it = c2787gm.g.iterator();
        while (it.hasNext()) {
            it.next().a(activity, j);
        }
    }

    public void a(Activity activity, long j, Il il, C2662bm c2662bm, List<InterfaceC2637am> list) {
        boolean z;
        Iterator<C3214xl> it = this.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (it.next().a(activity, c2662bm)) {
                z = true;
                break;
            }
        }
        boolean z2 = z;
        WeakReference weakReference = new WeakReference(activity);
        C2686cl.a aVar = this.i;
        C2636al c2636al = this.e;
        aVar.getClass();
        RunnableC2762fm runnableC2762fm = new RunnableC2762fm(this, weakReference, list, il, c2662bm, new C2686cl(c2636al, il), z2);
        Runnable runnable = this.a;
        if (runnable != null) {
            ((C3061rn) this.b).a(runnable);
        }
        this.a = runnableC2762fm;
        Iterator<InterfaceC2687cm> it2 = this.g.iterator();
        while (it2.hasNext()) {
            it2.next().a(activity, z2);
        }
        ((C3061rn) this.b).a(runnableC2762fm, j);
    }
}
