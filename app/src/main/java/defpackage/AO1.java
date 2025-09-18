package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R;

/* loaded from: classes.dex */
public abstract class AO1 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
