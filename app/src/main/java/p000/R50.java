package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class R50 implements InterfaceC7556Er0 {
    public static final Parcelable.Creator<R50> CREATOR = new C0444H2(26);

    /* renamed from: a */
    public final byte[] f9993a;

    /* renamed from: b */
    public final String f9994b;

    /* renamed from: c */
    public final String f9995c;

    public R50(String str, String str2, byte[] bArr) {
        this.f9993a = bArr;
        this.f9994b = str;
        this.f9995c = str2;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: A */
    public final /* synthetic */ C6686qX mo30A() {
        return null;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: d0 */
    public final void mo31d0(C11209tp0 c11209tp0) {
        String str = this.f9994b;
        if (str != null) {
            c11209tp0.f43325a = str;
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
        if (obj == null || R50.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f9993a, ((R50) obj).f9993a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9993a);
    }

    public final String toString() {
        return "ICY: title=\"" + this.f9994b + "\", url=\"" + this.f9995c + "\", rawMetadata.length=\"" + this.f9993a.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f9993a);
        parcel.writeString(this.f9994b);
        parcel.writeString(this.f9995c);
    }

    public R50(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.f9993a = bArrCreateByteArray;
        this.f9994b = parcel.readString();
        this.f9995c = parcel.readString();
    }
}
