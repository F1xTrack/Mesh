package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class B90 extends V50 {
    public static final Parcelable.Creator<B90> CREATOR = new H2(28);
    public final String b;
    public final String c;
    public final String d;

    public B90(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B90.class != obj.getClass()) {
            return false;
        }
        B90 b90 = (B90) obj;
        return AbstractC0277Dh1.a(this.c, b90.c) && AbstractC0277Dh1.a(this.b, b90.b) && AbstractC0277Dh1.a(this.d, b90.d);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // defpackage.V50
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
    }

    public B90(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i = AbstractC0277Dh1.a;
        this.b = string;
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
