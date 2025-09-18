package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class AD0 extends V50 {
    public static final Parcelable.Creator<AD0> CREATOR = new C0834Kl0(20);
    public final String b;
    public final byte[] c;

    public AD0(String str, byte[] bArr) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AD0.class != obj.getClass()) {
            return false;
        }
        AD0 ad0 = (AD0) obj;
        return AbstractC0277Dh1.a(this.b, ad0.b) && Arrays.equals(this.c, ad0.c);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.V50
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByteArray(this.c);
    }

    public AD0(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = AbstractC0277Dh1.a;
        this.b = string;
        this.c = parcel.createByteArray();
    }
}
