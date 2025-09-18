package p000;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: Hh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7693Hh1 {

    /* renamed from: b */
    public static final long f4438b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    public static final Pattern f4439c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    public static C7693Hh1 f4440d;

    /* renamed from: a */
    public final OL0 f4441a;

    public C7693Hh1(OL0 ol0) {
        this.f4441a = ol0;
    }

    /* renamed from: a */
    public final boolean m3550a(C6313ke c6313ke) {
        if (TextUtils.isEmpty(c6313ke.f36584c)) {
            return true;
        }
        long j = c6313ke.f36587f + c6313ke.f36586e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f4441a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + f4438b;
    }
}
