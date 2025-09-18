package defpackage;

import io.invertase.firebase.app.ReactNativeFirebaseAppModule;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class EN1 {
    public static ArrayList a;

    public static HashMap a(MU mu) {
        mu.a();
        mu.a();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        String str = mu.b;
        map3.put("name", str);
        map3.put("automaticDataCollectionEnabled", Boolean.valueOf(mu.j()));
        C3783fV c3783fV = mu.c;
        map2.put("apiKey", c3783fV.a);
        map2.put("appId", c3783fV.b);
        map2.put("projectId", c3783fV.g);
        map2.put("databaseURL", c3783fV.c);
        map2.put("gaTrackingId", c3783fV.d);
        map2.put("messagingSenderId", c3783fV.e);
        map2.put("storageBucket", c3783fV.f);
        if (ReactNativeFirebaseAppModule.authDomains.get(str) != null) {
            map2.put("authDomain", ReactNativeFirebaseAppModule.authDomains.get(str));
        }
        map.put("options", map2);
        map.put("appConfig", map3);
        return map;
    }
}
