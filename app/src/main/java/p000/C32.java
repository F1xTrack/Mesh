package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class C32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C32> CREATOR = new C8697aD1(29);

    /* renamed from: a */
    public final double f1165a;

    /* renamed from: b */
    public final double f1166b;

    public C32(double d, double d2) {
        this.f1165a = d;
        this.f1166b = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 1, this.f1165a);
        SafeParcelWriter.writeDouble(parcel, 2, this.f1166b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
