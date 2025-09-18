package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.location.LocationManager;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.F */
/* loaded from: classes2.dex */
public class C2591F {

    /* renamed from: a */
    private final LocationManager f21159a;

    public C2591F(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    /* renamed from: a */
    public List<String> m14052a() {
        List<String> providers;
        LocationManager locationManager = this.f21159a;
        List<String> listEmptyList = Collections.emptyList();
        if (locationManager != null) {
            try {
                providers = locationManager.getProviders(true);
            } catch (Throwable unused) {
            }
        } else {
            providers = null;
        }
        return providers == null ? listEmptyList : providers;
    }

    public C2591F(LocationManager locationManager) {
        this.f21159a = locationManager;
    }
}
