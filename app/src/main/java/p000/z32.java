package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class z32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<z32> CREATOR = new C8697aD1(26);

    /* renamed from: a */
    public final D32 f46617a;

    /* renamed from: b */
    public final String f46618b;

    /* renamed from: c */
    public final String f46619c;

    /* renamed from: d */
    public final E32[] f46620d;

    /* renamed from: e */
    public final B32[] f46621e;

    /* renamed from: f */
    public final String[] f46622f;

    /* renamed from: g */
    public final w32[] f46623g;

    public z32(D32 d32, String str, String str2, E32[] e32Arr, B32[] b32Arr, String[] strArr, w32[] w32VarArr) {
        this.f46617a = d32;
        this.f46618b = str;
        this.f46619c = str2;
        this.f46620d = e32Arr;
        this.f46621e = b32Arr;
        this.f46622f = strArr;
        this.f46623g = w32VarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f46617a, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f46618b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f46619c, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.f46620d, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f46621e, i, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.f46622f, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.f46623g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
