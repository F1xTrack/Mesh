package defpackage;

import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: qL1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6632qL1 {
    public static final String[] a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] b = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    public static final AbstractActivityC0629Hv a(Context context) {
        O90.f(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof AbstractActivityC0629Hv) {
                return (AbstractActivityC0629Hv) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            O90.e(context, "getBaseContext(...)");
        }
        throw new IllegalStateException("Picture in picture should be called in the context of an Activity");
    }
}
