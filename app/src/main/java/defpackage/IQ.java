package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;

/* loaded from: classes.dex */
public final class IQ extends AB0 {
    public final int c;
    public final String d;
    public final int e;
    public final C6666qX f;
    public final int g;
    public final C0456Fp0 h;
    public final boolean i;

    static {
        AbstractC8235ym.t(1001, 1002, 1003, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
        AbstractC0277Dh1.L(1006);
    }

    public IQ(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IQ(String str, Throwable th, int i, int i2, String str2, int i3, C6666qX c6666qX, int i4, C0456Fp0 c0456Fp0, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        YN1.c(!z || i2 == 1);
        YN1.c(th != null || i2 == 3);
        this.c = i2;
        this.d = str2;
        this.e = i3;
        this.f = c6666qX;
        this.g = i4;
        this.h = c0456Fp0;
        this.i = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IQ(int i, Exception exc, int i2, String str, int i3, C6666qX c6666qX, int i4, boolean z) {
        String str2;
        if (i == 0) {
            str2 = "Source error";
        } else if (i == 1) {
            str2 = str + " error, index=" + i3 + ", format=" + c6666qX + ", format_supported=" + AbstractC0277Dh1.x(i4);
        } else if (i != 3) {
            str2 = "Unexpected runtime error";
        } else {
            str2 = "Remote error";
        }
        this(TextUtils.isEmpty(null) ? str2 : AbstractC8235ym.i(str2, ": null"), exc, i2, i, str, i3, c6666qX, i4, null, SystemClock.elapsedRealtime(), z);
    }
}
