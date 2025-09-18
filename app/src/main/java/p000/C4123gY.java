package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: gY */
/* loaded from: classes.dex */
public final class C4123gY implements Parcelable {
    public static final Parcelable.Creator<C4123gY> CREATOR = new C0444H2(19);

    /* renamed from: a */
    public String f27831a;

    /* renamed from: b */
    public int f27832b;

    public C4123gY(String str, int i) {
        this.f27831a = str;
        this.f27832b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27831a);
        parcel.writeInt(this.f27832b);
    }
}
