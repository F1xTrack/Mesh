package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class M00 extends V50 {
    public static final Parcelable.Creator<M00> CREATOR = new C0444H2(22);

    /* renamed from: b */
    public final String f6962b;

    /* renamed from: c */
    public final String f6963c;

    /* renamed from: d */
    public final String f6964d;

    /* renamed from: e */
    public final byte[] f6965e;

    public M00(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f6962b = str;
        this.f6963c = str2;
        this.f6964d = str3;
        this.f6965e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M00.class != obj.getClass()) {
            return false;
        }
        M00 m00 = (M00) obj;
        return AbstractC7485Dh1.m1812a(this.f6962b, m00.f6962b) && AbstractC7485Dh1.m1812a(this.f6963c, m00.f6963c) && AbstractC7485Dh1.m1812a(this.f6964d, m00.f6964d) && Arrays.equals(this.f6965e, m00.f6965e);
    }

    public final int hashCode() {
        String str = this.f6962b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6963c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6964d;
        return Arrays.hashCode(this.f6965e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // p000.V50
    public final String toString() {
        return this.f12347a + ": mimeType=" + this.f6962b + ", filename=" + this.f6963c + ", description=" + this.f6964d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6962b);
        parcel.writeString(this.f6963c);
        parcel.writeString(this.f6964d);
        parcel.writeByteArray(this.f6965e);
    }

    public M00(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        this.f6962b = string;
        this.f6963c = parcel.readString();
        this.f6964d = parcel.readString();
        this.f6965e = parcel.createByteArray();
    }
}
