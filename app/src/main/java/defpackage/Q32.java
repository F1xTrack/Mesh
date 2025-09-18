package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class Q32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Q32> CREATOR = new P32(5);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public Q32(int i, int i2, long j, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeInt(parcel, 2, this.b);
        SafeParcelWriter.writeInt(parcel, 3, this.c);
        SafeParcelWriter.writeInt(parcel, 4, this.d);
        SafeParcelWriter.writeLong(parcel, 5, this.e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
