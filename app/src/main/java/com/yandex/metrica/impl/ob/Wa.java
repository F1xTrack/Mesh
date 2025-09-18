package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.AbstractC8235ym;

/* loaded from: classes2.dex */
public class Wa implements Parcelable {
    public static final Parcelable.Creator<Wa> CREATOR = new a();
    public final long a;
    public final int b;

    public class a implements Parcelable.Creator<Wa> {
        @Override // android.os.Parcelable.Creator
        public Wa createFromParcel(Parcel parcel) {
            return new Wa(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Wa[] newArray(int i) {
            return new Wa[i];
        }
    }

    public Wa(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DiagnosticsConfig{expirationTimestampSeconds=");
        sb.append(this.a);
        sb.append(", intervalSeconds=");
        return AbstractC8235ym.l(sb, this.b, '}');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeInt(this.b);
    }

    public Wa(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readInt();
    }
}
