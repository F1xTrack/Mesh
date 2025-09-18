package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Ua */
/* loaded from: classes2.dex */
public final class C4850Ua implements Parcelable {
    public static final Parcelable.Creator<C4850Ua> CREATOR = new C4826Ta();

    /* renamed from: a */
    public final ResultReceiver f30805a;

    /* renamed from: b */
    public final List f30806b;

    /* renamed from: c */
    public final HashMap f30807c;

    public C4850Ua(ResultReceiverC4388B6 resultReceiverC4388B6, List list, Map map) {
        this.f30806b = list;
        this.f30805a = resultReceiverC4388B6;
        this.f30807c = map == null ? new HashMap() : new HashMap(map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver", this.f30805a);
        if (this.f30806b != null) {
            bundle.putStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList", new ArrayList<>(this.f30806b));
        }
        HashMap map = this.f30807c;
        if (map != null) {
            bundle.putString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification", AbstractC4550Hl.m19475a((Map) map));
        }
        parcel.writeBundle(bundle);
    }

    public C4850Ua(Parcel parcel) {
        Bundle bundle = parcel.readBundle(ResultReceiverC4388B6.class.getClassLoader());
        if (bundle != null) {
            this.f30805a = (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.internal.CounterConfiguration.receiver");
            this.f30806b = bundle.getStringArrayList("io.appmetrica.analytics.internal.CounterConfiguration.identifiersList");
            this.f30807c = AbstractC4550Hl.m19476a(bundle.getString("io.appmetrica.analytics.internal.CounterConfiguration.clidsForVerification"));
            return;
        }
        this.f30807c = new HashMap();
    }
}
