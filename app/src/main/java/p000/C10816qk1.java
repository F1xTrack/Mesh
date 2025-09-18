package p000;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: qk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10816qk1 {

    /* renamed from: d */
    public static final ArrayList f41123d = new ArrayList();

    /* renamed from: a */
    public WeakHashMap f41124a;

    /* renamed from: b */
    public SparseArray f41125b;

    /* renamed from: c */
    public WeakReference f41126c;

    /* renamed from: a */
    public final View m24055a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f41124a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewM24055a = m24055a(viewGroup.getChildAt(childCount));
                    if (viewM24055a != null) {
                        return viewM24055a;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }
}
