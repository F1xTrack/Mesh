package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.vk.push.common.DefaultLogger;
import com.vk.push.common.HostInfoProvider;
import com.vk.push.common.Logger;
import com.vk.push.common.analytics.AnalyticsTimingsStore;
import com.vk.push.common.analytics.EmptyAnalyticsSender;
import com.vk.push.core.DeviceIdRepository;
import com.vk.push.core.analytics.AnalyticsTimingsStoreImpl;
import com.vk.push.core.data.repository.CallingAppRepositoryImplKt;
import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.data.repository.CrashSenderRepositoryFactory;
import com.vk.push.core.data.repository.IssueKeyBlackListRepository;
import com.vk.push.core.data.repository.PackagesRepositoryImplKt;
import com.vk.push.core.data.source.CallingAppDataSource;
import com.vk.push.core.data.source.ContextDataSource;
import com.vk.push.core.data.source.DeviceInfoDataSource;
import com.vk.push.core.data.source.PackageManagerDataSource;
import com.vk.push.core.deviceid.DeviceIdRepositoryProvider;
import com.vk.push.core.feature.FeatureManager;
import com.vk.push.core.feature.FeatureManagerImpl;
import com.vk.push.core.filedatastore.FileDataSource;
import com.vk.push.core.filedatastore.FileDataStore;
import com.vk.push.core.network.PusherHostProvider;
import com.vk.push.core.network.data.source.MasterHostApi;
import com.vk.push.core.network.http.HttpClientFactory;
import com.vk.push.core.network.http.HttpHeadersInterceptorFactory;
import com.vk.push.core.network.http.HttpLoggingInterceptorFactory;

/* renamed from: Hu1 */
/* loaded from: classes2.dex */
public final class C0628Hu1 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public static final C0628Hu1 f = new C0628Hu1(0, 0);
    public static final C0628Hu1 g = new C0628Hu1(0, 1);
    public static final C0628Hu1 h = new C0628Hu1(0, 2);
    public static final C0628Hu1 i = new C0628Hu1(0, 3);
    public static final C0628Hu1 j = new C0628Hu1(0, 4);
    public static final C0628Hu1 k = new C0628Hu1(0, 5);
    public static final C0628Hu1 l = new C0628Hu1(0, 6);
    public static final C0628Hu1 m = new C0628Hu1(0, 7);
    public static final C0628Hu1 n = new C0628Hu1(0, 8);
    public static final C0628Hu1 o = new C0628Hu1(0, 9);
    public static final C0628Hu1 p = new C0628Hu1(0, 10);
    public static final C0628Hu1 q = new C0628Hu1(0, 11);
    public static final C0628Hu1 r = new C0628Hu1(0, 12);
    public static final C0628Hu1 s = new C0628Hu1(0, 13);
    public static final C0628Hu1 t = new C0628Hu1(0, 14);
    public static final C0628Hu1 u = new C0628Hu1(0, 15);
    public static final C0628Hu1 v = new C0628Hu1(0, 16);
    public static final C0628Hu1 w = new C0628Hu1(0, 17);
    public static final C0628Hu1 x = new C0628Hu1(0, 18);
    public static final C0628Hu1 y = new C0628Hu1(0, 19);
    public static final C0628Hu1 z = new C0628Hu1(0, 20);
    public static final C0628Hu1 A = new C0628Hu1(0, 21);
    public static final C0628Hu1 B = new C0628Hu1(0, 22);
    public static final C0628Hu1 C = new C0628Hu1(0, 23);
    public static final C0628Hu1 D = new C0628Hu1(0, 24);
    public static final C0628Hu1 E = new C0628Hu1(0, 25);
    public static final C0628Hu1 F = new C0628Hu1(0, 26);
    public static final C0628Hu1 G = new C0628Hu1(0, 27);
    public static final C0628Hu1 H = new C0628Hu1(0, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0628Hu1(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        Logger defaultLogger;
        InterfaceC1317Qq1 c2216as1;
        switch (this.e) {
            case 0:
                HttpClientFactory httpClientFactory = HttpClientFactory.INSTANCE;
                F71 f71 = AbstractC1251Pu1.a;
                HttpLoggingInterceptorFactory httpLoggingInterceptorFactory = HttpLoggingInterceptorFactory.INSTANCE;
                C1020Mv1 c1020Mv1 = C1538Tm0.h;
                if (c1020Mv1 == null || (defaultLogger = c1020Mv1.d) == null) {
                    defaultLogger = new DefaultLogger("VkpnsClientSdk");
                }
                InterfaceC6785r90 interfaceC6785r90Create = httpLoggingInterceptorFactory.create(defaultLogger, false);
                HttpHeadersInterceptorFactory httpHeadersInterceptorFactory = HttpHeadersInterceptorFactory.INSTANCE;
                C1020Mv1 c1020Mv12 = C1538Tm0.h;
                if (c1020Mv12 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext = c1020Mv12.a.getApplicationContext();
                O90.e(applicationContext, "vkpnsPushConfig.application.applicationContext");
                String packageName = applicationContext.getPackageName();
                O90.e(packageName, "ConfigModule.applicationContext.packageName");
                return HttpClientFactory.create$default(httpClientFactory, 0L, false, new InterfaceC6785r90[]{interfaceC6785r90Create, httpHeadersInterceptorFactory.create("client_sdk/6.9.1", packageName)}, 3, null);
            case 1:
                C1020Mv1 c1020Mv13 = C1538Tm0.h;
                if (c1020Mv13 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext2 = c1020Mv13.a.getApplicationContext();
                O90.e(applicationContext2, "vkpnsPushConfig.application.applicationContext");
                return new C0538Gq1(C5958mp1.c.j(applicationContext2).b, (C0544Gs1) AbstractC1953Yu1.o.getValue(), (AnalyticsTimingsStore) AbstractC1953Yu1.p.getValue(), (FeatureManager) AbstractC1953Yu1.v.getValue(), AbstractC1953Yu1.a);
            case 2:
                Logger logger = AbstractC1953Yu1.a;
                C1020Mv1 c1020Mv14 = C1538Tm0.h;
                if (c1020Mv14 != null) {
                    return new C1005Mq1(new C6273oT0(c1020Mv14.a));
                }
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            case 3:
                Logger logger2 = AbstractC1953Yu1.a;
                C1020Mv1 c1020Mv15 = C1538Tm0.h;
                if (c1020Mv15 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext3 = c1020Mv15.a.getApplicationContext();
                O90.e(applicationContext3, "vkpnsPushConfig.application.applicationContext");
                PackageManager packageManager = applicationContext3.getPackageManager();
                O90.e(packageManager, "packageManager");
                PackageManagerDataSource packageManagerDataSource = new PackageManagerDataSource(packageManager);
                C6518pl0 c6518pl0 = new C6518pl0(24);
                C3860fu1 c3860fu1 = C3860fu1.a;
                C1020Mv1 c1020Mv16 = C1538Tm0.h;
                if (c1020Mv16 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext4 = c1020Mv16.a.getApplicationContext();
                O90.e(applicationContext4, "vkpnsPushConfig.application.applicationContext");
                c3860fu1.getClass();
                InterfaceC7018sN0 interfaceC7018sN0 = C3860fu1.i;
                InterfaceC5927mf0[] interfaceC5927mf0Arr = C3860fu1.b;
                FileDataStore fileDataStore = (FileDataStore) interfaceC7018sN0.getValue(applicationContext4, interfaceC5927mf0Arr[6]);
                C1020Mv1 c1020Mv17 = C1538Tm0.h;
                if (c1020Mv17 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext5 = c1020Mv17.a.getApplicationContext();
                O90.e(applicationContext5, "vkpnsPushConfig.application.applicationContext");
                C0622Hs1 c0622Hs1 = new C0622Hs1(fileDataStore, (FileDataStore) C3860fu1.j.getValue(applicationContext5, interfaceC5927mf0Arr[7]));
                C6363ox0 c6363ox0 = (C6363ox0) AbstractC1251Pu1.a.getValue();
                C1020Mv1 c1020Mv18 = C1538Tm0.h;
                if (c1020Mv18 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                HostInfoProvider pusherHostProvider = c1020Mv18.e;
                if (pusherHostProvider == null) {
                    pusherHostProvider = new PusherHostProvider();
                }
                MasterHostApi masterHostApi = new MasterHostApi(c6363ox0, pusherHostProvider, null, 4, null);
                C1020Mv1 c1020Mv19 = C1538Tm0.h;
                if (c1020Mv19 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext6 = c1020Mv19.a.getApplicationContext();
                O90.e(applicationContext6, "vkpnsPushConfig.application.applicationContext");
                Logger logger3 = AbstractC1953Yu1.a;
                return new C1320Qr1(packageManagerDataSource, c6518pl0, c0622Hs1, masterHostApi, new C5826m71(6, new N8(applicationContext6, logger3)), new C1398Rr1(1, 2, null), AbstractC1953Yu1.b(), logger3);
            case 4:
                Logger logger4 = AbstractC1953Yu1.a;
                C1020Mv1 c1020Mv110 = C1538Tm0.h;
                if (c1020Mv110 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                C5792ly c5792ly = new C5792ly(c1020Mv110.j);
                C1632Ur1 c1632Ur1A = AbstractC1953Yu1.a();
                C1020Mv1 c1020Mv111 = C1538Tm0.h;
                if (c1020Mv111 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext7 = c1020Mv111.a.getApplicationContext();
                O90.e(applicationContext7, "vkpnsPushConfig.application.applicationContext");
                return new C0544Gs1(c5792ly, c1632Ur1A, new DeviceInfoDataSource(applicationContext7), (DeviceIdRepository) AbstractC1953Yu1.n.getValue());
            case 5:
                Logger logger5 = AbstractC1953Yu1.a;
                C1020Mv1 c1020Mv112 = C1538Tm0.h;
                if (c1020Mv112 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext8 = c1020Mv112.a.getApplicationContext();
                O90.e(applicationContext8, "vkpnsPushConfig.application.applicationContext");
                return CallingAppRepositoryImplKt.CallingAppRepository(new CallingAppDataSource(applicationContext8));
            case 6:
                return new C6543pt1(AbstractC1953Yu1.a());
            case 7:
                Logger logger6 = AbstractC1953Yu1.a;
                C3860fu1 c3860fu12 = C3860fu1.a;
                C1020Mv1 c1020Mv113 = C1538Tm0.h;
                if (c1020Mv113 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext9 = c1020Mv113.a.getApplicationContext();
                O90.e(applicationContext9, "vkpnsPushConfig.application.applicationContext");
                c3860fu12.getClass();
                return new C0936Lt1(new C6446pN0((FileDataStore) C3860fu1.c.getValue(applicationContext9, C3860fu1.b[0])));
            case 8:
                Logger logger7 = AbstractC1953Yu1.a;
                C1020Mv1 c1020Mv114 = C1538Tm0.h;
                if (c1020Mv114 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext10 = c1020Mv114.a.getApplicationContext();
                O90.e(applicationContext10, "vkpnsPushConfig.application.applicationContext");
                Logger logger8 = AbstractC1953Yu1.a;
                return new C1629Uq1(new ES1(applicationContext10, logger8), (C0697Ir1) AbstractC1953Yu1.c.getValue(), logger8);
            case 9:
                CrashSenderRepositoryFactory crashSenderRepositoryFactory = new CrashSenderRepositoryFactory();
                C1020Mv1 c1020Mv115 = C1538Tm0.h;
                if (c1020Mv115 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext11 = c1020Mv115.a.getApplicationContext();
                O90.e(applicationContext11, "vkpnsPushConfig.application.applicationContext");
                return crashSenderRepositoryFactory.createCrashSenderRepository(applicationContext11, "ru.rustore.sdk.pushclient", (IssueKeyBlackListRepository) AbstractC1953Yu1.u.getValue(), AbstractC1953Yu1.a);
            case 10:
                DeviceIdRepositoryProvider deviceIdRepositoryProvider = DeviceIdRepositoryProvider.INSTANCE;
                C1020Mv1 c1020Mv116 = C1538Tm0.h;
                if (c1020Mv116 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext12 = c1020Mv116.a.getApplicationContext();
                O90.e(applicationContext12, "vkpnsPushConfig.application.applicationContext");
                return deviceIdRepositoryProvider.initIfRequired(applicationContext12, AbstractC1953Yu1.a);
            case 11:
                return new EmptyAnalyticsSender();
            case 12:
                FeatureManager featureManager = (FeatureManager) AbstractC1953Yu1.v.getValue();
                C1020Mv1 c1020Mv117 = C1538Tm0.h;
                if (c1020Mv117 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext13 = c1020Mv117.a.getApplicationContext();
                O90.e(applicationContext13, "vkpnsPushConfig.application.applicationContext");
                return new C1551Tq1(featureManager, new FileDataSource(applicationContext13, "vkpns_client_external_apps_config", null, 4, null));
            case 13:
                C1020Mv1 c1020Mv118 = C1538Tm0.h;
                if (c1020Mv118 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext14 = c1020Mv118.a.getApplicationContext();
                O90.e(applicationContext14, "vkpnsPushConfig.application.applicationContext");
                return new FeatureManagerImpl(applicationContext14, (C6363ox0) AbstractC1251Pu1.a.getValue(), (CrashReporterRepository) AbstractC1953Yu1.w.getValue(), (IssueKeyBlackListRepository) AbstractC1953Yu1.u.getValue(), AbstractC1953Yu1.a, null, null, 96, null);
            case 14:
                Logger logger9 = AbstractC1953Yu1.a;
                if (C1538Tm0.o().i) {
                    Context applicationContext15 = C1538Tm0.o().a.getApplicationContext();
                    O90.e(applicationContext15, "vkpnsPushConfig.application.applicationContext");
                    c2216as1 = new C2216as1(applicationContext15, C1538Tm0.o().b, logger9);
                } else {
                    Context applicationContext16 = C1538Tm0.o().a.getApplicationContext();
                    O90.e(applicationContext16, "vkpnsPushConfig.application.applicationContext");
                    String str = C1538Tm0.o().b;
                    O90.f(logger9, "logger");
                    C0145Bp1 c0145Bp1 = new C0145Bp1();
                    c0145Bp1.b = applicationContext16;
                    c0145Bp1.a = str;
                    c0145Bp1.c = logger9;
                    c2216as1 = c0145Bp1;
                }
                return new C3669eu1(new C1173Ou1(c2216as1, new C1398Rr1(1, 3, null), new C1398Rr1(1, 4, null), logger9));
            case 15:
                C1020Mv1 c1020Mv119 = C1538Tm0.h;
                if (c1020Mv119 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext17 = c1020Mv119.a.getApplicationContext();
                O90.e(applicationContext17, "vkpnsPushConfig.application.applicationContext");
                return new IssueKeyBlackListRepository(applicationContext17, null, 2, null);
            case 16:
                Logger logger10 = AbstractC1953Yu1.a;
                C3860fu1 c3860fu13 = C3860fu1.a;
                C1020Mv1 c1020Mv120 = C1538Tm0.h;
                if (c1020Mv120 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext18 = c1020Mv120.a.getApplicationContext();
                O90.e(applicationContext18, "vkpnsPushConfig.application.applicationContext");
                c3860fu13.getClass();
                return new C0238Cu1(new C1644Uv1((FileDataStore) C3860fu1.d.getValue(applicationContext18, C3860fu1.b[1])));
            case 17:
                C1020Mv1 c1020Mv121 = C1538Tm0.h;
                if (c1020Mv121 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext19 = c1020Mv121.a.getApplicationContext();
                O90.e(applicationContext19, "vkpnsPushConfig.application.applicationContext");
                return new C7696vw0(applicationContext19);
            case 18:
                Logger logger11 = AbstractC1953Yu1.a;
                C1020Mv1 c1020Mv122 = C1538Tm0.h;
                if (c1020Mv122 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext20 = c1020Mv122.a.getApplicationContext();
                O90.e(applicationContext20, "vkpnsPushConfig.application.applicationContext");
                PackageManager packageManager2 = applicationContext20.getPackageManager();
                O90.e(packageManager2, "packageManager");
                PackageManagerDataSource packageManagerDataSource2 = new PackageManagerDataSource(packageManager2);
                C1020Mv1 c1020Mv123 = C1538Tm0.h;
                if (c1020Mv123 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext21 = c1020Mv123.a.getApplicationContext();
                O90.e(applicationContext21, "vkpnsPushConfig.application.applicationContext");
                return PackagesRepositoryImplKt.PackagesRepository(packageManagerDataSource2, new ContextDataSource(applicationContext21));
            case 19:
                C3860fu1 c3860fu14 = C3860fu1.a;
                C1020Mv1 c1020Mv124 = C1538Tm0.h;
                if (c1020Mv124 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext22 = c1020Mv124.a.getApplicationContext();
                O90.e(applicationContext22, "vkpnsPushConfig.application.applicationContext");
                c3860fu14.getClass();
                InterfaceC7018sN0 interfaceC7018sN02 = C3860fu1.f;
                InterfaceC5927mf0[] interfaceC5927mf0Arr2 = C3860fu1.b;
                FileDataStore fileDataStore2 = (FileDataStore) interfaceC7018sN02.getValue(applicationContext22, interfaceC5927mf0Arr2[3]);
                C1020Mv1 c1020Mv125 = C1538Tm0.h;
                if (c1020Mv125 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext23 = c1020Mv125.a.getApplicationContext();
                O90.e(applicationContext23, "vkpnsPushConfig.application.applicationContext");
                FileDataStore fileDataStore3 = (FileDataStore) C3860fu1.g.getValue(applicationContext23, interfaceC5927mf0Arr2[4]);
                O90.f(fileDataStore2, "pushTokenDataStore");
                O90.f(fileDataStore3, "pushTokenDeliveryDataStore");
                return new C0697Ir1(fileDataStore2, fileDataStore3);
            case 20:
                Logger logger12 = AbstractC1953Yu1.a;
                C1020Mv1 c1020Mv126 = C1538Tm0.h;
                if (c1020Mv126 != null) {
                    return new C5594kv1(new C5792ly(c1020Mv126.j));
                }
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            case 21:
                return new C8074xv1(new C1398Rr1(1, 6, null), AbstractC1953Yu1.a);
            case 22:
                return new AnalyticsTimingsStoreImpl();
            case 23:
                C6363ox0 c6363ox02 = (C6363ox0) AbstractC1251Pu1.a.getValue();
                C1020Mv1 c1020Mv127 = C1538Tm0.h;
                if (c1020Mv127 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Object c0396Ev0 = c1020Mv127.f;
                if (c0396Ev0 == null) {
                    c0396Ev0 = new C0396Ev0(24);
                }
                GK gk = GK.a;
                QF qf = QF.c;
                O90.f(c6363ox02, "okHttpClient");
                O90.f(qf, "dispatcher");
                C0145Bp1 c0145Bp12 = new C0145Bp1();
                c0145Bp12.b = c6363ox02;
                c0145Bp12.a = c0396Ev0;
                c0145Bp12.c = qf;
                return new C1098Nv1(c0145Bp12, (C0697Ir1) AbstractC1953Yu1.c.getValue(), AbstractC1953Yu1.a);
            case 24:
                C1020Mv1 c1020Mv128 = C1538Tm0.h;
                if (c1020Mv128 != null) {
                    return c1020Mv128.h;
                }
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            case 25:
                C1020Mv1 c1020Mv129 = C1538Tm0.h;
                if (c1020Mv129 != null) {
                    return c1020Mv129.g;
                }
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            case 26:
                return new C0391Et1((C3669eu1) AbstractC1953Yu1.t.getValue());
            case 27:
                return new C0391Et1((C3669eu1) AbstractC1953Yu1.t.getValue());
            default:
                return new C1017Mu1();
        }
    }
}
