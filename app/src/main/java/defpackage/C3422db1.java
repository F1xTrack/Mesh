package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: db1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3422db1 extends AbstractC7516v {
    public static final Parcelable.Creator<C3422db1> CREATOR = new C7325u(12);
    public int c;
    public boolean d;

    public C3422db1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    @Override // defpackage.AbstractC7516v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
