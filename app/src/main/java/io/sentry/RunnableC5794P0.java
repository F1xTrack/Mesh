package io.sentry;

import com.google.android.gms.common.Scopes;
import com.yandex.metrica.C2460e;
import io.sentry.cache.C5993e;
import io.sentry.config.AbstractC6003a;
import io.sentry.protocol.C6102r;
import io.sentry.protocol.EnumC6080C;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/* renamed from: io.sentry.P0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5794P0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33363a;

    /* renamed from: b */
    public final /* synthetic */ C5759D1 f33364b;

    public /* synthetic */ RunnableC5794P0(C5759D1 c5759d1, int i) {
        this.f33363a = i;
        this.f33364b = c5759d1;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalArgumentException {
        switch (this.f33363a) {
            case 0:
                this.f33364b.loadLazyFields();
                return;
            case 1:
                C5759D1 c5759d1 = this.f33364b;
                String cacheDirPathWithoutDsn = c5759d1.getCacheDirPathWithoutDsn();
                if (cacheDirPathWithoutDsn != null) {
                    File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                    try {
                        AbstractC6003a.m21744c(file);
                        if (c5759d1.isEnableAppStartProfiling()) {
                            if (!c5759d1.isTracingEnabled()) {
                                c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                return;
                            }
                            if (file.createNewFile()) {
                                C5805T0 c5805t0 = new C5805T0(c5759d1, new C5774I1(c5759d1, 1).m21404c(new C2460e(new C5824Z1("app.launch", EnumC6080C.CUSTOM, Scopes.PROFILE, null))));
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, AbstractC5802S0.f33392d));
                                    try {
                                        c5759d1.getSerializer().mo21461e(c5805t0, bufferedWriter);
                                        bufferedWriter.close();
                                        fileOutputStream.close();
                                        return;
                                    } finally {
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Unable to create app start profiling config file. ", th);
                        return;
                    }
                }
                return;
            case 2:
                C5759D1 c5759d12 = this.f33364b;
                for (InterfaceC5781L interfaceC5781L : c5759d12.getOptionsObservers()) {
                    String release = c5759d12.getRelease();
                    C5993e c5993e = (C5993e) interfaceC5781L;
                    if (release == null) {
                        c5993e.m21714a("release.json");
                    } else {
                        c5993e.m21715b(release, "release.json");
                    }
                    String proguardUuid = c5759d12.getProguardUuid();
                    if (proguardUuid == null) {
                        c5993e.m21714a("proguard-uuid.json");
                    } else {
                        c5993e.m21715b(proguardUuid, "proguard-uuid.json");
                    }
                    C6102r sdkVersion = c5759d12.getSdkVersion();
                    if (sdkVersion == null) {
                        c5993e.m21714a("sdk-version.json");
                    } else {
                        c5993e.m21715b(sdkVersion, "sdk-version.json");
                    }
                    String dist = c5759d12.getDist();
                    if (dist == null) {
                        c5993e.m21714a("dist.json");
                    } else {
                        c5993e.m21715b(dist, "dist.json");
                    }
                    String environment = c5759d12.getEnvironment();
                    if (environment == null) {
                        c5993e.m21714a("environment.json");
                    } else {
                        c5993e.m21715b(environment, "environment.json");
                    }
                    c5993e.m21715b(c5759d12.getTags(), "tags.json");
                    Double d = c5759d12.getSessionReplay().f33284b;
                    if (d == null) {
                        c5993e.m21714a("replay-error-sample-rate.json");
                    } else {
                        c5993e.m21715b(d.toString(), "replay-error-sample-rate.json");
                    }
                }
                return;
            default:
                C5760E.f33234a.mo21374t(this.f33364b.getFlushTimeoutMillis());
                return;
        }
    }
}
