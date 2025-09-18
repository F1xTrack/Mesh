package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X5 */
/* loaded from: classes.dex */
public final class C1453X5 extends V50 {
    public static final Parcelable.Creator<C1453X5> CREATOR = new C0444H2(1);

    /* renamed from: b */
    public final String f13556b;

    /* renamed from: c */
    public final String f13557c;

    /* renamed from: d */
    public final int f13558d;

    /* renamed from: e */
    public final byte[] f13559e;

    public C1453X5(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f13556b = str;
        this.f13557c = str2;
        this.f13558d = i;
        this.f13559e = bArr;
    }

    @Override // p000.V50, p000.InterfaceC7556Er0
    /* renamed from: d0 */
    public final void mo31d0(C11209tp0 c11209tp0) {
        c11209tp0.m24990a(this.f13558d, this.f13559e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1453X5.class != obj.getClass()) {
            return false;
        }
        C1453X5 c1453x5 = (C1453X5) obj;
        return this.f13558d == c1453x5.f13558d && AbstractC7485Dh1.m1812a(this.f13556b, c1453x5.f13556b) && AbstractC7485Dh1.m1812a(this.f13557c, c1453x5.f13557c) && Arrays.equals(this.f13559e, c1453x5.f13559e);
    }

    public final int hashCode() {
        int i = (527 + this.f13558d) * 31;
        String str = this.f13556b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f13557c;
        return Arrays.hashCode(this.f13559e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // p000.V50
    public final String toString() {
        return this.f12347a + ": mimeType=" + this.f13556b + ", description=" + this.f13557c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13556b);
        parcel.writeString(this.f13557c);
        parcel.writeInt(this.f13558d);
        parcel.writeByteArray(this.f13559e);
    }

    public C1453X5(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        this.f13556b = string;
        this.f13557c = parcel.readString();
        this.f13558d = parcel.readInt();
        this.f13559e = parcel.createByteArray();
    }
}
