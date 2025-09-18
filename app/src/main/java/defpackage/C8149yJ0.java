package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: yJ0 */
/* loaded from: classes.dex */
public class C8149yJ0 extends AbstractC5884mR {
    public static int v = 1056964608;
    public static final HashMap w;
    public final View q;
    public final C7579vJ0 r;
    public final HandlerC7197tJ0 s;
    public final HashMap t;
    public View u;

    static {
        HashMap map = new HashMap();
        w = map;
        map.put("activate", Integer.valueOf(L1.g.a()));
        map.put("longpress", Integer.valueOf(L1.h.a()));
        map.put("increment", Integer.valueOf(L1.i.a()));
        map.put("decrement", Integer.valueOf(L1.j.a()));
        map.put("expand", Integer.valueOf(L1.k.a()));
        map.put("collapse", Integer.valueOf(L1.l.a()));
    }

    public C8149yJ0(int i, View view, boolean z) {
        super(view);
        this.q = view;
        this.t = new HashMap();
        this.s = new HandlerC7197tJ0();
        view.setFocusable(z);
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        view.setImportantForAccessibility(i);
        this.r = (C7579vJ0) view.getTag(R.id.accessibility_links);
    }

    public static void A(Q1 q1, EnumC7769wJ0 enumC7769wJ0, Context context) {
        q1.k(EnumC7769wJ0.c(enumC7769wJ0));
        if (enumC7769wJ0.equals(EnumC7769wJ0.d)) {
            q1.n(context.getString(R.string.link_description));
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.f)) {
            q1.n(context.getString(R.string.image_description));
            return;
        }
        boolean zEquals = enumC7769wJ0.equals(EnumC7769wJ0.g);
        AccessibilityNodeInfo accessibilityNodeInfo = q1.a;
        if (zEquals) {
            q1.n(context.getString(R.string.imagebutton_description));
            accessibilityNodeInfo.setClickable(true);
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.b)) {
            accessibilityNodeInfo.setClickable(true);
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.c)) {
            accessibilityNodeInfo.setClickable(true);
            accessibilityNodeInfo.setCheckable(true);
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.i)) {
            q1.n(context.getString(R.string.summary_description));
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.j)) {
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityNodeInfo.setHeading(true);
                return;
            } else {
                q1.i(2, true);
                return;
            }
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.k)) {
            q1.n(context.getString(R.string.alert_description));
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.m)) {
            q1.n(context.getString(R.string.combobox_description));
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.n)) {
            q1.n(context.getString(R.string.menu_description));
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.o)) {
            q1.n(context.getString(R.string.menubar_description));
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.p)) {
            q1.n(context.getString(R.string.menuitem_description));
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.q)) {
            q1.n(context.getString(R.string.progressbar_description));
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.s)) {
            q1.n(context.getString(R.string.radiogroup_description));
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.t)) {
            q1.n(context.getString(R.string.scrollbar_description));
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.u)) {
            q1.n(context.getString(R.string.spinbutton_description));
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.w)) {
            q1.n(context.getString(R.string.rn_tab_description));
            return;
        }
        if (enumC7769wJ0.equals(EnumC7769wJ0.x)) {
            q1.n(context.getString(R.string.tablist_description));
        } else if (enumC7769wJ0.equals(EnumC7769wJ0.y)) {
            q1.n(context.getString(R.string.timer_description));
        } else if (enumC7769wJ0.equals(EnumC7769wJ0.B)) {
            q1.n(context.getString(R.string.toolbar_description));
        }
    }

    public static CharSequence x(Q1 q1, View view) {
        Q1 q12;
        if (q1 != null) {
            q12 = new Q1(AccessibilityNodeInfo.obtain(q1.a));
        } else if (view == null) {
            q12 = null;
        } else {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            q12 = new Q1(accessibilityNodeInfoObtain);
            try {
                WeakHashMap weakHashMap = AbstractC6897rk1.a;
                view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            } catch (NullPointerException unused) {
            }
        }
        if (q12 == null) {
            return null;
        }
        CharSequence contentDescription = q12.a.getContentDescription();
        CharSequence charSequenceH = q12.h();
        boolean zIsEmpty = TextUtils.isEmpty(charSequenceH);
        boolean z = view instanceof EditText;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(contentDescription) && (!z || zIsEmpty)) {
            sb.append(contentDescription);
            return sb;
        }
        if (!zIsEmpty) {
            sb.append(charSequenceH);
            return sb;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain();
            Q1 q13 = new Q1(accessibilityNodeInfoObtain2);
            WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
            childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain2);
            if (z(q13, childAt) && !y(q13, childAt)) {
                CharSequence charSequenceX = x(null, childAt);
                if (!TextUtils.isEmpty(charSequenceX)) {
                    sb2.append(((Object) charSequenceX) + ", ");
                }
            }
        }
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 2, length);
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean y(defpackage.Q1 r4, android.view.View r5) {
        /*
            android.view.accessibility.AccessibilityNodeInfo r5 = r4.a
            boolean r0 = r5.isVisibleToUser()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            r3 = 1
            if (r0 < r2) goto L16
            boolean r0 = defpackage.H1.w(r5)
            goto L1a
        L16:
            boolean r0 = r4.f(r3)
        L1a:
            if (r0 != 0) goto L5b
            boolean r0 = r5.isClickable()
            if (r0 != 0) goto L58
            boolean r0 = r5.isLongClickable()
            if (r0 != 0) goto L58
            boolean r5 = r5.isFocusable()
            if (r5 == 0) goto L2f
            goto L58
        L2f:
            java.util.List r4 = r4.d()
            r5 = 16
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L58
            r5 = 32
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L58
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L56
            goto L58
        L56:
            r4 = r1
            goto L59
        L58:
            r4 = r3
        L59:
            if (r4 == 0) goto L5c
        L5b:
            r1 = r3
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8149yJ0.y(Q1, android.view.View):boolean");
    }

    public static boolean z(Q1 q1, View view) {
        WeakHashMap weakHashMap = AbstractC6897rk1.a;
        int importantForAccessibility = view.getImportantForAccessibility();
        if (importantForAccessibility != 4) {
            AccessibilityNodeInfo accessibilityNodeInfo = q1.a;
            if (importantForAccessibility != 2 || accessibilityNodeInfo.getChildCount() > 0) {
                AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
                if ((collectionInfo != null ? new C0396Ev0(7, collectionInfo) : null) == null) {
                    if (!TextUtils.isEmpty(q1.h()) || !TextUtils.isEmpty(accessibilityNodeInfo.getContentDescription())) {
                        return true;
                    }
                    if (!TextUtils.isEmpty(Build.VERSION.SDK_INT >= 26 ? accessibilityNodeInfo.getHintText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY"))) {
                        return true;
                    }
                }
                if (!TextUtils.isEmpty(Build.VERSION.SDK_INT >= 30 ? M1.b(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY")) || accessibilityNodeInfo.isCheckable()) {
                    return true;
                }
                AccessibilityNodeInfo.RangeInfo rangeInfo = accessibilityNodeInfo.getRangeInfo();
                C1304Qm0 c1304Qm0 = rangeInfo != null ? new C1304Qm0(1, rangeInfo) : null;
                if (c1304Qm0 != null) {
                    AccessibilityNodeInfo.RangeInfo rangeInfo2 = (AccessibilityNodeInfo.RangeInfo) c1304Qm0.b;
                    float max = rangeInfo2.getMax();
                    float min = rangeInfo2.getMin();
                    float current = rangeInfo2.getCurrent();
                    if (max - min > 0.0f && current >= min && current <= max) {
                        return true;
                    }
                }
                if (accessibilityNodeInfo.isCheckable()) {
                    return true;
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt != null) {
                            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                            Q1 q12 = new Q1(accessibilityNodeInfoObtain);
                            WeakHashMap weakHashMap2 = AbstractC6897rk1.a;
                            childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                            if (accessibilityNodeInfoObtain.isVisibleToUser() && !y(q12, childAt) && z(q12, childAt)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC5884mR, defpackage.A1
    public final QQ0 b(View view) {
        if (this.r != null) {
            return super.b(view);
        }
        return null;
    }

    @Override // defpackage.A1
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int iAsInt = dynamic.asInt();
                    int iAsInt2 = dynamic2.asInt();
                    int iAsInt3 = dynamic3.asInt();
                    if (iAsInt3 <= iAsInt || iAsInt2 < iAsInt || iAsInt3 < iAsInt2) {
                        return;
                    }
                    accessibilityEvent.setItemCount(iAsInt3 - iAsInt);
                    accessibilityEvent.setCurrentItemIndex(iAsInt2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x01e0  */
    @Override // defpackage.AbstractC5884mR, defpackage.A1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.Q1 r17, android.view.View r18) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8149yJ0.d(Q1, android.view.View):void");
    }

    @Override // defpackage.A1
    public boolean g(View view, int i, Bundle bundle) {
        if (i == 524288) {
            view.setTag(R.id.accessibility_state_expanded, Boolean.FALSE);
        }
        if (i == 262144) {
            view.setTag(R.id.accessibility_state_expanded, Boolean.TRUE);
        }
        HashMap map = this.t;
        if (!map.containsKey(Integer.valueOf(i))) {
            return super.g(view, i, bundle);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("actionName", (String) map.get(Integer.valueOf(i)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveReactInstance()) {
            int id = view.getId();
            int iD = OZ1.d(reactContext);
            UIManager uIManagerF = OZ1.f(reactContext, R02.b(id), true);
            if (uIManagerF != null) {
                ((InterfaceC7405uP) uIManagerF.getEventDispatcher()).g(new C3622ef(iD, id, writableMapCreateMap));
            }
        } else {
            ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        EnumC7769wJ0 enumC7769wJ0 = (EnumC7769wJ0) view.getTag(R.id.accessibility_role);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (enumC7769wJ0 != EnumC7769wJ0.h || (i != L1.i.a() && i != L1.j.a())) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            HandlerC7197tJ0 handlerC7197tJ0 = this.s;
            if (handlerC7197tJ0.hasMessages(1, view)) {
                handlerC7197tJ0.removeMessages(1, view);
            }
            handlerC7197tJ0.sendMessageDelayed(handlerC7197tJ0.obtainMessage(1, view), 200L);
        }
        return super.g(view, i, bundle);
    }

    @Override // defpackage.AbstractC5884mR
    public final int m(float f, float f2) {
        Layout layout;
        C7388uJ0 c7388uJ0;
        C7579vJ0 c7579vJ0 = this.r;
        if (c7579vJ0 == null) {
            return Integer.MIN_VALUE;
        }
        ArrayList arrayList = c7579vJ0.a;
        if (arrayList.size() == 0) {
            return Integer.MIN_VALUE;
        }
        View view = this.q;
        if (!(view instanceof TextView)) {
            return Integer.MIN_VALUE;
        }
        TextView textView = (TextView) view;
        if (!(textView.getText() instanceof Spanned) || (layout = textView.getLayout()) == null) {
            return Integer.MIN_VALUE;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((f2 - textView.getTotalPaddingTop()) + textView.getScrollY())), (f - textView.getTotalPaddingLeft()) + textView.getScrollX());
        ClickableSpan clickableSpan = (ClickableSpan) w(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpan == null) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) textView.getText();
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                c7388uJ0 = null;
                break;
            }
            c7388uJ0 = (C7388uJ0) it.next();
            if (c7388uJ0.b == spanStart && c7388uJ0.c == spanEnd) {
                break;
            }
        }
        if (c7388uJ0 != null) {
            return c7388uJ0.d;
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.AbstractC5884mR
    public final void n(ArrayList arrayList) {
        C7579vJ0 c7579vJ0 = this.r;
        if (c7579vJ0 == null) {
            return;
        }
        for (int i = 0; i < c7579vJ0.a.size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.AbstractC5884mR
    public final boolean q(int i, int i2) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011e  */
    @Override // defpackage.AbstractC5884mR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(int r18, defpackage.Q1 r19) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8149yJ0.s(int, Q1):void");
    }

    public final Object w(int i, int i2, Class cls) {
        View view = this.q;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        if (!(textView.getText() instanceof Spanned)) {
            return null;
        }
        Object[] spans = ((Spanned) textView.getText()).getSpans(i, i2, cls);
        if (spans.length > 0) {
            return spans[0];
        }
        return null;
    }
}
