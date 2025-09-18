package com.yandex.metrica.impl.p022ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import com.yandex.metrica.MetricaService;

/* renamed from: com.yandex.metrica.impl.ob.Em */
/* loaded from: classes2.dex */
public final class RunnableC2589Em implements Runnable {

    /* renamed from: a */
    final Context f21157a;

    public RunnableC2589Em(Context context) {
        this.f21157a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        PackageInfo packageInfo;
        Context context = this.f21157a;
        try {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 516);
            } catch (Throwable unused) {
                packageInfo = null;
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (MetricaService.class.getName().equals(serviceInfo.name) && !serviceInfo.enabled) {
                        try {
                            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) MetricaService.class), 1, 1);
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
