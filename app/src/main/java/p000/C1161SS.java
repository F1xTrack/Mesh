package p000;

import com.p019vk.push.common.EmptyLogger;
import com.p019vk.push.core.feature.FeatureManagerImpl;
import com.p019vk.push.core.remote.config.omicron.Omicron;
import com.p019vk.push.core.remote.config.omicron.OmicronConfig;
import com.p019vk.push.core.remote.config.omicron.OmicronEnvironment;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;

/* renamed from: SS */
/* loaded from: classes2.dex */
public final class C1161SS extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public OmicronConfig.Builder f10766a;

    /* renamed from: b */
    public C1224TS f10767b;

    /* renamed from: c */
    public int f10768c;

    /* renamed from: d */
    public final /* synthetic */ FeatureManagerImpl f10769d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1161SS(FeatureManagerImpl featureManagerImpl, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f10769d = featureManagerImpl;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C1161SS(this.f10769d, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1161SS) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        OmicronConfig.Builder builderUseDefaultRequestExecutor;
        C1224TS c1224ts;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        int i = this.f10768c;
        FeatureManagerImpl featureManagerImpl = this.f10769d;
        if (i == 0) {
            RQ1.m7017d(obj);
            builderUseDefaultRequestExecutor = OmicronConfig.newBuilder().environment(OmicronEnvironment.RELEASE).appId(FeatureManagerImpl.APP_ID_RELEASE).analyticsHandler(FeatureManagerImpl.access$provideAnalyticsHandler(featureManagerImpl, new EmptyLogger(), featureManagerImpl.f20401c)).useDefaultRequestExecutor(featureManagerImpl.f20400b, false);
            C1224TS c1224ts2 = FeatureManagerImpl.f20398i;
            this.f10766a = builderUseDefaultRequestExecutor;
            this.f10767b = c1224ts2;
            this.f10768c = 1;
            Object objAccess$getFileUpdateInterval = FeatureManagerImpl.access$getFileUpdateInterval(featureManagerImpl, this);
            if (objAccess$getFileUpdateInterval == enumC0817Mz) {
                return enumC0817Mz;
            }
            c1224ts = c1224ts2;
            obj = objAccess$getFileUpdateInterval;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1224ts = this.f10767b;
            builderUseDefaultRequestExecutor = this.f10766a;
            RQ1.m7017d(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        c1224ts.getClass();
        OmicronConfig omicronConfigBuild = builderUseDefaultRequestExecutor.updateInterval((int) TimeUnit.HOURS.toMinutes(iIntValue)).build();
        O90.m5967e(omicronConfigBuild, "newBuilder()\n           …\n                .build()");
        Omicron.getInstance().init(featureManagerImpl.f20399a, omicronConfigBuild);
        AbstractC9366fP1.m18230b(featureManagerImpl.f20405g, null, new C1098RS(featureManagerImpl, null), 3);
        return C8313Tf1.f11463a;
    }
}
