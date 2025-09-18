package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.Geofence;
import java.util.Locale;

/* loaded from: classes.dex */
public final class PE1 extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<PE1> CREATOR = new C2093aD1(5);
    public final String a;
    public final long b;
    public final short c;
    public final double d;
    public final double e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;

    public PE1(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
        }
        if (f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        }
        if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d);
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d2);
        }
        int i4 = i & 7;
        if (i4 == 0) {
            throw new IllegalArgumentException(AbstractC7209tN0.u(i, "No supported transition specified: "));
        }
        this.c = s;
        this.a = str;
        this.d = d;
        this.e = d2;
        this.f = f;
        this.b = j;
        this.g = i4;
        this.h = i2;
        this.i = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PE1) {
            PE1 pe1 = (PE1) obj;
            if (this.f == pe1.f && this.d == pe1.d && this.e == pe1.e && this.c == pe1.c) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final long getExpirationTime() {
        return this.b;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLatitude() {
        return this.d;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getLoiteringDelay() {
        return this.i;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLongitude() {
        return this.e;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getNotificationResponsiveness() {
        return this.h;
    }

    @Override // com.google.android.gms.location.Geofence
    public final float getRadius() {
        return this.f;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.a;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getTransitionTypes() {
        return this.g;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.d);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.e);
        return ((((Float.floatToIntBits(this.f) + ((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31)) * 31) + this.c) * 31) + this.g;
    }

    public final String toString() {
        Locale locale = Locale.US;
        short s = this.c;
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s != -1 ? s != 1 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "CIRCLE" : "INVALID", this.a.replaceAll("\\p{C}", "?"), Integer.valueOf(this.g), Double.valueOf(this.d), Double.valueOf(this.e), Float.valueOf(this.f), Integer.valueOf(this.h / 1000), Integer.valueOf(this.i), Long.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.a, false);
        SafeParcelWriter.writeLong(parcel, 2, this.b);
        SafeParcelWriter.writeShort(parcel, 3, this.c);
        SafeParcelWriter.writeDouble(parcel, 4, this.d);
        SafeParcelWriter.writeDouble(parcel, 5, this.e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f);
        SafeParcelWriter.writeInt(parcel, 7, this.g);
        SafeParcelWriter.writeInt(parcel, 8, this.h);
        SafeParcelWriter.writeInt(parcel, 9, this.i);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
