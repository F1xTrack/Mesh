package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.common.ContainerUtils;

/* renamed from: jm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9924jm1 implements InterfaceC7556Er0 {
    public static final Parcelable.Creator<C9924jm1> CREATOR = new C10857r31(13);

    /* renamed from: a */
    public final String f35375a;

    /* renamed from: b */
    public final String f35376b;

    public C9924jm1(String str, String str2) {
        this.f35375a = PN1.m6358d(str);
        this.f35376b = str2;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: A */
    public final /* synthetic */ C6686qX mo30A() {
        return null;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: d0 */
    public final void mo31d0(C11209tp0 c11209tp0) {
        String str;
        String str2 = this.f35375a;
        str2.getClass();
        str = this.f35376b;
        switch (str2) {
            case "ALBUM":
                c11209tp0.f43327c = str;
                break;
            case "TITLE":
                c11209tp0.f43325a = str;
                break;
            case "DESCRIPTION":
                c11209tp0.f43330f = str;
                break;
            case "ALBUMARTIST":
                c11209tp0.f43328d = str;
                break;
            case "ARTIST":
                c11209tp0.f43326b = str;
                break;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C9924jm1 c9924jm1 = (C9924jm1) obj;
        return this.f35375a.equals(c9924jm1.f35375a) && this.f35376b.equals(c9924jm1.f35376b);
    }

    public final int hashCode() {
        return this.f35376b.hashCode() + AbstractC1374Vq.m8586e(527, 31, this.f35375a);
    }

    public final String toString() {
        return "VC: " + this.f35375a + ContainerUtils.KEY_VALUE_DELIMITER + this.f35376b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35375a);
        parcel.writeString(this.f35376b);
    }

    public C9924jm1(Parcel parcel) {
        String string = parcel.readString();
        int i = AbstractC7485Dh1.f2166a;
        this.f35375a = string;
        this.f35376b = parcel.readString();
    }
}
