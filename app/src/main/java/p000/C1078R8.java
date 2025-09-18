package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: R8 */
/* loaded from: classes2.dex */
public final class C1078R8 implements Parcelable {
    public static final Parcelable.Creator<C1078R8> CREATOR = new C0444H2(4);

    /* renamed from: a */
    public final String f10021a;

    /* renamed from: b */
    public final float f10022b;

    /* renamed from: c */
    public final float f10023c;

    public C1078R8(String str, float f, float f2) {
        this.f10021a = str;
        this.f10022b = f;
        this.f10023c = f2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10021a);
        parcel.writeFloat(this.f10022b);
        parcel.writeFloat(this.f10023c);
    }

    public C1078R8(Parcel parcel) {
        this.f10021a = parcel.readString();
        this.f10022b = parcel.readFloat();
        this.f10023c = parcel.readFloat();
    }
}
