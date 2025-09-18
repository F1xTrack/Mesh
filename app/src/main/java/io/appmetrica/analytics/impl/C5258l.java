package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.l */
/* loaded from: classes2.dex */
public final class C5258l implements InterfaceC5308n {

    /* renamed from: a */
    public final HashSet f32114a = new HashSet();

    public C5258l(C5358p c5358p) {
        c5358p.m20894a(this, new EnumC5283m[0]);
    }

    /* renamed from: a */
    public final synchronized void m20662a(InterfaceC5233k interfaceC5233k) {
        this.f32114a.add(interfaceC5233k);
    }

    /* renamed from: a */
    public final void m20661a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f32114a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C5427ri) ((InterfaceC5233k) it.next())).m21017a(activity);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5308n
    /* renamed from: a */
    public final void mo6433a(Activity activity, EnumC5283m enumC5283m) {
        C5388q4.m20928h().f32420c.m20407a().execute(new RunnableC5208j(this, activity));
    }
}
