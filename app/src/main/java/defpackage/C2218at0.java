package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: at0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2218at0 implements InterfaceC0384Er0 {
    public static final Parcelable.Creator<C2218at0> CREATOR = new C0834Kl0(12);
    public final float a;
    public final float b;

    public C2218at0(float f, float f2) {
        YN1.b("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ C6666qX A() {
        return null;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ void d0(C7293tp0 c7293tp0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ byte[] e0() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2218at0.class != obj.getClass()) {
            return false;
        }
        C2218at0 c2218at0 = (C2218at0) obj;
        return this.a == c2218at0.a && this.b == c2218at0.b;
    }

    public final int hashCode() {
        return Float.valueOf(this.b).hashCode() + ((Float.valueOf(this.a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
    }

    public C2218at0(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
    }
}
