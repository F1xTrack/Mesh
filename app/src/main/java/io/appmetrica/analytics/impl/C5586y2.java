package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.LocationManager;

/* renamed from: io.appmetrica.analytics.impl.y2 */
/* loaded from: classes2.dex */
public final class C5586y2 {

    /* renamed from: a */
    public final LocationManager f32836a;

    public C5586y2(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    public C5586y2(LocationManager locationManager) {
        this.f32836a = locationManager;
    }
}
