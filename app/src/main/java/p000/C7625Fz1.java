package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Fz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7625Fz1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C7625Fz1> CREATOR = new C7363Ay1(16);

    /* renamed from: a */
    public final C8947cA1 f3500a;

    /* renamed from: b */
    public final String f3501b;

    /* renamed from: c */
    public final String f3502c;

    /* renamed from: d */
    public final C9592hA1[] f3503d;

    /* renamed from: e */
    public final C8249Rz1[] f3504e;

    /* renamed from: f */
    public final String[] f3505f;

    /* renamed from: g */
    public final C10846qz1[] f3506g;

    public C7625Fz1(C8947cA1 c8947cA1, String str, String str2, C9592hA1[] c9592hA1Arr, C8249Rz1[] c8249Rz1Arr, String[] strArr, C10846qz1[] c10846qz1Arr) {
        this.f3500a = c8947cA1;
        this.f3501b = str;
        this.f3502c = str2;
        this.f3503d = c9592hA1Arr;
        this.f3504e = c8249Rz1Arr;
        this.f3505f = strArr;
        this.f3506g = c10846qz1Arr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f3500a, i, false);
        SafeParcelWriter.writeString(parcel, 2, this.f3501b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f3502c, false);
        SafeParcelWriter.writeTypedArray(parcel, 4, this.f3503d, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.f3504e, i, false);
        SafeParcelWriter.writeStringArray(parcel, 6, this.f3505f, false);
        SafeParcelWriter.writeTypedArray(parcel, 7, this.f3506g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
