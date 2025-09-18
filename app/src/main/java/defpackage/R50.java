package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class R50 implements InterfaceC0384Er0 {
    public static final Parcelable.Creator<R50> CREATOR = new H2(26);
    public final byte[] a;
    public final String b;
    public final String c;

    public R50(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ C6666qX A() {
        return null;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final void d0(C7293tp0 c7293tp0) {
        String str = this.b;
        if (str != null) {
            c7293tp0.a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ byte[] e0() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || R50.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((R50) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "ICY: title=\"" + this.b + "\", url=\"" + this.c + "\", rawMetadata.length=\"" + this.a.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }

    public R50(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.a = bArrCreateByteArray;
        this.b = parcel.readString();
        this.c = parcel.readString();
    }
}
