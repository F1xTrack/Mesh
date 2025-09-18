package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: Gr0 */
/* loaded from: classes.dex */
public final class C7660Gr0 implements Parcelable {
    public static final Parcelable.Creator<C7660Gr0> CREATOR = new C7856Kl0(8);

    /* renamed from: a */
    public final InterfaceC7556Er0[] f3928a;

    /* renamed from: b */
    public final long f3929b;

    public C7660Gr0(InterfaceC7556Er0... interfaceC7556Er0Arr) {
        this(-9223372036854775807L, interfaceC7556Er0Arr);
    }

    /* renamed from: a */
    public final C7660Gr0 m3181a(InterfaceC7556Er0... interfaceC7556Er0Arr) {
        if (interfaceC7556Er0Arr.length == 0) {
            return this;
        }
        int i = AbstractC7485Dh1.f2166a;
        InterfaceC7556Er0[] interfaceC7556Er0Arr2 = this.f3928a;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC7556Er0Arr2, interfaceC7556Er0Arr2.length + interfaceC7556Er0Arr.length);
        System.arraycopy(interfaceC7556Er0Arr, 0, objArrCopyOf, interfaceC7556Er0Arr2.length, interfaceC7556Er0Arr.length);
        return new C7660Gr0(this.f3929b, (InterfaceC7556Er0[]) objArrCopyOf);
    }

    /* renamed from: b */
    public final C7660Gr0 m3182b(C7660Gr0 c7660Gr0) {
        return c7660Gr0 == null ? this : m3181a(c7660Gr0.f3928a);
    }

    /* renamed from: c */
    public final int m3183c() {
        return this.f3928a.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7660Gr0.class != obj.getClass()) {
            return false;
        }
        C7660Gr0 c7660Gr0 = (C7660Gr0) obj;
        return Arrays.equals(this.f3928a, c7660Gr0.f3928a) && this.f3929b == c7660Gr0.f3929b;
    }

    public final int hashCode() {
        return AbstractC9809it0.m21935a(this.f3929b) + (Arrays.hashCode(this.f3928a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f3928a));
        long j = this.f3929b;
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
        InterfaceC7556Er0[] interfaceC7556Er0Arr = this.f3928a;
        parcel.writeInt(interfaceC7556Er0Arr.length);
        for (InterfaceC7556Er0 interfaceC7556Er0 : interfaceC7556Er0Arr) {
            parcel.writeParcelable(interfaceC7556Er0, 0);
        }
        parcel.writeLong(this.f3929b);
    }

    public C7660Gr0(long j, InterfaceC7556Er0... interfaceC7556Er0Arr) {
        this.f3929b = j;
        this.f3928a = interfaceC7556Er0Arr;
    }

    public C7660Gr0(List list) {
        this((InterfaceC7556Er0[]) list.toArray(new InterfaceC7556Er0[0]));
    }

    public C7660Gr0(Parcel parcel) {
        this.f3928a = new InterfaceC7556Er0[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC7556Er0[] interfaceC7556Er0Arr = this.f3928a;
            if (i < interfaceC7556Er0Arr.length) {
                interfaceC7556Er0Arr[i] = (InterfaceC7556Er0) parcel.readParcelable(InterfaceC7556Er0.class.getClassLoader());
                i++;
            } else {
                this.f3929b = parcel.readLong();
                return;
            }
        }
    }
}
