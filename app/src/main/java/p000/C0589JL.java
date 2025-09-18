package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: JL */
/* loaded from: classes.dex */
public final class C0589JL implements Comparator, Parcelable {
    public static final Parcelable.Creator<C0589JL> CREATOR = new C0444H2(16);

    /* renamed from: a */
    public final C0526IL[] f5485a;

    /* renamed from: b */
    public int f5486b;

    /* renamed from: c */
    public final String f5487c;

    /* renamed from: d */
    public final int f5488d;

    public C0589JL(String str, ArrayList arrayList) {
        this(str, false, (C0526IL[]) arrayList.toArray(new C0526IL[0]));
    }

    /* renamed from: a */
    public final C0589JL m4295a(String str) {
        return AbstractC7485Dh1.m1812a(this.f5487c, str) ? this : new C0589JL(str, false, this.f5485a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0526IL c0526il = (C0526IL) obj;
        C0526IL c0526il2 = (C0526IL) obj2;
        UUID uuid = AbstractC0865Nk.f7977a;
        return uuid.equals(c0526il.f4899b) ? uuid.equals(c0526il2.f4899b) ? 0 : 1 : c0526il.f4899b.compareTo(c0526il2.f4899b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0589JL.class != obj.getClass()) {
            return false;
        }
        C0589JL c0589jl = (C0589JL) obj;
        return AbstractC7485Dh1.m1812a(this.f5487c, c0589jl.f5487c) && Arrays.equals(this.f5485a, c0589jl.f5485a);
    }

    public final int hashCode() {
        if (this.f5486b == 0) {
            String str = this.f5487c;
            this.f5486b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f5485a);
        }
        return this.f5486b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5487c);
        parcel.writeTypedArray(this.f5485a, 0);
    }

    public C0589JL(C0526IL... c0526ilArr) {
        this(null, true, c0526ilArr);
    }

    public C0589JL(String str, boolean z, C0526IL... c0526ilArr) {
        this.f5487c = str;
        c0526ilArr = z ? (C0526IL[]) c0526ilArr.clone() : c0526ilArr;
        this.f5485a = c0526ilArr;
        this.f5488d = c0526ilArr.length;
        Arrays.sort(c0526ilArr, this);
    }

    public C0589JL(Parcel parcel) {
        this.f5487c = parcel.readString();
        C0526IL[] c0526ilArr = (C0526IL[]) parcel.createTypedArray(C0526IL.CREATOR);
        int i = AbstractC7485Dh1.f2166a;
        this.f5485a = c0526ilArr;
        this.f5488d = c0526ilArr.length;
    }
}
