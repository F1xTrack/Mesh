package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class z32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<z32> CREATOR = new C2093aD1(26);
    public final D32 a;
    public final String b;
    public final String c;
    public final E32[] d;
    public final B32[] e;
    public final String[] f;
    public final w32[] g;

    public z32(D32 d32, String str, String str2, E32[] e32Arr, B32[] b32Arr, String[] strArr, w32[] w32VarArr) {
        this.a = d32;
        this.b = str;
        this.c = str2;
        this.d = e32Arr;
        this.e = b32Arr;
        this.f = strArr;
        this.g = w32VarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.d, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.e, i, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.f, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
