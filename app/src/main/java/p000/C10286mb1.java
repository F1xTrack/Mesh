package p000;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* renamed from: mb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10286mb1 {

    /* renamed from: d */
    public static WeakReference f37784d;

    /* renamed from: a */
    public final SharedPreferences f37785a;

    /* renamed from: b */
    public C6937uF f37786b;

    /* renamed from: c */
    public final ScheduledThreadPoolExecutor f37787c;

    public C10286mb1(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f37787c = scheduledThreadPoolExecutor;
        this.f37785a = sharedPreferences;
    }

    /* renamed from: a */
    public final synchronized C10158lb1 m22903a() {
        C10158lb1 c10158lb1;
        String strM25131B = this.f37786b.m25131B();
        Pattern pattern = C10158lb1.f37180d;
        c10158lb1 = null;
        if (!TextUtils.isEmpty(strM25131B)) {
            String[] strArrSplit = strM25131B.split("!", -1);
            if (strArrSplit.length == 2) {
                c10158lb1 = new C10158lb1(strArrSplit[0], strArrSplit[1]);
            }
        }
        return c10158lb1;
    }

    /* renamed from: b */
    public final synchronized void m22904b() {
        this.f37786b = C6937uF.m25129w(this.f37785a, this.f37787c);
    }

    /* renamed from: c */
    public final synchronized void m22905c(C10158lb1 c10158lb1) {
        this.f37786b.m25133D(c10158lb1.f37183c);
    }
}
