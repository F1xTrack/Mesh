package defpackage;

import android.content.UriMatcher;
import android.os.Handler;
import android.os.Looper;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.repository.PackagesRepository;
import expo.modules.filesystem.DeletingOptions;
import expo.modules.filesystem.MakeDirectoryOptions;
import expo.modules.filesystem.RelocatingOptions;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.util.List;
import java.util.ServiceLoader;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class X2 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public static final X2 f = new X2(0, 0);
    public static final X2 g = new X2(0, 1);
    public static final X2 h = new X2(0, 2);
    public static final X2 i = new X2(0, 3);
    public static final X2 j = new X2(0, 4);
    public static final X2 k = new X2(0, 5);
    public static final X2 l = new X2(0, 6);
    public static final X2 m = new X2(0, 7);
    public static final X2 n = new X2(0, 8);
    public static final X2 o = new X2(0, 9);
    public static final X2 p = new X2(0, 10);
    public static final X2 q = new X2(0, 11);
    public static final X2 r = new X2(0, 12);
    public static final X2 s = new X2(0, 13);
    public static final X2 t = new X2(0, 14);
    public static final X2 u = new X2(0, 15);
    public static final X2 v = new X2(0, 16);
    public static final X2 w = new X2(0, 17);
    public static final X2 x = new X2(0, 18);
    public static final X2 y = new X2(0, 19);
    public static final X2 z = new X2(0, 20);
    public static final X2 A = new X2(0, 21);
    public static final X2 B = new X2(0, 22);
    public static final X2 C = new X2(0, 23);
    public static final X2 D = new X2(0, 24);
    public static final X2 E = new X2(0, 25);
    public static final X2 F = new X2(0, 26);
    public static final X2 G = new X2(0, 27);
    public static final X2 H = new X2(0, 28);
    public static final X2 I = new X2(0, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X2(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Logger defaultLogger;
        switch (this.e) {
            case 0:
                AbstractC3557eJ0.a.getClass();
                return Integer.valueOf(AbstractC3557eJ0.b.c(2147418112) + 65536);
            case 1:
                return BP0.c(URI.class);
            case 2:
                return BP0.b(String.class);
            case 3:
                return BP0.c(String.class);
            case 4:
                return new C5649lC0(12);
            case 5:
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC1606Uj.class, InterfaceC1606Uj.class.getClassLoader());
                O90.c(serviceLoaderLoad);
                InterfaceC1606Uj interfaceC1606Uj = (InterfaceC1606Uj) AbstractC8069xu.B(serviceLoaderLoad);
                if (interfaceC1606Uj != null) {
                    return interfaceC1606Uj;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            case 6:
                return Pattern.compile("[-/ ]");
            case 7:
                return BP0.c(String.class);
            case 8:
                return BP0.c(String.class);
            case 9:
                return BP0.c(String.class);
            case 10:
                return BP0.c(String.class);
            case 11:
                SE se = new SE(new C1922Yk0("DefaultBuiltIns"));
                se.c(false);
                return se;
            case 12:
                Logger logger = AbstractC5979mw1.a;
                return new C0778Js1(AbstractC1953Yu1.c(), (PackagesRepository) AbstractC1953Yu1.i.getValue(), AbstractC1953Yu1.b());
            case 13:
                C1020Mv1 c1020Mv1 = C1538Tm0.h;
                if (c1020Mv1 == null || (defaultLogger = c1020Mv1.d) == null) {
                    defaultLogger = new DefaultLogger("VkpnsClientSdk");
                }
                return defaultLogger.createLogger("DeleteTokenWorker");
            case 14:
                return MN.a;
            case 15:
                return new UriMatcher(-1);
            case 16:
                return new DK();
            case 17:
                return new EK(new Handler(Looper.getMainLooper()));
            case 18:
                return new ScheduledThreadPoolExecutor(1);
            case 19:
                return new ThreadPoolExecutor(3, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue());
            case 20:
                return (SE) SE.f.getValue();
            case 21:
                try {
                    Object objNewInstance = C6838rR.class.getConstructor(null).newInstance(null);
                    O90.d(objNewInstance, "null cannot be cast to non-null type expo.modules.kotlin.ModulesProvider");
                    return (InterfaceC1010Ms0) objNewInstance;
                } catch (Exception unused) {
                    return null;
                }
            case 22:
                try {
                    Object objInvoke = C6838rR.class.getMethod("getPackageList", null).invoke(null, null);
                    O90.d(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<expo.modules.core.interfaces.Package>");
                    return AbstractC8069xu.W((List) objInvoke, new C2209aq0(10));
                } catch (Exception unused2) {
                    return MN.a;
                }
            case 23:
                return BP0.c(String.class);
            case 24:
                return BP0.c(DeletingOptions.class);
            case 25:
                return BP0.c(RelocatingOptions.class);
            case 26:
                return BP0.c(RelocatingOptions.class);
            case 27:
                return BP0.c(String.class);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return BP0.c(String.class);
            default:
                return BP0.c(MakeDirectoryOptions.class);
        }
    }
}
