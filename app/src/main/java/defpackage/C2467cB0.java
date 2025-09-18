package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: cB0 */
/* loaded from: classes.dex */
public final class C2467cB0 implements InterfaceC0384Er0 {
    public static final Parcelable.Creator<C2467cB0> CREATOR = new C0834Kl0(18);
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public C2467cB0(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static C2467cB0 a(C4103hA0 c4103hA0) {
        int iG = c4103hA0.g();
        String strN = AbstractC1865Xr0.n(c4103hA0.s(c4103hA0.g(), AbstractC8250yr.a));
        String strS = c4103hA0.s(c4103hA0.g(), AbstractC8250yr.c);
        int iG2 = c4103hA0.g();
        int iG3 = c4103hA0.g();
        int iG4 = c4103hA0.g();
        int iG5 = c4103hA0.g();
        int iG6 = c4103hA0.g();
        byte[] bArr = new byte[iG6];
        c4103hA0.e(bArr, 0, iG6);
        return new C2467cB0(iG, strN, strS, iG2, iG3, iG4, iG5, bArr);
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ C6666qX A() {
        return null;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final void d0(C7293tp0 c7293tp0) {
        c7293tp0.a(this.a, this.h);
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
        if (obj == null || C2467cB0.class != obj.getClass()) {
            return false;
        }
        C2467cB0 c2467cB0 = (C2467cB0) obj;
        return this.a == c2467cB0.a && this.b.equals(c2467cB0.b) && this.c.equals(c2467cB0.c) && this.d == c2467cB0.d && this.e == c2467cB0.e && this.f == c2467cB0.f && this.g == c2467cB0.g && Arrays.equals(this.h, c2467cB0.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((AbstractC1705Vq.e(AbstractC1705Vq.e((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeByteArray(this.h);
    }

    public C2467cB0(Parcel parcel) {
        this.a = parcel.readInt();
        String string = parcel.readString();
        int i = AbstractC0277Dh1.a;
        this.b = string;
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.createByteArray();
    }
}
