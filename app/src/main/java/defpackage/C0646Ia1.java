package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: Ia1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646Ia1 implements Parcelable {
    public static final Parcelable.Creator<C0646Ia1> CREATOR = new C6767r31(9);
    public long a;
    public long b;

    public C0646Ia1() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }

    public final long a() {
        return new C0646Ia1().b - this.b;
    }

    public final long b(C0646Ia1 c0646Ia1) {
        return c0646Ia1.b - this.b;
    }

    public final long c() {
        return this.a;
    }

    public final void d() {
        this.a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.b = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public C0646Ia1(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
