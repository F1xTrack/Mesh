package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class IO0 extends AbstractC7516v {
    public static final Parcelable.Creator<IO0> CREATOR = new C7325u(8);
    public Parcelable c;

    public IO0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readParcelable(classLoader == null ? AbstractC8354zO0.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.AbstractC7516v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.c, 0);
    }
}
