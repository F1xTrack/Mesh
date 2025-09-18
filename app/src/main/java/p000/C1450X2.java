package p000;

import android.content.UriMatcher;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.p019vk.push.common.DefaultLogger;
import com.p019vk.push.common.Logger;
import com.p019vk.push.core.domain.repository.PackagesRepository;
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

/* renamed from: X2 */
/* loaded from: classes.dex */
public final class C1450X2 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f13523e;

    /* renamed from: f */
    public static final C1450X2 f13502f = new C1450X2(0, 0);

    /* renamed from: g */
    public static final C1450X2 f13503g = new C1450X2(0, 1);

    /* renamed from: h */
    public static final C1450X2 f13504h = new C1450X2(0, 2);

    /* renamed from: i */
    public static final C1450X2 f13505i = new C1450X2(0, 3);

    /* renamed from: j */
    public static final C1450X2 f13506j = new C1450X2(0, 4);

    /* renamed from: k */
    public static final C1450X2 f13507k = new C1450X2(0, 5);

    /* renamed from: l */
    public static final C1450X2 f13508l = new C1450X2(0, 6);

    /* renamed from: m */
    public static final C1450X2 f13509m = new C1450X2(0, 7);

    /* renamed from: n */
    public static final C1450X2 f13510n = new C1450X2(0, 8);

    /* renamed from: o */
    public static final C1450X2 f13511o = new C1450X2(0, 9);

    /* renamed from: p */
    public static final C1450X2 f13512p = new C1450X2(0, 10);

    /* renamed from: q */
    public static final C1450X2 f13513q = new C1450X2(0, 11);

    /* renamed from: r */
    public static final C1450X2 f13514r = new C1450X2(0, 12);

    /* renamed from: s */
    public static final C1450X2 f13515s = new C1450X2(0, 13);

    /* renamed from: t */
    public static final C1450X2 f13516t = new C1450X2(0, 14);

    /* renamed from: u */
    public static final C1450X2 f13517u = new C1450X2(0, 15);

    /* renamed from: v */
    public static final C1450X2 f13518v = new C1450X2(0, 16);

    /* renamed from: w */
    public static final C1450X2 f13519w = new C1450X2(0, 17);

    /* renamed from: x */
    public static final C1450X2 f13520x = new C1450X2(0, 18);

    /* renamed from: y */
    public static final C1450X2 f13521y = new C1450X2(0, 19);

    /* renamed from: z */
    public static final C1450X2 f13522z = new C1450X2(0, 20);

    /* renamed from: A */
    public static final C1450X2 f13493A = new C1450X2(0, 21);

    /* renamed from: B */
    public static final C1450X2 f13494B = new C1450X2(0, 22);

    /* renamed from: C */
    public static final C1450X2 f13495C = new C1450X2(0, 23);

    /* renamed from: D */
    public static final C1450X2 f13496D = new C1450X2(0, 24);

    /* renamed from: E */
    public static final C1450X2 f13497E = new C1450X2(0, 25);

    /* renamed from: F */
    public static final C1450X2 f13498F = new C1450X2(0, 26);

    /* renamed from: G */
    public static final C1450X2 f13499G = new C1450X2(0, 27);

    /* renamed from: H */
    public static final C1450X2 f13500H = new C1450X2(0, 28);

    /* renamed from: I */
    public static final C1450X2 f13501I = new C1450X2(0, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1450X2(int i, int i2) {
        super(i);
        this.f13523e = i2;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Logger defaultLogger;
        switch (this.f13523e) {
            case 0:
                AbstractC9225eJ0.f26655a.getClass();
                return Integer.valueOf(AbstractC9225eJ0.f26656b.mo6524c(2147418112) + 65536);
            case 1:
                return BP0.m715c(URI.class);
            case 2:
                return BP0.m714b(String.class);
            case 3:
                return BP0.m715c(String.class);
            case 4:
                return new C10107lC0(12);
            case 5:
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(InterfaceC1304Uj.class, InterfaceC1304Uj.class.getClassLoader());
                O90.m5965c(serviceLoaderLoad);
                InterfaceC1304Uj interfaceC1304Uj = (InterfaceC1304Uj) AbstractC7167xu.m25956B(serviceLoaderLoad);
                if (interfaceC1304Uj != null) {
                    return interfaceC1304Uj;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            case 6:
                return Pattern.compile("[-/ ]");
            case 7:
                return BP0.m715c(String.class);
            case 8:
                return BP0.m715c(String.class);
            case 9:
                return BP0.m715c(String.class);
            case 10:
                return BP0.m715c(String.class);
            case 11:
                C1147SE c1147se = new C1147SE(new C8582Yk0("DefaultBuiltIns"));
                c1147se.m26497c(false);
                return c1147se;
            case 12:
                Logger logger = AbstractC10328mw1.f37997a;
                return new C7819Js1(AbstractC8603Yu1.m9425c(), (PackagesRepository) AbstractC8603Yu1.f14596i.getValue(), AbstractC8603Yu1.m9424b());
            case 13:
                C7981Mv1 c7981Mv1 = C8326Tm0.f11511h;
                if (c7981Mv1 == null || (defaultLogger = c7981Mv1.f7398d) == null) {
                    defaultLogger = new DefaultLogger("VkpnsClientSdk");
                }
                return defaultLogger.createLogger("DeleteTokenWorker");
            case 14:
                return C0779MN.f7117a;
            case 15:
                return new UriMatcher(-1);
            case 16:
                return new C0210DK();
            case 17:
                return new C0273EK(new Handler(Looper.getMainLooper()));
            case 18:
                return new ScheduledThreadPoolExecutor(1);
            case 19:
                return new ThreadPoolExecutor(3, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue());
            case 20:
                return (C1147SE) C1147SE.f10643f.getValue();
            case 21:
                try {
                    Object objNewInstance = C6743rR.class.getConstructor(null).newInstance(null);
                    O90.m5966d(objNewInstance, "null cannot be cast to non-null type expo.modules.kotlin.ModulesProvider");
                    return (InterfaceC7974Ms0) objNewInstance;
                } catch (Exception unused) {
                    return null;
                }
            case 22:
                try {
                    Object objInvoke = C6743rR.class.getMethod("getPackageList", null).invoke(null, null);
                    O90.m5966d(objInvoke, "null cannot be cast to non-null type kotlin.collections.List<expo.modules.core.interfaces.Package>");
                    return AbstractC7167xu.m25977W((List) objInvoke, new C8774aq0(10));
                } catch (Exception unused2) {
                    return C0779MN.f7117a;
                }
            case 23:
                return BP0.m715c(String.class);
            case 24:
                return BP0.m715c(DeletingOptions.class);
            case 25:
                return BP0.m715c(RelocatingOptions.class);
            case 26:
                return BP0.m715c(RelocatingOptions.class);
            case 27:
                return BP0.m715c(String.class);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return BP0.m715c(String.class);
            default:
                return BP0.m715c(MakeDirectoryOptions.class);
        }
    }
}
