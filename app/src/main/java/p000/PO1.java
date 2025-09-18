package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class PO1 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PO1> CREATOR = new C8697aD1(10);

    /* renamed from: a */
    public int f9063a;

    /* renamed from: b */
    public String[] f9064b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f9063a);
        SafeParcelWriter.writeStringArray(parcel, 3, this.f9064b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
