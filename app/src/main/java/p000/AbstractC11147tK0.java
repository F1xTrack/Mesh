package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import ru.mes.dnevnik.R;

/* renamed from: tK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11147tK0 {

    /* renamed from: a */
    public static final ArrayList f42994a = new ArrayList();

    /* renamed from: b */
    public static final HashMap f42995b = new HashMap();

    /* renamed from: a */
    public static View m24875a(View view, String str) {
        Object tag = view.getTag(R.id.view_tag_native_id);
        String str2 = tag instanceof String ? (String) tag : null;
        if (str2 != null && str2.equals(str)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View viewM24875a = m24875a(viewGroup.getChildAt(i), str);
                if (viewM24875a != null) {
                    return viewM24875a;
                }
            }
        }
        return null;
    }
}
