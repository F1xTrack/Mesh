package p000;

import com.p019vk.push.common.Logger;
import com.p019vk.push.core.feature.FeatureManager;

/* renamed from: Vv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8449Vv1 {

    /* renamed from: a */
    public final InterfaceC8439Vq1 f12870a;

    /* renamed from: b */
    public final FeatureManager f12871b;

    /* renamed from: c */
    public final C1068Qy f12872c;

    /* renamed from: d */
    public final Logger f12873d;

    public C8449Vv1(InterfaceC8439Vq1 interfaceC8439Vq1, FeatureManager featureManager, Logger logger) {
        C1068Qy c1068QyM25444a = AbstractC11432vY1.m25444a(C0399GK.f3695b);
        O90.m5968f(featureManager, "featureManager");
        O90.m5968f(logger, "logger");
        this.f12870a = interfaceC8439Vq1;
        this.f12871b = featureManager;
        this.f12872c = c1068QyM25444a;
        this.f12873d = logger.createLogger("DeleteExpiredPushTokenUseCase");
    }
}
