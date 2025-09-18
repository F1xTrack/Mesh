package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Fz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0487Fz1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C0487Fz1> CREATOR = new C0094Ay1(16);
    public final C2465cA1 a;
    public final String b;
    public final String c;
    public final C4104hA1[] d;
    public final C1422Rz1[] e;
    public final String[] f;
    public final C6752qz1[] g;

    public C0487Fz1(C2465cA1 c2465cA1, String str, String str2, C4104hA1[] c4104hA1Arr, C1422Rz1[] c1422Rz1Arr, String[] strArr, C6752qz1[] c6752qz1Arr) {
        this.a = c2465cA1;
        this.b = str;
        this.c = str2;
        this.d = c4104hA1Arr;
        this.e = c1422Rz1Arr;
        this.f = strArr;
        this.g = c6752qz1Arr;
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
