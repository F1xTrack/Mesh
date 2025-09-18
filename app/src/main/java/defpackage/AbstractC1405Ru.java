package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Ru, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1405Ru {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean a(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !AbstractC1327Qu.y(resources.getDrawable(i, null));
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
