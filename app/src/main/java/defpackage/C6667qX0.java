package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.ads.PushAdsProvider;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.retry.RequestRetryComponent;
import expo.modules.securestore.SecureStoreOptions;
import java.util.concurrent.Executors;

/* renamed from: qX0 */
/* loaded from: classes2.dex */
public final class C6667qX0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public static final C6667qX0 f = new C6667qX0(0, 0);
    public static final C6667qX0 g = new C6667qX0(0, 1);
    public static final C6667qX0 h = new C6667qX0(0, 2);
    public static final C6667qX0 i = new C6667qX0(0, 3);
    public static final C6667qX0 j = new C6667qX0(0, 4);
    public static final C6667qX0 k = new C6667qX0(0, 5);
    public static final C6667qX0 l = new C6667qX0(0, 6);
    public static final C6667qX0 m = new C6667qX0(0, 7);
    public static final C6667qX0 n = new C6667qX0(0, 8);
    public static final C6667qX0 o = new C6667qX0(0, 9);
    public static final C6667qX0 p = new C6667qX0(0, 10);
    public static final C6667qX0 q = new C6667qX0(0, 11);
    public static final C6667qX0 r = new C6667qX0(0, 12);
    public static final C6667qX0 s = new C6667qX0(0, 13);
    public static final C6667qX0 t = new C6667qX0(0, 14);
    public static final C6667qX0 u = new C6667qX0(0, 15);
    public static final C6667qX0 v = new C6667qX0(0, 16);
    public static final C6667qX0 w = new C6667qX0(0, 17);
    public static final C6667qX0 x = new C6667qX0(0, 18);
    public static final C6667qX0 y = new C6667qX0(0, 19);
    public static final C6667qX0 z = new C6667qX0(0, 20);
    public static final C6667qX0 A = new C6667qX0(0, 21);
    public static final C6667qX0 B = new C6667qX0(0, 22);
    public static final C6667qX0 C = new C6667qX0(0, 23);
    public static final C6667qX0 D = new C6667qX0(0, 24);
    public static final C6667qX0 E = new C6667qX0(0, 25);
    public static final C6667qX0 F = new C6667qX0(0, 26);
    public static final C6667qX0 G = new C6667qX0(0, 27);
    public static final C6667qX0 H = new C6667qX0(0, 28);
    public static final C6667qX0 I = new C6667qX0(0, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6667qX0(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        Logger defaultLogger;
        switch (this.e) {
            case 0:
                return BP0.c(String.class);
            case 1:
                return BP0.c(SecureStoreOptions.class);
            case 2:
                return BP0.b(String.class);
            case 3:
                return BP0.b(String.class);
            case 4:
                return BP0.c(SecureStoreOptions.class);
            case 5:
                return BP0.c(String.class);
            case 6:
                return BP0.c(SecureStoreOptions.class);
            case 7:
                return BP0.b(String.class);
            case 8:
                return BP0.b(String.class);
            case 9:
                return BP0.c(SecureStoreOptions.class);
            case 10:
                return BP0.c(String.class);
            case 11:
                return BP0.c(SecureStoreOptions.class);
            case 12:
                return BP0.b(Integer.class);
            case 13:
                return Executors.newFixedThreadPool(1);
            case 14:
                return new Handler(Looper.getMainLooper());
            case 15:
                return new C1945Ys();
            case 16:
                return new C0850Kq1();
            case 17:
                return new C1164Or1();
            case 18:
                C1020Mv1 c1020Mv1 = C1538Tm0.h;
                if (c1020Mv1 == null || (defaultLogger = c1020Mv1.d) == null) {
                    defaultLogger = new DefaultLogger("VkpnsClientSdk");
                }
                return defaultLogger.createLogger("DeletePushTokenIfNoHostsUseCase");
            case 19:
                return C1518Tf1.a;
            case 20:
                InterfaceC1707Vq1 interfaceC1707Vq1C = AbstractC1953Yu1.c();
                Logger logger = AbstractC5979mw1.a;
                Logger logger2 = AbstractC6734qt1.a;
                O90.f(logger2, "logger");
                C1632Ur1 c1632Ur1 = new C1632Ur1(interfaceC1707Vq1C, logger2);
                C6543pt1 c6543pt1 = (C6543pt1) AbstractC1953Yu1.l.getValue();
                O90.f(c6543pt1, "clientIdRepository");
                C7409uQ0 c7409uQ0 = new C7409uQ0();
                c7409uQ0.a = c6543pt1;
                C5996n11 c5996n11 = new C5996n11(9, new C6446pN0(13, new C1398Rr1(1, 5, null)));
                C3669eu1 c3669eu1 = (C3669eu1) AbstractC1953Yu1.t.getValue();
                Logger logger3 = AbstractC5979mw1.a;
                C6860rY0 c6860rY0 = new C6860rY0(c5996n11, new C0388Es1(logger3, RequestRetryComponent.INSTANCE.createDefaultBackOffForRequest()), c3669eu1, logger3);
                C1629Uq1 c1629Uq1 = (C1629Uq1) AbstractC1953Yu1.g.getValue();
                C0697Ir1 c0697Ir1 = (C0697Ir1) AbstractC1953Yu1.c.getValue();
                C0850Kq1 c0850Kq1 = (C0850Kq1) AbstractC1083Nq1.b.getValue();
                O90.f(c1629Uq1, "clientDispatcher");
                O90.f(c0697Ir1, "pushStorage");
                O90.f(c0850Kq1, "onNewPushTokenListener");
                O90.f(logger3, "logger");
                T71 t71 = new T71();
                t71.a = c1629Uq1;
                t71.b = c0697Ir1;
                t71.c = c0850Kq1;
                t71.d = logger3.createLogger("SendPushTokenToClientIfNeedUseCase");
                return new C0070Aq1(new C1398Rr1(1, 1, null), interfaceC1707Vq1C, c1632Ur1, c7409uQ0, c6860rY0, t71, AbstractC1953Yu1.b(), (AnalyticsTimingsStore) AbstractC1953Yu1.p.getValue(), (C1320Qr1) AbstractC1953Yu1.e.getValue(), logger2);
            case 21:
                return AbstractC1953Yu1.b();
            case 22:
                return (C1320Qr1) AbstractC1953Yu1.e.getValue();
            case 23:
                return (C1629Uq1) AbstractC1953Yu1.g.getValue();
            case 24:
                Logger logger4 = AbstractC5979mw1.a;
                return new C0856Ks1((C1551Tq1) AbstractC1953Yu1.x.getValue(), (PackagesRepository) AbstractC1953Yu1.i.getValue(), AbstractC1953Yu1.b());
            case 25:
                return AbstractC5979mw1.a();
            case 26:
                C1020Mv1 c1020Mv12 = C1538Tm0.h;
                if (c1020Mv12 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                PushAdsProvider pushAdsProvider = c1020Mv12.k;
                if (pushAdsProvider != null) {
                    return pushAdsProvider;
                }
                F71 f71 = AbstractC1083Nq1.a;
                return new C0076As1(new S20(24));
            case 27:
                Logger logger5 = AbstractC5979mw1.a;
                return new C1722Vv1(AbstractC1953Yu1.c(), (FeatureManager) AbstractC1953Yu1.v.getValue(), AbstractC5979mw1.a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (C5594kv1) AbstractC1953Yu1.m.getValue();
            default:
                return (C0070Aq1) AbstractC6734qt1.b.getValue();
        }
    }
}
