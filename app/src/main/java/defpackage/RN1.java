package defpackage;

import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class RN1 implements Callable {
    public final /* synthetic */ int a;
    public /* synthetic */ NN1 b;
    public /* synthetic */ String c;

    public /* synthetic */ RN1(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                RN1 rn1 = new RN1(2);
                rn1.b = this.b;
                rn1.c = this.c;
                return new UR1(rn1);
            case 1:
                C0999Mo1 c0999Mo1 = new C0999Mo1(this.b, this.c, false);
                C2234ay1 c2234ay1 = new C2234ay1("internal.remoteConfig", 1);
                c2234ay1.b.put("getValue", new UR1(c0999Mo1));
                return c2234ay1;
            default:
                C1656Uz1 c1656Uz1X1 = this.b.x1();
                String str = this.c;
                PM1 pm1U2 = c1656Uz1X1.u2(str);
                HashMap map = new HashMap();
                map.put("platform", ConstantDeviceInfo.APP_PLATFORM);
                map.put(AnalyticsBaseParamsConstantsKt.PACKAGE_NAME, str);
                map.put("gmp_version", 114010L);
                if (pm1U2 != null) {
                    String strH = pm1U2.h();
                    if (strH != null) {
                        map.put("app_version", strH);
                    }
                    map.put("app_version_int", Long.valueOf(pm1U2.y()));
                    map.put("dynamite_version", Long.valueOf(pm1U2.N()));
                }
                return map;
        }
    }
}
