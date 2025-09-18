package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class BD0 extends AbstractC6004n31 {
    public static final Parcelable.Creator<BD0> CREATOR = new C0834Kl0(21);
    public final long a;
    public final long b;
    public final byte[] c;

    public BD0(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    @Override // defpackage.AbstractC6004n31
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.a);
        sb.append(", identifier= ");
        return NX.i(sb, this.b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }

    public BD0(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = AbstractC0277Dh1.a;
        this.c = bArrCreateByteArray;
    }
}
