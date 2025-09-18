package p000;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* renamed from: s40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10987s40 extends C1650aD {

    /* renamed from: c */
    public final int f42245c;

    public C10987s40(int i) {
        super(m24611a(i, 1));
        this.f42245c = 1;
    }

    /* renamed from: a */
    public static int m24611a(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    /* renamed from: b */
    public static C10987s40 m24612b(int i, IOException iOException) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : (message == null || !PN1.m6357c(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new C10731q40(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted") : new C10987s40(i2, i, iOException);
    }

    public C10987s40(String str, int i) {
        super(str, m24611a(i, 1));
        this.f42245c = 1;
    }

    public C10987s40(int i, int i2, IOException iOException) {
        super(m24611a(i, i2), iOException);
        this.f42245c = i2;
    }

    public C10987s40(int i, IOException iOException, String str) {
        super(str, iOException, m24611a(i, 1));
        this.f42245c = 1;
    }
}
