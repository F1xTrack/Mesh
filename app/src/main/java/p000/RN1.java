package p000;

import com.p019vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class RN1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f10148a;

    /* renamed from: b */
    public /* synthetic */ NN1 f10149b;

    /* renamed from: c */
    public /* synthetic */ String f10150c;

    public /* synthetic */ RN1(int i) {
        this.f10148a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f10148a) {
            case 0:
                RN1 rn1 = new RN1(2);
                rn1.f10149b = this.f10149b;
                rn1.f10150c = this.f10150c;
                return new UR1(rn1);
            case 1:
                C7967Mo1 c7967Mo1 = new C7967Mo1(this.f10149b, this.f10150c, false);
                C8791ay1 c8791ay1 = new C8791ay1("internal.remoteConfig", 1);
                c8791ay1.f28711b.put("getValue", new UR1(c7967Mo1));
                return c8791ay1;
            default:
                C8405Uz1 c8405Uz1M4344x1 = this.f10149b.m4344x1();
                String str = this.f10150c;
                PM1 pm1M8264u2 = c8405Uz1M4344x1.m8264u2(str);
                HashMap map = new HashMap();
                map.put("platform", ConstantDeviceInfo.APP_PLATFORM);
                map.put(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME, str);
                map.put("gmp_version", 114010L);
                if (pm1M8264u2 != null) {
                    String strM6336h = pm1M8264u2.m6336h();
                    if (strM6336h != null) {
                        map.put("app_version", strM6336h);
                    }
                    map.put("app_version_int", Long.valueOf(pm1M8264u2.m6353y()));
                    map.put("dynamite_version", Long.valueOf(pm1M8264u2.m6321N()));
                }
                return map;
        }
    }
}
