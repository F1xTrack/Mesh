package defpackage;

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
public final class C1478Ss0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<C1478Ss0> CREATOR = new C0834Kl0(10);
    public final Calendar a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public String g;

    public C1478Ss0(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarD = AbstractC6316oh1.d(calendar);
        this.a = calendarD;
        this.b = calendarD.get(2);
        this.c = calendarD.get(1);
        this.d = calendarD.getMaximum(7);
        this.e = calendarD.getActualMaximum(5);
        this.f = calendarD.getTimeInMillis();
    }

    public static C1478Ss0 b(int i, int i2) {
        Calendar calendarG = AbstractC6316oh1.g(null);
        calendarG.set(1, i);
        calendarG.set(2, i2);
        return new C1478Ss0(calendarG);
    }

    public static C1478Ss0 c(long j) {
        Calendar calendarG = AbstractC6316oh1.g(null);
        calendarG.setTimeInMillis(j);
        return new C1478Ss0(calendarG);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(C1478Ss0 c1478Ss0) {
        return this.a.compareTo(c1478Ss0.a);
    }

    public final String d() {
        if (this.g == null) {
            long timeInMillis = this.a.getTimeInMillis();
            this.g = Build.VERSION.SDK_INT >= 24 ? AbstractC6316oh1.c("yMMMM", Locale.getDefault()).format(new Date(timeInMillis)) : DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        return this.g;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(C1478Ss0 c1478Ss0) {
        if (!(this.a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c1478Ss0.b - this.b) + ((c1478Ss0.c - this.c) * 12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1478Ss0)) {
            return false;
        }
        C1478Ss0 c1478Ss0 = (C1478Ss0) obj;
        return this.b == c1478Ss0.b && this.c == c1478Ss0.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.b);
    }
}
