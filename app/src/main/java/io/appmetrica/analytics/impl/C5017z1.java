package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5017z1 implements InterfaceC4754o1 {
    public final ICommonExecutor a;
    public final InterfaceC4754o1 b;
    public boolean c;

    public C5017z1(InterfaceC4754o1 interfaceC4754o1) {
        this(C4667ka.h().u().b(), interfaceC4754o1);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void a(Intent intent, int i) {
        this.a.execute(new C4825r1(this, intent, i));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void b(Intent intent) {
        this.a.execute(new C4921v1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void c(Intent intent) {
        this.a.execute(new C4897u1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void onConfigurationChanged(Configuration configuration) {
        this.a.execute(new C4778p1(this, configuration));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final synchronized void onCreate() {
        this.c = true;
        this.a.execute(new C4802q1(this));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void onDestroy() {
        this.a.removeAll();
        synchronized (this) {
            this.c = false;
        }
        this.b.onDestroy();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void pauseUserSession(Bundle bundle) {
        this.a.execute(new C4993y1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void reportData(int i, Bundle bundle) {
        this.a.execute(new C4945w1(this, i, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void resumeUserSession(Bundle bundle) {
        this.a.execute(new C4969x1(this, bundle));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void a(Intent intent, int i, int i2) {
        this.a.execute(new C4849s1(this, intent, i, i2));
    }

    public C5017z1(IHandlerExecutor iHandlerExecutor, InterfaceC4754o1 interfaceC4754o1) {
        this.c = false;
        this.a = iHandlerExecutor;
        this.b = interfaceC4754o1;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void a(Intent intent) {
        this.a.execute(new C4873t1(this, intent));
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4754o1
    public final void a(InterfaceC4730n1 interfaceC4730n1) {
        this.b.a(interfaceC4730n1);
    }
}
