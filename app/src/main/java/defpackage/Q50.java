package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Q50 implements InterfaceC0384Er0 {
    public static final Parcelable.Creator<Q50> CREATOR = new H2(25);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public Q50(int i, int i2, String str, String str2, String str3, boolean z) {
        YN1.c(i2 == -1 || i2 > 0);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.Q50 a(java.util.Map r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Q50.a(java.util.Map):Q50");
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ C6666qX A() {
        return null;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final void d0(C7293tp0 c7293tp0) {
        String str = this.c;
        if (str != null) {
            c7293tp0.x = str;
        }
        String str2 = this.b;
        if (str2 != null) {
            c7293tp0.w = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ byte[] e0() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q50.class != obj.getClass()) {
            return false;
        }
        Q50 q50 = (Q50) obj;
        return this.a == q50.a && AbstractC0277Dh1.a(this.b, q50.b) && AbstractC0277Dh1.a(this.c, q50.c) && AbstractC0277Dh1.a(this.d, q50.d) && this.e == q50.e && this.f == q50.f;
    }

    public final int hashCode() {
        int i = (527 + this.a) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.b + "\", bitrate=" + this.a + ", metadataInterval=" + this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        int i2 = AbstractC0277Dh1.a;
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
    }

    public Q50(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        int i = AbstractC0277Dh1.a;
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt();
    }
}
