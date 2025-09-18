package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: iT0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4351iT0 implements Parcelable {
    public static final Parcelable.Creator<AbstractC4351iT0> CREATOR = new C0094Ay1(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C1026Mx1 c1026Mx1 = (C1026Mx1) this;
        parcel.writeParcelable(c1026Mx1.a, 0);
        parcel.writeInt(c1026Mx1.b ? 1 : 0);
    }
}
