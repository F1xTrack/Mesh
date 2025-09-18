package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: wo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7862wo0 implements InterfaceC0384Er0 {
    public static final Parcelable.Creator<C7862wo0> CREATOR = new C0834Kl0(2);
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public C7862wo0(String str, byte[] bArr, int i, int i2) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ C6666qX A() {
        return null;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ void d0(C7293tp0 c7293tp0) {
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
        if (obj == null || C7862wo0.class != obj.getClass()) {
            return false;
        }
        C7862wo0 c7862wo0 = (C7862wo0) obj;
        return this.a.equals(c7862wo0.a) && Arrays.equals(this.b, c7862wo0.b) && this.c == c7862wo0.c && this.d == c7862wo0.d;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + AbstractC1705Vq.e(527, 31, this.a)) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String strO;
        byte[] bArr = this.b;
        int i = this.d;
        if (i == 1) {
            strO = AbstractC0277Dh1.o(bArr);
        } else if (i == 23) {
            strO = String.valueOf(Float.intBitsToFloat(AbstractC6955s22.d(bArr)));
        } else if (i != 67) {
            int i2 = AbstractC0277Dh1.a;
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (int i3 = 0; i3 < bArr.length; i3++) {
                sb.append(Character.forDigit((bArr[i3] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i3] & 15, 16));
            }
            strO = sb.toString();
        } else {
            strO = String.valueOf(AbstractC6955s22.d(bArr));
        }
        return AbstractC7209tN0.z(new StringBuilder("mdta: key="), this.a, ", value=", strO);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public C7862wo0(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC0277Dh1.a;
        this.a = string;
        this.b = parcel.createByteArray();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
