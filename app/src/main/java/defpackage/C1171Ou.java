package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Ou, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1171Ou extends V50 {
    public static final Parcelable.Creator<C1171Ou> CREATOR = new H2(11);
    public final String b;
    public final String c;
    public final String d;

    public C1171Ou(String str, String str2, String str3) {
        super("COMM");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1171Ou.class != obj.getClass()) {
            return false;
        }
        C1171Ou c1171Ou = (C1171Ou) obj;
        return AbstractC0277Dh1.a(this.c, c1171Ou.c) && AbstractC0277Dh1.a(this.b, c1171Ou.b) && AbstractC0277Dh1.a(this.d, c1171Ou.d);
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
        return this.a + ": language=" + this.b + ", description=" + this.c + ", text=" + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.d);
    }

    public C1171Ou(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = AbstractC0277Dh1.a;
        this.b = string;
        this.c = parcel.readString();
        this.d = parcel.readString();
    }
}
