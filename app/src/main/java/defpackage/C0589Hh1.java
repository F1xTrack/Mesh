package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: Hh1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589Hh1 {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static C0589Hh1 d;
    public final OL0 a;

    public C0589Hh1(OL0 ol0) {
        this.a = ol0;
    }

    public final boolean a(C5541ke c5541ke) {
        if (TextUtils.isEmpty(c5541ke.c)) {
            return true;
        }
        long j = c5541ke.f + c5541ke.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
