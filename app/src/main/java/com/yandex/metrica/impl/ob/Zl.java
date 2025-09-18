package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes2.dex */
public class Zl implements Jl {
    private final C3264zl a;
    private final C3134ul b;
    private final F9 c;
    private final C2636al d;
    private final C2960nl e;
    private Activity f;
    private Il g;

    public class a implements Um<Activity> {
        public a() {
        }

        @Override // com.yandex.metrica.impl.ob.Um
        public void b(Activity activity) {
            Zl.this.a.a(activity);
        }
    }

    public Zl(Context context, F9 f9, InterfaceC2861jm interfaceC2861jm, InterfaceExecutorC3086sn interfaceExecutorC3086sn, Il il) {
        this(context, f9, interfaceC2861jm, interfaceExecutorC3086sn, il, new C2636al(il));
    }

    public synchronized void b(Activity activity) {
        this.f = activity;
        this.a.a(activity);
    }

    private Zl(Context context, F9 f9, InterfaceC2861jm interfaceC2861jm, InterfaceExecutorC3086sn interfaceExecutorC3086sn, Il il, C2636al c2636al) {
        this(f9, interfaceC2861jm, il, c2636al, new Lk(1, f9), new C2787gm(interfaceExecutorC3086sn, new Mk(f9), c2636al), new Ik(context));
    }

    public synchronized void a(Activity activity) {
        this.e.a(activity);
        this.f = null;
    }

    private Zl(F9 f9, InterfaceC2861jm interfaceC2861jm, Il il, C2636al c2636al, Lk lk, C2787gm c2787gm, Ik ik) {
        this(f9, il, interfaceC2861jm, c2787gm, c2636al, new C3264zl(il, lk, f9, c2787gm, ik), new C3134ul(il, lk, f9, c2787gm, ik), new Nk());
    }

    public Zl(F9 f9, Il il, InterfaceC2861jm interfaceC2861jm, C2787gm c2787gm, C2636al c2636al, C3264zl c3264zl, C3134ul c3134ul, Nk nk) {
        this.c = f9;
        this.g = il;
        this.d = c2636al;
        this.a = c3264zl;
        this.b = c3134ul;
        C2960nl c2960nl = new C2960nl(new a(), interfaceC2861jm);
        this.e = c2960nl;
        c2787gm.a(nk, c2960nl);
    }

    public synchronized void a(Ol ol, boolean z) {
        this.b.a(this.f, ol, z);
        this.c.c(true);
    }

    @Override // com.yandex.metrica.impl.ob.Jl
    public synchronized void a(Il il) {
        if (!il.equals(this.g)) {
            this.d.a(il);
            this.b.a(il);
            this.a.a(il);
            this.g = il;
            Activity activity = this.f;
            if (activity != null) {
                this.a.b(activity);
            }
        }
    }
}
