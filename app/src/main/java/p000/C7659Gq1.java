package p000;

import com.p019vk.push.common.Logger;
import com.p019vk.push.common.analytics.AnalyticsTimingsStore;
import com.p019vk.push.common.analytics.BaseAnalyticsEvent;
import com.p019vk.push.core.analytics.BaseAnalyticsSender;
import com.p019vk.push.core.feature.FeatureManager;
import java.util.Map;

/* renamed from: Gq1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7659Gq1 extends BaseAnalyticsSender {

    /* renamed from: e */
    public final C8232Rr0 f3925e;

    /* renamed from: f */
    public final C7663Gs1 f3926f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7659Gq1(C8232Rr0 c8232Rr0, C7663Gs1 c7663Gs1, AnalyticsTimingsStore analyticsTimingsStore, FeatureManager featureManager, Logger logger) {
        super(featureManager, analyticsTimingsStore, logger.createLogger("ClientAnalyticsSender"), null, 8, null);
        O90.m5968f(c8232Rr0, "analyticsClient");
        O90.m5968f(c7663Gs1, "baseClientAnalyticsRepository");
        O90.m5968f(analyticsTimingsStore, "timingsStore");
        O90.m5968f(featureManager, "featureManager");
        O90.m5968f(logger, "logger");
        this.f3925e = c8232Rr0;
        this.f3926f = c7663Gs1;
    }

    @Override // com.p019vk.push.core.analytics.BaseAnalyticsSender
    public final Object getBaseParams(InterfaceC1382Vy interfaceC1382Vy) {
        return this.f3926f.m3184a(interfaceC1382Vy);
    }

    @Override // com.p019vk.push.core.analytics.BaseAnalyticsSender
    public final Object sendImpl(BaseAnalyticsEvent baseAnalyticsEvent, Map map, InterfaceC1382Vy interfaceC1382Vy) {
        C0619Jp c0619Jp = new C0619Jp(1, AbstractC10599p22.m23595b(interfaceC1382Vy));
        c0619Jp.m4439s();
        AbstractC10396nS1.m23145a(new C9571h11(this.f3925e.m7124a(new C8284Sr0(baseAnalyticsEvent.getEventName(), map)), C7427Ce1.f1553m), C6228jI.f35045w, new C10115lG0(17, c0619Jp));
        Object objM4438r = c0619Jp.m4438r();
        return objM4438r == EnumC0817Mz.f7418a ? objM4438r : C8313Tf1.f11463a;
    }
}
