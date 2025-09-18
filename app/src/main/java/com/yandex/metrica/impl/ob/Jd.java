package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.impl.ob.Uf;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class Jd {
    public Uf.b a(C3002pd c3002pd) {
        Uf.b bVar = new Uf.b();
        Location locationC = c3002pd.c();
        bVar.b = c3002pd.b() == null ? bVar.b : c3002pd.b().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.d = timeUnit.toSeconds(locationC.getTime());
        bVar.l = C2692d2.a(c3002pd.a);
        bVar.c = timeUnit.toSeconds(c3002pd.e());
        bVar.m = timeUnit.toSeconds(c3002pd.d());
        bVar.e = locationC.getLatitude();
        bVar.f = locationC.getLongitude();
        bVar.g = Math.round(locationC.getAccuracy());
        bVar.h = Math.round(locationC.getBearing());
        bVar.i = Math.round(locationC.getSpeed());
        bVar.j = (int) Math.round(locationC.getAltitude());
        String provider = locationC.getProvider();
        bVar.k = "gps".equals(provider) ? 1 : "network".equals(provider) ? 2 : GplLibraryWrapper.FUSED_PROVIDER.equals(provider) ? 3 : 0;
        bVar.n = C2692d2.a(c3002pd.a());
        return bVar;
    }
}
