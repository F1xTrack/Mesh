package defpackage;

import android.media.MediaDrmResetException;

/* loaded from: classes.dex */
public abstract class UL {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrmResetException;
    }
}
