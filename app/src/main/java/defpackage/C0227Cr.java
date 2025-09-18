package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Cr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227Cr extends AbstractC7516v {
    public static final Parcelable.Creator<C0227Cr> CREATOR = new C7325u(3);
    public boolean c;

    public C0227Cr(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt() == 1;
    }

    @Override // defpackage.AbstractC7516v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
