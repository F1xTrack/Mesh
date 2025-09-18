package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: nh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6123nh extends V50 {
    public static final Parcelable.Creator<C6123nh> CREATOR = new H2(7);
    public final byte[] b;

    public C6123nh(String str, byte[] bArr) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6123nh.class != obj.getClass()) {
            return false;
        }
        C6123nh c6123nh = (C6123nh) obj;
        return this.a.equals(c6123nh.a) && Arrays.equals(this.b, c6123nh.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + AbstractC1705Vq.e(527, 31, this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C6123nh(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC0277Dh1.a;
        super(string);
        this.b = parcel.createByteArray();
    }
}
