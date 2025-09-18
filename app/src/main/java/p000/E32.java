package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class E32 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<E32> CREATOR = new P32(1);

    /* renamed from: a */
    public final int f2446a;

    /* renamed from: b */
    public final String f2447b;

    public E32(int i, String str) {
        this.f2446a = i;
        this.f2447b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f2446a);
        SafeParcelWriter.writeString(parcel, 2, this.f2447b, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
