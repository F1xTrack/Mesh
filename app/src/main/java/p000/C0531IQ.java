package p000;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;

/* renamed from: IQ */
/* loaded from: classes.dex */
public final class C0531IQ extends AB0 {

    /* renamed from: c */
    public final int f4926c;

    /* renamed from: d */
    public final String f4927d;

    /* renamed from: e */
    public final int f4928e;

    /* renamed from: f */
    public final C6686qX f4929f;

    /* renamed from: g */
    public final int f4930g;

    /* renamed from: h */
    public final C7604Fp0 f4931h;

    /* renamed from: i */
    public final boolean f4932i;

    static {
        AbstractC7222ym.m26243t(1001, 1002, 1003, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);
        AbstractC7485Dh1.m1797L(1006);
    }

    public C0531IQ(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0531IQ(String str, Throwable th, int i, int i2, String str2, int i3, C6686qX c6686qX, int i4, C7604Fp0 c7604Fp0, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        YN1.m9278c(!z || i2 == 1);
        YN1.m9278c(th != null || i2 == 3);
        this.f4926c = i2;
        this.f4927d = str2;
        this.f4928e = i3;
        this.f4929f = c6686qX;
        this.f4930g = i4;
        this.f4931h = c7604Fp0;
        this.f4932i = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0531IQ(int i, Exception exc, int i2, String str, int i3, C6686qX c6686qX, int i4, boolean z) {
        String str2;
        if (i == 0) {
            str2 = "Source error";
        } else if (i == 1) {
            str2 = str + " error, index=" + i3 + ", format=" + c6686qX + ", format_supported=" + AbstractC7485Dh1.m1839x(i4);
        } else if (i != 3) {
            str2 = "Unexpected runtime error";
        } else {
            str2 = "Remote error";
        }
        this(TextUtils.isEmpty(null) ? str2 : AbstractC7222ym.m26232i(str2, ": null"), exc, i2, i, str, i3, c6686qX, i4, null, SystemClock.elapsedRealtime(), z);
    }
}
