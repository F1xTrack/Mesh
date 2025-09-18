package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.common.analytics.BaseAnalyticsEvent;
import com.vk.push.core.analytics.BaseAnalyticsSender;
import com.vk.push.core.feature.FeatureManager;
import java.util.Map;

/* renamed from: Gq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0538Gq1 extends BaseAnalyticsSender {
    public final C1397Rr0 e;
    public final C0544Gs1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0538Gq1(C1397Rr0 c1397Rr0, C0544Gs1 c0544Gs1, AnalyticsTimingsStore analyticsTimingsStore, FeatureManager featureManager, Logger logger) {
        super(featureManager, analyticsTimingsStore, logger.createLogger("ClientAnalyticsSender"), null, 8, null);
        O90.f(c1397Rr0, "analyticsClient");
        O90.f(c0544Gs1, "baseClientAnalyticsRepository");
        O90.f(analyticsTimingsStore, "timingsStore");
        O90.f(featureManager, "featureManager");
        O90.f(logger, "logger");
        this.e = c1397Rr0;
        this.f = c0544Gs1;
    }

    @Override // com.vk.push.core.analytics.BaseAnalyticsSender
    public final Object getBaseParams(InterfaceC1729Vy interfaceC1729Vy) {
        return this.f.a(interfaceC1729Vy);
    }

    @Override // com.vk.push.core.analytics.BaseAnalyticsSender
    public final Object sendImpl(BaseAnalyticsEvent baseAnalyticsEvent, Map map, InterfaceC1729Vy interfaceC1729Vy) {
        C0767Jp c0767Jp = new C0767Jp(1, AbstractC6383p22.b(interfaceC1729Vy));
        c0767Jp.s();
        AbstractC6080nS1.a(new C4074h11(this.e.a(new C1475Sr0(baseAnalyticsEvent.getEventName(), map)), C0190Ce1.m), C5284jI.w, new C5661lG0(17, c0767Jp));
        Object objR = c0767Jp.r();
        return objR == EnumC1030Mz.a ? objR : C1518Tf1.a;
    }
}
