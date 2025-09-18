package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: nh */
/* loaded from: classes.dex */
public final class C6505nh extends V50 {
    public static final Parcelable.Creator<C6505nh> CREATOR = new C0444H2(7);

    /* renamed from: b */
    public final byte[] f38471b;

    public C6505nh(String str, byte[] bArr) {
        super(str);
        this.f38471b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6505nh.class != obj.getClass()) {
            return false;
        }
        C6505nh c6505nh = (C6505nh) obj;
        return this.f12347a.equals(c6505nh.f12347a) && Arrays.equals(this.f38471b, c6505nh.f38471b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f38471b) + AbstractC1374Vq.m8586e(527, 31, this.f12347a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12347a);
        parcel.writeByteArray(this.f38471b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6505nh(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        super(string);
        this.f38471b = parcel.createByteArray();
    }
}
