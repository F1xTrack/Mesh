package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: wz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7896wz1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C7896wz1> CREATOR = new C0094Ay1(5);
    public int a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public C7896wz1(int i, int i2, long j, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.a);
        SafeParcelWriter.writeInt(parcel, 3, this.b);
        SafeParcelWriter.writeInt(parcel, 4, this.c);
        SafeParcelWriter.writeLong(parcel, 5, this.d);
        SafeParcelWriter.writeInt(parcel, 6, this.e);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
