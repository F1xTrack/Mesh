package com.yandex.metrica.impl.ob;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.metrica.ConfigurationService;

/* loaded from: classes2.dex */
public class F6 implements H6, E6 {
    private final Context a;
    private final AlarmManager b;
    private Om c;

    public F6(Context context) {
        this(context, (AlarmManager) context.getSystemService("alarm"), new Nm());
    }

    public static PendingIntent a(F6 f6, Context context) {
        f6.getClass();
        try {
            return PendingIntent.getService(context, 7695435, new Intent(context, (Class<?>) ConfigurationService.class).setAction("com.yandex.metrica.configuration.ACTION_SCHEDULED_START"), U2.a(23) ? 201326592 : 134217728);
        } catch (Throwable unused) {
            return null;
        }
    }

    public F6(Context context, AlarmManager alarmManager, Om om) {
        this.a = context;
        this.b = alarmManager;
        this.c = om;
    }

    @Override // com.yandex.metrica.impl.ob.H6
    public void a(long j, boolean z) {
        AlarmManager alarmManager = this.b;
        if (alarmManager != null) {
            try {
                PendingIntent pendingIntentA = a(this, this.a);
                if (pendingIntentA != null) {
                    alarmManager.set(3, this.c.c() + j, pendingIntentA);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.H6
    public void a() {
        AlarmManager alarmManager = this.b;
        if (alarmManager != null) {
            try {
                PendingIntent pendingIntentA = a(this, this.a);
                if (pendingIntentA != null) {
                    alarmManager.cancel(pendingIntentA);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.E6
    public void a(Bundle bundle) {
        try {
            this.a.startService(new Intent().setComponent(new ComponentName(this.a.getPackageName(), ConfigurationService.class.getName())).setAction("com.yandex.metrica.configuration.ACTION_INIT").putExtras(bundle));
        } catch (Throwable unused) {
        }
    }
}
