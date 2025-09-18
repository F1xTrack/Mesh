package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class RA1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RA1> CREATOR = new C7363Ay1(11);

    /* renamed from: a */
    public final int f10053a;

    /* renamed from: b */
    public final boolean f10054b;

    public RA1(int i, boolean z) {
        this.f10053a = i;
        this.f10054b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f10053a);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f10054b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
