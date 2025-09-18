package p000;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: L1 */
/* loaded from: classes.dex */
public final class C0695L1 {

    /* renamed from: e */
    public static final C0695L1 f6452e = new C0695L1(1, (String) null);

    /* renamed from: f */
    public static final C0695L1 f6453f = new C0695L1(2, (String) null);

    /* renamed from: g */
    public static final C0695L1 f6454g;

    /* renamed from: h */
    public static final C0695L1 f6455h;

    /* renamed from: i */
    public static final C0695L1 f6456i;

    /* renamed from: j */
    public static final C0695L1 f6457j;

    /* renamed from: k */
    public static final C0695L1 f6458k;

    /* renamed from: l */
    public static final C0695L1 f6459l;

    /* renamed from: m */
    public static final C0695L1 f6460m;

    /* renamed from: n */
    public static final C0695L1 f6461n;

    /* renamed from: o */
    public static final C0695L1 f6462o;

    /* renamed from: a */
    public final Object f6463a;

    /* renamed from: b */
    public final int f6464b;

    /* renamed from: c */
    public final Class f6465c;

    /* renamed from: d */
    public final InterfaceC1639a2 f6466d;

    static {
        new C0695L1(4, (String) null);
        new C0695L1(8, (String) null);
        f6454g = new C0695L1(16, (String) null);
        f6455h = new C0695L1(32, (String) null);
        new C0695L1(64, (String) null);
        new C0695L1(128, (String) null);
        new C0695L1(256, AbstractC1197T1.class);
        new C0695L1(512, AbstractC1197T1.class);
        new C0695L1(1024, AbstractC1260U1.class);
        new C0695L1(2048, AbstractC1260U1.class);
        f6456i = new C0695L1(4096, (String) null);
        f6457j = new C0695L1(8192, (String) null);
        new C0695L1(16384, (String) null);
        new C0695L1(32768, (String) null);
        new C0695L1(65536, (String) null);
        new C0695L1(131072, AbstractC1512Y1.class);
        f6458k = new C0695L1(262144, (String) null);
        f6459l = new C0695L1(524288, (String) null);
        f6460m = new C0695L1(1048576, (String) null);
        new C0695L1(2097152, AbstractC1575Z1.class);
        int i = Build.VERSION.SDK_INT;
        new C0695L1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C0695L1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC1386W1.class);
        f6461n = new C0695L1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new C0695L1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f6462o = new C0695L1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new C0695L1(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new C0695L1(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C0695L1(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C0695L1(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C0695L1(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C0695L1(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C0695L1(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, AbstractC1449X1.class);
        new C0695L1(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AbstractC1323V1.class);
        new C0695L1(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C0695L1(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C0695L1(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C0695L1(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C0695L1(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C0695L1(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C0695L1(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C0695L1(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C0695L1(i >= 34 ? AbstractC0883O1.m5928a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C0695L1(int i, String str) {
        this(null, i, str, null, null);
    }

    /* renamed from: a */
    public final int m4832a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f6463a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0695L1)) {
            return false;
        }
        Object obj2 = ((C0695L1) obj).f6463a;
        Object obj3 = this.f6463a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f6463a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM6529e = C1009Q1.m6529e(this.f6464b);
        if (strM6529e.equals("ACTION_UNKNOWN")) {
            Object obj = this.f6463a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM6529e = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM6529e);
        return sb.toString();
    }

    public C0695L1(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C0695L1(Object obj, int i, String str, InterfaceC1639a2 interfaceC1639a2, Class cls) {
        this.f6464b = i;
        this.f6466d = interfaceC1639a2;
        if (obj == null) {
            this.f6463a = new AccessibilityNodeInfo.AccessibilityAction(i, str);
        } else {
            this.f6463a = obj;
        }
        this.f6465c = cls;
    }
}
