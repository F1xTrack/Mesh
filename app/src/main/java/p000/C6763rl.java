package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: rl */
/* loaded from: classes.dex */
public final class C6763rl implements Parcelable {
    public static final Parcelable.Creator<C6763rl> CREATOR = new C0444H2(8);

    /* renamed from: a */
    public final C8286Ss0 f41848a;

    /* renamed from: b */
    public final C8286Ss0 f41849b;

    /* renamed from: c */
    public final InterfaceC6700ql f41850c;

    /* renamed from: d */
    public C8286Ss0 f41851d;

    /* renamed from: e */
    public final int f41852e;

    /* renamed from: f */
    public final int f41853f;

    /* renamed from: g */
    public final int f41854g;

    public C6763rl(C8286Ss0 c8286Ss0, C8286Ss0 c8286Ss02, InterfaceC6700ql interfaceC6700ql, C8286Ss0 c8286Ss03, int i) {
        Objects.requireNonNull(c8286Ss0, "start cannot be null");
        Objects.requireNonNull(c8286Ss02, "end cannot be null");
        Objects.requireNonNull(interfaceC6700ql, "validator cannot be null");
        this.f41848a = c8286Ss0;
        this.f41849b = c8286Ss02;
        this.f41851d = c8286Ss03;
        this.f41852e = i;
        this.f41850c = interfaceC6700ql;
        if (c8286Ss03 != null && c8286Ss0.f11016a.compareTo(c8286Ss03.f11016a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c8286Ss03 != null && c8286Ss03.f11016a.compareTo(c8286Ss02.f11016a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > AbstractC10554oh1.m23526g(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f41854g = c8286Ss0.m7460e(c8286Ss02) + 1;
        this.f41853f = (c8286Ss02.f11018c - c8286Ss0.f11018c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6763rl)) {
            return false;
        }
        C6763rl c6763rl = (C6763rl) obj;
        return this.f41848a.equals(c6763rl.f41848a) && this.f41849b.equals(c6763rl.f41849b) && Objects.equals(this.f41851d, c6763rl.f41851d) && this.f41852e == c6763rl.f41852e && this.f41850c.equals(c6763rl.f41850c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41848a, this.f41849b, this.f41851d, Integer.valueOf(this.f41852e), this.f41850c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f41848a, 0);
        parcel.writeParcelable(this.f41849b, 0);
        parcel.writeParcelable(this.f41851d, 0);
        parcel.writeParcelable(this.f41850c, 0);
        parcel.writeInt(this.f41852e);
    }
}
