package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class B90 extends V50 {
    public static final Parcelable.Creator<B90> CREATOR = new C0444H2(28);

    /* renamed from: b */
    public final String f605b;

    /* renamed from: c */
    public final String f606c;

    /* renamed from: d */
    public final String f607d;

    public B90(String str, String str2, String str3) {
        super("----");
        this.f605b = str;
        this.f606c = str2;
        this.f607d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || B90.class != obj.getClass()) {
            return false;
        }
        B90 b90 = (B90) obj;
        return AbstractC7485Dh1.m1812a(this.f606c, b90.f606c) && AbstractC7485Dh1.m1812a(this.f605b, b90.f605b) && AbstractC7485Dh1.m1812a(this.f607d, b90.f607d);
    }

    public final int hashCode() {
        String str = this.f605b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f606c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f607d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p000.V50
    public final String toString() {
        return this.f12347a + ": domain=" + this.f605b + ", description=" + this.f606c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12347a);
        parcel.writeString(this.f605b);
        parcel.writeString(this.f607d);
    }

    public B90(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        this.f605b = string;
        this.f606c = parcel.readString();
        this.f607d = parcel.readString();
    }
}
