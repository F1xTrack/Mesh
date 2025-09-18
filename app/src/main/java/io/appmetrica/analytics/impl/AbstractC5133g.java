package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.g */
/* loaded from: classes2.dex */
public abstract class AbstractC5133g {

    /* renamed from: a */
    public final C5139g5 f31699a;

    /* renamed from: b */
    public final C4835Tj f31700b;

    /* renamed from: c */
    public final C4931Xj f31701c;

    /* renamed from: d */
    public final C4811Sj f31702d;

    /* renamed from: e */
    public final InterfaceC4707Oa f31703e;

    /* renamed from: f */
    public final SystemTimeProvider f31704f;

    public AbstractC5133g(C5139g5 c5139g5, C4835Tj c4835Tj, C4931Xj c4931Xj, C4811Sj c4811Sj, InterfaceC4707Oa interfaceC4707Oa, SystemTimeProvider systemTimeProvider) {
        this.f31699a = c5139g5;
        this.f31700b = c4835Tj;
        this.f31701c = c4931Xj;
        this.f31702d = c4811Sj;
        this.f31703e = interfaceC4707Oa;
        this.f31704f = systemTimeProvider;
    }

    /* renamed from: a */
    public final /* bridge */ C4524Gj m20398a(Object obj) {
        return m20397a((C4548Hj) obj);
    }

    /* renamed from: b */
    public final C4524Gj m20400b() {
        if (this.f31701c.m19997h()) {
            return new C4524Gj(this.f31699a, this.f31701c, m20399a(), this.f31704f);
        }
        return null;
    }

    /* renamed from: a */
    public final C4524Gj m20397a(C4548Hj c4548Hj) {
        if (this.f31701c.m19997h()) {
            this.f31703e.reportEvent("create session with non-empty storage");
        }
        C5139g5 c5139g5 = this.f31699a;
        C4931Xj c4931Xj = this.f31701c;
        long jM19879a = this.f31700b.m19879a();
        C4931Xj c4931Xj2 = this.f31701c;
        c4931Xj2.m19986a(C4931Xj.f31056f, Long.valueOf(jM19879a));
        c4931Xj2.m19986a(C4931Xj.f31054d, Long.valueOf(c4548Hj.f30260a));
        c4931Xj2.m19986a(C4931Xj.f31058h, Long.valueOf(c4548Hj.f30260a));
        c4931Xj2.m19986a(C4931Xj.f31057g, 0L);
        c4931Xj2.m19986a(C4931Xj.f31059i, Boolean.TRUE);
        c4931Xj2.m19988b();
        this.f31699a.f31727f.m19587a(jM19879a, this.f31702d.f30747a, TimeUnit.MILLISECONDS.toSeconds(c4548Hj.f30261b));
        return new C4524Gj(c5139g5, c4931Xj, m20399a(), new SystemTimeProvider());
    }

    /* renamed from: a */
    public final C4596Jj m20399a() {
        C4572Ij c4572Ij = new C4572Ij(this.f31702d);
        c4572Ij.f30316g = this.f31701c.m19998i();
        c4572Ij.f30315f = this.f31701c.f31062c.m20118a(C4931Xj.f31057g);
        c4572Ij.f30313d = this.f31701c.f31062c.m20118a(C4931Xj.f31058h);
        c4572Ij.f30312c = this.f31701c.f31062c.m20118a(C4931Xj.f31056f);
        c4572Ij.f30317h = this.f31701c.f31062c.m20118a(C4931Xj.f31054d);
        c4572Ij.f30310a = this.f31701c.f31062c.m20118a(C4931Xj.f31055e);
        return new C4596Jj(c4572Ij);
    }
}
