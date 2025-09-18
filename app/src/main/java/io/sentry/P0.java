package io.sentry;

import com.google.android.gms.common.Scopes;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/* loaded from: classes2.dex */
public final /* synthetic */ class P0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ D1 b;

    public /* synthetic */ P0(D1 d1, int i) {
        this.a = i;
        this.b = d1;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalArgumentException {
        switch (this.a) {
            case 0:
                this.b.loadLazyFields();
                return;
            case 1:
                D1 d1 = this.b;
                String cacheDirPathWithoutDsn = d1.getCacheDirPathWithoutDsn();
                if (cacheDirPathWithoutDsn != null) {
                    File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                    try {
                        io.sentry.config.a.c(file);
                        if (d1.isEnableAppStartProfiling()) {
                            if (!d1.isTracingEnabled()) {
                                d1.getLogger().k(EnumC5148n1.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                return;
                            }
                            if (file.createNewFile()) {
                                T0 t0 = new T0(d1, new I1(d1, 1).c(new com.yandex.metrica.e(new Z1("app.launch", io.sentry.protocol.C.CUSTOM, Scopes.PROFILE, null))));
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, S0.d));
                                    try {
                                        d1.getSerializer().e(t0, bufferedWriter);
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
                        d1.getLogger().d(EnumC5148n1.ERROR, "Unable to create app start profiling config file. ", th);
                        return;
                    }
                }
                return;
            case 2:
                D1 d12 = this.b;
                for (L l : d12.getOptionsObservers()) {
                    String release = d12.getRelease();
                    io.sentry.cache.e eVar = (io.sentry.cache.e) l;
                    if (release == null) {
                        eVar.a("release.json");
                    } else {
                        eVar.b(release, "release.json");
                    }
                    String proguardUuid = d12.getProguardUuid();
                    if (proguardUuid == null) {
                        eVar.a("proguard-uuid.json");
                    } else {
                        eVar.b(proguardUuid, "proguard-uuid.json");
                    }
                    io.sentry.protocol.r sdkVersion = d12.getSdkVersion();
                    if (sdkVersion == null) {
                        eVar.a("sdk-version.json");
                    } else {
                        eVar.b(sdkVersion, "sdk-version.json");
                    }
                    String dist = d12.getDist();
                    if (dist == null) {
                        eVar.a("dist.json");
                    } else {
                        eVar.b(dist, "dist.json");
                    }
                    String environment = d12.getEnvironment();
                    if (environment == null) {
                        eVar.a("environment.json");
                    } else {
                        eVar.b(environment, "environment.json");
                    }
                    eVar.b(d12.getTags(), "tags.json");
                    Double d = d12.getSessionReplay().b;
                    if (d == null) {
                        eVar.a("replay-error-sample-rate.json");
                    } else {
                        eVar.b(d.toString(), "replay-error-sample-rate.json");
                    }
                }
                return;
            default:
                E.a.t(this.b.getFlushTimeoutMillis());
                return;
        }
    }
}
