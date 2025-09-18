package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5819Y;
import io.sentry.config.AbstractC6003a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import p000.O91;

/* loaded from: classes2.dex */
public final class SystemEventsBreadcrumbsIntegration implements InterfaceC5819Y, Closeable {

    /* renamed from: a */
    public final Context f33609a;

    /* renamed from: b */
    public C5868g0 f33610b;

    /* renamed from: c */
    public SentryAndroidOptions f33611c;

    /* renamed from: d */
    public final ArrayList f33612d;

    /* renamed from: e */
    public boolean f33613e;

    /* renamed from: f */
    public final Object f33614f;

    public SystemEventsBreadcrumbsIntegration(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.appwidget.action.APPWIDGET_DELETED");
        arrayList.add("android.appwidget.action.APPWIDGET_DISABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_ENABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_HOST_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS");
        arrayList.add("android.intent.action.ACTION_POWER_CONNECTED");
        arrayList.add("android.intent.action.ACTION_POWER_DISCONNECTED");
        arrayList.add("android.intent.action.ACTION_SHUTDOWN");
        arrayList.add("android.intent.action.AIRPLANE_MODE");
        arrayList.add("android.intent.action.BATTERY_LOW");
        arrayList.add("android.intent.action.BATTERY_OKAY");
        arrayList.add("android.intent.action.BATTERY_CHANGED");
        arrayList.add(Core.ScheduledPublisher.BOOT_EVENT);
        arrayList.add("android.intent.action.CAMERA_BUTTON");
        arrayList.add("android.intent.action.CONFIGURATION_CHANGED");
        arrayList.add("android.intent.action.CONTENT_CHANGED");
        arrayList.add("android.intent.action.DATE_CHANGED");
        arrayList.add("android.intent.action.DEVICE_STORAGE_LOW");
        arrayList.add("android.intent.action.DEVICE_STORAGE_OK");
        arrayList.add("android.intent.action.DOCK_EVENT");
        arrayList.add("android.intent.action.DREAMING_STARTED");
        arrayList.add("android.intent.action.DREAMING_STOPPED");
        arrayList.add("android.intent.action.INPUT_METHOD_CHANGED");
        arrayList.add("android.intent.action.LOCALE_CHANGED");
        arrayList.add("android.intent.action.REBOOT");
        arrayList.add("android.intent.action.SCREEN_OFF");
        arrayList.add("android.intent.action.SCREEN_ON");
        arrayList.add("android.intent.action.TIMEZONE_CHANGED");
        arrayList.add("android.intent.action.TIME_SET");
        arrayList.add("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        arrayList.add("android.os.action.POWER_SAVE_MODE_CHANGED");
        arrayList.add("android.intent.action.APP_ERROR");
        arrayList.add("android.intent.action.BUG_REPORT");
        arrayList.add("android.intent.action.MEDIA_BAD_REMOVAL");
        arrayList.add("android.intent.action.MEDIA_MOUNTED");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTABLE");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTED");
        this.f33613e = false;
        this.f33614f = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f33609a = applicationContext != null ? applicationContext : context;
        this.f33612d = arrayList;
    }

    /* renamed from: a */
    public final void m21543a(SentryAndroidOptions sentryAndroidOptions) {
        this.f33610b = new C5868g0(sentryAndroidOptions);
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = this.f33612d.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        try {
            Context context = this.f33609a;
            C5868g0 c5868g0 = this.f33610b;
            AbstractC6003a.m21735D(sentryAndroidOptions.getLogger(), "The ILogger object is required.");
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(c5868g0, intentFilter, 2);
            } else {
                context.registerReceiver(c5868g0, intentFilter);
            }
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
            AbstractC6003a.m21742a("SystemEventsBreadcrumbs");
        } catch (Throwable th) {
            sentryAndroidOptions.setEnableSystemEventBreadcrumbs(false);
            sentryAndroidOptions.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f33614f) {
            this.f33613e = true;
        }
        C5868g0 c5868g0 = this.f33610b;
        if (c5868g0 != null) {
            this.f33609a.unregisterReceiver(c5868g0);
            this.f33610b = null;
            SentryAndroidOptions sentryAndroidOptions = this.f33611c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "SystemEventsBreadcrumbsIntegration remove.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        SentryAndroidOptions sentryAndroidOptions = c5759d1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5759d1 : null;
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f33611c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f33611c.isEnableSystemEventBreadcrumbs()));
        if (this.f33611c.isEnableSystemEventBreadcrumbs()) {
            try {
                c5759d1.getExecutorService().submit(new O91(this, 24, c5759d1));
            } catch (Throwable th) {
                c5759d1.getLogger().mo21406d(EnumC6069n1.DEBUG, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", th);
            }
        }
    }
}
