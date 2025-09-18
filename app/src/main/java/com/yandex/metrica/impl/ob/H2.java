package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import com.yandex.metrica.MetricaService;

/* loaded from: classes2.dex */
public final class H2 {
    private static final Wn a = new Wn();

    public static Intent a(Context context) {
        return new Intent(context, (Class<?>) MetricaService.class).setAction("com.yandex.metrica.IMetricaService").setData(new Uri.Builder().scheme("metrica").authority(context.getPackageName()).build()).addFlags(32);
    }

    public static Intent b(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Intent intentA = a(context);
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
        Intent intentPutExtras = intentA.putExtras(bundle);
        intentPutExtras.setData(intentPutExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", U3.c).build());
        C3170w2 c3170w2A = C3245z2.a(context).a();
        intentPutExtras.putExtra("screen_size", c3170w2A != null ? C3240ym.a(c3170w2A) : null);
        return intentPutExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
