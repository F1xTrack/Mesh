package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* loaded from: classes2.dex */
public final class S5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC4666k9 enumC4666k9;
        Bundle bundle = parcel.readBundle(B6.class.getClassLoader());
        if (bundle.containsKey("CounterReport.Source")) {
            int i = bundle.getInt("CounterReport.Source");
            EnumC4666k9[] enumC4666k9ArrValues = EnumC4666k9.values();
            int length = enumC4666k9ArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4666k9 = EnumC4666k9.NATIVE;
                    break;
                }
                enumC4666k9 = enumC4666k9ArrValues[i2];
                if (enumC4666k9.a == i) {
                    break;
                }
                i2++;
            }
        } else {
            enumC4666k9 = null;
        }
        T5 t5 = new T5("", "", 0);
        Wa wa = Wa.EVENT_TYPE_UNDEFINED;
        t5.d = bundle.getInt("CounterReport.Type", -1);
        t5.e = bundle.getInt("CounterReport.CustomType");
        t5.b = StringUtils.ifIsNullToDef(bundle.getString("CounterReport.Value"), "");
        t5.c = bundle.getString("CounterReport.Environment");
        t5.a = bundle.getString("CounterReport.Event");
        t5.f = T5.a(bundle);
        t5.g = bundle.getInt("CounterReport.TRUNCATED");
        t5.h = bundle.getString("CounterReport.ProfileID");
        t5.i = bundle.getLong("CounterReport.CreationElapsedRealtime");
        t5.j = bundle.getLong("CounterReport.CreationTimestamp");
        t5.k = EnumC4424aa.a(Integer.valueOf(bundle.getInt("CounterReport.UniquenessStatus")));
        t5.l = enumC4666k9;
        t5.m = bundle.getBundle("CounterReport.Payload");
        t5.n = bundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(bundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        t5.o = bundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(bundle.getInt("CounterReport.OpenId")) : null;
        t5.p = CollectionUtils.bundleToMap(bundle.getBundle("CounterReport.Extras"));
        return t5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new T5[i];
    }
}
