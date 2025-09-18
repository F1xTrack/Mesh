package p000;

import io.invertase.firebase.app.ReactNativeFirebaseAppModule;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class EN1 {

    /* renamed from: a */
    public static ArrayList f2677a;

    /* renamed from: a */
    public static HashMap m2200a(C0786MU c0786mu) {
        c0786mu.m5379a();
        c0786mu.m5379a();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        String str = c0786mu.f7175b;
        map3.put("name", str);
        map3.put("automaticDataCollectionEnabled", Boolean.valueOf(c0786mu.m5383j()));
        C4057fV c4057fV = c0786mu.f7176c;
        map2.put("apiKey", c4057fV.f27218a);
        map2.put("appId", c4057fV.f27219b);
        map2.put("projectId", c4057fV.f27224g);
        map2.put("databaseURL", c4057fV.f27220c);
        map2.put("gaTrackingId", c4057fV.f27221d);
        map2.put("messagingSenderId", c4057fV.f27222e);
        map2.put("storageBucket", c4057fV.f27223f);
        if (ReactNativeFirebaseAppModule.authDomains.get(str) != null) {
            map2.put("authDomain", ReactNativeFirebaseAppModule.authDomains.get(str));
        }
        map.put("options", map2);
        map.put("appConfig", map3);
        return map;
    }
}
