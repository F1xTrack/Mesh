package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: pr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6535pr extends V50 {
    public static final Parcelable.Creator<C6535pr> CREATOR = new H2(9);
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final V50[] g;

    public C6535pr(String str, int i, int i2, long j, long j2, V50[] v50Arr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = v50Arr;
    }

    @Override // defpackage.V50, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6535pr.class != obj.getClass()) {
            return false;
        }
        C6535pr c6535pr = (C6535pr) obj;
        return this.c == c6535pr.c && this.d == c6535pr.d && this.e == c6535pr.e && this.f == c6535pr.f && AbstractC0277Dh1.a(this.b, c6535pr.b) && Arrays.equals(this.g, c6535pr.g);
    }

    public final int hashCode() {
        int i = (((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31;
        String str = this.b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        V50[] v50Arr = this.g;
        parcel.writeInt(v50Arr.length);
        for (V50 v50 : v50Arr) {
            parcel.writeParcelable(v50, 0);
        }
    }

    public C6535pr(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = AbstractC0277Dh1.a;
        this.b = string;
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        int i2 = parcel.readInt();
        this.g = new V50[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.g[i3] = (V50) parcel.readParcelable(V50.class.getClassLoader());
        }
    }
}
