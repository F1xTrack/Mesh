package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class BD0 extends AbstractC10345n31 {
    public static final Parcelable.Creator<BD0> CREATOR = new C7856Kl0(21);

    /* renamed from: a */
    public final long f662a;

    /* renamed from: b */
    public final long f663b;

    /* renamed from: c */
    public final byte[] f664c;

    public BD0(long j, byte[] bArr, long j2) {
        this.f662a = j2;
        this.f663b = j;
        this.f664c = bArr;
    }

    @Override // p000.AbstractC10345n31
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f662a);
        sb.append(", identifier= ");
        return AbstractC0852NX.m5760i(sb, this.f663b, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f662a);
        parcel.writeLong(this.f663b);
        parcel.writeByteArray(this.f664c);
    }

    public BD0(Parcel parcel) {
        this.f662a = parcel.readLong();
        this.f663b = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = AbstractC7485Dh1.f2166a;
        this.f664c = bArrCreateByteArray;
    }
}
