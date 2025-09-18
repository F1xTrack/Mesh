package p000;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: mR */
/* loaded from: classes.dex */
public abstract class AbstractC6426mR extends C0002A1 {

    /* renamed from: n */
    public static final Rect f37685n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final OL0 f37686o = new OL0(13);

    /* renamed from: p */
    public static final OJ1 f37687p = new OJ1(13);

    /* renamed from: h */
    public final AccessibilityManager f37692h;

    /* renamed from: i */
    public final View f37693i;

    /* renamed from: j */
    public C6363lR f37694j;

    /* renamed from: d */
    public final Rect f37688d = new Rect();

    /* renamed from: e */
    public final Rect f37689e = new Rect();

    /* renamed from: f */
    public final Rect f37690f = new Rect();

    /* renamed from: g */
    public final int[] f37691g = new int[2];

    /* renamed from: k */
    public int f37695k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f37696l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f37697m = Integer.MIN_VALUE;

    public AbstractC6426mR(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f37693i = view;
        this.f37692h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // p000.C0002A1
    /* renamed from: b */
    public QQ0 mo9b(View view) {
        if (this.f37694j == null) {
            this.f37694j = new C6363lR(this);
        }
        return this.f37694j;
    }

    @Override // p000.C0002A1
    /* renamed from: d */
    public void mo11d(C1009Q1 c1009q1, View view) {
        this.f11a.onInitializeAccessibilityNodeInfo(view, c1009q1.f9401a);
        mo5121r(c1009q1);
    }

    /* renamed from: j */
    public final boolean m22819j(int i) {
        if (this.f37696l != i) {
            return false;
        }
        this.f37696l = Integer.MIN_VALUE;
        mo5123t(i, false);
        m22825v(i, 8);
        return true;
    }

    /* renamed from: k */
    public final C1009Q1 m22820k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C1009Q1 c1009q1 = new C1009Q1(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c1009q1.m6539k("android.view.View");
        Rect rect = f37685n;
        c1009q1.m6538j(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        View view = this.f37693i;
        accessibilityNodeInfoObtain.setParent(view);
        mo5122s(i, c1009q1);
        if (c1009q1.m6536h() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f37689e;
        c1009q1.m6535g(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        c1009q1.f9402b = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.f37695k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c1009q1.m6530a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c1009q1.m6530a(64);
        }
        boolean z = this.f37696l == i;
        if (z) {
            c1009q1.m6530a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c1009q1.m6530a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f37691g;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f37688d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c1009q1.m6535g(rect3);
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f37690f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            c1009q1.f9401a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c1009q1;
    }

    /* renamed from: l */
    public final boolean m22821l(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.f37692h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iMo5118m = mo5118m(motionEvent.getX(), motionEvent.getY());
            int i2 = this.f37697m;
            if (i2 != iMo5118m) {
                this.f37697m = iMo5118m;
                m22825v(iMo5118m, 128);
                m22825v(i2, 256);
            }
            return iMo5118m != Integer.MIN_VALUE;
        }
        if (action != 10 || (i = this.f37697m) == Integer.MIN_VALUE) {
            return false;
        }
        if (i != Integer.MIN_VALUE) {
            this.f37697m = Integer.MIN_VALUE;
            m22825v(i, 256);
        }
        return true;
    }

    /* renamed from: m */
    public abstract int mo5118m(float f, float f2);

    /* renamed from: n */
    public abstract void mo5119n(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a7  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m22822o(int r20, android.graphics.Rect r21) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC6426mR.m22822o(int, android.graphics.Rect):boolean");
    }

    /* renamed from: p */
    public final C1009Q1 m22823p(int i) {
        if (i != -1) {
            return m22820k(i);
        }
        View view = this.f37693i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        C1009Q1 c1009q1 = new C1009Q1(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo5119n(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c1009q1.f9401a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return c1009q1;
    }

    /* renamed from: q */
    public abstract boolean mo5120q(int i, int i2);

    /* renamed from: s */
    public abstract void mo5122s(int i, C1009Q1 c1009q1);

    /* renamed from: u */
    public final boolean m22824u(int i) {
        int i2;
        View view = this.f37693i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.f37696l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m22819j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f37696l = i;
        mo5123t(i, true);
        m22825v(i, 8);
        return true;
    }

    /* renamed from: v */
    public final void m22825v(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f37692h.isEnabled() || (parent = (view = this.f37693i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            C1009Q1 c1009q1M22823p = m22823p(i);
            accessibilityEventObtain.getText().add(c1009q1M22823p.m6536h());
            AccessibilityNodeInfo accessibilityNodeInfo = c1009q1M22823p.f9401a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }

    /* renamed from: r */
    public void mo5121r(C1009Q1 c1009q1) {
    }

    /* renamed from: t */
    public void mo5123t(int i, boolean z) {
    }
}
