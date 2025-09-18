package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d6 */
/* loaded from: classes.dex */
public final class C3907d6 extends AbstractC6984v {
    public static final Parcelable.Creator<C3907d6> CREATOR = new C6921u(1);

    /* renamed from: c */
    public boolean f25810c;

    /* renamed from: d */
    public boolean f25811d;

    /* renamed from: e */
    public int f25812e;

    /* renamed from: f */
    public float f25813f;

    /* renamed from: g */
    public boolean f25814g;

    public C3907d6(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f25810c = parcel.readByte() != 0;
        this.f25811d = parcel.readByte() != 0;
        this.f25812e = parcel.readInt();
        this.f25813f = parcel.readFloat();
        this.f25814g = parcel.readByte() != 0;
    }

    @Override // p000.AbstractC6984v, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f25810c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f25811d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f25812e);
        parcel.writeFloat(this.f25813f);
        parcel.writeByte(this.f25814g ? (byte) 1 : (byte) 0);
    }
}
