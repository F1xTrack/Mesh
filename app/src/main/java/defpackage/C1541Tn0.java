package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Tn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1541Tn0 extends AbstractC7516v {
    public static final Parcelable.Creator<C1541Tn0> CREATOR = new C7325u(7);
    public boolean c;

    public C1541Tn0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C1541Tn0.class.getClassLoader();
        }
        this.c = parcel.readInt() == 1;
    }

    @Override // defpackage.AbstractC7516v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
