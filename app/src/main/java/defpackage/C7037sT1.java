package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: sT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7037sT1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C7037sT1> CREATOR = new C2093aD1(21);
    public AY1 a;
    public String b;
    public String c;
    public LZ1[] d;
    public C3407dW1[] e;
    public String[] f;
    public PO1[] g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.a, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.b, false);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.writeTypedArray(parcel, 5, this.d, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 6, this.e, i, false);
        SafeParcelWriter.writeStringArray(parcel, 7, this.f, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.g, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
