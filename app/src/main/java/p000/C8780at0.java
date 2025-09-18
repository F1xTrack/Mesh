package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: at0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8780at0 implements InterfaceC7556Er0 {
    public static final Parcelable.Creator<C8780at0> CREATOR = new C7856Kl0(12);

    /* renamed from: a */
    public final float f16643a;

    /* renamed from: b */
    public final float f16644b;

    public C8780at0(float f, float f2) {
        YN1.m9277b("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.f16643a = f;
        this.f16644b = f2;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: A */
    public final /* synthetic */ C6686qX mo30A() {
        return null;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: d0 */
    public final /* synthetic */ void mo31d0(C11209tp0 c11209tp0) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: e0 */
    public final /* synthetic */ byte[] mo32e0() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8780at0.class != obj.getClass()) {
            return false;
        }
        C8780at0 c8780at0 = (C8780at0) obj;
        return this.f16643a == c8780at0.f16643a && this.f16644b == c8780at0.f16644b;
    }

    public final int hashCode() {
        return Float.valueOf(this.f16644b).hashCode() + ((Float.valueOf(this.f16643a).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.f16643a + ", longitude=" + this.f16644b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f16643a);
        parcel.writeFloat(this.f16644b);
    }

    public C8780at0(Parcel parcel) {
        this.f16643a = parcel.readFloat();
        this.f16644b = parcel.readFloat();
    }
}
