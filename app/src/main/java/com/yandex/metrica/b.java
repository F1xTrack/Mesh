package com.yandex.metrica;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.metrica.impl.ob.ResultReceiverC2939n0;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return new CounterConfiguration((ContentValues) parcel.readBundle(ResultReceiverC2939n0.class.getClassLoader()).getParcelable("com.yandex.metrica.CounterConfiguration.data"));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CounterConfiguration[i];
    }
}
