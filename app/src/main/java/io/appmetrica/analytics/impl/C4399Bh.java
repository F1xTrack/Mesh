package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.reactnative.AppMetricaModule;
import java.util.LinkedHashMap;
import java.util.List;
import p000.AbstractC7230yu;

/* renamed from: io.appmetrica.analytics.impl.Bh */
/* loaded from: classes2.dex */
public final class C4399Bh implements InterfaceC4731Pa {

    /* renamed from: a */
    public final Context f29898a;

    /* renamed from: b */
    public final C4782Re f29899b;

    /* renamed from: c */
    public final C4690Nh f29900c;

    /* renamed from: d */
    public final Handler f29901d;

    /* renamed from: e */
    public final C4741Pk f29902e;

    /* renamed from: f */
    public final C5146gc f29903f;

    /* renamed from: g */
    public final LinkedHashMap f29904g;

    /* renamed from: h */
    public final C4379Am f29905h;

    /* renamed from: i */
    public final List f29906i;

    /* renamed from: j */
    public C4899Wb f29907j;

    public C4399Bh(Context context, C4782Re c4782Re, C4690Nh c4690Nh, Handler handler, C4741Pk c4741Pk) {
        this.f29898a = context;
        this.f29899b = c4782Re;
        this.f29900c = c4690Nh;
        this.f29901d = handler;
        this.f29902e = c4741Pk;
        this.f29903f = new C5146gc(context, c4782Re, c4690Nh, c4741Pk);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f29904g = linkedHashMap;
        this.f29905h = new C4379Am(new C4449Dh(linkedHashMap));
        this.f29906i = AbstractC7230yu.m26275f("20799a27-fa80-4b36-b2db-0f8141f24180", "0e5e9c33-f8c3-4568-86c5-2e4f57523f72");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4731Pa, io.appmetrica.analytics.impl.InterfaceC4755Qa
    /* renamed from: a */
    public final InterfaceC4731Pa mo19238a() {
        return this;
    }

    /* renamed from: b */
    public final C4399Bh m19240b() {
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4731Pa
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized C4899Wb mo19237a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z) {
        C4899Wb c4899Wb;
        try {
            c4899Wb = this.f29907j;
            if (c4899Wb == null) {
                this.f29905h.mo19211a(appMetricaConfig.apiKey);
                this.f29903f.m20452a(appMetricaConfig, publicLogger);
                c4899Wb = new C4899Wb(this.f29903f);
                c4899Wb.f30651i = new C5195ib(this.f29901d, c4899Wb);
                C4741Pk c4741Pk = this.f29902e;
                C4952Yg c4952Yg = c4899Wb.f30644b;
                if (c4741Pk != null) {
                    c4952Yg.f31090b.setUuid(c4741Pk.m19729g());
                } else {
                    c4952Yg.getClass();
                }
                c4899Wb.m19948a(appMetricaConfig, z);
                c4899Wb.mo19739l();
                this.f29900c.f30527f.f32155c = new C4374Ah(c4899Wb);
                this.f29904g.put(appMetricaConfig.apiKey, c4899Wb);
                this.f29907j = c4899Wb;
            }
        } finally {
        }
        return c4899Wb;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4731Pa
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final synchronized C4899Wb mo19241b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, boolean z) {
        C4899Wb c4899Wb;
        try {
            c4899Wb = this.f29907j;
            if (c4899Wb != null) {
                this.f29903f.m20452a(appMetricaConfig, publicLogger);
                c4899Wb.m19948a(appMetricaConfig, z);
                C5388q4.m20928h().getClass();
                this.f29904g.put(appMetricaConfig.apiKey, c4899Wb);
            } else {
                this.f29905h.mo19211a(appMetricaConfig.apiKey);
                this.f29903f.m20452a(appMetricaConfig, publicLogger);
                c4899Wb = new C4899Wb(this.f29903f);
                c4899Wb.f30651i = new C5195ib(this.f29901d, c4899Wb);
                C4741Pk c4741Pk = this.f29902e;
                C4952Yg c4952Yg = c4899Wb.f30644b;
                if (c4741Pk != null) {
                    c4952Yg.f31090b.setUuid(c4741Pk.m19729g());
                } else {
                    c4952Yg.getClass();
                }
                c4899Wb.m19948a(appMetricaConfig, z);
                c4899Wb.mo19739l();
                this.f29900c.f30527f.f32155c = new C4374Ah(c4899Wb);
                this.f29904g.put(appMetricaConfig.apiKey, c4899Wb);
                C5388q4.m20928h().getClass();
                this.f29907j = c4899Wb;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c4899Wb;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4731Pa
    /* renamed from: a */
    public final synchronized void mo19239a(ReporterConfig reporterConfig) {
        try {
            if (this.f29904g.containsKey(reporterConfig.apiKey)) {
                LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey).warning("Reporter with apiKey=%s already exists.", reporterConfig.apiKey);
            } else {
                mo19242b(reporterConfig);
                ImportantLogger.INSTANCE.info(AppMetricaModule.NAME, "Activate reporter with APIKey " + ApiKeyUtils.createPartialApiKey(reporterConfig.apiKey), new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4731Pa
    /* renamed from: b */
    public final synchronized InterfaceC4707Oa mo19242b(ReporterConfig reporterConfig) {
        InterfaceC4707Oa interfaceC4707Oa;
        try {
            interfaceC4707Oa = (InterfaceC4707Oa) this.f29904g.get(reporterConfig.apiKey);
            if (interfaceC4707Oa == null) {
                if (!this.f29906i.contains(reporterConfig.apiKey)) {
                    this.f29902e.m19731i();
                }
                Context context = this.f29898a;
                C5221jc c5221jc = new C5221jc(context, this.f29899b, reporterConfig, this.f29900c, new C4586J9(context));
                c5221jc.f30651i = new C5195ib(this.f29901d, c5221jc);
                C4741Pk c4741Pk = this.f29902e;
                C4952Yg c4952Yg = c5221jc.f30644b;
                if (c4741Pk != null) {
                    c4952Yg.f31090b.setUuid(c4741Pk.m19729g());
                } else {
                    c4952Yg.getClass();
                }
                c5221jc.mo19739l();
                this.f29904g.put(reporterConfig.apiKey, c5221jc);
                interfaceC4707Oa = c5221jc;
            }
        } catch (Throwable th) {
            throw th;
        }
        return interfaceC4707Oa;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4731Pa
    /* renamed from: b */
    public final synchronized InterfaceC4778Ra mo19243b(AppMetricaConfig appMetricaConfig) {
        AbstractC4747Q2 c5340o6;
        try {
            c5340o6 = this.f29907j;
            if (c5340o6 == null) {
                Context context = this.f29898a;
                c5340o6 = new C5340o6(context, this.f29899b, appMetricaConfig, this.f29900c, new C4586J9(context));
                c5340o6.f30651i = new C5195ib(this.f29901d, c5340o6);
                C4741Pk c4741Pk = this.f29902e;
                C4952Yg c4952Yg = c5340o6.f30644b;
                if (c4741Pk != null) {
                    c4952Yg.f31090b.setUuid(c4741Pk.m19729g());
                } else {
                    c4952Yg.getClass();
                }
                c5340o6.m19735b(appMetricaConfig.errorEnvironment);
                c5340o6.mo19739l();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c5340o6;
    }
}
