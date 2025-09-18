package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b;
import java.util.ArrayList;

/* renamed from: kY, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5523kY implements Parcelable {
    public static final Parcelable.Creator<C5523kY> CREATOR = new H2(20);
    public ArrayList a;
    public ArrayList b;
    public b[] c;
    public int d;
    public String e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.a);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        parcel.writeStringList(this.f);
        parcel.writeTypedList(this.g);
        parcel.writeTypedList(this.h);
    }
}
