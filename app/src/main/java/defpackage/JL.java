package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class JL implements Comparator, Parcelable {
    public static final Parcelable.Creator<JL> CREATOR = new H2(16);
    public final IL[] a;
    public int b;
    public final String c;
    public final int d;

    public JL(String str, ArrayList arrayList) {
        this(str, false, (IL[]) arrayList.toArray(new IL[0]));
    }

    public final JL a(String str) {
        return AbstractC0277Dh1.a(this.c, str) ? this : new JL(str, false, this.a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        IL il = (IL) obj;
        IL il2 = (IL) obj2;
        UUID uuid = AbstractC1063Nk.a;
        return uuid.equals(il.b) ? uuid.equals(il2.b) ? 0 : 1 : il.b.compareTo(il2.b);
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
        if (obj == null || JL.class != obj.getClass()) {
            return false;
        }
        JL jl = (JL) obj;
        return AbstractC0277Dh1.a(this.c, jl.c) && Arrays.equals(this.a, jl.a);
    }

    public final int hashCode() {
        if (this.b == 0) {
            String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public JL(IL... ilArr) {
        this(null, true, ilArr);
    }

    public JL(String str, boolean z, IL... ilArr) {
        this.c = str;
        ilArr = z ? (IL[]) ilArr.clone() : ilArr;
        this.a = ilArr;
        this.d = ilArr.length;
        Arrays.sort(ilArr, this);
    }

    public JL(Parcel parcel) {
        this.c = parcel.readString();
        IL[] ilArr = (IL[]) parcel.createTypedArray(IL.CREATOR);
        int i = AbstractC0277Dh1.a;
        this.a = ilArr;
        this.d = ilArr.length;
    }
}
