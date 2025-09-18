package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class AD0 extends V50 {
    public static final Parcelable.Creator<AD0> CREATOR = new C7856Kl0(20);

    /* renamed from: b */
    public final String f109b;

    /* renamed from: c */
    public final byte[] f110c;

    public AD0(String str, byte[] bArr) {
        super("PRIV");
        this.f109b = str;
        this.f110c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AD0.class != obj.getClass()) {
            return false;
        }
        AD0 ad0 = (AD0) obj;
        return AbstractC7485Dh1.m1812a(this.f109b, ad0.f109b) && Arrays.equals(this.f110c, ad0.f110c);
    }

    public final int hashCode() {
        String str = this.f109b;
        return Arrays.hashCode(this.f110c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p000.V50
    public final String toString() {
        return this.f12347a + ": owner=" + this.f109b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f109b);
        parcel.writeByteArray(this.f110c);
    }

    public AD0(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        this.f109b = string;
        this.f110c = parcel.createByteArray();
    }
}
