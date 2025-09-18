package defpackage;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import ru.mes.dnevnik.R;

/* renamed from: Jc1 */
/* loaded from: classes.dex */
public abstract class AbstractC0730Jc1 {
    public static final C6299oc a = new C6299oc();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static void a(ViewGroup viewGroup, AbstractC0418Fc1 abstractC0418Fc1) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC0418Fc1 == null) {
            abstractC0418Fc1 = a;
        }
        AbstractC0418Fc1 abstractC0418Fc1Clone = abstractC0418Fc1.clone();
        ArrayList arrayList2 = (ArrayList) b().getOrDefault(viewGroup, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0418Fc1) it.next()).y(viewGroup);
            }
        }
        abstractC0418Fc1Clone.j(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC0652Ic1 viewTreeObserverOnPreDrawListenerC0652Ic1 = new ViewTreeObserverOnPreDrawListenerC0652Ic1();
        viewTreeObserverOnPreDrawListenerC0652Ic1.a = abstractC0418Fc1Clone;
        viewTreeObserverOnPreDrawListenerC0652Ic1.b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0652Ic1);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0652Ic1);
    }

    public static C7925x8 b() {
        C7925x8 c7925x8;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c7925x8 = (C7925x8) weakReference.get()) != null) {
            return c7925x8;
        }
        C7925x8 c7925x82 = new C7925x8();
        threadLocal.set(new WeakReference(c7925x82));
        return c7925x82;
    }
}
