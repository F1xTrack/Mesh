package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: io.appmetrica.analytics.impl.h2 */
/* loaded from: classes2.dex */
public final class C5161h2 implements InterfaceC5528vj, ApplicationStateProvider {

    /* renamed from: a */
    public final HashSet f31821a = new HashSet();

    /* renamed from: b */
    public final HashSet f31822b = new HashSet();

    /* renamed from: c */
    public volatile ApplicationState f31823c = ApplicationState.UNKNOWN;

    /* renamed from: d */
    public final CopyOnWriteArraySet f31824d = new CopyOnWriteArraySet();

    /* renamed from: a */
    public final void m20478a(int i) {
        this.f31821a.remove(Integer.valueOf(i));
        m20477a();
    }

    /* renamed from: b */
    public final void m20479b(int i) {
        this.f31822b.add(Integer.valueOf(i));
        this.f31821a.remove(Integer.valueOf(i));
        m20477a();
    }

    /* renamed from: c */
    public final void m20480c(int i) {
        this.f31821a.add(Integer.valueOf(i));
        this.f31822b.remove(Integer.valueOf(i));
        m20477a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState getCurrentState() {
        return this.f31823c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5528vj
    public final void onCreate() {
        m20477a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5528vj
    public final void onDestroy() {
        if (this.f31823c == ApplicationState.VISIBLE) {
            this.f31823c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    public final ApplicationState registerStickyObserver(ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f31824d.add(applicationStateObserver);
        }
        return this.f31823c;
    }

    /* renamed from: a */
    public final void m20477a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f31821a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f31822b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f31823c != applicationState) {
            this.f31823c = applicationState;
            Iterator it = this.f31824d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f31823c);
            }
        }
    }
}
