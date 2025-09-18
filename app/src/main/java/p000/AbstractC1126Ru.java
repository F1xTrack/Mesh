package p000;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Ru */
/* loaded from: classes.dex */
public abstract class AbstractC1126Ru {

    /* renamed from: a */
    public static final AtomicInteger f10481a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: a */
    public static boolean m7126a(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !AbstractC1064Qu.m6828y(resources.getDrawable(i, null));
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }
}
