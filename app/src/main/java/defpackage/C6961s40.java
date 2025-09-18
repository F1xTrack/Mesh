package defpackage;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* renamed from: s40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6961s40 extends C2091aD {
    public final int c;

    public C6961s40(int i) {
        super(a(i, 1));
        this.c = 1;
    }

    public static int a(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static C6961s40 b(int i, IOException iOException) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : (message == null || !PN1.c(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new C6580q40(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted") : new C6961s40(i2, i, iOException);
    }

    public C6961s40(String str, int i) {
        super(str, a(i, 1));
        this.c = 1;
    }

    public C6961s40(int i, int i2, IOException iOException) {
        super(a(i, i2), iOException);
        this.c = i2;
    }

    public C6961s40(int i, IOException iOException, String str) {
        super(str, iOException, a(i, 1));
        this.c = 1;
    }
}
