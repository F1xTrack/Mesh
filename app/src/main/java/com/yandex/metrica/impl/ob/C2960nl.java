package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.C2712dm;
import defpackage.InterfaceC3663es1;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.nl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2960nl implements InterfaceC2687cm {
    private final InterfaceC3663es1 a;
    private final C2712dm.a b;
    private final InterfaceC2861jm c;
    private final C2836im d;

    public C2960nl(Um<Activity> um, InterfaceC2861jm interfaceC2861jm) {
        this(new C2712dm.a(), um, interfaceC2861jm, new C2761fl(), new C2836im());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2687cm
    public void a(Activity activity, long j) {
    }

    public C2960nl(C2712dm.a aVar, Um<Activity> um, InterfaceC2861jm interfaceC2861jm, C2761fl c2761fl, C2836im c2836im) {
        this.b = aVar;
        this.c = interfaceC2861jm;
        this.a = c2761fl.a(um);
        this.d = c2836im;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2637am
    public boolean a(Il il) {
        return false;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2687cm
    public void a(Activity activity, boolean z) {
        if (z) {
            return;
        }
        try {
            this.a.subscribe(activity);
        } catch (Throwable unused) {
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2637am
    public void a(long j, Activity activity, Gl gl, List<Wl> list, Il il, C2686cl c2686cl) {
        Kl kl;
        Kl kl2;
        if (il.b && (kl2 = il.f) != null) {
            this.c.b(this.d.a(activity, gl, kl2, c2686cl.b(), j));
        }
        if (!il.d || (kl = il.h) == null) {
            return;
        }
        this.c.a(this.d.a(activity, gl, kl, c2686cl.d(), j));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2637am
    public void a(Throwable th, C2662bm c2662bm) {
        this.b.getClass();
        new C2712dm(c2662bm, Oh.a()).a("ui_parsing", th);
    }

    public void a(Activity activity) {
        try {
            this.a.unsubscribe(activity);
        } catch (Throwable unused) {
        }
    }
}
