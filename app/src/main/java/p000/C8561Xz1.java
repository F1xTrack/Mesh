package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: Xz1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8561Xz1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C8561Xz1> CREATOR = new C7363Ay1(21);

    /* renamed from: a */
    public final double f14078a;

    /* renamed from: b */
    public final double f14079b;

    public C8561Xz1(double d, double d2) {
        this.f14078a = d;
        this.f14079b = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 1, this.f14078a);
        SafeParcelWriter.writeDouble(parcel, 2, this.f14079b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
