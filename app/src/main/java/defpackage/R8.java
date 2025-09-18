package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class R8 implements Parcelable {
    public static final Parcelable.Creator<R8> CREATOR = new H2(4);
    public final String a;
    public final float b;
    public final float c;

    public R8(String str, float f, float f2) {
        this.a = str;
        this.b = f;
        this.c = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }

    public R8(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
    }
}
