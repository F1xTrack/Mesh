package com.yandex.metrica.impl.p022ob;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.metrica.ConfigurationService;

/* renamed from: com.yandex.metrica.impl.ob.F6 */
/* loaded from: classes2.dex */
public class C2598F6 implements InterfaceC2648H6, InterfaceC2573E6 {

    /* renamed from: a */
    private final Context f21173a;

    /* renamed from: b */
    private final AlarmManager f21174b;

    /* renamed from: c */
    private InterfaceC2839Om f21175c;

    public C2598F6(Context context) {
        this(context, (AlarmManager) context.getSystemService("alarm"), new C2814Nm());
    }

    /* renamed from: a */
    public static PendingIntent m14063a(C2598F6 c2598f6, Context context) {
        c2598f6.getClass();
        try {
            return PendingIntent.getService(context, 7695435, new Intent(context, (Class<?>) ConfigurationService.class).setAction("com.yandex.metrica.configuration.ACTION_SCHEDULED_START"), C2968U2.m15243a(23) ? 201326592 : 134217728);
        } catch (Throwable unused) {
            return null;
        }
    }

    public C2598F6(Context context, AlarmManager alarmManager, InterfaceC2839Om interfaceC2839Om) {
        this.f21173a = context;
        this.f21174b = alarmManager;
        this.f21175c = interfaceC2839Om;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2648H6
    /* renamed from: a */
    public void mo13983a(long j, boolean z) {
        AlarmManager alarmManager = this.f21174b;
        if (alarmManager != null) {
            try {
                PendingIntent pendingIntentM14063a = m14063a(this, this.f21173a);
                if (pendingIntentM14063a != null) {
                    alarmManager.set(3, this.f21175c.mo14676c() + j, pendingIntentM14063a);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2648H6
    /* renamed from: a */
    public void mo13982a() {
        AlarmManager alarmManager = this.f21174b;
        if (alarmManager != null) {
            try {
                PendingIntent pendingIntentM14063a = m14063a(this, this.f21173a);
                if (pendingIntentM14063a != null) {
                    alarmManager.cancel(pendingIntentM14063a);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2573E6
    /* renamed from: a */
    public void mo13984a(Bundle bundle) {
        try {
            this.f21173a.startService(new Intent().setComponent(new ComponentName(this.f21173a.getPackageName(), ConfigurationService.class.getName())).setAction("com.yandex.metrica.configuration.ACTION_INIT").putExtras(bundle));
        } catch (Throwable unused) {
        }
    }
}
