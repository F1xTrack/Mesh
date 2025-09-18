package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3983gY implements Parcelable {
    public static final Parcelable.Creator<C3983gY> CREATOR = new H2(19);
    public String a;
    public int b;

    public C3983gY(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
