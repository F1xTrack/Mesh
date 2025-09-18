package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7516v implements Parcelable {
    public final Parcelable a;
    public static final C7134t b = new C7134t();
    public static final Parcelable.Creator<AbstractC7516v> CREATOR = new C7325u(0);

    public AbstractC7516v() {
        this.a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public AbstractC7516v(Parcelable parcelable) {
        if (parcelable != null) {
            this.a = parcelable == b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC7516v(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.a = parcelable == null ? b : parcelable;
    }
}
