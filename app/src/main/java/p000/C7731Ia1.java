package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* renamed from: Ia1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7731Ia1 implements Parcelable {
    public static final Parcelable.Creator<C7731Ia1> CREATOR = new C10857r31(9);

    /* renamed from: a */
    public long f5021a;

    /* renamed from: b */
    public long f5022b;

    public C7731Ia1() {
        this(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()), TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()));
    }

    /* renamed from: a */
    public final long m3946a() {
        return new C7731Ia1().f5022b - this.f5022b;
    }

    /* renamed from: b */
    public final long m3947b(C7731Ia1 c7731Ia1) {
        return c7731Ia1.f5022b - this.f5022b;
    }

    /* renamed from: c */
    public final long m3948c() {
        return this.f5021a;
    }

    /* renamed from: d */
    public final void m3949d() {
        this.f5021a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f5022b = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5021a);
        parcel.writeLong(this.f5022b);
    }

    public C7731Ia1(long j, long j2) {
        this.f5021a = j;
        this.f5022b = j2;
    }
}
