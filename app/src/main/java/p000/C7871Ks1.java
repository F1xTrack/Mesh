package p000;

import com.p019vk.push.common.analytics.AnalyticsSender;
import com.p019vk.push.core.domain.repository.PackagesRepository;

/* renamed from: Ks1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7871Ks1 {

    /* renamed from: a */
    public final C8335Tq1 f6371a;

    /* renamed from: b */
    public final PackagesRepository f6372b;

    /* renamed from: c */
    public final AnalyticsSender f6373c;

    /* renamed from: d */
    public final C1068Qy f6374d;

    public C7871Ks1(C8335Tq1 c8335Tq1, PackagesRepository packagesRepository, AnalyticsSender analyticsSender) {
        C0399GK c0399gk = C0399GK.f3694a;
        C1068Qy c1068QyM25444a = AbstractC11432vY1.m25444a(ExecutorC1023QF.f9548c);
        O90.m5968f(c8335Tq1, "externalAppsRepository");
        O90.m5968f(packagesRepository, "packagesRepository");
        O90.m5968f(analyticsSender, "analyticsSender");
        this.f6371a = c8335Tq1;
        this.f6372b = packagesRepository;
        this.f6373c = analyticsSender;
        this.f6374d = c1068QyM25444a;
    }
}
