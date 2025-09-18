package defpackage;

import com.vk.push.common.Logger;
import com.vk.push.core.feature.FeatureManager;

/* renamed from: Vv1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1722Vv1 {
    public final InterfaceC1707Vq1 a;
    public final FeatureManager b;
    public final C1339Qy c;
    public final Logger d;

    public C1722Vv1(InterfaceC1707Vq1 interfaceC1707Vq1, FeatureManager featureManager, Logger logger) {
        C1339Qy c1339QyA = AbstractC7625vY1.a(GK.b);
        O90.f(featureManager, "featureManager");
        O90.f(logger, "logger");
        this.a = interfaceC1707Vq1;
        this.b = featureManager;
        this.c = c1339QyA;
        this.d = logger.createLogger("DeleteExpiredPushTokenUseCase");
    }
}
