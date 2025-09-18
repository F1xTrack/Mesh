package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.yoga.YogaNative;
import com.p019vk.push.common.DefaultLogger;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.data.imageloader.ImageDownloader;
import com.p019vk.push.core.data.imageloader.ImageDownloaderImplKt;
import com.p019vk.push.core.data.repository.CrashReporterRepository;
import com.p019vk.push.core.domain.repository.CallingAppRepository;
import com.p019vk.push.core.domain.repository.PackagesRepository;
import com.p019vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import java.lang.reflect.Field;
import kotlin.Pair;
import ru.p031ok.tracer.base.ucum.UcumUtils;

/* renamed from: TT */
/* loaded from: classes2.dex */
public final class C1225TT extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f11391e;

    /* renamed from: f */
    public static final C1225TT f11370f = new C1225TT(0, 0);

    /* renamed from: g */
    public static final C1225TT f11371g = new C1225TT(0, 1);

    /* renamed from: h */
    public static final C1225TT f11372h = new C1225TT(0, 2);

    /* renamed from: i */
    public static final C1225TT f11373i = new C1225TT(0, 3);

    /* renamed from: j */
    public static final C1225TT f11374j = new C1225TT(0, 4);

    /* renamed from: k */
    public static final C1225TT f11375k = new C1225TT(0, 5);

    /* renamed from: l */
    public static final C1225TT f11376l = new C1225TT(0, 6);

    /* renamed from: m */
    public static final C1225TT f11377m = new C1225TT(0, 7);

    /* renamed from: n */
    public static final C1225TT f11378n = new C1225TT(0, 8);

    /* renamed from: o */
    public static final C1225TT f11379o = new C1225TT(0, 9);

    /* renamed from: p */
    public static final C1225TT f11380p = new C1225TT(0, 10);

    /* renamed from: q */
    public static final C1225TT f11381q = new C1225TT(0, 11);

    /* renamed from: r */
    public static final C1225TT f11382r = new C1225TT(0, 12);

    /* renamed from: s */
    public static final C1225TT f11383s = new C1225TT(0, 13);

    /* renamed from: t */
    public static final C1225TT f11384t = new C1225TT(0, 14);

    /* renamed from: u */
    public static final C1225TT f11385u = new C1225TT(0, 15);

    /* renamed from: v */
    public static final C1225TT f11386v = new C1225TT(0, 16);

    /* renamed from: w */
    public static final C1225TT f11387w = new C1225TT(0, 17);

    /* renamed from: x */
    public static final C1225TT f11388x = new C1225TT(0, 18);

    /* renamed from: y */
    public static final C1225TT f11389y = new C1225TT(0, 19);

    /* renamed from: z */
    public static final C1225TT f11390z = new C1225TT(0, 20);

    /* renamed from: A */
    public static final C1225TT f11361A = new C1225TT(0, 21);

    /* renamed from: B */
    public static final C1225TT f11362B = new C1225TT(0, 22);

    /* renamed from: C */
    public static final C1225TT f11363C = new C1225TT(0, 23);

    /* renamed from: D */
    public static final C1225TT f11364D = new C1225TT(0, 24);

    /* renamed from: E */
    public static final C1225TT f11365E = new C1225TT(0, 25);

    /* renamed from: F */
    public static final C1225TT f11366F = new C1225TT(0, 26);

    /* renamed from: G */
    public static final C1225TT f11367G = new C1225TT(0, 27);

    /* renamed from: H */
    public static final C1225TT f11368H = new C1225TT(0, 28);

    /* renamed from: I */
    public static final C1225TT f11369I = new C1225TT(0, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1225TT(int i, int i2) {
        super(i);
        this.f11391e = i2;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() throws NoSuchFieldException, SecurityException {
        Logger defaultLogger;
        switch (this.f11391e) {
            case 0:
                return BP0.m715c(String.class);
            case 1:
                return BP0.m715c(String.class);
            case 2:
                return BP0.m715c(String.class);
            case 3:
                return BP0.m715c(String.class);
            case 4:
                return new C10698pp1();
            case 5:
                return new C10228m81(new C7564Ev0(20));
            case 6:
                return new C11722xq1();
            case 7:
                return new C7823Ju1();
            case 8:
                return new C8395Uu1();
            case 9:
                return new C7411Bw1();
            case 10:
                return new C8210Rg0();
            case 11:
                return new Handler(Looper.getMainLooper());
            case 12:
                return new E60();
            case 13:
                try {
                    Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                    declaredField.setAccessible(true);
                    Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                    declaredField3.setAccessible(true);
                    return new D70(declaredField3, declaredField, declaredField2);
                } catch (NoSuchFieldException unused) {
                    return C70.f1211a;
                }
            case 14:
                try {
                    try {
                        return C7418Ca0.class.getMethod(UcumUtils.UCUM_DAYS, MotionEvent.class, InterfaceC6947uP.class, Boolean.TYPE);
                    } catch (NoSuchMethodException unused2) {
                        return null;
                    }
                } catch (NoSuchMethodException unused3) {
                    return C7418Ca0.class.getMethod("handleMotionEvent", MotionEvent.class, InterfaceC6947uP.class);
                }
            case 15:
                return AbstractC11205tn0.m24984c(new Pair(AbstractC8250Sa0.f10860a, new C11246u51("Deprecated in Java")));
            case 16:
                return Object.class;
            case 17:
                return BP0.m715c(String.class);
            case 18:
                return BP0.m715c(String.class);
            case 19:
                return BP0.m715c(String.class);
            case 20:
                return BP0.m715c(String.class);
            case 21:
                return BP0.m715c(ReadableArray.class);
            case 22:
                return C0842NN.f7735a;
            case 23:
                return AbstractC11077sn0.m24780h(new Pair(RNGestureHandlerRootViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C7754Im0(16))), new Pair(RNGestureHandlerButtonViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C7754Im0(17))));
            case 24:
                long jJni_YGConfigNewJNI = YogaNative.jni_YGConfigNewJNI();
                C7709Hp1 c7709Hp1 = new C7709Hp1();
                if (jJni_YGConfigNewJNI == 0) {
                    throw new IllegalStateException("Failed to allocate native memory");
                }
                c7709Hp1.f4521a = jJni_YGConfigNewJNI;
                YogaNative.jni_YGConfigSetPointScaleFactorJNI(jJni_YGConfigNewJNI, 0.0f);
                YogaNative.jni_YGConfigSetErrataJNI(c7709Hp1.f4521a, Integer.MAX_VALUE);
                return c7709Hp1;
            case 25:
                return AbstractC8603Yu1.m9424b();
            case 26:
                return (C8387Uq1) AbstractC8603Yu1.f14594g.getValue();
            case 27:
                C7981Mv1 c7981Mv1 = C8326Tm0.f11511h;
                if (c7981Mv1 == null || (defaultLogger = c7981Mv1.f7398d) == null) {
                    defaultLogger = new DefaultLogger("VkpnsClientSdk");
                }
                return defaultLogger.createLogger("VkpnsMessagingService");
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Logger logger = AbstractC7511Du1.f2294a;
                O90.m5968f(logger, "logger");
                C8387Uq1 c8387Uq1 = (C8387Uq1) AbstractC8603Yu1.f14594g.getValue();
                PackagesRepository packagesRepository = (PackagesRepository) AbstractC8603Yu1.f14596i.getValue();
                Logger logger2 = AbstractC10328mw1.f37997a;
                C8907bs1 c8907bs1 = new C8907bs1(new GetCallingAppInfoUseCase((CallingAppRepository) AbstractC8603Yu1.f14606s.getValue()), packagesRepository, (C8181Qr1) AbstractC8603Yu1.f14592e.getValue());
                C8326Tm0 c8326Tm0 = C8326Tm0.f11510g;
                Context applicationContext = C8326Tm0.m7740o().f7395a.getApplicationContext();
                O90.m5967e(applicationContext, "vkpnsPushConfig.application.applicationContext");
                C7981Mv1 c7981Mv12 = C8326Tm0.f11511h;
                if (c7981Mv12 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext2 = c7981Mv12.f7395a.getApplicationContext();
                O90.m5967e(applicationContext2, "vkpnsPushConfig.application.applicationContext");
                C9422fr1 c9422fr1 = new C9422fr1(applicationContext2);
                C11479vw0 c11479vw0 = (C11479vw0) AbstractC8603Yu1.f14595h.getValue();
                C7981Mv1 c7981Mv13 = C8326Tm0.f11511h;
                if (c7981Mv13 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext3 = c7981Mv13.f7395a.getApplicationContext();
                O90.m5967e(applicationContext3, "vkpnsPushConfig.application.applicationContext");
                C7967Mo1 c7967Mo1 = new C7967Mo1(applicationContext3, 25);
                ImageDownloader ImageDownloader = ImageDownloaderImplKt.ImageDownloader(c8326Tm0);
                O90.m5968f(c11479vw0, "notificationManager");
                O90.m5968f(ImageDownloader, "imageDownloader");
                O90.m5968f(logger, "logger");
                U41 u41 = new U41();
                u41.f11644a = applicationContext;
                u41.f11645b = c9422fr1;
                u41.f11646c = c11479vw0;
                u41.f11647d = c7967Mo1;
                u41.f11648e = ImageDownloader;
                u41.f11649f = logger.createLogger("NotificationController");
                return new C11730xu1(c8387Uq1, c8907bs1, u41, (C7765Ir1) AbstractC8603Yu1.f14590c.getValue(), AbstractC8603Yu1.m9424b(), (C8077Or1) AbstractC8023Nq1.f8030a.getValue(), (CrashReporterRepository) AbstractC8603Yu1.f14610w.getValue(), logger);
            default:
                return (C7765Ir1) AbstractC8603Yu1.f14590c.getValue();
        }
    }
}
