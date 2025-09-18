package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: pr */
/* loaded from: classes.dex */
public final class C6643pr extends V50 {
    public static final Parcelable.Creator<C6643pr> CREATOR = new C0444H2(9);

    /* renamed from: b */
    public final String f40418b;

    /* renamed from: c */
    public final int f40419c;

    /* renamed from: d */
    public final int f40420d;

    /* renamed from: e */
    public final long f40421e;

    /* renamed from: f */
    public final long f40422f;

    /* renamed from: g */
    public final V50[] f40423g;

    public C6643pr(String str, int i, int i2, long j, long j2, V50[] v50Arr) {
        super("CHAP");
        this.f40418b = str;
        this.f40419c = i;
        this.f40420d = i2;
        this.f40421e = j;
        this.f40422f = j2;
        this.f40423g = v50Arr;
    }

    @Override // p000.V50, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6643pr.class != obj.getClass()) {
            return false;
        }
        C6643pr c6643pr = (C6643pr) obj;
        return this.f40419c == c6643pr.f40419c && this.f40420d == c6643pr.f40420d && this.f40421e == c6643pr.f40421e && this.f40422f == c6643pr.f40422f && AbstractC7485Dh1.m1812a(this.f40418b, c6643pr.f40418b) && Arrays.equals(this.f40423g, c6643pr.f40423g);
    }

    public final int hashCode() {
        int i = (((((((527 + this.f40419c) * 31) + this.f40420d) * 31) + ((int) this.f40421e)) * 31) + ((int) this.f40422f)) * 31;
        String str = this.f40418b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40418b);
        parcel.writeInt(this.f40419c);
        parcel.writeInt(this.f40420d);
        parcel.writeLong(this.f40421e);
        parcel.writeLong(this.f40422f);
        V50[] v50Arr = this.f40423g;
        parcel.writeInt(v50Arr.length);
        for (V50 v50 : v50Arr) {
            parcel.writeParcelable(v50, 0);
        }
    }

    public C6643pr(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        this.f40418b = string;
        this.f40419c = parcel.readInt();
        this.f40420d = parcel.readInt();
        this.f40421e = parcel.readLong();
        this.f40422f = parcel.readLong();
        int i2 = parcel.readInt();
        this.f40423g = new V50[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f40423g[i3] = (V50) parcel.readParcelable(V50.class.getClassLoader());
        }
    }
}
