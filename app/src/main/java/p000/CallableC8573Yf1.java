package p000;

import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumMap;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: Yf1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC8573Yf1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f14414a;

    /* renamed from: b */
    public final /* synthetic */ C8755ag1 f14415b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f14416c;

    public /* synthetic */ CallableC8573Yf1(C8755ag1 c8755ag1, Bundle bundle, int i) {
        this.f14414a = i;
        this.f14415b = c8755ag1;
        this.f14416c = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f14414a) {
            case 0:
                C8755ag1 c8755ag1 = this.f14415b;
                c8755ag1.getClass();
                Bundle bundle = this.f14416c;
                Set<String> setKeySet = bundle.keySet();
                FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance((ReactApplicationContext) c8755ag1.f2474b);
                for (String str : setKeySet) {
                    String str2 = (String) bundle.get(str);
                    CG1 cg1 = firebaseAnalytics.f18443a;
                    cg1.getClass();
                    cg1.m1136f(new LG1(cg1, null, str, str2, false, 0));
                }
                break;
            case 1:
                C8755ag1 c8755ag12 = this.f14415b;
                c8755ag12.getClass();
                Bundle bundle2 = this.f14416c;
                boolean z = bundle2.getBoolean("analytics_storage");
                boolean z2 = bundle2.getBoolean("ad_storage");
                boolean z3 = bundle2.getBoolean("ad_user_data");
                boolean z4 = bundle2.getBoolean("ad_personalization");
                EnumMap enumMap = new EnumMap(EnumC0535IU.class);
                EnumC0535IU enumC0535IU = EnumC0535IU.f4950b;
                EnumC0472HU enumC0472HU = EnumC0472HU.f4318b;
                EnumC0472HU enumC0472HU2 = EnumC0472HU.f4317a;
                enumMap.put((EnumMap) enumC0535IU, (EnumC0535IU) (z ? enumC0472HU2 : enumC0472HU));
                EnumC0535IU enumC0535IU2 = EnumC0535IU.f4949a;
                enumMap.put((EnumMap) enumC0535IU2, (EnumC0535IU) (z2 ? enumC0472HU2 : enumC0472HU));
                EnumC0535IU enumC0535IU3 = EnumC0535IU.f4951c;
                enumMap.put((EnumMap) enumC0535IU3, (EnumC0535IU) (z3 ? enumC0472HU2 : enumC0472HU));
                EnumC0535IU enumC0535IU4 = EnumC0535IU.f4952d;
                if (z4) {
                    enumC0472HU = enumC0472HU2;
                }
                enumMap.put((EnumMap) enumC0535IU4, (EnumC0535IU) enumC0472HU);
                FirebaseAnalytics firebaseAnalytics2 = FirebaseAnalytics.getInstance((ReactApplicationContext) c8755ag12.f2474b);
                firebaseAnalytics2.getClass();
                Bundle bundle3 = new Bundle();
                EnumC0472HU enumC0472HU3 = (EnumC0472HU) enumMap.get(enumC0535IU2);
                if (enumC0472HU3 != null) {
                    int iOrdinal = enumC0472HU3.ordinal();
                    if (iOrdinal == 0) {
                        bundle3.putString("ad_storage", "granted");
                    } else if (iOrdinal == 1) {
                        bundle3.putString("ad_storage", "denied");
                    }
                }
                EnumC0472HU enumC0472HU4 = (EnumC0472HU) enumMap.get(enumC0535IU);
                if (enumC0472HU4 != null) {
                    int iOrdinal2 = enumC0472HU4.ordinal();
                    if (iOrdinal2 == 0) {
                        bundle3.putString("analytics_storage", "granted");
                    } else if (iOrdinal2 == 1) {
                        bundle3.putString("analytics_storage", "denied");
                    }
                }
                EnumC0472HU enumC0472HU5 = (EnumC0472HU) enumMap.get(enumC0535IU3);
                if (enumC0472HU5 != null) {
                    int iOrdinal3 = enumC0472HU5.ordinal();
                    if (iOrdinal3 == 0) {
                        bundle3.putString("ad_user_data", "granted");
                    } else if (iOrdinal3 == 1) {
                        bundle3.putString("ad_user_data", "denied");
                    }
                }
                EnumC0472HU enumC0472HU6 = (EnumC0472HU) enumMap.get(enumC0535IU4);
                if (enumC0472HU6 != null) {
                    int iOrdinal4 = enumC0472HU6.ordinal();
                    if (iOrdinal4 == 0) {
                        bundle3.putString("ad_personalization", "granted");
                    } else if (iOrdinal4 == 1) {
                        bundle3.putString("ad_personalization", "denied");
                    }
                }
                CG1 cg12 = firebaseAnalytics2.f18443a;
                cg12.getClass();
                cg12.m1136f(new YG1(cg12, bundle3, 1));
                break;
            default:
                FirebaseAnalytics firebaseAnalytics3 = FirebaseAnalytics.getInstance((ReactApplicationContext) this.f14415b.f2474b);
                Bundle bundle4 = this.f14416c;
                if (bundle4 != null) {
                    firebaseAnalytics3.getClass();
                    bundle4 = new Bundle(bundle4);
                }
                CG1 cg13 = firebaseAnalytics3.f18443a;
                cg13.getClass();
                cg13.m1136f(new YG1(cg13, bundle4, 2));
                break;
        }
        return null;
    }
}
