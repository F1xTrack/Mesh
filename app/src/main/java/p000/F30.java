package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class F30 implements Parcelable {
    public static final Parcelable.Creator<F30> CREATOR = new C0444H2(24);

    /* renamed from: a */
    public final int f3040a;

    /* renamed from: b */
    public final int f3041b;

    /* renamed from: c */
    public final String f3042c;

    /* renamed from: d */
    public final String f3043d;

    /* renamed from: e */
    public final String f3044e;

    /* renamed from: f */
    public final String f3045f;

    public F30(int i, int i2, String str, String str2, String str3, String str4) {
        this.f3040a = i;
        this.f3041b = i2;
        this.f3042c = str;
        this.f3043d = str2;
        this.f3044e = str3;
        this.f3045f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F30.class != obj.getClass()) {
            return false;
        }
        F30 f30 = (F30) obj;
        return this.f3040a == f30.f3040a && this.f3041b == f30.f3041b && TextUtils.equals(this.f3042c, f30.f3042c) && TextUtils.equals(this.f3043d, f30.f3043d) && TextUtils.equals(this.f3044e, f30.f3044e) && TextUtils.equals(this.f3045f, f30.f3045f);
    }

    public final int hashCode() {
        int i = ((this.f3040a * 31) + this.f3041b) * 31;
        String str = this.f3042c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3043d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3044e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f3045f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3040a);
        parcel.writeInt(this.f3041b);
        parcel.writeString(this.f3042c);
        parcel.writeString(this.f3043d);
        parcel.writeString(this.f3044e);
        parcel.writeString(this.f3045f);
    }

    public F30(Parcel parcel) {
        this.f3040a = parcel.readInt();
        this.f3041b = parcel.readInt();
        this.f3042c = parcel.readString();
        this.f3043d = parcel.readString();
        this.f3044e = parcel.readString();
        this.f3045f = parcel.readString();
    }
}
