package p000;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: Ss0 */
/* loaded from: classes.dex */
public final class C8286Ss0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<C8286Ss0> CREATOR = new C7856Kl0(10);

    /* renamed from: a */
    public final Calendar f11016a;

    /* renamed from: b */
    public final int f11017b;

    /* renamed from: c */
    public final int f11018c;

    /* renamed from: d */
    public final int f11019d;

    /* renamed from: e */
    public final int f11020e;

    /* renamed from: f */
    public final long f11021f;

    /* renamed from: g */
    public String f11022g;

    public C8286Ss0(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM23523d = AbstractC10554oh1.m23523d(calendar);
        this.f11016a = calendarM23523d;
        this.f11017b = calendarM23523d.get(2);
        this.f11018c = calendarM23523d.get(1);
        this.f11019d = calendarM23523d.getMaximum(7);
        this.f11020e = calendarM23523d.getActualMaximum(5);
        this.f11021f = calendarM23523d.getTimeInMillis();
    }

    /* renamed from: b */
    public static C8286Ss0 m7456b(int i, int i2) {
        Calendar calendarM23526g = AbstractC10554oh1.m23526g(null);
        calendarM23526g.set(1, i);
        calendarM23526g.set(2, i2);
        return new C8286Ss0(calendarM23526g);
    }

    /* renamed from: c */
    public static C8286Ss0 m7457c(long j) {
        Calendar calendarM23526g = AbstractC10554oh1.m23526g(null);
        calendarM23526g.setTimeInMillis(j);
        return new C8286Ss0(calendarM23526g);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(C8286Ss0 c8286Ss0) {
        return this.f11016a.compareTo(c8286Ss0.f11016a);
    }

    /* renamed from: d */
    public final String m7459d() {
        if (this.f11022g == null) {
            long timeInMillis = this.f11016a.getTimeInMillis();
            this.f11022g = Build.VERSION.SDK_INT >= 24 ? AbstractC10554oh1.m23522c("yMMMM", Locale.getDefault()).format(new Date(timeInMillis)) : DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        return this.f11022g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m7460e(C8286Ss0 c8286Ss0) {
        if (!(this.f11016a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c8286Ss0.f11017b - this.f11017b) + ((c8286Ss0.f11018c - this.f11018c) * 12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8286Ss0)) {
            return false;
        }
        C8286Ss0 c8286Ss0 = (C8286Ss0) obj;
        return this.f11017b == c8286Ss0.f11017b && this.f11018c == c8286Ss0.f11018c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11017b), Integer.valueOf(this.f11018c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11018c);
        parcel.writeInt(this.f11017b);
    }
}
