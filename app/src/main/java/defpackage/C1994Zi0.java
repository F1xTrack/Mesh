package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Zi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1994Zi0 implements Parcelable {
    public static final Parcelable.Creator<C1994Zi0> CREATOR = new H2(29);
    public int a;
    public int b;
    public boolean c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
