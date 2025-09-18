package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: f11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3692f11 implements Parcelable {
    public static final Parcelable.Creator<C3692f11> CREATOR = new C0834Kl0(25);
    public Long a;

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Long l = this.a;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
    }
}
