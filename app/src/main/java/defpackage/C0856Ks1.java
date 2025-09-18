package defpackage;

import com.vk.push.common.analytics.AnalyticsSender;
import com.vk.push.core.domain.repository.PackagesRepository;

/* renamed from: Ks1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0856Ks1 {
    public final C1551Tq1 a;
    public final PackagesRepository b;
    public final AnalyticsSender c;
    public final C1339Qy d;

    public C0856Ks1(C1551Tq1 c1551Tq1, PackagesRepository packagesRepository, AnalyticsSender analyticsSender) {
        GK gk = GK.a;
        C1339Qy c1339QyA = AbstractC7625vY1.a(QF.c);
        O90.f(c1551Tq1, "externalAppsRepository");
        O90.f(packagesRepository, "packagesRepository");
        O90.f(analyticsSender, "analyticsSender");
        this.a = c1551Tq1;
        this.b = packagesRepository;
        this.c = analyticsSender;
        this.d = c1339QyA;
    }
}
