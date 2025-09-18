package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class LZ1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LZ1> CREATOR = new C10857r31(27);

    /* renamed from: a */
    public int f6726a;

    /* renamed from: b */
    public String f6727b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f6726a);
        SafeParcelWriter.writeString(parcel, 3, this.f6727b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
