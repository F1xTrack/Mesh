package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.z1 */
/* loaded from: classes2.dex */
public final class C5610z1 implements InterfaceC5335o1 {

    /* renamed from: a */
    public final ICommonExecutor f32900a;

    /* renamed from: b */
    public final InterfaceC5335o1 f32901b;

    /* renamed from: c */
    public boolean f32902c;

    public C5610z1(InterfaceC5335o1 interfaceC5335o1) {
        this(C5244ka.m20614h().m20636u().m21139b(), interfaceC5335o1);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    /* renamed from: a */
    public final void mo19250a(Intent intent, int i) {
        this.f32900a.execute(new C5410r1(this, intent, i));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    /* renamed from: b */
    public final void mo19255b(Intent intent) {
        this.f32900a.execute(new C5510v1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    /* renamed from: c */
    public final void mo19257c(Intent intent) {
        this.f32900a.execute(new C5485u1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    public final void onConfigurationChanged(Configuration configuration) {
        this.f32900a.execute(new C5360p1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    public final synchronized void onCreate() {
        this.f32902c = true;
        this.f32900a.execute(new C5385q1(this));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    public final void onDestroy() {
        this.f32900a.removeAll();
        synchronized (this) {
            this.f32902c = false;
        }
        this.f32901b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    public final void pauseUserSession(Bundle bundle) {
        this.f32900a.execute(new C5585y1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    public final void reportData(int i, Bundle bundle) {
        this.f32900a.execute(new C5535w1(this, i, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    public final void resumeUserSession(Bundle bundle) {
        this.f32900a.execute(new C5560x1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    /* renamed from: a */
    public final void mo19251a(Intent intent, int i, int i2) {
        this.f32900a.execute(new C5435s1(this, intent, i, i2));
    }

    public C5610z1(IHandlerExecutor iHandlerExecutor, InterfaceC5335o1 interfaceC5335o1) {
        this.f32902c = false;
        this.f32900a = iHandlerExecutor;
        this.f32901b = interfaceC5335o1;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    /* renamed from: a */
    public final void mo19249a(Intent intent) {
        this.f32900a.execute(new C5460t1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5335o1
    /* renamed from: a */
    public final void mo19253a(InterfaceC5310n1 interfaceC5310n1) {
        this.f32901b.mo19253a(interfaceC5310n1);
    }
}
