package defpackage;

import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: Yf1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC1908Yf1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C2180ag1 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ CallableC1908Yf1(C2180ag1 c2180ag1, Bundle bundle, int i) {
        this.a = i;
        this.b = c2180ag1;
        this.c = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                C2180ag1 c2180ag1 = this.b;
                c2180ag1.getClass();
                Bundle bundle = this.c;
                Set<String> setKeySet = bundle.keySet();
                FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance((ReactApplicationContext) c2180ag1.b);
                for (String str : setKeySet) {
                    String str2 = (String) bundle.get(str);
                    CG1 cg1 = firebaseAnalytics.a;
                    cg1.getClass();
                    cg1.f(new LG1(cg1, null, str, str2, false, 0));
                }
                break;
            case 1:
                C2180ag1 c2180ag12 = this.b;
                c2180ag12.getClass();
                Bundle bundle2 = this.c;
                boolean z = bundle2.getBoolean("analytics_storage");
                boolean z2 = bundle2.getBoolean("ad_storage");
                boolean z3 = bundle2.getBoolean("ad_user_data");
                boolean z4 = bundle2.getBoolean("ad_personalization");
                EnumMap enumMap = new EnumMap(IU.class);
                IU iu = IU.b;
                HU hu = HU.b;
                HU hu2 = HU.a;
                enumMap.put((EnumMap) iu, (IU) (z ? hu2 : hu));
                IU iu2 = IU.a;
                enumMap.put((EnumMap) iu2, (IU) (z2 ? hu2 : hu));
                IU iu3 = IU.c;
                enumMap.put((EnumMap) iu3, (IU) (z3 ? hu2 : hu));
                IU iu4 = IU.d;
                if (z4) {
                    hu = hu2;
                }
                enumMap.put((EnumMap) iu4, (IU) hu);
                FirebaseAnalytics firebaseAnalytics2 = FirebaseAnalytics.getInstance((ReactApplicationContext) c2180ag12.b);
                firebaseAnalytics2.getClass();
                Bundle bundle3 = new Bundle();
                HU hu3 = (HU) enumMap.get(iu2);
                if (hu3 != null) {
                    int iOrdinal = hu3.ordinal();
                    if (iOrdinal == 0) {
                        bundle3.putString("ad_storage", "granted");
                    } else if (iOrdinal == 1) {
                        bundle3.putString("ad_storage", "denied");
                    }
                }
                HU hu4 = (HU) enumMap.get(iu);
                if (hu4 != null) {
                    int iOrdinal2 = hu4.ordinal();
                    if (iOrdinal2 == 0) {
                        bundle3.putString("analytics_storage", "granted");
                    } else if (iOrdinal2 == 1) {
                        bundle3.putString("analytics_storage", "denied");
                    }
                }
                HU hu5 = (HU) enumMap.get(iu3);
                if (hu5 != null) {
                    int iOrdinal3 = hu5.ordinal();
                    if (iOrdinal3 == 0) {
                        bundle3.putString("ad_user_data", "granted");
                    } else if (iOrdinal3 == 1) {
                        bundle3.putString("ad_user_data", "denied");
                    }
                }
                HU hu6 = (HU) enumMap.get(iu4);
                if (hu6 != null) {
                    int iOrdinal4 = hu6.ordinal();
                    if (iOrdinal4 == 0) {
                        bundle3.putString("ad_personalization", "granted");
                    } else if (iOrdinal4 == 1) {
                        bundle3.putString("ad_personalization", "denied");
                    }
                }
                CG1 cg12 = firebaseAnalytics2.a;
                cg12.getClass();
                cg12.f(new YG1(cg12, bundle3, 1));
                break;
            default:
                FirebaseAnalytics firebaseAnalytics3 = FirebaseAnalytics.getInstance((ReactApplicationContext) this.b.b);
                Bundle bundle4 = this.c;
                if (bundle4 != null) {
                    firebaseAnalytics3.getClass();
                    bundle4 = new Bundle(bundle4);
                }
                CG1 cg13 = firebaseAnalytics3.a;
                cg13.getClass();
                cg13.f(new YG1(cg13, bundle4, 2));
                break;
        }
        return null;
    }
}
