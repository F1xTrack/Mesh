package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: qr */
/* loaded from: classes.dex */
public final class C6706qr extends V50 {
    public static final Parcelable.Creator<C6706qr> CREATOR = new C0444H2(10);

    /* renamed from: b */
    public final String f41208b;

    /* renamed from: c */
    public final boolean f41209c;

    /* renamed from: d */
    public final boolean f41210d;

    /* renamed from: e */
    public final String[] f41211e;

    /* renamed from: f */
    public final V50[] f41212f;

    public C6706qr(String str, boolean z, boolean z2, String[] strArr, V50[] v50Arr) {
        super("CTOC");
        this.f41208b = str;
        this.f41209c = z;
        this.f41210d = z2;
        this.f41211e = strArr;
        this.f41212f = v50Arr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6706qr.class != obj.getClass()) {
            return false;
        }
        C6706qr c6706qr = (C6706qr) obj;
        return this.f41209c == c6706qr.f41209c && this.f41210d == c6706qr.f41210d && AbstractC7485Dh1.m1812a(this.f41208b, c6706qr.f41208b) && Arrays.equals(this.f41211e, c6706qr.f41211e) && Arrays.equals(this.f41212f, c6706qr.f41212f);
    }

    public final int hashCode() {
        int i = (((527 + (this.f41209c ? 1 : 0)) * 31) + (this.f41210d ? 1 : 0)) * 31;
        String str = this.f41208b;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f41208b);
        parcel.writeByte(this.f41209c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f41210d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f41211e);
        V50[] v50Arr = this.f41212f;
        parcel.writeInt(v50Arr.length);
        for (V50 v50 : v50Arr) {
            parcel.writeParcelable(v50, 0);
        }
    }

    public C6706qr(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        this.f41208b = string;
        this.f41209c = parcel.readByte() != 0;
        this.f41210d = parcel.readByte() != 0;
        this.f41211e = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.f41212f = new V50[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f41212f[i3] = (V50) parcel.readParcelable(V50.class.getClassLoader());
        }
    }
}
