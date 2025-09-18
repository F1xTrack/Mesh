package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e51 */
/* loaded from: classes.dex */
public final class C3516e51 implements Comparable, Parcelable {
    public static final Parcelable.Creator<C3516e51> CREATOR = new C6767r31(4);
    public final int a;
    public final int b;
    public final int c;

    static {
        AbstractC0277Dh1.L(0);
        AbstractC0277Dh1.L(1);
        AbstractC0277Dh1.L(2);
    }

    public C3516e51() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3516e51 c3516e51 = (C3516e51) obj;
        int i = this.a - c3516e51.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - c3516e51.b;
        return i2 == 0 ? this.c - c3516e51.c : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3516e51.class != obj.getClass()) {
            return false;
        }
        C3516e51 c3516e51 = (C3516e51) obj;
        return this.a == c3516e51.a && this.b == c3516e51.b && this.c == c3516e51.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return this.a + "." + this.b + "." + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
    }

    public C3516e51(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
    }
}
