package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: Gr0 */
/* loaded from: classes.dex */
public final class C0540Gr0 implements Parcelable {
    public static final Parcelable.Creator<C0540Gr0> CREATOR = new C0834Kl0(8);
    public final InterfaceC0384Er0[] a;
    public final long b;

    public C0540Gr0(InterfaceC0384Er0... interfaceC0384Er0Arr) {
        this(-9223372036854775807L, interfaceC0384Er0Arr);
    }

    public final C0540Gr0 a(InterfaceC0384Er0... interfaceC0384Er0Arr) {
        if (interfaceC0384Er0Arr.length == 0) {
            return this;
        }
        int i = AbstractC0277Dh1.a;
        InterfaceC0384Er0[] interfaceC0384Er0Arr2 = this.a;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC0384Er0Arr2, interfaceC0384Er0Arr2.length + interfaceC0384Er0Arr.length);
        System.arraycopy(interfaceC0384Er0Arr, 0, objArrCopyOf, interfaceC0384Er0Arr2.length, interfaceC0384Er0Arr.length);
        return new C0540Gr0(this.b, (InterfaceC0384Er0[]) objArrCopyOf);
    }

    public final C0540Gr0 b(C0540Gr0 c0540Gr0) {
        return c0540Gr0 == null ? this : a(c0540Gr0.a);
    }

    public final int c() {
        return this.a.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0540Gr0.class != obj.getClass()) {
            return false;
        }
        C0540Gr0 c0540Gr0 = (C0540Gr0) obj;
        return Arrays.equals(this.a, c0540Gr0.a) && this.b == c0540Gr0.b;
    }

    public final int hashCode() {
        return AbstractC5205it0.a(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.a));
        long j = this.b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InterfaceC0384Er0[] interfaceC0384Er0Arr = this.a;
        parcel.writeInt(interfaceC0384Er0Arr.length);
        for (InterfaceC0384Er0 interfaceC0384Er0 : interfaceC0384Er0Arr) {
            parcel.writeParcelable(interfaceC0384Er0, 0);
        }
        parcel.writeLong(this.b);
    }

    public C0540Gr0(long j, InterfaceC0384Er0... interfaceC0384Er0Arr) {
        this.b = j;
        this.a = interfaceC0384Er0Arr;
    }

    public C0540Gr0(List list) {
        this((InterfaceC0384Er0[]) list.toArray(new InterfaceC0384Er0[0]));
    }

    public C0540Gr0(Parcel parcel) {
        this.a = new InterfaceC0384Er0[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC0384Er0[] interfaceC0384Er0Arr = this.a;
            if (i < interfaceC0384Er0Arr.length) {
                interfaceC0384Er0Arr[i] = (InterfaceC0384Er0) parcel.readParcelable(InterfaceC0384Er0.class.getClassLoader());
                i++;
            } else {
                this.b = parcel.readLong();
                return;
            }
        }
    }
}
