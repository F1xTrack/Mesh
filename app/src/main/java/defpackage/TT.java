package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.yoga.YogaNative;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import com.swmansion.gesturehandler.react.RNGestureHandlerRootViewManager;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.data.imageloader.ImageDownloader;
import com.vk.push.core.data.imageloader.ImageDownloaderImplKt;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.domain.repository.CallingAppRepository;
import com.vk.push.core.domain.repository.PackagesRepository;
import com.vk.push.core.domain.usecase.GetCallingAppInfoUseCase;
import java.lang.reflect.Field;
import kotlin.Pair;
import ru.ok.tracer.base.ucum.UcumUtils;

/* loaded from: classes2.dex */
public final class TT extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public static final TT f = new TT(0, 0);
    public static final TT g = new TT(0, 1);
    public static final TT h = new TT(0, 2);
    public static final TT i = new TT(0, 3);
    public static final TT j = new TT(0, 4);
    public static final TT k = new TT(0, 5);
    public static final TT l = new TT(0, 6);
    public static final TT m = new TT(0, 7);
    public static final TT n = new TT(0, 8);
    public static final TT o = new TT(0, 9);
    public static final TT p = new TT(0, 10);
    public static final TT q = new TT(0, 11);
    public static final TT r = new TT(0, 12);
    public static final TT s = new TT(0, 13);
    public static final TT t = new TT(0, 14);
    public static final TT u = new TT(0, 15);
    public static final TT v = new TT(0, 16);
    public static final TT w = new TT(0, 17);
    public static final TT x = new TT(0, 18);
    public static final TT y = new TT(0, 19);
    public static final TT z = new TT(0, 20);
    public static final TT A = new TT(0, 21);
    public static final TT B = new TT(0, 22);
    public static final TT C = new TT(0, 23);
    public static final TT D = new TT(0, 24);
    public static final TT E = new TT(0, 25);
    public static final TT F = new TT(0, 26);
    public static final TT G = new TT(0, 27);
    public static final TT H = new TT(0, 28);
    public static final TT I = new TT(0, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TT(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() throws NoSuchFieldException, SecurityException {
        Logger defaultLogger;
        switch (this.e) {
            case 0:
                return BP0.c(String.class);
            case 1:
                return BP0.c(String.class);
            case 2:
                return BP0.c(String.class);
            case 3:
                return BP0.c(String.class);
            case 4:
                return new C6531pp1();
            case 5:
                return new C5829m81(new C0396Ev0(20));
            case 6:
                return new C8059xq1();
            case 7:
                return new C0784Ju1();
            case 8:
                return new C1641Uu1();
            case 9:
                return new C0166Bw1();
            case 10:
                return new C1364Rg0();
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
                    return C70.a;
                }
            case 14:
                try {
                    try {
                        return C0177Ca0.class.getMethod(UcumUtils.UCUM_DAYS, MotionEvent.class, InterfaceC7405uP.class, Boolean.TYPE);
                    } catch (NoSuchMethodException unused2) {
                        return null;
                    }
                } catch (NoSuchMethodException unused3) {
                    return C0177Ca0.class.getMethod("handleMotionEvent", MotionEvent.class, InterfaceC7405uP.class);
                }
            case 15:
                return AbstractC7287tn0.c(new Pair(AbstractC1424Sa0.a, new C7347u51("Deprecated in Java")));
            case 16:
                return Object.class;
            case 17:
                return BP0.c(String.class);
            case 18:
                return BP0.c(String.class);
            case 19:
                return BP0.c(String.class);
            case 20:
                return BP0.c(String.class);
            case 21:
                return BP0.c(ReadableArray.class);
            case 22:
                return NN.a;
            case 23:
                return AbstractC7096sn0.h(new Pair(RNGestureHandlerRootViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C0681Im0(16))), new Pair(RNGestureHandlerButtonViewManager.REACT_CLASS, ModuleSpec.viewManagerSpec(new C0681Im0(17))));
            case 24:
                long jJni_YGConfigNewJNI = YogaNative.jni_YGConfigNewJNI();
                C0613Hp1 c0613Hp1 = new C0613Hp1();
                if (jJni_YGConfigNewJNI == 0) {
                    throw new IllegalStateException("Failed to allocate native memory");
                }
                c0613Hp1.a = jJni_YGConfigNewJNI;
                YogaNative.jni_YGConfigSetPointScaleFactorJNI(jJni_YGConfigNewJNI, 0.0f);
                YogaNative.jni_YGConfigSetErrataJNI(c0613Hp1.a, Integer.MAX_VALUE);
                return c0613Hp1;
            case 25:
                return AbstractC1953Yu1.b();
            case 26:
                return (C1629Uq1) AbstractC1953Yu1.g.getValue();
            case 27:
                C1020Mv1 c1020Mv1 = C1538Tm0.h;
                if (c1020Mv1 == null || (defaultLogger = c1020Mv1.d) == null) {
                    defaultLogger = new DefaultLogger("VkpnsClientSdk");
                }
                return defaultLogger.createLogger("VkpnsMessagingService");
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Logger logger = AbstractC0316Du1.a;
                O90.f(logger, "logger");
                C1629Uq1 c1629Uq1 = (C1629Uq1) AbstractC1953Yu1.g.getValue();
                PackagesRepository packagesRepository = (PackagesRepository) AbstractC1953Yu1.i.getValue();
                Logger logger2 = AbstractC5979mw1.a;
                C2407bs1 c2407bs1 = new C2407bs1(new GetCallingAppInfoUseCase((CallingAppRepository) AbstractC1953Yu1.s.getValue()), packagesRepository, (C1320Qr1) AbstractC1953Yu1.e.getValue());
                C1538Tm0 c1538Tm0 = C1538Tm0.g;
                Context applicationContext = C1538Tm0.o().a.getApplicationContext();
                O90.e(applicationContext, "vkpnsPushConfig.application.applicationContext");
                C1020Mv1 c1020Mv12 = C1538Tm0.h;
                if (c1020Mv12 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext2 = c1020Mv12.a.getApplicationContext();
                O90.e(applicationContext2, "vkpnsPushConfig.application.applicationContext");
                C3851fr1 c3851fr1 = new C3851fr1(applicationContext2);
                C7696vw0 c7696vw0 = (C7696vw0) AbstractC1953Yu1.h.getValue();
                C1020Mv1 c1020Mv13 = C1538Tm0.h;
                if (c1020Mv13 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext3 = c1020Mv13.a.getApplicationContext();
                O90.e(applicationContext3, "vkpnsPushConfig.application.applicationContext");
                C0999Mo1 c0999Mo1 = new C0999Mo1(applicationContext3, 25);
                ImageDownloader ImageDownloader = ImageDownloaderImplKt.ImageDownloader(c1538Tm0);
                O90.f(c7696vw0, "notificationManager");
                O90.f(ImageDownloader, "imageDownloader");
                O90.f(logger, "logger");
                U41 u41 = new U41();
                u41.a = applicationContext;
                u41.b = c3851fr1;
                u41.c = c7696vw0;
                u41.d = c0999Mo1;
                u41.e = ImageDownloader;
                u41.f = logger.createLogger("NotificationController");
                return new C8071xu1(c1629Uq1, c2407bs1, u41, (C0697Ir1) AbstractC1953Yu1.c.getValue(), AbstractC1953Yu1.b(), (C1164Or1) AbstractC1083Nq1.a.getValue(), (CrashReporterRepository) AbstractC1953Yu1.w.getValue(), logger);
            default:
                return (C0697Ir1) AbstractC1953Yu1.c.getValue();
        }
    }
}
