package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class G30 implements InterfaceC7556Er0 {
    public static final Parcelable.Creator<G30> CREATOR = new C0444H2(23);

    /* renamed from: a */
    public final String f3552a;

    /* renamed from: b */
    public final String f3553b;

    /* renamed from: c */
    public final List f3554c;

    public G30(List list, String str, String str2) {
        this.f3552a = str;
        this.f3553b = str2;
        this.f3554c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: A */
    public final /* synthetic */ C6686qX mo30A() {
        return null;
    }

    @Override // p000.InterfaceC7556Er0
    /* renamed from: d0 */
    public final /* synthetic */ void mo31d0(C11209tp0 c11209tp0) {
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
        if (obj == null || G30.class != obj.getClass()) {
            return false;
        }
        G30 g30 = (G30) obj;
        return TextUtils.equals(this.f3552a, g30.f3552a) && TextUtils.equals(this.f3553b, g30.f3553b) && this.f3554c.equals(g30.f3554c);
    }

    public final int hashCode() {
        String str = this.f3552a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3553b;
        return this.f3554c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f3552a;
        sb.append(str != null ? AbstractC1374Vq.m8593l(AbstractC7222ym.m26240q(" [", str, ", "), this.f3553b, "]") : "");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3552a);
        parcel.writeString(this.f3553b);
        List list = this.f3554c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
    }

    public G30(Parcel parcel) {
        this.f3552a = parcel.readString();
        this.f3553b = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((F30) parcel.readParcelable(F30.class.getClassLoader()));
        }
        this.f3554c = Collections.unmodifiableList(arrayList);
    }
}
