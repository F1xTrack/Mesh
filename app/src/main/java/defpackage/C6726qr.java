package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: qr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6726qr extends V50 {
    public static final Parcelable.Creator<C6726qr> CREATOR = new H2(10);
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final V50[] f;

    public C6726qr(String str, boolean z, boolean z2, String[] strArr, V50[] v50Arr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = v50Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6726qr.class != obj.getClass()) {
            return false;
        }
        C6726qr c6726qr = (C6726qr) obj;
        return this.c == c6726qr.c && this.d == c6726qr.d && AbstractC0277Dh1.a(this.b, c6726qr.b) && Arrays.equals(this.e, c6726qr.e) && Arrays.equals(this.f, c6726qr.f);
    }

    public final int hashCode() {
        int i = (((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.e);
        V50[] v50Arr = this.f;
        parcel.writeInt(v50Arr.length);
        for (V50 v50 : v50Arr) {
            parcel.writeParcelable(v50, 0);
        }
    }

    public C6726qr(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = AbstractC0277Dh1.a;
        this.b = string;
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.e = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.f = new V50[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f[i3] = (V50) parcel.readParcelable(V50.class.getClassLoader());
        }
    }
}
