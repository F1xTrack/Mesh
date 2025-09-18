package defpackage;

import android.system.ErrnoException;
import android.system.OsConstants;

/* renamed from: nT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6081nT {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
