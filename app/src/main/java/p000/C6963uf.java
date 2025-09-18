package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C1720b;
import java.util.ArrayList;

/* renamed from: uf */
/* loaded from: classes.dex */
public final class C6963uf implements Parcelable {
    public static final Parcelable.Creator<C6963uf> CREATOR = new C0444H2(6);

    /* renamed from: a */
    public final ArrayList f43787a;

    /* renamed from: b */
    public final ArrayList f43788b;

    public C6963uf(Parcel parcel) {
        this.f43787a = parcel.createStringArrayList();
        this.f43788b = parcel.createTypedArrayList(C1720b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f43787a);
        parcel.writeTypedList(this.f43788b);
    }
}
