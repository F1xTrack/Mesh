package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: jm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5376jm1 implements InterfaceC0384Er0 {
    public static final Parcelable.Creator<C5376jm1> CREATOR = new C6767r31(13);
    public final String a;
    public final String b;

    public C5376jm1(String str, String str2) {
        this.a = PN1.d(str);
        this.b = str2;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ C6666qX A() {
        return null;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final void d0(C7293tp0 c7293tp0) {
        String str;
        String str2 = this.a;
        str2.getClass();
        str = this.b;
        switch (str2) {
            case "ALBUM":
                c7293tp0.c = str;
                break;
            case "TITLE":
                c7293tp0.a = str;
                break;
            case "DESCRIPTION":
                c7293tp0.f = str;
                break;
            case "ALBUMARTIST":
                c7293tp0.d = str;
                break;
            case "ARTIST":
                c7293tp0.b = str;
                break;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5376jm1 c5376jm1 = (C5376jm1) obj;
        return this.a.equals(c5376jm1.a) && this.b.equals(c5376jm1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + AbstractC1705Vq.e(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + ContainerUtils.KEY_VALUE_DELIMITER + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }

    public C5376jm1(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC0277Dh1.a;
        this.a = string;
        this.b = parcel.readString();
    }
}
