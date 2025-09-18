package p000;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.p019vk.push.common.DefaultLogger;
import com.p019vk.push.common.Logger;
import com.p019vk.push.common.ads.PushAdsProvider;
import com.p019vk.push.common.analytics.AnalyticsTimingsStore;
import com.p019vk.push.core.domain.repository.PackagesRepository;
import com.p019vk.push.core.feature.FeatureManager;
import com.p019vk.push.core.retry.RequestRetryComponent;
import expo.modules.securestore.SecureStoreOptions;
import java.util.concurrent.Executors;

/* renamed from: qX0 */
/* loaded from: classes2.dex */
public final class C10789qX0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f41018e;

    /* renamed from: f */
    public static final C10789qX0 f40997f = new C10789qX0(0, 0);

    /* renamed from: g */
    public static final C10789qX0 f40998g = new C10789qX0(0, 1);

    /* renamed from: h */
    public static final C10789qX0 f40999h = new C10789qX0(0, 2);

    /* renamed from: i */
    public static final C10789qX0 f41000i = new C10789qX0(0, 3);

    /* renamed from: j */
    public static final C10789qX0 f41001j = new C10789qX0(0, 4);

    /* renamed from: k */
    public static final C10789qX0 f41002k = new C10789qX0(0, 5);

    /* renamed from: l */
    public static final C10789qX0 f41003l = new C10789qX0(0, 6);

    /* renamed from: m */
    public static final C10789qX0 f41004m = new C10789qX0(0, 7);

    /* renamed from: n */
    public static final C10789qX0 f41005n = new C10789qX0(0, 8);

    /* renamed from: o */
    public static final C10789qX0 f41006o = new C10789qX0(0, 9);

    /* renamed from: p */
    public static final C10789qX0 f41007p = new C10789qX0(0, 10);

    /* renamed from: q */
    public static final C10789qX0 f41008q = new C10789qX0(0, 11);

    /* renamed from: r */
    public static final C10789qX0 f41009r = new C10789qX0(0, 12);

    /* renamed from: s */
    public static final C10789qX0 f41010s = new C10789qX0(0, 13);

    /* renamed from: t */
    public static final C10789qX0 f41011t = new C10789qX0(0, 14);

    /* renamed from: u */
    public static final C10789qX0 f41012u = new C10789qX0(0, 15);

    /* renamed from: v */
    public static final C10789qX0 f41013v = new C10789qX0(0, 16);

    /* renamed from: w */
    public static final C10789qX0 f41014w = new C10789qX0(0, 17);

    /* renamed from: x */
    public static final C10789qX0 f41015x = new C10789qX0(0, 18);

    /* renamed from: y */
    public static final C10789qX0 f41016y = new C10789qX0(0, 19);

    /* renamed from: z */
    public static final C10789qX0 f41017z = new C10789qX0(0, 20);

    /* renamed from: A */
    public static final C10789qX0 f40988A = new C10789qX0(0, 21);

    /* renamed from: B */
    public static final C10789qX0 f40989B = new C10789qX0(0, 22);

    /* renamed from: C */
    public static final C10789qX0 f40990C = new C10789qX0(0, 23);

    /* renamed from: D */
    public static final C10789qX0 f40991D = new C10789qX0(0, 24);

    /* renamed from: E */
    public static final C10789qX0 f40992E = new C10789qX0(0, 25);

    /* renamed from: F */
    public static final C10789qX0 f40993F = new C10789qX0(0, 26);

    /* renamed from: G */
    public static final C10789qX0 f40994G = new C10789qX0(0, 27);

    /* renamed from: H */
    public static final C10789qX0 f40995H = new C10789qX0(0, 28);

    /* renamed from: I */
    public static final C10789qX0 f40996I = new C10789qX0(0, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10789qX0(int i, int i2) {
        super(i);
        this.f41018e = i2;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        Logger defaultLogger;
        switch (this.f41018e) {
            case 0:
                return BP0.m715c(String.class);
            case 1:
                return BP0.m715c(SecureStoreOptions.class);
            case 2:
                return BP0.m714b(String.class);
            case 3:
                return BP0.m714b(String.class);
            case 4:
                return BP0.m715c(SecureStoreOptions.class);
            case 5:
                return BP0.m715c(String.class);
            case 6:
                return BP0.m715c(SecureStoreOptions.class);
            case 7:
                return BP0.m714b(String.class);
            case 8:
                return BP0.m714b(String.class);
            case 9:
                return BP0.m715c(SecureStoreOptions.class);
            case 10:
                return BP0.m715c(String.class);
            case 11:
                return BP0.m715c(SecureStoreOptions.class);
            case 12:
                return BP0.m714b(Integer.class);
            case 13:
                return Executors.newFixedThreadPool(1);
            case 14:
                return new Handler(Looper.getMainLooper());
            case 15:
                return new C1565Ys();
            case 16:
                return new C7867Kq1();
            case 17:
                return new C8077Or1();
            case 18:
                C7981Mv1 c7981Mv1 = C8326Tm0.f11511h;
                if (c7981Mv1 == null || (defaultLogger = c7981Mv1.f7398d) == null) {
                    defaultLogger = new DefaultLogger("VkpnsClientSdk");
                }
                return defaultLogger.createLogger("DeletePushTokenIfNoHostsUseCase");
            case 19:
                return C8313Tf1.f11463a;
            case 20:
                InterfaceC8439Vq1 interfaceC8439Vq1M9425c = AbstractC8603Yu1.m9425c();
                Logger logger = AbstractC10328mw1.f37997a;
                Logger logger2 = AbstractC10834qt1.f41236a;
                O90.m5968f(logger2, "logger");
                C8389Ur1 c8389Ur1 = new C8389Ur1(interfaceC8439Vq1M9425c, logger2);
                C10706pt1 c10706pt1 = (C10706pt1) AbstractC8603Yu1.f14599l.getValue();
                O90.m5968f(c10706pt1, "clientIdRepository");
                C11287uQ0 c11287uQ0 = new C11287uQ0();
                c11287uQ0.f43693a = c10706pt1;
                C10339n11 c10339n11 = new C10339n11(9, new C10641pN0(13, new C8233Rr1(1, 5, null)));
                C9300eu1 c9300eu1 = (C9300eu1) AbstractC8603Yu1.f14607t.getValue();
                Logger logger3 = AbstractC10328mw1.f37997a;
                C10919rY0 c10919rY0 = new C10919rY0(c10339n11, new C7559Es1(logger3, RequestRetryComponent.INSTANCE.createDefaultBackOffForRequest()), c9300eu1, logger3);
                C8387Uq1 c8387Uq1 = (C8387Uq1) AbstractC8603Yu1.f14594g.getValue();
                C7765Ir1 c7765Ir1 = (C7765Ir1) AbstractC8603Yu1.f14590c.getValue();
                C7867Kq1 c7867Kq1 = (C7867Kq1) AbstractC8023Nq1.f8031b.getValue();
                O90.m5968f(c8387Uq1, "clientDispatcher");
                O90.m5968f(c7765Ir1, "pushStorage");
                O90.m5968f(c7867Kq1, "onNewPushTokenListener");
                O90.m5968f(logger3, "logger");
                T71 t71 = new T71();
                t71.f11173a = c8387Uq1;
                t71.f11174b = c7765Ir1;
                t71.f11175c = c7867Kq1;
                t71.f11176d = logger3.createLogger("SendPushTokenToClientIfNeedUseCase");
                return new C7347Aq1(new C8233Rr1(1, 1, null), interfaceC8439Vq1M9425c, c8389Ur1, c11287uQ0, c10919rY0, t71, AbstractC8603Yu1.m9424b(), (AnalyticsTimingsStore) AbstractC8603Yu1.f14603p.getValue(), (C8181Qr1) AbstractC8603Yu1.f14592e.getValue(), logger2);
            case 21:
                return AbstractC8603Yu1.m9424b();
            case 22:
                return (C8181Qr1) AbstractC8603Yu1.f14592e.getValue();
            case 23:
                return (C8387Uq1) AbstractC8603Yu1.f14594g.getValue();
            case 24:
                Logger logger4 = AbstractC10328mw1.f37997a;
                return new C7871Ks1((C8335Tq1) AbstractC8603Yu1.f14611x.getValue(), (PackagesRepository) AbstractC8603Yu1.f14596i.getValue(), AbstractC8603Yu1.m9424b());
            case 25:
                return AbstractC10328mw1.m23021a();
            case 26:
                C7981Mv1 c7981Mv12 = C8326Tm0.f11511h;
                if (c7981Mv12 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                PushAdsProvider pushAdsProvider = c7981Mv12.f7405k;
                if (pushAdsProvider != null) {
                    return pushAdsProvider;
                }
                F71 f71 = AbstractC8023Nq1.f8030a;
                return new C7351As1(new S20(24));
            case 27:
                Logger logger5 = AbstractC10328mw1.f37997a;
                return new C8449Vv1(AbstractC8603Yu1.m9425c(), (FeatureManager) AbstractC8603Yu1.f14609v.getValue(), AbstractC10328mw1.f37997a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (C10070kv1) AbstractC8603Yu1.f14600m.getValue();
            default:
                return (C7347Aq1) AbstractC10834qt1.f41237b.getValue();
        }
    }
}
