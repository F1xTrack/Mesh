package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* renamed from: io.appmetrica.analytics.impl.S5 */
/* loaded from: classes2.dex */
public final class C4797S5 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        EnumC5243k9 enumC5243k9;
        Bundle bundle = parcel.readBundle(ResultReceiverC4388B6.class.getClassLoader());
        if (bundle.containsKey("CounterReport.Source")) {
            int i = bundle.getInt("CounterReport.Source");
            EnumC5243k9[] enumC5243k9ArrValues = EnumC5243k9.values();
            int length = enumC5243k9ArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC5243k9 = EnumC5243k9.NATIVE;
                    break;
                }
                enumC5243k9 = enumC5243k9ArrValues[i2];
                if (enumC5243k9.f32037a == i) {
                    break;
                }
                i2++;
            }
        } else {
            enumC5243k9 = null;
        }
        C4821T5 c4821t5 = new C4821T5("", "", 0);
        EnumC4898Wa enumC4898Wa = EnumC4898Wa.EVENT_TYPE_UNDEFINED;
        c4821t5.f30764d = bundle.getInt("CounterReport.Type", -1);
        c4821t5.f30765e = bundle.getInt("CounterReport.CustomType");
        c4821t5.f30762b = StringUtils.ifIsNullToDef(bundle.getString("CounterReport.Value"), "");
        c4821t5.f30763c = bundle.getString("CounterReport.Environment");
        c4821t5.f30761a = bundle.getString("CounterReport.Event");
        c4821t5.f30766f = C4821T5.m19832a(bundle);
        c4821t5.f30767g = bundle.getInt("CounterReport.TRUNCATED");
        c4821t5.f30768h = bundle.getString("CounterReport.ProfileID");
        c4821t5.f30769i = bundle.getLong("CounterReport.CreationElapsedRealtime");
        c4821t5.f30770j = bundle.getLong("CounterReport.CreationTimestamp");
        c4821t5.f30771k = EnumC4994aa.m20117a(Integer.valueOf(bundle.getInt("CounterReport.UniquenessStatus")));
        c4821t5.f30772l = enumC5243k9;
        c4821t5.f30773m = bundle.getBundle("CounterReport.Payload");
        c4821t5.f30774n = bundle.containsKey("CounterReport.AttributionIdChanged") ? Boolean.valueOf(bundle.getBoolean("CounterReport.AttributionIdChanged")) : null;
        c4821t5.f30775o = bundle.containsKey("CounterReport.OpenId") ? Integer.valueOf(bundle.getInt("CounterReport.OpenId")) : null;
        c4821t5.f30776p = CollectionUtils.bundleToMap(bundle.getBundle("CounterReport.Extras"));
        return c4821t5;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C4821T5[i];
    }
}
