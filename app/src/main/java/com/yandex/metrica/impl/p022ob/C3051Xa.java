package com.yandex.metrica.impl.p022ob;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.metrica.impl.ob.Xa */
/* loaded from: classes2.dex */
public class C3051Xa implements Parcelable {
    public static final Parcelable.Creator<C3051Xa> CREATOR = new a();

    /* renamed from: a */
    public final C3026Wa f22781a;

    /* renamed from: b */
    public final C3026Wa f22782b;

    /* renamed from: c */
    public final C3026Wa f22783c;

    /* renamed from: com.yandex.metrica.impl.ob.Xa$a */
    public class a implements Parcelable.Creator<C3051Xa> {
        @Override // android.os.Parcelable.Creator
        public C3051Xa createFromParcel(Parcel parcel) {
            return new C3051Xa(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public C3051Xa[] newArray(int i) {
            return new C3051Xa[i];
        }
    }

    public C3051Xa() {
        this(null, null, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "DiagnosticsConfigsHolder{activationConfig=" + this.f22781a + ", clidsInfoConfig=" + this.f22782b + ", preloadInfoConfig=" + this.f22783c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f22781a, i);
        parcel.writeParcelable(this.f22782b, i);
        parcel.writeParcelable(this.f22783c, i);
    }

    public C3051Xa(C3026Wa c3026Wa, C3026Wa c3026Wa2, C3026Wa c3026Wa3) {
        this.f22781a = c3026Wa;
        this.f22782b = c3026Wa2;
        this.f22783c = c3026Wa3;
    }

    public C3051Xa(Parcel parcel) {
        this.f22781a = (C3026Wa) parcel.readParcelable(C3026Wa.class.getClassLoader());
        this.f22782b = (C3026Wa) parcel.readParcelable(C3026Wa.class.getClassLoader());
        this.f22783c = (C3026Wa) parcel.readParcelable(C3026Wa.class.getClassLoader());
    }
}
