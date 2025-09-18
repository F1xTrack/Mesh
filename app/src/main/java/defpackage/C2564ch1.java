package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ch1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2564ch1 extends V50 {
    public static final Parcelable.Creator<C2564ch1> CREATOR = new C6767r31(11);
    public final String b;
    public final String c;

    public C2564ch1(String str, String str2, String str3) {
        super(str);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2564ch1.class != obj.getClass()) {
            return false;
        }
        C2564ch1 c2564ch1 = (C2564ch1) obj;
        return this.a.equals(c2564ch1.a) && AbstractC0277Dh1.a(this.b, c2564ch1.b) && AbstractC0277Dh1.a(this.c, c2564ch1.c);
    }

    public final int hashCode() {
        int iE = AbstractC1705Vq.e(527, 31, this.a);
        String str = this.b;
        int iHashCode = (iE + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.V50
    public final String toString() {
        return this.a + ": url=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2564ch1(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC0277Dh1.a;
        super(string);
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
