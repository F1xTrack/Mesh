package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class P10 extends AbstractSafeParcelable {
    public static final Parcelable.Creator<P10> CREATOR = new C10857r31(14);

    /* renamed from: a */
    public final int f8777a;

    /* renamed from: b */
    public final int f8778b;

    /* renamed from: c */
    public final Bundle f8779c;

    public P10(int i, int i2, Bundle bundle) {
        this.f8777a = i;
        this.f8778b = i2;
        this.f8779c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f8777a);
        SafeParcelWriter.writeInt(parcel, 2, this.f8778b);
        SafeParcelWriter.writeBundle(parcel, 3, this.f8779c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
