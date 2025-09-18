package io.appmetrica.analytics.impl;

import defpackage.AG;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import defpackage.RunnableC8389za;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Kb implements Hb, ToggleObserver {
    public final ArrayList a = new ArrayList();
    public final IHandlerExecutor b = C4667ka.h().u().c();
    public Gm c;
    public boolean d;

    public final void a(Toggle toggle) {
        Gm gm = new Gm(toggle);
        this.c = gm;
        gm.c.registerObserver(this, true);
    }

    public final void b(Object obj) {
        Gm gm = this.c;
        if (gm != null) {
            gm.b.b(obj);
        } else {
            O90.o("togglesHolder");
            throw null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(boolean z) {
        this.b.execute(new RunnableC8389za(this, z, 5));
    }

    public final void a(LocationControllerObserver locationControllerObserver, boolean z) {
        this.b.execute(new AG(this, locationControllerObserver, z, 2));
    }

    public static final void a(Kb kb, LocationControllerObserver locationControllerObserver, boolean z) {
        kb.a.add(locationControllerObserver);
        if (z) {
            if (kb.d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    public static final void a(Kb kb, boolean z) {
        if (kb.d != z) {
            kb.d = z;
            InterfaceC6099nZ interfaceC6099nZ = z ? Ib.a : Jb.a;
            Iterator it = kb.a.iterator();
            while (it.hasNext()) {
                interfaceC6099nZ.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    public final void a(Object obj) {
        Gm gm = this.c;
        if (gm != null) {
            gm.b.a(obj);
        } else {
            O90.o("togglesHolder");
            throw null;
        }
    }

    public final void a(boolean z) {
        Gm gm = this.c;
        if (gm != null) {
            gm.a.a(z);
        } else {
            O90.o("togglesHolder");
            throw null;
        }
    }
}
