package p000;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class J32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<J32> CREATOR = new C8697aD1(22);

    /* renamed from: a */
    public final int f5304a;

    /* renamed from: b */
    public final String f5305b;

    /* renamed from: c */
    public final String f5306c;

    /* renamed from: d */
    public final byte[] f5307d;

    /* renamed from: e */
    public final Point[] f5308e;

    /* renamed from: f */
    public final int f5309f;

    /* renamed from: g */
    public final B32 f5310g;

    /* renamed from: h */
    public final E32 f5311h;

    /* renamed from: i */
    public final F32 f5312i;

    /* renamed from: j */
    public final I32 f5313j;

    /* renamed from: k */
    public final G32 f5314k;

    /* renamed from: l */
    public final C32 f5315l;

    /* renamed from: m */
    public final y32 f5316m;

    /* renamed from: n */
    public final z32 f5317n;

    /* renamed from: o */
    public final A32 f5318o;

    public J32(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, B32 b32, E32 e32, F32 f32, I32 i32, G32 g32, C32 c32, y32 y32Var, z32 z32Var, A32 a32) {
        this.f5304a = i;
        this.f5305b = str;
        this.f5306c = str2;
        this.f5307d = bArr;
        this.f5308e = pointArr;
        this.f5309f = i2;
        this.f5310g = b32;
        this.f5311h = e32;
        this.f5312i = f32;
        this.f5313j = i32;
        this.f5314k = g32;
        this.f5315l = c32;
        this.f5316m = y32Var;
        this.f5317n = z32Var;
        this.f5318o = a32;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f5304a);
        SafeParcelWriter.writeString(parcel, 2, this.f5305b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f5306c, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f5307d, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f5308e, i, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f5309f);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f5310g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f5311h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f5312i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f5313j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f5314k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f5315l, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.f5316m, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f5317n, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.f5318o, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
