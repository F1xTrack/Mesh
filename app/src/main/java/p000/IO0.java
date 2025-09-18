package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class IO0 extends AbstractC6984v {
    public static final Parcelable.Creator<IO0> CREATOR = new C6921u(8);

    /* renamed from: c */
    public Parcelable f4920c;

    public IO0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4920c = parcel.readParcelable(classLoader == null ? AbstractC11919zO0.class.getClassLoader() : classLoader);
    }

    @Override // p000.AbstractC6984v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f4920c, 0);
    }
}
