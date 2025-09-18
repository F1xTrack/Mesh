package com.yandex.metrica.impl.ob;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class Xa implements Parcelable {
    public static final Parcelable.Creator<Xa> CREATOR = new a();
    public final Wa a;
    public final Wa b;
    public final Wa c;

    public class a implements Parcelable.Creator<Xa> {
        @Override // android.os.Parcelable.Creator
        public Xa createFromParcel(Parcel parcel) {
            return new Xa(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Xa[] newArray(int i) {
            return new Xa[i];
        }
    }

    public Xa() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DiagnosticsConfigsHolder{activationConfig=" + this.a + ", clidsInfoConfig=" + this.b + ", preloadInfoConfig=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
    }

    public Xa(Wa wa, Wa wa2, Wa wa3) {
        this.a = wa;
        this.b = wa2;
        this.c = wa3;
    }

    public Xa(Parcel parcel) {
        this.a = (Wa) parcel.readParcelable(Wa.class.getClassLoader());
        this.b = (Wa) parcel.readParcelable(Wa.class.getClassLoader());
        this.c = (Wa) parcel.readParcelable(Wa.class.getClassLoader());
    }
}
