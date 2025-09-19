package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p000.AbstractC1392W7;
import p000.C1329V7;
import p000.EnumC3909d8;
import p000.InterfaceC11047sY0;
import p000.JA0;
import p000.RunnableC8176Qp0;

@Keep
/* loaded from: classes.dex */
public class SessionManager extends AbstractC1392W7 {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final C1329V7 appStateMonitor;
    private final Set<WeakReference<InterfaceC11047sY0>> clients;
    private final GaugeManager gaugeManager;
    private JA0 perfSession;
    private Future syncInitFuture;

    public SessionManager(GaugeManager gaugeManager, JA0 ja0, C1329V7 c1329v7) {
        super(C1329V7.m8297a());
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = ja0;
        this.appStateMonitor = c1329v7;
        registerForAppState();
    }

    public static SessionManager getInstance() {
        return instance;
    }

    public void lambda$setApplicationContext$0(Context context, JA0 ja0) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (ja0.f5370c) {
            this.gaugeManager.logGaugeMetadata(ja0.f5368a, EnumC3909d8.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(EnumC3909d8 enumC3909d8) {
        JA0 ja0 = this.perfSession;
        if (ja0.f5370c) {
            this.gaugeManager.logGaugeMetadata(ja0.f5368a, enumC3909d8);
        }
    }

    private void startOrStopCollectingGauges(EnumC3909d8 enumC3909d8) {
        JA0 ja0 = this.perfSession;
        if (ja0.f5370c) {
            this.gaugeManager.startCollectingGauges(ja0, enumC3909d8);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        EnumC3909d8 enumC3909d8 = EnumC3909d8.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(enumC3909d8);
        startOrStopCollectingGauges(enumC3909d8);
    }

    @Override // p000.AbstractC1392W7, p000.InterfaceC1266U7
    public void onUpdateAppState(EnumC3909d8 enumC3909d8) {
        super.onUpdateAppState(enumC3909d8);
        if (this.appStateMonitor.f12377q) {
            return;
        }
        if (enumC3909d8 == EnumC3909d8.FOREGROUND) {
            updatePerfSession(JA0.m4242c(UUID.randomUUID().toString()));
        } else if (this.perfSession.m4244d()) {
            updatePerfSession(JA0.m4242c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(enumC3909d8);
        }
    }

    public final JA0 perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<InterfaceC11047sY0> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new RunnableC8176Qp0(this, context, this.perfSession, 8));
    }

    public void setPerfSession(JA0 ja0) {
        this.perfSession = ja0;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.m4244d()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<InterfaceC11047sY0> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(JA0 ja0) {
        if (ja0.f5368a == this.perfSession.f5368a) {
            return;
        }
        this.perfSession = ja0;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<InterfaceC11047sY0>> it = this.clients.iterator();
                while (it.hasNext()) {
                    InterfaceC11047sY0 interfaceC11047sY0 = it.next().get();
                    if (interfaceC11047sY0 != null) {
                        interfaceC11047sY0.mo9627a(ja0);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.f12375o);
        startOrStopCollectingGauges(this.appStateMonitor.f12375o);
    }

    private SessionManager() {
        this(GaugeManager.getInstance(), JA0.m4242c(UUID.randomUUID().toString()), C1329V7.m8297a());
    }
}
