package defpackage;

import com.vk.push.common.EmptyLogger;
import com.vk.push.core.feature.FeatureManagerImpl;
import com.vk.push.core.remote.config.omicron.Omicron;
import com.vk.push.core.remote.config.omicron.OmicronConfig;
import com.vk.push.core.remote.config.omicron.OmicronEnvironment;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class SS extends AbstractC4286i71 implements Function2 {
    public OmicronConfig.Builder a;
    public TS b;
    public int c;
    public final /* synthetic */ FeatureManagerImpl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SS(FeatureManagerImpl featureManagerImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.d = featureManagerImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new SS(this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SS) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        OmicronConfig.Builder builderUseDefaultRequestExecutor;
        TS ts;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        int i = this.c;
        FeatureManagerImpl featureManagerImpl = this.d;
        if (i == 0) {
            RQ1.d(obj);
            builderUseDefaultRequestExecutor = OmicronConfig.newBuilder().environment(OmicronEnvironment.RELEASE).appId(FeatureManagerImpl.APP_ID_RELEASE).analyticsHandler(FeatureManagerImpl.access$provideAnalyticsHandler(featureManagerImpl, new EmptyLogger(), featureManagerImpl.c)).useDefaultRequestExecutor(featureManagerImpl.b, false);
            TS ts2 = FeatureManagerImpl.i;
            this.a = builderUseDefaultRequestExecutor;
            this.b = ts2;
            this.c = 1;
            Object objAccess$getFileUpdateInterval = FeatureManagerImpl.access$getFileUpdateInterval(featureManagerImpl, this);
            if (objAccess$getFileUpdateInterval == enumC1030Mz) {
                return enumC1030Mz;
            }
            ts = ts2;
            obj = objAccess$getFileUpdateInterval;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ts = this.b;
            builderUseDefaultRequestExecutor = this.a;
            RQ1.d(obj);
        }
        int iIntValue = ((Number) obj).intValue();
        ts.getClass();
        OmicronConfig omicronConfigBuild = builderUseDefaultRequestExecutor.updateInterval((int) TimeUnit.HOURS.toMinutes(iIntValue)).build();
        O90.e(omicronConfigBuild, "newBuilder()\n           …\n                .build()");
        Omicron.getInstance().init(featureManagerImpl.a, omicronConfigBuild);
        AbstractC3767fP1.b(featureManagerImpl.g, null, new RS(featureManagerImpl, null), 3);
        return C1518Tf1.a;
    }
}
