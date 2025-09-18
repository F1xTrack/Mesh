package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class Y12 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Y12> CREATOR = new C2093aD1(17);
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] e;
    public C3407dW1 f;
    public LZ1 g;
    public C5229j02 h;
    public C7142t12 i;
    public K02 j;
    public C3791fX1 k;
    public VR1 l;
    public C7037sT1 m;
    public NU1 n;
    public byte[] o;
    public boolean p;
    public double q;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.a);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.writeInt(parcel, 5, this.d);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.l, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.m, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.n, i, false);
        SafeParcelWriter.writeByteArray(parcel, 16, this.o, false);
        SafeParcelWriter.writeBoolean(parcel, 17, this.p);
        SafeParcelWriter.writeDouble(parcel, 18, this.q);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
