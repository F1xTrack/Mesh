package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Ou */
/* loaded from: classes.dex */
public final class C0938Ou extends V50 {
    public static final Parcelable.Creator<C0938Ou> CREATOR = new C0444H2(11);

    /* renamed from: b */
    public final String f8663b;

    /* renamed from: c */
    public final String f8664c;

    /* renamed from: d */
    public final String f8665d;

    public C0938Ou(String str, String str2, String str3) {
        super("COMM");
        this.f8663b = str;
        this.f8664c = str2;
        this.f8665d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0938Ou.class != obj.getClass()) {
            return false;
        }
        C0938Ou c0938Ou = (C0938Ou) obj;
        return AbstractC7485Dh1.m1812a(this.f8664c, c0938Ou.f8664c) && AbstractC7485Dh1.m1812a(this.f8663b, c0938Ou.f8663b) && AbstractC7485Dh1.m1812a(this.f8665d, c0938Ou.f8665d);
    }

    public final int hashCode() {
        String str = this.f8663b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f8664c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f8665d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p000.V50
    public final String toString() {
        return this.f12347a + ": language=" + this.f8663b + ", description=" + this.f8664c + ", text=" + this.f8665d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12347a);
        parcel.writeString(this.f8663b);
        parcel.writeString(this.f8665d);
    }

    public C0938Ou(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        this.f8663b = string;
        this.f8664c = parcel.readString();
        this.f8665d = parcel.readString();
    }
}
