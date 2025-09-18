package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: Sv */
/* loaded from: classes.dex */
public final class C1190Sv implements InterfaceC6700ql {

    /* renamed from: a */
    public final InterfaceC1127Rv f11072a;

    /* renamed from: b */
    public final ArrayList f11073b;

    /* renamed from: c */
    public static final C11370v32 f11070c = new C11370v32(9);

    /* renamed from: d */
    public static final C6914tt f11071d = new C6914tt(10);
    public static final Parcelable.Creator<C1190Sv> CREATOR = new C0444H2(12);

    public C1190Sv(ArrayList arrayList, InterfaceC1127Rv interfaceC1127Rv) {
        this.f11073b = arrayList;
        this.f11072a = interfaceC1127Rv;
    }

    @Override // p000.InterfaceC6700ql
    /* renamed from: S */
    public final boolean mo7464S(long j) {
        return this.f11072a.mo7128h(this.f11073b, j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1190Sv)) {
            return false;
        }
        C1190Sv c1190Sv = (C1190Sv) obj;
        return this.f11073b.equals(c1190Sv.f11073b) && this.f11072a.getId() == c1190Sv.f11072a.getId();
    }

    public final int hashCode() {
        return this.f11073b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f11073b);
        parcel.writeInt(this.f11072a.getId());
    }
}
