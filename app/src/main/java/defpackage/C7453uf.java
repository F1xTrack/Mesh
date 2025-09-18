package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import java.util.ArrayList;

/* renamed from: uf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7453uf implements Parcelable {
    public static final Parcelable.Creator<C7453uf> CREATOR = new H2(6);
    public final ArrayList a;
    public final ArrayList b;

    public C7453uf(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.b);
    }
}
