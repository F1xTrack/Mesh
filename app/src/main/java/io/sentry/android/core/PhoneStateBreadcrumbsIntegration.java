package io.sentry.android.core;

import android.content.Context;
import android.telephony.TelephonyManager;
import io.sentry.C5759D1;
import io.sentry.EnumC6069n1;
import io.sentry.InterfaceC5819Y;
import io.sentry.config.AbstractC6003a;
import java.io.Closeable;
import p000.O91;

/* loaded from: classes2.dex */
public final class PhoneStateBreadcrumbsIntegration implements InterfaceC5819Y, Closeable {

    /* renamed from: a */
    public final Context f33574a;

    /* renamed from: b */
    public SentryAndroidOptions f33575b;

    /* renamed from: c */
    public C5849V f33576c;

    /* renamed from: d */
    public TelephonyManager f33577d;

    /* renamed from: e */
    public boolean f33578e = false;

    /* renamed from: f */
    public final Object f33579f = new Object();

    public PhoneStateBreadcrumbsIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f33574a = applicationContext != null ? applicationContext : context;
    }

    /* renamed from: a */
    public final void m21539a(C5759D1 c5759d1) {
        TelephonyManager telephonyManager = (TelephonyManager) this.f33574a.getSystemService("phone");
        this.f33577d = telephonyManager;
        if (telephonyManager == null) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "TelephonyManager is not available", new Object[0]);
            return;
        }
        try {
            C5849V c5849v = new C5849V();
            this.f33576c = c5849v;
            this.f33577d.listen(c5849v, 32);
            c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "PhoneStateBreadcrumbsIntegration installed.", new Object[0]);
            AbstractC6003a.m21742a("PhoneStateBreadcrumbs");
        } catch (Throwable th) {
            c5759d1.getLogger().mo21405c(EnumC6069n1.INFO, th, "TelephonyManager is not available or ready to use.", new Object[0]);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C5849V c5849v;
        synchronized (this.f33579f) {
            this.f33578e = true;
        }
        TelephonyManager telephonyManager = this.f33577d;
        if (telephonyManager == null || (c5849v = this.f33576c) == null) {
            return;
        }
        telephonyManager.listen(c5849v, 0);
        this.f33576c = null;
        SentryAndroidOptions sentryAndroidOptions = this.f33575b;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "PhoneStateBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC5819Y
    /* renamed from: e */
    public final void mo21468e(C5759D1 c5759d1) {
        SentryAndroidOptions sentryAndroidOptions = c5759d1 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c5759d1 : null;
        AbstractC6003a.m21735D(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f33575b = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().mo21407k(EnumC6069n1.DEBUG, "enableSystemEventBreadcrumbs enabled: %s", Boolean.valueOf(this.f33575b.isEnableSystemEventBreadcrumbs()));
        if (this.f33575b.isEnableSystemEventBreadcrumbs() && AbstractC6003a.m21761u(this.f33574a, "android.permission.READ_PHONE_STATE")) {
            try {
                c5759d1.getExecutorService().submit(new O91(this, 23, c5759d1));
            } catch (Throwable th) {
                c5759d1.getLogger().mo21406d(EnumC6069n1.DEBUG, "Failed to start PhoneStateBreadcrumbsIntegration on executor thread.", th);
            }
        }
    }
}
