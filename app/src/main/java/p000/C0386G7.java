package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: G7 */
/* loaded from: classes.dex */
public final class C0386G7 implements InterfaceC7556Er0 {
    public static final Parcelable.Creator<C0386G7> CREATOR = new C0444H2(3);

    /* renamed from: a */
    public final int f3591a;

    /* renamed from: b */
    public final String f3592b;

    public C0386G7(int i, String str) {
        this.f3591a = i;
        this.f3592b = str;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.f3591a);
        sb.append(",url=");
        return AbstractC1374Vq.m8593l(sb, this.f3592b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3592b);
        parcel.writeInt(this.f3591a);
    }
}
