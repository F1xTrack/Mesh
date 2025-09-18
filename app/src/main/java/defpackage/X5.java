package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class X5 extends V50 {
    public static final Parcelable.Creator<X5> CREATOR = new H2(1);
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public X5(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // defpackage.V50, defpackage.InterfaceC0384Er0
    public final void d0(C7293tp0 c7293tp0) {
        c7293tp0.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || X5.class != obj.getClass()) {
            return false;
        }
        X5 x5 = (X5) obj;
        return this.d == x5.d && AbstractC0277Dh1.a(this.b, x5.b) && AbstractC0277Dh1.a(this.c, x5.c) && Arrays.equals(this.e, x5.e);
    }

    public final int hashCode() {
        int i = (527 + this.d) * 31;
        String str = this.b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return Arrays.hashCode(this.e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.V50
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.e);
    }

    public X5(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = AbstractC0277Dh1.a;
        this.b = string;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.createByteArray();
    }
}
