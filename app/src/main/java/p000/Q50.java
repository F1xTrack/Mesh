package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Q50 implements InterfaceC7556Er0 {
    public static final Parcelable.Creator<Q50> CREATOR = new C0444H2(25);

    /* renamed from: a */
    public final int f9471a;

    /* renamed from: b */
    public final String f9472b;

    /* renamed from: c */
    public final String f9473c;

    /* renamed from: d */
    public final String f9474d;

    /* renamed from: e */
    public final boolean f9475e;

    /* renamed from: f */
    public final int f9476f;

    public Q50(int i, int i2, String str, String str2, String str3, boolean z) {
        YN1.m9278c(i2 == -1 || i2 > 0);
        this.f9471a = i;
        this.f9472b = str;
        this.f9473c = str2;
        this.f9474d = str3;
        this.f9475e = z;
        this.f9476f = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p000.Q50 m6572a(java.util.Map r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.Q50.m6572a(java.util.Map):Q50");
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: A */
    public final /* synthetic */ C6686qX mo30A() {
        return null;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: d0 */
    public final void mo31d0(C11209tp0 c11209tp0) {
        String str = this.f9473c;
        if (str != null) {
            c11209tp0.f43348x = str;
        }
        String str2 = this.f9472b;
        if (str2 != null) {
            c11209tp0.f43347w = str2;
        }
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
        if (obj == null || Q50.class != obj.getClass()) {
            return false;
        }
        Q50 q50 = (Q50) obj;
        return this.f9471a == q50.f9471a && AbstractC7485Dh1.m1812a(this.f9472b, q50.f9472b) && AbstractC7485Dh1.m1812a(this.f9473c, q50.f9473c) && AbstractC7485Dh1.m1812a(this.f9474d, q50.f9474d) && this.f9475e == q50.f9475e && this.f9476f == q50.f9476f;
    }

    public final int hashCode() {
        int i = (527 + this.f9471a) * 31;
        String str = this.f9472b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f9473c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9474d;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f9475e ? 1 : 0)) * 31) + this.f9476f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f9473c + "\", genre=\"" + this.f9472b + "\", bitrate=" + this.f9471a + ", metadataInterval=" + this.f9476f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9471a);
        parcel.writeString(this.f9472b);
        parcel.writeString(this.f9473c);
        parcel.writeString(this.f9474d);
        int i2 = AbstractC7485Dh1.f2166a;
        parcel.writeInt(this.f9475e ? 1 : 0);
        parcel.writeInt(this.f9476f);
    }

    public Q50(Parcel parcel) {
        this.f9471a = parcel.readInt();
        this.f9472b = parcel.readString();
        this.f9473c = parcel.readString();
        this.f9474d = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        this.f9475e = parcel.readInt() != 0;
        this.f9476f = parcel.readInt();
    }
}
