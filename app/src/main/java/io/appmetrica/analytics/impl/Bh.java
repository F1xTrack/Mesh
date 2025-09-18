package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import defpackage.AbstractC8259yu;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.reactnative.AppMetricaModule;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class Bh implements Pa {
    public final Context a;
    public final Re b;
    public final Nh c;
    public final Handler d;
    public final Pk e;
    public final C4574gc f;
    public final LinkedHashMap g;
    public final Am h;
    public final List i;
    public Wb j;

    public Bh(Context context, Re re, Nh nh, Handler handler, Pk pk) {
        this.a = context;
        this.b = re;
        this.c = nh;
        this.d = handler;
        this.e = pk;
        this.f = new C4574gc(context, re, nh, pk);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.g = linkedHashMap;
        this.h = new Am(new Dh(linkedHashMap));
        this.i = AbstractC8259yu.f("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Qa
    public final Pa a() {
        return this;
    }

    public final Bh b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Pa
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized Wb a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z) {
        Wb wb;
        try {
            wb = this.j;
            if (wb == null) {
                this.h.a(appMetricaConfig.apiKey);
                this.f.a(appMetricaConfig, publicLogger);
                wb = new Wb(this.f);
                wb.i = new C4621ib(this.d, wb);
                Pk pk = this.e;
                Yg yg = wb.b;
                if (pk != null) {
                    yg.b.setUuid(pk.g());
                } else {
                    yg.getClass();
                }
                wb.a(appMetricaConfig, z);
                wb.l();
                this.c.f.c = new Ah(wb);
                this.g.put(appMetricaConfig.apiKey, wb);
                this.j = wb;
            }
        } finally {
        }
        return wb;
    }

    @Override // io.appmetrica.analytics.impl.Pa
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized Wb b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z) {
        Wb wb;
        try {
            wb = this.j;
            if (wb != null) {
                this.f.a(appMetricaConfig, publicLogger);
                wb.a(appMetricaConfig, z);
                C4805q4.h().getClass();
                this.g.put(appMetricaConfig.apiKey, wb);
            } else {
                this.h.a(appMetricaConfig.apiKey);
                this.f.a(appMetricaConfig, publicLogger);
                wb = new Wb(this.f);
                wb.i = new C4621ib(this.d, wb);
                Pk pk = this.e;
                Yg yg = wb.b;
                if (pk != null) {
                    yg.b.setUuid(pk.g());
                } else {
                    yg.getClass();
                }
                wb.a(appMetricaConfig, z);
                wb.l();
                this.c.f.c = new Ah(wb);
                this.g.put(appMetricaConfig.apiKey, wb);
                C4805q4.h().getClass();
                this.j = wb;
            }
        } catch (Throwable th) {
            throw th;
        }
        return wb;
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final synchronized void a(ReporterConfig reporterConfig) {
        try {
            if (this.g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", reporterConfig.apiKey);
            } else {
                b(reporterConfig);
                ImportantLogger.INSTANCE.info(AppMetricaModule.NAME, "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final synchronized Oa b(ReporterConfig reporterConfig) {
        Oa oa;
        try {
            oa = (Oa) this.g.get(reporterConfig.apiKey);
            if (oa == null) {
                if (!this.i.contains(reporterConfig.apiKey)) {
                    this.e.i();
                }
                Context context = this.a;
                C4645jc c4645jc = new C4645jc(context, this.b, reporterConfig, this.c, new J9(context));
                c4645jc.i = new C4621ib(this.d, c4645jc);
                Pk pk = this.e;
                Yg yg = c4645jc.b;
                if (pk != null) {
                    yg.b.setUuid(pk.g());
                } else {
                    yg.getClass();
                }
                c4645jc.l();
                this.g.put(reporterConfig.apiKey, c4645jc);
                oa = c4645jc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return oa;
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final synchronized Ra b(AppMetricaConfig appMetricaConfig) {
        Q2 c4759o6;
        try {
            c4759o6 = this.j;
            if (c4759o6 == null) {
                Context context = this.a;
                c4759o6 = new C4759o6(context, this.b, appMetricaConfig, this.c, new J9(context));
                c4759o6.i = new C4621ib(this.d, c4759o6);
                Pk pk = this.e;
                Yg yg = c4759o6.b;
                if (pk != null) {
                    yg.b.setUuid(pk.g());
                } else {
                    yg.getClass();
                }
                c4759o6.b(appMetricaConfig.errorEnvironment);
                c4759o6.l();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c4759o6;
    }
}
