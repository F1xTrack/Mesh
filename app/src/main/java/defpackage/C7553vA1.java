package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: vA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7553vA1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C7553vA1> CREATOR = new C0094Ay1(7);
    public final int a;
    public final String b;
    public final String c;
    public final byte[] d;
    public final Point[] e;
    public final int f;
    public final C1422Rz1 g;
    public final C4104hA1 h;
    public final C5835mA1 i;
    public final C7171tA1 j;
    public final C6599qA1 k;
    public final C1890Xz1 l;
    public final C0097Az1 m;
    public final C0487Fz1 n;
    public final C1032Mz1 o;

    public C7553vA1(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, C1422Rz1 c1422Rz1, C4104hA1 c4104hA1, C5835mA1 c5835mA1, C7171tA1 c7171tA1, C6599qA1 c6599qA1, C1890Xz1 c1890Xz1, C0097Az1 c0097Az1, C0487Fz1 c0487Fz1, C1032Mz1 c1032Mz1) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = pointArr;
        this.f = i2;
        this.g = c1422Rz1;
        this.h = c4104hA1;
        this.i = c5835mA1;
        this.j = c7171tA1;
        this.k = c6599qA1;
        this.l = c1890Xz1;
        this.m = c0097Az1;
        this.n = c0487Fz1;
        this.o = c1032Mz1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.d, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.e, i, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f);
        SafeParcelWriter.writeParcelable(parcel, 7, this.g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.l, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.m, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.n, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.o, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
