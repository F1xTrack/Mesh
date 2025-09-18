package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import ru.mes.dnevnik.R;

/* renamed from: tK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7200tK0 {
    public static final ArrayList a = new ArrayList();
    public static final HashMap b = new HashMap();

    public static View a(View view, String str) {
        Object tag = view.getTag(R.id.view_tag_native_id);
        String str2 = tag instanceof String ? (String) tag : null;
        if (str2 != null && str2.equals(str)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View viewA = a(viewGroup.getChildAt(i), str);
                if (viewA != null) {
                    return viewA;
                }
            }
        }
        return null;
    }
}
