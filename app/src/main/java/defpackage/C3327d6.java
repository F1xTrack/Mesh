package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3327d6 extends AbstractC7516v {
    public static final Parcelable.Creator<C3327d6> CREATOR = new C7325u(1);
    public boolean c;
    public boolean d;
    public int e;
    public float f;
    public boolean g;

    public C3327d6(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readFloat();
        this.g = parcel.readByte() != 0;
    }

    @Override // defpackage.AbstractC7516v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.e);
        parcel.writeFloat(this.f);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
    }
}
