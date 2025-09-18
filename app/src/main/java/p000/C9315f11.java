package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: f11, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9315f11 implements Parcelable {
    public static final Parcelable.Creator<C9315f11> CREATOR = new C7856Kl0(25);

    /* renamed from: a */
    public Long f27015a;

    /* renamed from: a */
    public final ArrayList m18154a() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f27015a;
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
        parcel.writeValue(this.f27015a);
    }
}
