package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class G30 implements InterfaceC0384Er0 {
    public static final Parcelable.Creator<G30> CREATOR = new H2(23);
    public final String a;
    public final String b;
    public final List c;

    public G30(List list, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ C6666qX A() {
        return null;
    }

    @Override // defpackage.InterfaceC0384Er0
    public final /* synthetic */ void d0(C7293tp0 c7293tp0) {
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
        if (obj == null || G30.class != obj.getClass()) {
            return false;
        }
        G30 g30 = (G30) obj;
        return TextUtils.equals(this.a, g30.a) && TextUtils.equals(this.b, g30.b) && this.c.equals(g30.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.a;
        sb.append(str != null ? AbstractC1705Vq.l(AbstractC8235ym.q(" [", str, ", "), this.b, "]") : "");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        List list = this.c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
    }

    public G30(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((F30) parcel.readParcelable(F30.class.getClassLoader()));
        }
        this.c = Collections.unmodifiableList(arrayList);
    }
}
