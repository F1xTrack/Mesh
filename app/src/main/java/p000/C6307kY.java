package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1720b;
import java.util.ArrayList;

/* renamed from: kY */
/* loaded from: classes.dex */
public final class C6307kY implements Parcelable {
    public static final Parcelable.Creator<C6307kY> CREATOR = new C0444H2(20);

    /* renamed from: a */
    public ArrayList f36527a;

    /* renamed from: b */
    public ArrayList f36528b;

    /* renamed from: c */
    public C1720b[] f36529c;

    /* renamed from: d */
    public int f36530d;

    /* renamed from: e */
    public String f36531e;

    /* renamed from: f */
    public ArrayList f36532f;

    /* renamed from: g */
    public ArrayList f36533g;

    /* renamed from: h */
    public ArrayList f36534h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f36527a);
        parcel.writeStringList(this.f36528b);
        parcel.writeTypedArray(this.f36529c, i);
        parcel.writeInt(this.f36530d);
        parcel.writeString(this.f36531e);
        parcel.writeStringList(this.f36532f);
        parcel.writeTypedList(this.f36533g);
        parcel.writeTypedList(this.f36534h);
    }
}
