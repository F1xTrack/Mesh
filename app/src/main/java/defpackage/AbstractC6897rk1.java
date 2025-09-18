package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: rk1 */
/* loaded from: classes.dex */
public abstract class AbstractC6897rk1 {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final C2383bk1 e = new C2383bk1();
    public static final ViewTreeObserverOnGlobalLayoutListenerC3449dk1 f = new ViewTreeObserverOnGlobalLayoutListenerC3449dk1();

    public static C6519pl1 a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        C6519pl1 c6519pl1 = (C6519pl1) a.get(view);
        if (c6519pl1 != null) {
            return c6519pl1;
        }
        C6519pl1 c6519pl12 = new C6519pl1(view);
        a.put(view, c6519pl12);
        return c6519pl12;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C6707qk1.d;
        C6707qk1 c6707qk1 = (C6707qk1) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c6707qk1 == null) {
            c6707qk1 = new C6707qk1();
            c6707qk1.a = null;
            c6707qk1.b = null;
            c6707qk1.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c6707qk1);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c6707qk1.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C6707qk1.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c6707qk1.a == null) {
                            c6707qk1.a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C6707qk1.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c6707qk1.a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c6707qk1.a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = c6707qk1.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c6707qk1.b == null) {
                    c6707qk1.b = new SparseArray();
                }
                c6707qk1.b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static A1 c(View view) {
        View.AccessibilityDelegate accessibilityDelegateD = d(view);
        if (accessibilityDelegateD == null) {
            return null;
        }
        return accessibilityDelegateD instanceof C8282z1 ? ((C8282z1) accessibilityDelegateD).a : new A1(accessibilityDelegateD);
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC5752lk1.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC5561kk1.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] g(L6 l6) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC6134nk1.a(l6) : (String[]) l6.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void h(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static C1698Vn1 i(View view, C1698Vn1 c1698Vn1) {
        WindowInsets windowInsetsG = c1698Vn1.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsB = AbstractC3639ek1.b(view, windowInsetsG);
            if (!windowInsetsB.equals(windowInsetsG)) {
                return C1698Vn1.h(view, windowInsetsB);
            }
        }
        return c1698Vn1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C0092Ay j(View view, C0092Ay c0092Ay) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c0092Ay);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC6134nk1.b(view, c0092Ay);
        }
        InterfaceC2039Zx0 interfaceC2039Zx0 = (InterfaceC2039Zx0) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC2233ay0 interfaceC2233ay0 = e;
        if (interfaceC2039Zx0 == null) {
            if (view instanceof InterfaceC2233ay0) {
                interfaceC2233ay0 = (InterfaceC2233ay0) view;
            }
            return interfaceC2233ay0.a(c0092Ay);
        }
        C0092Ay c0092AyA = ((M91) interfaceC2039Zx0).a(view, c0092Ay);
        if (c0092AyA == null) {
            return null;
        }
        if (view instanceof InterfaceC2233ay0) {
            interfaceC2233ay0 = (InterfaceC2233ay0) view;
        }
        return interfaceC2233ay0.a(c0092AyA);
    }

    public static void k(int i, View view) {
        ArrayList arrayListF = f(view);
        for (int i2 = 0; i2 < arrayListF.size(); i2++) {
            if (((L1) arrayListF.get(i2)).a() == i) {
                arrayListF.remove(i2);
                return;
            }
        }
    }

    public static void l(View view, L1 l1, InterfaceC2056a2 interfaceC2056a2) {
        if (interfaceC2056a2 == null) {
            k(l1.a(), view);
            h(0, view);
            return;
        }
        L1 l12 = new L1(null, l1.b, null, interfaceC2056a2, l1.c);
        A1 a1C = c(view);
        if (a1C == null) {
            a1C = new A1();
        }
        n(view, a1C);
        k(l12.a(), view);
        f(view).add(l12);
        h(0, view);
    }

    public static void m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC5752lk1.d(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void n(View view, A1 a1) {
        if (a1 == null && (d(view) instanceof C8282z1)) {
            a1 = new A1();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(a1 == null ? null : a1.b);
    }

    public static void o(View view, CharSequence charSequence) {
        new C2573ck1(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).e(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC3449dk1 viewTreeObserverOnGlobalLayoutListenerC3449dk1 = f;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC3449dk1.a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC3449dk1);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3449dk1);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC3449dk1.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC3449dk1);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3449dk1);
            }
        }
    }

    public static void p(View view, AbstractC0061An1 abstractC0061An1) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(abstractC0061An1 != null ? new C0373En1(abstractC0061An1) : null);
            return;
        }
        PathInterpolator pathInterpolator = C0295Dn1.e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (abstractC0061An1 == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC0217Cn1 = new ViewOnApplyWindowInsetsListenerC0217Cn1(view, abstractC0061An1);
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC0217Cn1);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC0217Cn1);
        }
    }
}
