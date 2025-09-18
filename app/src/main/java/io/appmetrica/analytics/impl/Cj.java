package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.internal.AppMetricaService;

/* loaded from: classes2.dex */
public abstract class Cj {
    public static final SafePackageManager a = new SafePackageManager();

    public static Intent a(Context context) {
        Bundle bundle;
        C4842ri c4842ri;
        Intent intentAddFlags = new Intent(context, (Class<?>) AppMetricaService.class).setAction("io.appmetrica.analytics.IAppMetricaService").setData(new Uri.Builder().scheme("appmetrica").authority(context.getPackageName()).build()).addFlags(32);
        try {
            bundle = a.getApplicationInfo(context, context.getPackageName(), 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
        } catch (Throwable unused) {
            bundle = new Bundle();
        }
        Intent intentPutExtras = intentAddFlags.putExtras(bundle);
        intentPutExtras.setData(intentPutExtras.getData().buildUpon().path("client").appendQueryParameter("pid", String.valueOf(Process.myPid())).appendQueryParameter("psid", Re.c).build());
        C4805q4 c4805q4H = C4805q4.h();
        synchronized (c4805q4H) {
            try {
                if (c4805q4H.o == null) {
                    C4842ri c4842ri2 = new C4842ri();
                    c4805q4H.o = c4842ri2;
                    c4805q4H.h.a(c4842ri2);
                }
                c4842ri = c4805q4H.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        ScreenInfo screenInfoA = c4842ri.a(context);
        intentPutExtras.putExtra("screen_size", screenInfoA == null ? null : AbstractC4450bb.a(screenInfoA));
        return intentPutExtras.setPackage(context.getApplicationContext().getPackageName());
    }
}
