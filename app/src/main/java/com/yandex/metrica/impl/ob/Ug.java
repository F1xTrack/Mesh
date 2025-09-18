package com.yandex.metrica.impl.ob;

import android.content.Context;
import defpackage.O90;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public class Ug {
    private final Set<Vg> a;
    private Fg b;
    private boolean c;
    private final H8 d;
    private final Context e;

    public interface a {
        void a(Fg fg);
    }

    public Ug(Context context) {
        this(context, P0.i().y().a());
    }

    public synchronized void a(Fg fg) {
        this.b = fg;
        this.c = true;
        this.d.a(fg);
        this.d.a(true);
        Fg fg2 = this.b;
        synchronized (this) {
            Iterator<Vg> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a(fg2);
            }
        }
    }

    public void b() {
        if (this.c) {
            return;
        }
        Context context = this.e;
        P0 p0I = P0.i();
        O90.e(p0I, "GlobalServiceLocator.getInstance()");
        C3266zn c3266znS = p0I.s();
        O90.e(c3266znS, "GlobalServiceLocator.get…).serviceExecutorProvider");
        new Og(this, new Yg(context, c3266znS.b()), new Ig(context), new Zg(context, null, 0 == true ? 1 : 0, 6)).b();
    }

    public Ug(Context context, H8 h8) {
        this.a = new HashSet();
        this.e = context;
        this.d = h8;
        this.b = h8.g();
        this.c = h8.h();
    }

    public Fg a() {
        return this.b;
    }

    public synchronized void a(Vg vg) {
        this.a.add(vg);
        if (this.c) {
            vg.a(this.b);
        }
    }
}
