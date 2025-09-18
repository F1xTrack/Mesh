package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* renamed from: mb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5916mb1 {
    public static WeakReference d;
    public final SharedPreferences a;
    public C7375uF b;
    public final ScheduledThreadPoolExecutor c;

    public C5916mb1(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.c = scheduledThreadPoolExecutor;
        this.a = sharedPreferences;
    }

    public final synchronized C5725lb1 a() {
        C5725lb1 c5725lb1;
        String strB = this.b.B();
        Pattern pattern = C5725lb1.d;
        c5725lb1 = null;
        if (!TextUtils.isEmpty(strB)) {
            String[] strArrSplit = strB.split("!", -1);
            if (strArrSplit.length == 2) {
                c5725lb1 = new C5725lb1(strArrSplit[0], strArrSplit[1]);
            }
        }
        return c5725lb1;
    }

    public final synchronized void b() {
        this.b = C7375uF.w(this.a, this.c);
    }

    public final synchronized void c(C5725lb1 c5725lb1) {
        this.b.D(c5725lb1.c);
    }
}
