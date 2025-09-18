package p000;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C1938R;

/* loaded from: classes.dex */
public abstract class AO1 {
    /* renamed from: a */
    public static String m173a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C1938R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }
}
