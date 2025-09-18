package io.appmetrica.analytics.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Ta implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new Ua(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new Ua[i];
    }
}
