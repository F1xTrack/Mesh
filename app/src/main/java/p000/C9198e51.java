package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e51 */
/* loaded from: classes.dex */
public final class C9198e51 implements Comparable, Parcelable {
    public static final Parcelable.Creator<C9198e51> CREATOR = new C10857r31(4);

    /* renamed from: a */
    public final int f26537a;

    /* renamed from: b */
    public final int f26538b;

    /* renamed from: c */
    public final int f26539c;

    static {
        AbstractC7485Dh1.m1797L(0);
        AbstractC7485Dh1.m1797L(1);
        AbstractC7485Dh1.m1797L(2);
    }

    public C9198e51() {
        this.f26537a = -1;
        this.f26538b = -1;
        this.f26539c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C9198e51 c9198e51 = (C9198e51) obj;
        int i = this.f26537a - c9198e51.f26537a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f26538b - c9198e51.f26538b;
        return i2 == 0 ? this.f26539c - c9198e51.f26539c : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9198e51.class != obj.getClass()) {
            return false;
        }
        C9198e51 c9198e51 = (C9198e51) obj;
        return this.f26537a == c9198e51.f26537a && this.f26538b == c9198e51.f26538b && this.f26539c == c9198e51.f26539c;
    }

    public final int hashCode() {
        return (((this.f26537a * 31) + this.f26538b) * 31) + this.f26539c;
    }

    public final String toString() {
        return this.f26537a + "." + this.f26538b + "." + this.f26539c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26537a);
        parcel.writeInt(this.f26538b);
        parcel.writeInt(this.f26539c);
    }

    public C9198e51(Parcel parcel) {
        this.f26537a = parcel.readInt();
        this.f26538b = parcel.readInt();
        this.f26539c = parcel.readInt();
    }
}
