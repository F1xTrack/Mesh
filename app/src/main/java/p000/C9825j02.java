package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* renamed from: j02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9825j02 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<C9825j02> CREATOR = new C10857r31(28);

    /* renamed from: a */
    public String f34839a;

    /* renamed from: b */
    public String f34840b;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f34839a, false);
        SafeParcelWriter.writeString(parcel, 3, this.f34840b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
