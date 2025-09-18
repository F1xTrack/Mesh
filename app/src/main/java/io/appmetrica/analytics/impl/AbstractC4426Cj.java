package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.internal.AppMetricaService;

/* renamed from: io.appmetrica.analytics.impl.Cj */
/* loaded from: classes2.dex */
public abstract class AbstractC4426Cj {

    /* renamed from: a */
    public static final SafePackageManager f29970a = new SafePackageManager();

    /* renamed from: a */
    public static Intent m19284a(Context context) {
        Bundle bundle;
        C5427ri c5427ri;
        Intent intentAddFlags = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme("appmetrica").authority(context.getPackageName()).build()).addFlags(32);
        try {
            bundle = f29970a.getApplicationInfo(context, context.getPackageName(), 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused) {
            bundle = new Bundle();
        }
        Intent intentPutExtras = intentAddFlags.putExtras(bundle);
        intentPutExtras.setData(intentPutExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", C4782Re.f30695c).build());
        C5388q4 c5388q4M20928h = C5388q4.m20928h();
        synchronized (c5388q4M20928h) {
            try {
                if (c5388q4M20928h.f32432o == null) {
                    C5427ri c5427ri2 = new C5427ri();
                    c5388q4M20928h.f32432o = c5427ri2;
                    c5388q4M20928h.f32425h.m20662a(c5427ri2);
                }
                c5427ri = c5388q4M20928h.f32432o;
            } catch (Throwable th) {
                throw th;
            }
        }
        ScreenInfo screenInfoM21016a = c5427ri.m21016a(context);
        intentPutExtras.putExtra("screen_size", screenInfoM21016a == null ? null : AbstractC5020bb.m20169a(screenInfoM21016a));
        return intentPutExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
