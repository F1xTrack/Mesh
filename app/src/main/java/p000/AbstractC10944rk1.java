package p000;

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
public abstract class AbstractC10944rk1 {

    /* renamed from: a */
    public static WeakHashMap f41842a = null;

    /* renamed from: b */
    public static Field f41843b = null;

    /* renamed from: c */
    public static boolean f41844c = false;

    /* renamed from: d */
    public static final int[] f41845d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e */
    public static final C8891bk1 f41846e = new C8891bk1();

    /* renamed from: f */
    public static final ViewTreeObserverOnGlobalLayoutListenerC9152dk1 f41847f = new ViewTreeObserverOnGlobalLayoutListenerC9152dk1();

    /* renamed from: a */
    public static C10690pl1 m24469a(View view) {
        if (f41842a == null) {
            f41842a = new WeakHashMap();
        }
        C10690pl1 c10690pl1 = (C10690pl1) f41842a.get(view);
        if (c10690pl1 != null) {
            return c10690pl1;
        }
        C10690pl1 c10690pl12 = new C10690pl1(view);
        f41842a.put(view, c10690pl12);
        return c10690pl12;
    }

    /* renamed from: b */
    public static boolean m24470b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C10816qk1.f41123d;
        C10816qk1 c10816qk1 = (C10816qk1) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c10816qk1 == null) {
            c10816qk1 = new C10816qk1();
            c10816qk1.f41124a = null;
            c10816qk1.f41125b = null;
            c10816qk1.f41126c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c10816qk1);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c10816qk1.f41124a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C10816qk1.f41123d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c10816qk1.f41124a == null) {
                            c10816qk1.f41124a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C10816qk1.f41123d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c10816qk1.f41124a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c10816qk1.f41124a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewM24055a = c10816qk1.m24055a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM24055a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c10816qk1.f41125b == null) {
                    c10816qk1.f41125b = new SparseArray();
                }
                c10816qk1.f41125b.put(keyCode, new WeakReference(viewM24055a));
            }
        }
        return viewM24055a != null;
    }

    /* renamed from: c */
    public static C0002A1 m24471c(View view) {
        View.AccessibilityDelegate accessibilityDelegateM24472d = m24472d(view);
        if (accessibilityDelegateM24472d == null) {
            return null;
        }
        return accessibilityDelegateM24472d instanceof C7238z1 ? ((C7238z1) accessibilityDelegateM24472d).f46585a : new C0002A1(accessibilityDelegateM24472d);
    }

    /* renamed from: d */
    public static View.AccessibilityDelegate m24472d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC10176lk1.m22533a(view);
        }
        if (f41844c) {
            return null;
        }
        if (f41843b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f41843b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f41844c = true;
                return null;
            }
        }
        try {
            Object obj = f41843b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f41844c = true;
            return null;
        }
    }

    /* renamed from: e */
    public static CharSequence m24473e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC10048kk1.m22252b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* renamed from: f */
    public static ArrayList m24474f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: g */
    public static String[] m24475g(C0700L6 c0700l6) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC10432nk1.m23212a(c0700l6) : (String[]) c0700l6.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* renamed from: h */
    public static void m24476h(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m24473e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m24473e(view));
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
            accessibilityEventObtain2.getText().add(m24473e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* renamed from: i */
    public static C8433Vn1 m24477i(View view, C8433Vn1 c8433Vn1) {
        WindowInsets windowInsetsM8557g = c8433Vn1.m8557g();
        if (windowInsetsM8557g != null) {
            WindowInsets windowInsetsM18028b = AbstractC9280ek1.m18028b(view, windowInsetsM8557g);
            if (!windowInsetsM18028b.equals(windowInsetsM8557g)) {
                return C8433Vn1.m8551h(view, windowInsetsM18028b);
            }
        }
        return c8433Vn1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public static C0061Ay m24478j(View view, C0061Ay c0061Ay) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c0061Ay);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC10432nk1.m23213b(view, c0061Ay);
        }
        InterfaceC8660Zx0 interfaceC8660Zx0 = (InterfaceC8660Zx0) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC8790ay0 interfaceC8790ay0 = f41846e;
        if (interfaceC8660Zx0 == null) {
            if (view instanceof InterfaceC8790ay0) {
                interfaceC8790ay0 = (InterfaceC8790ay0) view;
            }
            return interfaceC8790ay0.mo4900a(c0061Ay);
        }
        C0061Ay c0061AyM5279a = ((M91) interfaceC8660Zx0).m5279a(view, c0061Ay);
        if (c0061AyM5279a == null) {
            return null;
        }
        if (view instanceof InterfaceC8790ay0) {
            interfaceC8790ay0 = (InterfaceC8790ay0) view;
        }
        return interfaceC8790ay0.mo4900a(c0061AyM5279a);
    }

    /* renamed from: k */
    public static void m24479k(int i, View view) {
        ArrayList arrayListM24474f = m24474f(view);
        for (int i2 = 0; i2 < arrayListM24474f.size(); i2++) {
            if (((C0695L1) arrayListM24474f.get(i2)).m4832a() == i) {
                arrayListM24474f.remove(i2);
                return;
            }
        }
    }

    /* renamed from: l */
    public static void m24480l(View view, C0695L1 c0695l1, InterfaceC1639a2 interfaceC1639a2) {
        if (interfaceC1639a2 == null) {
            m24479k(c0695l1.m4832a(), view);
            m24476h(0, view);
            return;
        }
        C0695L1 c0695l12 = new C0695L1(null, c0695l1.f6464b, null, interfaceC1639a2, c0695l1.f6465c);
        C0002A1 c0002a1M24471c = m24471c(view);
        if (c0002a1M24471c == null) {
            c0002a1M24471c = new C0002A1();
        }
        m24482n(view, c0002a1M24471c);
        m24479k(c0695l12.m4832a(), view);
        m24474f(view).add(c0695l12);
        m24476h(0, view);
    }

    /* renamed from: m */
    public static void m24481m(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC10176lk1.m22536d(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: n */
    public static void m24482n(View view, C0002A1 c0002a1) {
        if (c0002a1 == null && (m24472d(view) instanceof C7238z1)) {
            c0002a1 = new C0002A1();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0002a1 == null ? null : c0002a1.f12b);
    }

    /* renamed from: o */
    public static void m24483o(View view, CharSequence charSequence) {
        new C9019ck1(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m9817e(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC9152dk1 viewTreeObserverOnGlobalLayoutListenerC9152dk1 = f41847f;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC9152dk1.f26235a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC9152dk1);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC9152dk1);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC9152dk1.f26235a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC9152dk1);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC9152dk1);
            }
        }
    }

    /* renamed from: p */
    public static void m24484p(View view, AbstractC7341An1 abstractC7341An1) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(abstractC7341An1 != null ? new C7549En1(abstractC7341An1) : null);
            return;
        }
        PathInterpolator pathInterpolator = C7497Dn1.f2252e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (abstractC7341An1 == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC7445Cn1 = new ViewOnApplyWindowInsetsListenerC7445Cn1(view, abstractC7341An1);
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC7445Cn1);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC7445Cn1);
        }
    }
}
