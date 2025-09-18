package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class J32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<J32> CREATOR = new C2093aD1(22);
    public final int a;
    public final String b;
    public final String c;
    public final byte[] d;
    public final Point[] e;
    public final int f;
    public final B32 g;
    public final E32 h;
    public final F32 i;
    public final I32 j;
    public final G32 k;
    public final C32 l;
    public final y32 m;
    public final z32 n;
    public final A32 o;

    public J32(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, B32 b32, E32 e32, F32 f32, I32 i32, G32 g32, C32 c32, y32 y32Var, z32 z32Var, A32 a32) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = bArr;
        this.e = pointArr;
        this.f = i2;
        this.g = b32;
        this.h = e32;
        this.i = f32;
        this.j = i32;
        this.k = g32;
        this.l = c32;
        this.m = y32Var;
        this.n = z32Var;
        this.o = a32;
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
