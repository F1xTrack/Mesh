package p000;

import android.media.MediaDrm;

/* renamed from: TL */
/* loaded from: classes.dex */
public abstract class AbstractC1217TL {
    /* renamed from: a */
    public static boolean m7685a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    /* renamed from: b */
    public static int m7686b(Throwable th) {
        return AbstractC7485Dh1.m1837v(AbstractC7485Dh1.m1838w(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
