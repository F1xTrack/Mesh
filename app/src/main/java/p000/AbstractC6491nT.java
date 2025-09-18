package p000;

import android.system.ErrnoException;
import android.system.OsConstants;

/* renamed from: nT */
/* loaded from: classes.dex */
public abstract class AbstractC6491nT {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static boolean m23149b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
