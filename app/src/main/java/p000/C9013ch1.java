package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ch1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9013ch1 extends V50 {
    public static final Parcelable.Creator<C9013ch1> CREATOR = new C10857r31(11);

    /* renamed from: b */
    public final String f17690b;

    /* renamed from: c */
    public final String f17691c;

    public C9013ch1(String str, String str2, String str3) {
        super(str);
        this.f17690b = str2;
        this.f17691c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9013ch1.class != obj.getClass()) {
            return false;
        }
        C9013ch1 c9013ch1 = (C9013ch1) obj;
        return this.f12347a.equals(c9013ch1.f12347a) && AbstractC7485Dh1.m1812a(this.f17690b, c9013ch1.f17690b) && AbstractC7485Dh1.m1812a(this.f17691c, c9013ch1.f17691c);
    }

    public final int hashCode() {
        int iM8586e = AbstractC1374Vq.m8586e(527, 31, this.f12347a);
        String str = this.f17690b;
        int iHashCode = (iM8586e + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17691c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p000.V50
    public final String toString() {
        return this.f12347a + ": url=" + this.f17691c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12347a);
        parcel.writeString(this.f17690b);
        parcel.writeString(this.f17691c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9013ch1(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        super(string);
        this.f17690b = parcel.readString();
        this.f17691c = parcel.readString();
    }
}
