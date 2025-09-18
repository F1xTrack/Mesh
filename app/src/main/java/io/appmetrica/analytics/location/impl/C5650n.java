package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.location.impl.n */
/* loaded from: classes2.dex */
public final class C5650n implements LocationListener {

    /* renamed from: a */
    public final C5652p f32985a;

    public C5650n(C5652p c5652p) {
        this.f32985a = c5652p;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            C5652p c5652p = this.f32985a;
            c5652p.getClass();
            String provider = location.getProvider();
            C5656t c5656t = (C5656t) c5652p.f32991e.get(provider);
            if (c5656t == null) {
                C5656t c5656t2 = new C5656t(c5652p.f32987a.f32965a);
                c5656t2.f32998c.add(c5652p.f32989c);
                Iterator it = c5652p.f32990d.iterator();
                while (it.hasNext()) {
                    c5656t2.f32998c.add((Consumer) it.next());
                }
                c5652p.f32991e.put(provider, c5656t2);
                c5656t = c5656t2;
            } else {
                c5656t.f32996a = c5652p.f32987a.f32965a;
            }
            if (c5656t.f32999d != null) {
                boolean zDidTimePassMillis = c5656t.f32997b.didTimePassMillis(c5656t.f33000e, c5656t.f32996a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z = location.distanceTo(c5656t.f32999d) > c5656t.f32996a.getUpdateDistanceInterval();
                boolean z2 = c5656t.f32999d == null || location.getTime() - c5656t.f32999d.getTime() >= 0;
                if ((!zDidTimePassMillis && !z) || !z2) {
                    return;
                }
            }
            c5656t.f32999d = location;
            c5656t.f33000e = System.currentTimeMillis();
            Iterator it2 = c5656t.f32998c.iterator();
            while (it2.hasNext()) {
                ((Consumer) it2.next()).consume(location);
            }
        }
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
