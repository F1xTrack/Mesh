package defpackage;

import android.media.MediaDrm;

/* loaded from: classes.dex */
public abstract class TL {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        return AbstractC0277Dh1.v(AbstractC0277Dh1.w(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
