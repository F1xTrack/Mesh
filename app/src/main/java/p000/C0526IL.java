package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: IL */
/* loaded from: classes.dex */
public final class C0526IL implements Parcelable {
    public static final Parcelable.Creator<C0526IL> CREATOR = new C0444H2(17);

    /* renamed from: a */
    public int f4898a;

    /* renamed from: b */
    public final UUID f4899b;

    /* renamed from: c */
    public final String f4900c;

    /* renamed from: d */
    public final String f4901d;

    /* renamed from: e */
    public final byte[] f4902e;

    public C0526IL(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f4899b = uuid;
        this.f4900c = str;
        str2.getClass();
        this.f4901d = AbstractC8544Xr0.m9171n(str2);
        this.f4902e = bArr;
    }

    /* renamed from: a */
    public final boolean m3826a(UUID uuid) {
        UUID uuid2 = AbstractC0865Nk.f7977a;
        UUID uuid3 = this.f4899b;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0526IL)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C0526IL c0526il = (C0526IL) obj;
        return AbstractC7485Dh1.m1812a(this.f4900c, c0526il.f4900c) && AbstractC7485Dh1.m1812a(this.f4901d, c0526il.f4901d) && AbstractC7485Dh1.m1812a(this.f4899b, c0526il.f4899b) && Arrays.equals(this.f4902e, c0526il.f4902e);
    }

    public final int hashCode() {
        if (this.f4898a == 0) {
            int iHashCode = this.f4899b.hashCode() * 31;
            String str = this.f4900c;
            this.f4898a = Arrays.hashCode(this.f4902e) + AbstractC1374Vq.m8586e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f4901d);
        }
        return this.f4898a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f4899b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f4900c);
        parcel.writeString(this.f4901d);
        parcel.writeByteArray(this.f4902e);
    }

    public C0526IL(Parcel parcel) {
        this.f4899b = new UUID(parcel.readLong(), parcel.readLong());
        this.f4900c = parcel.readString();
        String string = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        this.f4901d = string;
        this.f4902e = parcel.createByteArray();
    }
}
