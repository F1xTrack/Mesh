package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class A21 implements InterfaceC7556Er0 {
    public static final Parcelable.Creator<A21> CREATOR = new C7856Kl0(28);

    /* renamed from: a */
    public final float f26a;

    /* renamed from: b */
    public final int f27b;

    public A21(float f, int i) {
        this.f26a = f;
        this.f27b = i;
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
        if (obj == null || A21.class != obj.getClass()) {
            return false;
        }
        A21 a21 = (A21) obj;
        return this.f26a == a21.f26a && this.f27b == a21.f27b;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f26a).hashCode() + 527) * 31) + this.f27b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f26a + ", svcTemporalLayerCount=" + this.f27b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f26a);
        parcel.writeInt(this.f27b);
    }

    public A21(Parcel parcel) {
        this.f26a = parcel.readFloat();
        this.f27b = parcel.readInt();
    }
}
