package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationManager;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class F {
    private final LocationManager a;

    public F(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public List<String> a() {
        List<String> providers;
        LocationManager locationManager = this.a;
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

    public F(LocationManager locationManager) {
        this.a = locationManager;
    }
}
