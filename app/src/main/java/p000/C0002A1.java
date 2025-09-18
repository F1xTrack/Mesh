package p000;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import ru.mes.dnevnik.R;

/* renamed from: A1 */
/* loaded from: classes.dex */
public class C0002A1 {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f10c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f11a;

    /* renamed from: b */
    public final C7238z1 f12b;

    public C0002A1() {
        this(f10c);
    }

    /* renamed from: a */
    public boolean mo8a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f11a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public QQ0 mo9b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f11a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new QQ0(accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: c */
    public void mo10c(View view, AccessibilityEvent accessibilityEvent) {
        this.f11a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo11d(C1009Q1 c1009q1, View view) {
        this.f11a.onInitializeAccessibilityNodeInfo(view, c1009q1.f9401a);
    }

    /* renamed from: e */
    public void mo12e(View view, AccessibilityEvent accessibilityEvent) {
        this.f11a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo13f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f11a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: g */
    public boolean mo14g(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= listEmptyList.size()) {
                break;
            }
            C0695L1 c0695l1 = (C0695L1) listEmptyList.get(i2);
            if (c0695l1.m4832a() == i) {
                InterfaceC1639a2 interfaceC1639a2 = c0695l1.f6466d;
                if (interfaceC1639a2 != null) {
                    Class cls = c0695l1.f6465c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception unused) {
                        }
                    }
                    zPerformAccessibilityAction = interfaceC1639a2.mo2839a(view);
                }
            } else {
                i2++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f11a.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
                i4++;
            }
        }
        return z;
    }

    /* renamed from: h */
    public void mo15h(View view, int i) {
        this.f11a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: i */
    public void mo16i(View view, AccessibilityEvent accessibilityEvent) {
        this.f11a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0002A1(View.AccessibilityDelegate accessibilityDelegate) {
        this.f11a = accessibilityDelegate;
        this.f12b = new C7238z1(this);
    }
}
