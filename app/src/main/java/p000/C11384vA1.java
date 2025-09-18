package p000;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: vA1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11384vA1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C11384vA1> CREATOR = new C7363Ay1(7);

    /* renamed from: a */
    public final int f44220a;

    /* renamed from: b */
    public final String f44221b;

    /* renamed from: c */
    public final String f44222c;

    /* renamed from: d */
    public final byte[] f44223d;

    /* renamed from: e */
    public final Point[] f44224e;

    /* renamed from: f */
    public final int f44225f;

    /* renamed from: g */
    public final C8249Rz1 f44226g;

    /* renamed from: h */
    public final C9592hA1 f44227h;

    /* renamed from: i */
    public final C10232mA1 f44228i;

    /* renamed from: j */
    public final C11128tA1 f44229j;

    /* renamed from: k */
    public final C10744qA1 f44230k;

    /* renamed from: l */
    public final C8561Xz1 f44231l;

    /* renamed from: m */
    public final C7365Az1 f44232m;

    /* renamed from: n */
    public final C7625Fz1 f44233n;

    /* renamed from: o */
    public final C7989Mz1 f44234o;

    public C11384vA1(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, C8249Rz1 c8249Rz1, C9592hA1 c9592hA1, C10232mA1 c10232mA1, C11128tA1 c11128tA1, C10744qA1 c10744qA1, C8561Xz1 c8561Xz1, C7365Az1 c7365Az1, C7625Fz1 c7625Fz1, C7989Mz1 c7989Mz1) {
        this.f44220a = i;
        this.f44221b = str;
        this.f44222c = str2;
        this.f44223d = bArr;
        this.f44224e = pointArr;
        this.f44225f = i2;
        this.f44226g = c8249Rz1;
        this.f44227h = c9592hA1;
        this.f44228i = c10232mA1;
        this.f44229j = c11128tA1;
        this.f44230k = c10744qA1;
        this.f44231l = c8561Xz1;
        this.f44232m = c7365Az1;
        this.f44233n = c7625Fz1;
        this.f44234o = c7989Mz1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f44220a);
        SafeParcelWriter.writeString(parcel, 2, this.f44221b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f44222c, false);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f44223d, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f44224e, i, false);
        SafeParcelWriter.writeInt(parcel, 6, this.f44225f);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f44226g, i, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.f44227h, i, false);
        SafeParcelWriter.writeParcelable(parcel, 9, this.f44228i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f44229j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f44230k, i, false);
        SafeParcelWriter.writeParcelable(parcel, 12, this.f44231l, i, false);
        SafeParcelWriter.writeParcelable(parcel, 13, this.f44232m, i, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.f44233n, i, false);
        SafeParcelWriter.writeParcelable(parcel, 15, this.f44234o, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
