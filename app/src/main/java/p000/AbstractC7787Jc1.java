package p000;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import ru.mes.dnevnik.R;

/* renamed from: Jc1 */
/* loaded from: classes.dex */
public abstract class AbstractC7787Jc1 {

    /* renamed from: a */
    public static final C6563oc f5644a = new C6563oc();

    /* renamed from: b */
    public static final ThreadLocal f5645b = new ThreadLocal();

    /* renamed from: c */
    public static final ArrayList f5646c = new ArrayList();

    /* renamed from: a */
    public static void m4368a(ViewGroup viewGroup, AbstractC7579Fc1 abstractC7579Fc1) {
        ArrayList arrayList = f5646c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC7579Fc1 == null) {
            abstractC7579Fc1 = f5644a;
        }
        AbstractC7579Fc1 abstractC7579Fc1Clone = abstractC7579Fc1.clone();
        ArrayList arrayList2 = (ArrayList) m4369b().getOrDefault(viewGroup, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC7579Fc1) it.next()).mo2714y(viewGroup);
            }
        }
        abstractC7579Fc1Clone.m2701j(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC7735Ic1 viewTreeObserverOnPreDrawListenerC7735Ic1 = new ViewTreeObserverOnPreDrawListenerC7735Ic1();
        viewTreeObserverOnPreDrawListenerC7735Ic1.f5043a = abstractC7579Fc1Clone;
        viewTreeObserverOnPreDrawListenerC7735Ic1.f5044b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC7735Ic1);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC7735Ic1);
    }

    /* renamed from: b */
    public static C7119x8 m4369b() {
        C7119x8 c7119x8;
        ThreadLocal threadLocal = f5645b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c7119x8 = (C7119x8) weakReference.get()) != null) {
            return c7119x8;
        }
        C7119x8 c7119x82 = new C7119x8();
        threadLocal.set(new WeakReference(c7119x82));
        return c7119x82;
    }
}
