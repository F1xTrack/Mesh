package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class UX implements Parcelable {
    public static final Parcelable.Creator<UX> CREATOR = new C7325u(6);
    public final Bundle a;

    public UX(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.a = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
