package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: dB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3344dB1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C3344dB1> CREATOR = new C0094Ay1(13);
    public final VB1 a;

    public C3344dB1(VB1 vb1) {
        this.a = vb1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
