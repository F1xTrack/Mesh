package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class IL implements Parcelable {
    public static final Parcelable.Creator<IL> CREATOR = new H2(17);
    public int a;
    public final UUID b;
    public final String c;
    public final String d;
    public final byte[] e;

    public IL(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        str2.getClass();
        this.d = AbstractC1865Xr0.n(str2);
        this.e = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = AbstractC1063Nk.a;
        UUID uuid3 = this.b;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IL)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        IL il = (IL) obj;
        return AbstractC0277Dh1.a(this.c, il.c) && AbstractC0277Dh1.a(this.d, il.d) && AbstractC0277Dh1.a(this.b, il.b) && Arrays.equals(this.e, il.e);
    }

    public final int hashCode() {
        if (this.a == 0) {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            this.a = Arrays.hashCode(this.e) + AbstractC1705Vq.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public IL(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String string = parcel.readString();
        int i = AbstractC0277Dh1.a;
        this.d = string;
        this.e = parcel.createByteArray();
    }
}
