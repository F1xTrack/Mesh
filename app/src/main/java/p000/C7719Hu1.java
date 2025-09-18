package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import com.p019vk.push.common.DefaultLogger;
import com.p019vk.push.common.HostInfoProvider;
import com.p019vk.push.common.Logger;
import com.p019vk.push.common.analytics.AnalyticsTimingsStore;
import com.p019vk.push.common.analytics.EmptyAnalyticsSender;
import com.p019vk.push.core.DeviceIdRepository;
import com.p019vk.push.core.analytics.AnalyticsTimingsStoreImpl;
import com.p019vk.push.core.data.repository.CallingAppRepositoryImplKt;
import com.p019vk.push.core.data.repository.CrashReporterRepository;
import com.p019vk.push.core.data.repository.CrashSenderRepositoryFactory;
import com.p019vk.push.core.data.repository.IssueKeyBlackListRepository;
import com.p019vk.push.core.data.repository.PackagesRepositoryImplKt;
import com.p019vk.push.core.data.source.CallingAppDataSource;
import com.p019vk.push.core.data.source.ContextDataSource;
import com.p019vk.push.core.data.source.DeviceInfoDataSource;
import com.p019vk.push.core.data.source.PackageManagerDataSource;
import com.p019vk.push.core.deviceid.DeviceIdRepositoryProvider;
import com.p019vk.push.core.feature.FeatureManager;
import com.p019vk.push.core.feature.FeatureManagerImpl;
import com.p019vk.push.core.filedatastore.FileDataSource;
import com.p019vk.push.core.filedatastore.FileDataStore;
import com.p019vk.push.core.network.PusherHostProvider;
import com.p019vk.push.core.network.data.source.MasterHostApi;
import com.p019vk.push.core.network.http.HttpClientFactory;
import com.p019vk.push.core.network.http.HttpHeadersInterceptorFactory;
import com.p019vk.push.core.network.http.HttpLoggingInterceptorFactory;

/* renamed from: Hu1 */
/* loaded from: classes2.dex */
public final class C7719Hu1 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f4603e;

    /* renamed from: f */
    public static final C7719Hu1 f4582f = new C7719Hu1(0, 0);

    /* renamed from: g */
    public static final C7719Hu1 f4583g = new C7719Hu1(0, 1);

    /* renamed from: h */
    public static final C7719Hu1 f4584h = new C7719Hu1(0, 2);

    /* renamed from: i */
    public static final C7719Hu1 f4585i = new C7719Hu1(0, 3);

    /* renamed from: j */
    public static final C7719Hu1 f4586j = new C7719Hu1(0, 4);

    /* renamed from: k */
    public static final C7719Hu1 f4587k = new C7719Hu1(0, 5);

    /* renamed from: l */
    public static final C7719Hu1 f4588l = new C7719Hu1(0, 6);

    /* renamed from: m */
    public static final C7719Hu1 f4589m = new C7719Hu1(0, 7);

    /* renamed from: n */
    public static final C7719Hu1 f4590n = new C7719Hu1(0, 8);

    /* renamed from: o */
    public static final C7719Hu1 f4591o = new C7719Hu1(0, 9);

    /* renamed from: p */
    public static final C7719Hu1 f4592p = new C7719Hu1(0, 10);

    /* renamed from: q */
    public static final C7719Hu1 f4593q = new C7719Hu1(0, 11);

    /* renamed from: r */
    public static final C7719Hu1 f4594r = new C7719Hu1(0, 12);

    /* renamed from: s */
    public static final C7719Hu1 f4595s = new C7719Hu1(0, 13);

    /* renamed from: t */
    public static final C7719Hu1 f4596t = new C7719Hu1(0, 14);

    /* renamed from: u */
    public static final C7719Hu1 f4597u = new C7719Hu1(0, 15);

    /* renamed from: v */
    public static final C7719Hu1 f4598v = new C7719Hu1(0, 16);

    /* renamed from: w */
    public static final C7719Hu1 f4599w = new C7719Hu1(0, 17);

    /* renamed from: x */
    public static final C7719Hu1 f4600x = new C7719Hu1(0, 18);

    /* renamed from: y */
    public static final C7719Hu1 f4601y = new C7719Hu1(0, 19);

    /* renamed from: z */
    public static final C7719Hu1 f4602z = new C7719Hu1(0, 20);

    /* renamed from: A */
    public static final C7719Hu1 f4574A = new C7719Hu1(0, 21);

    /* renamed from: B */
    public static final C7719Hu1 f4575B = new C7719Hu1(0, 22);

    /* renamed from: C */
    public static final C7719Hu1 f4576C = new C7719Hu1(0, 23);

    /* renamed from: D */
    public static final C7719Hu1 f4577D = new C7719Hu1(0, 24);

    /* renamed from: E */
    public static final C7719Hu1 f4578E = new C7719Hu1(0, 25);

    /* renamed from: F */
    public static final C7719Hu1 f4579F = new C7719Hu1(0, 26);

    /* renamed from: G */
    public static final C7719Hu1 f4580G = new C7719Hu1(0, 27);

    /* renamed from: H */
    public static final C7719Hu1 f4581H = new C7719Hu1(0, 28);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7719Hu1(int i, int i2) {
        super(i);
        this.f4603e = i2;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        Logger defaultLogger;
        InterfaceC8179Qq1 c8779as1;
        switch (this.f4603e) {
            case 0:
                HttpClientFactory httpClientFactory = HttpClientFactory.INSTANCE;
                F71 f71 = AbstractC8135Pu1.f9346a;
                HttpLoggingInterceptorFactory httpLoggingInterceptorFactory = HttpLoggingInterceptorFactory.INSTANCE;
                C7981Mv1 c7981Mv1 = C8326Tm0.f11511h;
                if (c7981Mv1 == null || (defaultLogger = c7981Mv1.f7398d) == null) {
                    defaultLogger = new DefaultLogger("VkpnsClientSdk");
                }
                InterfaceC10869r90 interfaceC10869r90Create = httpLoggingInterceptorFactory.create(defaultLogger, false);
                HttpHeadersInterceptorFactory httpHeadersInterceptorFactory = HttpHeadersInterceptorFactory.INSTANCE;
                C7981Mv1 c7981Mv12 = C8326Tm0.f11511h;
                if (c7981Mv12 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext = c7981Mv12.f7395a.getApplicationContext();
                O90.m5967e(applicationContext, "vkpnsPushConfig.application.applicationContext");
                String packageName = applicationContext.getPackageName();
                O90.m5967e(packageName, "ConfigModule.applicationContext.packageName");
                return HttpClientFactory.create$default(httpClientFactory, 0L, false, new InterfaceC10869r90[]{interfaceC10869r90Create, httpHeadersInterceptorFactory.create("client_sdk/6.9.1", packageName)}, 3, null);
            case 1:
                C7981Mv1 c7981Mv13 = C8326Tm0.f11511h;
                if (c7981Mv13 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext2 = c7981Mv13.f7395a.getApplicationContext();
                O90.m5967e(applicationContext2, "vkpnsPushConfig.application.applicationContext");
                return new C7659Gq1(C10314mp1.f37956c.m1942j(applicationContext2).f37959b, (C7663Gs1) AbstractC8603Yu1.f14602o.getValue(), (AnalyticsTimingsStore) AbstractC8603Yu1.f14603p.getValue(), (FeatureManager) AbstractC8603Yu1.f14609v.getValue(), AbstractC8603Yu1.f14588a);
            case 2:
                Logger logger = AbstractC8603Yu1.f14588a;
                C7981Mv1 c7981Mv14 = C8326Tm0.f11511h;
                if (c7981Mv14 != null) {
                    return new C7971Mq1(new C10525oT0(c7981Mv14.f7395a));
                }
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            case 3:
                Logger logger2 = AbstractC8603Yu1.f14588a;
                C7981Mv1 c7981Mv15 = C8326Tm0.f11511h;
                if (c7981Mv15 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext3 = c7981Mv15.f7395a.getApplicationContext();
                O90.m5967e(applicationContext3, "vkpnsPushConfig.application.applicationContext");
                PackageManager packageManager = applicationContext3.getPackageManager();
                O90.m5967e(packageManager, "packageManager");
                PackageManagerDataSource packageManagerDataSource = new PackageManagerDataSource(packageManager);
                C10689pl0 c10689pl0 = new C10689pl0(24);
                C9428fu1 c9428fu1 = C9428fu1.f27451a;
                C7981Mv1 c7981Mv16 = C8326Tm0.f11511h;
                if (c7981Mv16 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext4 = c7981Mv16.f7395a.getApplicationContext();
                O90.m5967e(applicationContext4, "vkpnsPushConfig.application.applicationContext");
                c9428fu1.getClass();
                InterfaceC11025sN0 interfaceC11025sN0 = C9428fu1.f27459i;
                InterfaceC10293mf0[] interfaceC10293mf0Arr = C9428fu1.f27452b;
                FileDataStore fileDataStore = (FileDataStore) interfaceC11025sN0.getValue(applicationContext4, interfaceC10293mf0Arr[6]);
                C7981Mv1 c7981Mv17 = C8326Tm0.f11511h;
                if (c7981Mv17 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext5 = c7981Mv17.f7395a.getApplicationContext();
                O90.m5967e(applicationContext5, "vkpnsPushConfig.application.applicationContext");
                C7715Hs1 c7715Hs1 = new C7715Hs1(fileDataStore, (FileDataStore) C9428fu1.f27460j.getValue(applicationContext5, interfaceC10293mf0Arr[7]));
                C10585ox0 c10585ox0 = (C10585ox0) AbstractC8135Pu1.f9346a.getValue();
                C7981Mv1 c7981Mv18 = C8326Tm0.f11511h;
                if (c7981Mv18 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                HostInfoProvider pusherHostProvider = c7981Mv18.f7399e;
                if (pusherHostProvider == null) {
                    pusherHostProvider = new PusherHostProvider();
                }
                MasterHostApi masterHostApi = new MasterHostApi(c10585ox0, pusherHostProvider, null, 4, null);
                C7981Mv1 c7981Mv19 = C8326Tm0.f11511h;
                if (c7981Mv19 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext6 = c7981Mv19.f7395a.getApplicationContext();
                O90.m5967e(applicationContext6, "vkpnsPushConfig.application.applicationContext");
                Logger logger3 = AbstractC8603Yu1.f14588a;
                return new C8181Qr1(packageManagerDataSource, c10689pl0, c7715Hs1, masterHostApi, new C10226m71(6, new C0827N8(applicationContext6, logger3)), new C8233Rr1(1, 2, null), AbstractC8603Yu1.m9424b(), logger3);
            case 4:
                Logger logger4 = AbstractC8603Yu1.f14588a;
                C7981Mv1 c7981Mv110 = C8326Tm0.f11511h;
                if (c7981Mv110 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                C6396ly c6396ly = new C6396ly(c7981Mv110.f7404j);
                C8389Ur1 c8389Ur1M9423a = AbstractC8603Yu1.m9423a();
                C7981Mv1 c7981Mv111 = C8326Tm0.f11511h;
                if (c7981Mv111 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext7 = c7981Mv111.f7395a.getApplicationContext();
                O90.m5967e(applicationContext7, "vkpnsPushConfig.application.applicationContext");
                return new C7663Gs1(c6396ly, c8389Ur1M9423a, new DeviceInfoDataSource(applicationContext7), (DeviceIdRepository) AbstractC8603Yu1.f14601n.getValue());
            case 5:
                Logger logger5 = AbstractC8603Yu1.f14588a;
                C7981Mv1 c7981Mv112 = C8326Tm0.f11511h;
                if (c7981Mv112 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext8 = c7981Mv112.f7395a.getApplicationContext();
                O90.m5967e(applicationContext8, "vkpnsPushConfig.application.applicationContext");
                return CallingAppRepositoryImplKt.CallingAppRepository(new CallingAppDataSource(applicationContext8));
            case 6:
                return new C10706pt1(AbstractC8603Yu1.m9423a());
            case 7:
                Logger logger6 = AbstractC8603Yu1.f14588a;
                C9428fu1 c9428fu12 = C9428fu1.f27451a;
                C7981Mv1 c7981Mv113 = C8326Tm0.f11511h;
                if (c7981Mv113 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext9 = c7981Mv113.f7395a.getApplicationContext();
                O90.m5967e(applicationContext9, "vkpnsPushConfig.application.applicationContext");
                c9428fu12.getClass();
                return new C7925Lt1(new C10641pN0((FileDataStore) C9428fu1.f27453c.getValue(applicationContext9, C9428fu1.f27452b[0])));
            case 8:
                Logger logger7 = AbstractC8603Yu1.f14588a;
                C7981Mv1 c7981Mv114 = C8326Tm0.f11511h;
                if (c7981Mv114 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext10 = c7981Mv114.f7395a.getApplicationContext();
                O90.m5967e(applicationContext10, "vkpnsPushConfig.application.applicationContext");
                Logger logger8 = AbstractC8603Yu1.f14588a;
                return new C8387Uq1(new ES1(applicationContext10, logger8), (C7765Ir1) AbstractC8603Yu1.f14590c.getValue(), logger8);
            case 9:
                CrashSenderRepositoryFactory crashSenderRepositoryFactory = new CrashSenderRepositoryFactory();
                C7981Mv1 c7981Mv115 = C8326Tm0.f11511h;
                if (c7981Mv115 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext11 = c7981Mv115.f7395a.getApplicationContext();
                O90.m5967e(applicationContext11, "vkpnsPushConfig.application.applicationContext");
                return crashSenderRepositoryFactory.createCrashSenderRepository(applicationContext11, "ru.rustore.sdk.pushclient", (IssueKeyBlackListRepository) AbstractC8603Yu1.f14608u.getValue(), AbstractC8603Yu1.f14588a);
            case 10:
                DeviceIdRepositoryProvider deviceIdRepositoryProvider = DeviceIdRepositoryProvider.INSTANCE;
                C7981Mv1 c7981Mv116 = C8326Tm0.f11511h;
                if (c7981Mv116 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext12 = c7981Mv116.f7395a.getApplicationContext();
                O90.m5967e(applicationContext12, "vkpnsPushConfig.application.applicationContext");
                return deviceIdRepositoryProvider.initIfRequired(applicationContext12, AbstractC8603Yu1.f14588a);
            case 11:
                return new EmptyAnalyticsSender();
            case 12:
                FeatureManager featureManager = (FeatureManager) AbstractC8603Yu1.f14609v.getValue();
                C7981Mv1 c7981Mv117 = C8326Tm0.f11511h;
                if (c7981Mv117 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext13 = c7981Mv117.f7395a.getApplicationContext();
                O90.m5967e(applicationContext13, "vkpnsPushConfig.application.applicationContext");
                return new C8335Tq1(featureManager, new FileDataSource(applicationContext13, "vkpns_client_external_apps_config", null, 4, null));
            case 13:
                C7981Mv1 c7981Mv118 = C8326Tm0.f11511h;
                if (c7981Mv118 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext14 = c7981Mv118.f7395a.getApplicationContext();
                O90.m5967e(applicationContext14, "vkpnsPushConfig.application.applicationContext");
                return new FeatureManagerImpl(applicationContext14, (C10585ox0) AbstractC8135Pu1.f9346a.getValue(), (CrashReporterRepository) AbstractC8603Yu1.f14610w.getValue(), (IssueKeyBlackListRepository) AbstractC8603Yu1.f14608u.getValue(), AbstractC8603Yu1.f14588a, null, null, 96, null);
            case 14:
                Logger logger9 = AbstractC8603Yu1.f14588a;
                if (C8326Tm0.m7740o().f7403i) {
                    Context applicationContext15 = C8326Tm0.m7740o().f7395a.getApplicationContext();
                    O90.m5967e(applicationContext15, "vkpnsPushConfig.application.applicationContext");
                    c8779as1 = new C8779as1(applicationContext15, C8326Tm0.m7740o().f7396b, logger9);
                } else {
                    Context applicationContext16 = C8326Tm0.m7740o().f7395a.getApplicationContext();
                    O90.m5967e(applicationContext16, "vkpnsPushConfig.application.applicationContext");
                    String str = C8326Tm0.m7740o().f7396b;
                    O90.m5968f(logger9, "logger");
                    C7397Bp1 c7397Bp1 = new C7397Bp1();
                    c7397Bp1.f1052b = applicationContext16;
                    c7397Bp1.f1051a = str;
                    c7397Bp1.f1053c = logger9;
                    c8779as1 = c7397Bp1;
                }
                return new C9300eu1(new C8083Ou1(c8779as1, new C8233Rr1(1, 3, null), new C8233Rr1(1, 4, null), logger9));
            case 15:
                C7981Mv1 c7981Mv119 = C8326Tm0.f11511h;
                if (c7981Mv119 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext17 = c7981Mv119.f7395a.getApplicationContext();
                O90.m5967e(applicationContext17, "vkpnsPushConfig.application.applicationContext");
                return new IssueKeyBlackListRepository(applicationContext17, null, 2, null);
            case 16:
                Logger logger10 = AbstractC8603Yu1.f14588a;
                C9428fu1 c9428fu13 = C9428fu1.f27451a;
                C7981Mv1 c7981Mv120 = C8326Tm0.f11511h;
                if (c7981Mv120 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext18 = c7981Mv120.f7395a.getApplicationContext();
                O90.m5967e(applicationContext18, "vkpnsPushConfig.application.applicationContext");
                c9428fu13.getClass();
                return new C7459Cu1(new C8397Uv1((FileDataStore) C9428fu1.f27454d.getValue(applicationContext18, C9428fu1.f27452b[1])));
            case 17:
                C7981Mv1 c7981Mv121 = C8326Tm0.f11511h;
                if (c7981Mv121 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext19 = c7981Mv121.f7395a.getApplicationContext();
                O90.m5967e(applicationContext19, "vkpnsPushConfig.application.applicationContext");
                return new C11479vw0(applicationContext19);
            case 18:
                Logger logger11 = AbstractC8603Yu1.f14588a;
                C7981Mv1 c7981Mv122 = C8326Tm0.f11511h;
                if (c7981Mv122 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext20 = c7981Mv122.f7395a.getApplicationContext();
                O90.m5967e(applicationContext20, "vkpnsPushConfig.application.applicationContext");
                PackageManager packageManager2 = applicationContext20.getPackageManager();
                O90.m5967e(packageManager2, "packageManager");
                PackageManagerDataSource packageManagerDataSource2 = new PackageManagerDataSource(packageManager2);
                C7981Mv1 c7981Mv123 = C8326Tm0.f11511h;
                if (c7981Mv123 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext21 = c7981Mv123.f7395a.getApplicationContext();
                O90.m5967e(applicationContext21, "vkpnsPushConfig.application.applicationContext");
                return PackagesRepositoryImplKt.PackagesRepository(packageManagerDataSource2, new ContextDataSource(applicationContext21));
            case 19:
                C9428fu1 c9428fu14 = C9428fu1.f27451a;
                C7981Mv1 c7981Mv124 = C8326Tm0.f11511h;
                if (c7981Mv124 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext22 = c7981Mv124.f7395a.getApplicationContext();
                O90.m5967e(applicationContext22, "vkpnsPushConfig.application.applicationContext");
                c9428fu14.getClass();
                InterfaceC11025sN0 interfaceC11025sN02 = C9428fu1.f27456f;
                InterfaceC10293mf0[] interfaceC10293mf0Arr2 = C9428fu1.f27452b;
                FileDataStore fileDataStore2 = (FileDataStore) interfaceC11025sN02.getValue(applicationContext22, interfaceC10293mf0Arr2[3]);
                C7981Mv1 c7981Mv125 = C8326Tm0.f11511h;
                if (c7981Mv125 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Context applicationContext23 = c7981Mv125.f7395a.getApplicationContext();
                O90.m5967e(applicationContext23, "vkpnsPushConfig.application.applicationContext");
                FileDataStore fileDataStore3 = (FileDataStore) C9428fu1.f27457g.getValue(applicationContext23, interfaceC10293mf0Arr2[4]);
                O90.m5968f(fileDataStore2, "pushTokenDataStore");
                O90.m5968f(fileDataStore3, "pushTokenDeliveryDataStore");
                return new C7765Ir1(fileDataStore2, fileDataStore3);
            case 20:
                Logger logger12 = AbstractC8603Yu1.f14588a;
                C7981Mv1 c7981Mv126 = C8326Tm0.f11511h;
                if (c7981Mv126 != null) {
                    return new C10070kv1(new C6396ly(c7981Mv126.f7404j));
                }
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            case 21:
                return new C11732xv1(new C8233Rr1(1, 6, null), AbstractC8603Yu1.f14588a);
            case 22:
                return new AnalyticsTimingsStoreImpl();
            case 23:
                C10585ox0 c10585ox02 = (C10585ox0) AbstractC8135Pu1.f9346a.getValue();
                C7981Mv1 c7981Mv127 = C8326Tm0.f11511h;
                if (c7981Mv127 == null) {
                    throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
                }
                Object c7564Ev0 = c7981Mv127.f7400f;
                if (c7564Ev0 == null) {
                    c7564Ev0 = new C7564Ev0(24);
                }
                C0399GK c0399gk = C0399GK.f3694a;
                ExecutorC1023QF executorC1023QF = ExecutorC1023QF.f9548c;
                O90.m5968f(c10585ox02, "okHttpClient");
                O90.m5968f(executorC1023QF, "dispatcher");
                C7397Bp1 c7397Bp12 = new C7397Bp1();
                c7397Bp12.f1052b = c10585ox02;
                c7397Bp12.f1051a = c7564Ev0;
                c7397Bp12.f1053c = executorC1023QF;
                return new C8033Nv1(c7397Bp12, (C7765Ir1) AbstractC8603Yu1.f14590c.getValue(), AbstractC8603Yu1.f14588a);
            case 24:
                C7981Mv1 c7981Mv128 = C8326Tm0.f11511h;
                if (c7981Mv128 != null) {
                    return c7981Mv128.f7402h;
                }
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            case 25:
                C7981Mv1 c7981Mv129 = C8326Tm0.f11511h;
                if (c7981Mv129 != null) {
                    return c7981Mv129.f7401g;
                }
                throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
            case 26:
                return new C7561Et1((C9300eu1) AbstractC8603Yu1.f14607t.getValue());
            case 27:
                return new C7561Et1((C9300eu1) AbstractC8603Yu1.f14607t.getValue());
            default:
                return new C7979Mu1();
        }
    }
}
