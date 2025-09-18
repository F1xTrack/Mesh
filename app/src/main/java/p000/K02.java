package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class K02 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<K02> CREATOR = new C10857r31(29);

    /* renamed from: a */
    public String f5834a;

    /* renamed from: b */
    public String f5835b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f5834a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f5835b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
