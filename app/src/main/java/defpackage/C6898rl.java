package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: rl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6898rl implements Parcelable {
    public static final Parcelable.Creator<C6898rl> CREATOR = new H2(8);
    public final C1478Ss0 a;
    public final C1478Ss0 b;
    public final InterfaceC6708ql c;
    public C1478Ss0 d;
    public final int e;
    public final int f;
    public final int g;

    public C6898rl(C1478Ss0 c1478Ss0, C1478Ss0 c1478Ss02, InterfaceC6708ql interfaceC6708ql, C1478Ss0 c1478Ss03, int i) {
        Objects.requireNonNull(c1478Ss0, "start cannot be null");
        Objects.requireNonNull(c1478Ss02, "end cannot be null");
        Objects.requireNonNull(interfaceC6708ql, "validator cannot be null");
        this.a = c1478Ss0;
        this.b = c1478Ss02;
        this.d = c1478Ss03;
        this.e = i;
        this.c = interfaceC6708ql;
        if (c1478Ss03 != null && c1478Ss0.a.compareTo(c1478Ss03.a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c1478Ss03 != null && c1478Ss03.a.compareTo(c1478Ss02.a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > AbstractC6316oh1.g(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.g = c1478Ss0.e(c1478Ss02) + 1;
        this.f = (c1478Ss02.c - c1478Ss0.c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6898rl)) {
            return false;
        }
        C6898rl c6898rl = (C6898rl) obj;
        return this.a.equals(c6898rl.a) && this.b.equals(c6898rl.b) && Objects.equals(this.d, c6898rl.d) && this.e == c6898rl.e && this.c.equals(c6898rl.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Integer.valueOf(this.e), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeInt(this.e);
    }
}
