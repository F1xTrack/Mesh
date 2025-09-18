package com.yandex.metrica.impl.p022ob;

import android.location.Location;
import com.yandex.metrica.impl.p022ob.C2981Uf;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.Jd */
/* loaded from: classes2.dex */
public class C2705Jd {
    /* renamed from: a */
    public C2981Uf.b m14439a(C3519pd c3519pd) {
        C2981Uf.b bVar = new C2981Uf.b();
        Location locationM16577c = c3519pd.m16577c();
        bVar.f22467b = c3519pd.m16576b() == null ? bVar.f22467b : c3519pd.m16576b().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.f22469d = timeUnit.toSeconds(locationM16577c.getTime());
        bVar.f22477l = C3196d2.m15724a(c3519pd.f24442a);
        bVar.f22468c = timeUnit.toSeconds(c3519pd.m16579e());
        bVar.f22478m = timeUnit.toSeconds(c3519pd.m16578d());
        bVar.f22470e = locationM16577c.getLatitude();
        bVar.f22471f = locationM16577c.getLongitude();
        bVar.f22472g = Math.round(locationM16577c.getAccuracy());
        bVar.f22473h = Math.round(locationM16577c.getBearing());
        bVar.f22474i = Math.round(locationM16577c.getSpeed());
        bVar.f22475j = (int) Math.round(locationM16577c.getAltitude());
        String provider = locationM16577c.getProvider();
        bVar.f22476k = "gps".equals(provider) ? 1 : "network".equals(provider) ? 2 : GplLibraryWrapper.FUSED_PROVIDER.equals(provider) ? 3 : 0;
        bVar.f22479n = C3196d2.m15723a(c3519pd.m16575a());
        return bVar;
    }
}
