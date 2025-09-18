package p000;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: qL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10766qL1 {

    /* renamed from: a */
    public static final String[] f40794a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* renamed from: b */
    public static final String[] f40795b = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    /* renamed from: a */
    public static final AbstractActivityC0499Hv m23985a(Context context) {
        O90.m5968f(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof AbstractActivityC0499Hv) {
                return (AbstractActivityC0499Hv) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            O90.m5967e(context, "getBaseContext(...)");
        }
        throw new IllegalStateException("Picture in picture should be called in the context of an Activity");
    }
}
