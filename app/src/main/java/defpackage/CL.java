package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class CL extends AbstractC7516v {
    public static final Parcelable.Creator<CL> CREATOR = new C7325u(5);
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public CL(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = 0;
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
    }

    @Override // defpackage.AbstractC7516v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
    }
}
