package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: UX */
/* loaded from: classes.dex */
public final class C1292UX implements Parcelable {
    public static final Parcelable.Creator<C1292UX> CREATOR = new C6921u(6);

    /* renamed from: a */
    public final Bundle f11900a;

    public C1292UX(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.f11900a = bundle;
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
        parcel.writeBundle(this.f11900a);
    }
}
