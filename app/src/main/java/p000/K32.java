package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class K32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<K32> CREATOR = new C8697aD1(23);

    /* renamed from: a */
    public final int f5893a;

    /* renamed from: b */
    public final boolean f5894b;

    public K32(int i, boolean z) {
        this.f5893a = i;
        this.f5894b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f5893a);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f5894b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
