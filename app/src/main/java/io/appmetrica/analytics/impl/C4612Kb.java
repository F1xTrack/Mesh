package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.control.ToggleObserver;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p000.InterfaceC6497nZ;
import p000.O90;
import p000.RunnableC0017AG;
import p000.RunnableC7273za;

/* renamed from: io.appmetrica.analytics.impl.Kb */
/* loaded from: classes2.dex */
public final class C4612Kb implements InterfaceC4540Hb, ToggleObserver {

    /* renamed from: a */
    public final ArrayList f30395a = new ArrayList();

    /* renamed from: b */
    public final IHandlerExecutor f30396b = C5244ka.m20614h().m20636u().m21140c();

    /* renamed from: c */
    public C4527Gm f30397c;

    /* renamed from: d */
    public boolean f30398d;

    /* renamed from: a */
    public final void m19550a(Toggle toggle) {
        C4527Gm c4527Gm = new C4527Gm(toggle);
        this.f30397c = c4527Gm;
        c4527Gm.f30204c.registerObserver(this, true);
    }

    /* renamed from: b */
    public final void m19554b(Object obj) {
        C4527Gm c4527Gm = this.f30397c;
        if (c4527Gm != null) {
            c4527Gm.f30203b.m21229b(obj);
        } else {
            O90.m5977o("togglesHolder");
            throw null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.ToggleObserver
    public final void onStateChanged(boolean z) {
        this.f30396b.execute(new RunnableC7273za(this, z, 5));
    }

    /* renamed from: a */
    public final void m19551a(LocationControllerObserver locationControllerObserver, boolean z) {
        this.f30396b.execute(new RunnableC0017AG(this, locationControllerObserver, z, 2));
    }

    /* renamed from: a */
    public static final void m19548a(C4612Kb c4612Kb, LocationControllerObserver locationControllerObserver, boolean z) {
        c4612Kb.f30395a.add(locationControllerObserver);
        if (z) {
            if (c4612Kb.f30398d) {
                locationControllerObserver.startLocationTracking();
            } else {
                locationControllerObserver.stopLocationTracking();
            }
        }
    }

    /* renamed from: a */
    public static final void m19549a(C4612Kb c4612Kb, boolean z) {
        if (c4612Kb.f30398d != z) {
            c4612Kb.f30398d = z;
            InterfaceC6497nZ interfaceC6497nZ = z ? C4564Ib.f30279a : C4588Jb.f30359a;
            Iterator it = c4612Kb.f30395a.iterator();
            while (it.hasNext()) {
                interfaceC6497nZ.invoke((LocationControllerObserver) it.next());
            }
        }
    }

    /* renamed from: a */
    public final void m19552a(Object obj) {
        C4527Gm c4527Gm = this.f30397c;
        if (c4527Gm != null) {
            c4527Gm.f30203b.m21228a(obj);
        } else {
            O90.m5977o("togglesHolder");
            throw null;
        }
    }

    /* renamed from: a */
    public final void m19553a(boolean z) {
        C4527Gm c4527Gm = this.f30397c;
        if (c4527Gm != null) {
            c4527Gm.f30202a.m19901a(z);
        } else {
            O90.m5977o("togglesHolder");
            throw null;
        }
    }
}
