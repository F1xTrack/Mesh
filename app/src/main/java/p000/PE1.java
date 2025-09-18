package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.Geofence;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Locale;

/* loaded from: classes.dex */
public final class PE1 extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<PE1> CREATOR = new C8697aD1(5);

    /* renamed from: a */
    public final String f8934a;

    /* renamed from: b */
    public final long f8935b;

    /* renamed from: c */
    public final short f8936c;

    /* renamed from: d */
    public final double f8937d;

    /* renamed from: e */
    public final double f8938e;

    /* renamed from: f */
    public final float f8939f;

    /* renamed from: g */
    public final int f8940g;

    /* renamed from: h */
    public final int f8941h;

    /* renamed from: i */
    public final int f8942i;

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
            throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i, "No supported transition specified: "));
        }
        this.f8936c = s;
        this.f8934a = str;
        this.f8937d = d;
        this.f8938e = d2;
        this.f8939f = f;
        this.f8935b = j;
        this.f8940g = i4;
        this.f8941h = i2;
        this.f8942i = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PE1) {
            PE1 pe1 = (PE1) obj;
            if (this.f8939f == pe1.f8939f && this.f8937d == pe1.f8937d && this.f8938e == pe1.f8938e && this.f8936c == pe1.f8936c) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final long getExpirationTime() {
        return this.f8935b;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLatitude() {
        return this.f8937d;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getLoiteringDelay() {
        return this.f8942i;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLongitude() {
        return this.f8938e;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getNotificationResponsiveness() {
        return this.f8941h;
    }

    @Override // com.google.android.gms.location.Geofence
    public final float getRadius() {
        return this.f8939f;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.f8934a;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getTransitionTypes() {
        return this.f8940g;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f8937d);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f8938e);
        return ((((Float.floatToIntBits(this.f8939f) + ((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31)) * 31) + this.f8936c) * 31) + this.f8940g;
    }

    public final String toString() {
        Locale locale = Locale.US;
        short s = this.f8936c;
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", s != -1 ? s != 1 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "CIRCLE" : "INVALID", this.f8934a.replaceAll("\\p{C}", "?"), Integer.valueOf(this.f8940g), Double.valueOf(this.f8937d), Double.valueOf(this.f8938e), Float.valueOf(this.f8939f), Integer.valueOf(this.f8941h / 1000), Integer.valueOf(this.f8942i), Long.valueOf(this.f8935b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f8934a, false);
        SafeParcelWriter.writeLong(parcel, 2, this.f8935b);
        SafeParcelWriter.writeShort(parcel, 3, this.f8936c);
        SafeParcelWriter.writeDouble(parcel, 4, this.f8937d);
        SafeParcelWriter.writeDouble(parcel, 5, this.f8938e);
        SafeParcelWriter.writeFloat(parcel, 6, this.f8939f);
        SafeParcelWriter.writeInt(parcel, 7, this.f8940g);
        SafeParcelWriter.writeInt(parcel, 8, this.f8941h);
        SafeParcelWriter.writeInt(parcel, 9, this.f8942i);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
