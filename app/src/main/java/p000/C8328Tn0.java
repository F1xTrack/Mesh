package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Tn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8328Tn0 extends AbstractC6984v {
    public static final Parcelable.Creator<C8328Tn0> CREATOR = new C6921u(7);

    /* renamed from: c */
    public boolean f11516c;

    public C8328Tn0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C8328Tn0.class.getClassLoader();
        }
        this.f11516c = parcel.readInt() == 1;
    }

    @Override // p000.AbstractC6984v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f11516c ? 1 : 0);
    }
}
