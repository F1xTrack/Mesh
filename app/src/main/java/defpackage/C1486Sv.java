package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: Sv, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1486Sv implements InterfaceC6708ql {
    public final InterfaceC1408Rv a;
    public final ArrayList b;
    public static final C7532v32 c = new C7532v32(9);
    public static final C7304tt d = new C7304tt(10);
    public static final Parcelable.Creator<C1486Sv> CREATOR = new H2(12);

    public C1486Sv(ArrayList arrayList, InterfaceC1408Rv interfaceC1408Rv) {
        this.b = arrayList;
        this.a = interfaceC1408Rv;
    }

    @Override // defpackage.InterfaceC6708ql
    public final boolean S(long j) {
        return this.a.h(this.b, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1486Sv)) {
            return false;
        }
        C1486Sv c1486Sv = (C1486Sv) obj;
        return this.b.equals(c1486Sv.b) && this.a.getId() == c1486Sv.a.getId();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.b);
        parcel.writeInt(this.a.getId());
    }
}
