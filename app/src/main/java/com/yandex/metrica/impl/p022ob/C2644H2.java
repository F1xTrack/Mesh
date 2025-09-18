package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.yandex.metrica.MetricaService;

/* renamed from: com.yandex.metrica.impl.ob.H2 */
/* loaded from: classes2.dex */
public final class C2644H2 {

    /* renamed from: a */
    private static final C3039Wn f21337a = new C3039Wn();

    /* renamed from: a */
    public static Intent m14216a(Context context) {
        return new Intent(context, (Class<?>) MetricaService.class).setAction("com.yandex.metrica.IMetricaService").setData(new Uri.Builder().scheme("metrica").authority(context.getPackageName()).build()).addFlags(32);
    }

    /* renamed from: b */
    public static Intent m14217b(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Intent intentM14216a = m14216a(context);
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (Throwable unused) {
            applicationInfo = null;
        }
        try {
            bundle = applicationInfo.metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused2) {
            bundle = new Bundle();
        }
        Intent intentPutExtras = intentM14216a.putExtras(bundle);
        intentPutExtras.setData(intentPutExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", C2969U3.f22435c).build());
        C3690w2 c3690w2M17319a = C3768z2.m17317a(context).m17319a();
        intentPutExtras.putExtra("screen_size", c3690w2M17319a != null ? C3762ym.m17271a(c3690w2M17319a) : null);
        return intentPutExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
