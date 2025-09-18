package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: iT0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9757iT0 implements Parcelable {
    public static final Parcelable.Creator<AbstractC9757iT0> CREATOR = new C7363Ay1(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7985Mx1 c7985Mx1 = (C7985Mx1) this;
        parcel.writeParcelable(c7985Mx1.f7415a, 0);
        parcel.writeInt(c7985Mx1.f7416b ? 1 : 0);
    }
}
