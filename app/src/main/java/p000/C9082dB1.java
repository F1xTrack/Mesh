package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: dB1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9082dB1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C9082dB1> CREATOR = new C7363Ay1(13);

    /* renamed from: a */
    public final VB1 f25856a;

    public C9082dB1(VB1 vb1) {
        this.f25856a = vb1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f25856a, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
