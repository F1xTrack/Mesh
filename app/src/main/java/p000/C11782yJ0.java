package p000;

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
public class C11782yJ0 extends AbstractC6426mR {

    /* renamed from: v */
    public static int f46182v = 1056964608;

    /* renamed from: w */
    public static final HashMap f46183w;

    /* renamed from: q */
    public final View f46184q;

    /* renamed from: r */
    public final C11401vJ0 f46185r;

    /* renamed from: s */
    public final HandlerC11145tJ0 f46186s;

    /* renamed from: t */
    public final HashMap f46187t;

    /* renamed from: u */
    public View f46188u;

    static {
        HashMap map = new HashMap();
        f46183w = map;
        map.put("activate", Integer.valueOf(C0695L1.f6454g.m4832a()));
        map.put("longpress", Integer.valueOf(C0695L1.f6455h.m4832a()));
        map.put("increment", Integer.valueOf(C0695L1.f6456i.m4832a()));
        map.put("decrement", Integer.valueOf(C0695L1.f6457j.m4832a()));
        map.put("expand", Integer.valueOf(C0695L1.f6458k.m4832a()));
        map.put("collapse", Integer.valueOf(C0695L1.f6459l.m4832a()));
    }

    public C11782yJ0(int i, View view, boolean z) {
        super(view);
        this.f46184q = view;
        this.f46187t = new HashMap();
        this.f46186s = new HandlerC11145tJ0();
        view.setFocusable(z);
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        view.setImportantForAccessibility(i);
        this.f46185r = (C11401vJ0) view.getTag(R.id.accessibility_links);
    }

    /* renamed from: A */
    public static void m26119A(C1009Q1 c1009q1, EnumC11528wJ0 enumC11528wJ0, Context context) {
        c1009q1.m6539k(EnumC11528wJ0.m25595c(enumC11528wJ0));
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44783d)) {
            c1009q1.m6542n(context.getString(R.string.link_description));
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44785f)) {
            c1009q1.m6542n(context.getString(R.string.image_description));
            return;
        }
        boolean zEquals = enumC11528wJ0.equals(EnumC11528wJ0.f44786g);
        AccessibilityNodeInfo accessibilityNodeInfo = c1009q1.f9401a;
        if (zEquals) {
            c1009q1.m6542n(context.getString(R.string.imagebutton_description));
            accessibilityNodeInfo.setClickable(true);
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44781b)) {
            accessibilityNodeInfo.setClickable(true);
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44782c)) {
            accessibilityNodeInfo.setClickable(true);
            accessibilityNodeInfo.setCheckable(true);
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44788i)) {
            c1009q1.m6542n(context.getString(R.string.summary_description));
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44789j)) {
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityNodeInfo.setHeading(true);
                return;
            } else {
                c1009q1.m6537i(2, true);
                return;
            }
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44790k)) {
            c1009q1.m6542n(context.getString(R.string.alert_description));
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44792m)) {
            c1009q1.m6542n(context.getString(R.string.combobox_description));
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44793n)) {
            c1009q1.m6542n(context.getString(R.string.menu_description));
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44794o)) {
            c1009q1.m6542n(context.getString(R.string.menubar_description));
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44795p)) {
            c1009q1.m6542n(context.getString(R.string.menuitem_description));
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44796q)) {
            c1009q1.m6542n(context.getString(R.string.progressbar_description));
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44798s)) {
            c1009q1.m6542n(context.getString(R.string.radiogroup_description));
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44799t)) {
            c1009q1.m6542n(context.getString(R.string.scrollbar_description));
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44800u)) {
            c1009q1.m6542n(context.getString(R.string.spinbutton_description));
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44802w)) {
            c1009q1.m6542n(context.getString(R.string.rn_tab_description));
            return;
        }
        if (enumC11528wJ0.equals(EnumC11528wJ0.f44803x)) {
            c1009q1.m6542n(context.getString(R.string.tablist_description));
        } else if (enumC11528wJ0.equals(EnumC11528wJ0.f44804y)) {
            c1009q1.m6542n(context.getString(R.string.timer_description));
        } else if (enumC11528wJ0.equals(EnumC11528wJ0.f44778B)) {
            c1009q1.m6542n(context.getString(R.string.toolbar_description));
        }
    }

    /* renamed from: x */
    public static CharSequence m26120x(C1009Q1 c1009q1, View view) {
        C1009Q1 c1009q12;
        if (c1009q1 != null) {
            c1009q12 = new C1009Q1(AccessibilityNodeInfo.obtain(c1009q1.f9401a));
        } else if (view == null) {
            c1009q12 = null;
        } else {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
            c1009q12 = new C1009Q1(accessibilityNodeInfoObtain);
            try {
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            } catch (NullPointerException unused) {
            }
        }
        if (c1009q12 == null) {
            return null;
        }
        CharSequence contentDescription = c1009q12.f9401a.getContentDescription();
        CharSequence charSequenceM6536h = c1009q12.m6536h();
        boolean zIsEmpty = TextUtils.isEmpty(charSequenceM6536h);
        boolean z = view instanceof EditText;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(contentDescription) && (!z || zIsEmpty)) {
            sb.append(contentDescription);
            return sb;
        }
        if (!zIsEmpty) {
            sb.append(charSequenceM6536h);
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
            C1009Q1 c1009q13 = new C1009Q1(accessibilityNodeInfoObtain2);
            WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
            childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain2);
            if (m26122z(c1009q13, childAt) && !m26121y(c1009q13, childAt)) {
                CharSequence charSequenceM26120x = m26120x(null, childAt);
                if (!TextUtils.isEmpty(charSequenceM26120x)) {
                    sb2.append(((Object) charSequenceM26120x) + ", ");
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
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m26121y(p000.C1009Q1 r4, android.view.View r5) {
        /*
            android.view.accessibility.AccessibilityNodeInfo r5 = r4.f9401a
            boolean r0 = r5.isVisibleToUser()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            r3 = 1
            if (r0 < r2) goto L16
            boolean r0 = p000.AbstractC0443H1.m3236w(r5)
            goto L1a
        L16:
            boolean r0 = r4.m6534f(r3)
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
            java.util.List r4 = r4.m6533d()
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C11782yJ0.m26121y(Q1, android.view.View):boolean");
    }

    /* renamed from: z */
    public static boolean m26122z(C1009Q1 c1009q1, View view) {
        WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
        int importantForAccessibility = view.getImportantForAccessibility();
        if (importantForAccessibility != 4) {
            AccessibilityNodeInfo accessibilityNodeInfo = c1009q1.f9401a;
            if (importantForAccessibility != 2 || accessibilityNodeInfo.getChildCount() > 0) {
                AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
                if ((collectionInfo != null ? new C7564Ev0(7, collectionInfo) : null) == null) {
                    if (!TextUtils.isEmpty(c1009q1.m6536h()) || !TextUtils.isEmpty(accessibilityNodeInfo.getContentDescription())) {
                        return true;
                    }
                    if (!TextUtils.isEmpty(Build.VERSION.SDK_INT >= 26 ? accessibilityNodeInfo.getHintText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY"))) {
                        return true;
                    }
                }
                if (!TextUtils.isEmpty(Build.VERSION.SDK_INT >= 30 ? AbstractC0757M1.m5180b(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY")) || accessibilityNodeInfo.isCheckable()) {
                    return true;
                }
                AccessibilityNodeInfo.RangeInfo rangeInfo = accessibilityNodeInfo.getRangeInfo();
                C8170Qm0 c8170Qm0 = rangeInfo != null ? new C8170Qm0(1, rangeInfo) : null;
                if (c8170Qm0 != null) {
                    AccessibilityNodeInfo.RangeInfo rangeInfo2 = (AccessibilityNodeInfo.RangeInfo) c8170Qm0.f9780b;
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
                            C1009Q1 c1009q12 = new C1009Q1(accessibilityNodeInfoObtain);
                            WeakHashMap weakHashMap2 = AbstractC10944rk1.f41842a;
                            childAt.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                            if (accessibilityNodeInfoObtain.isVisibleToUser() && !m26121y(c1009q12, childAt) && m26122z(c1009q12, childAt)) {
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

    @Override // p000.AbstractC6426mR, p000.C0002A1
    /* renamed from: b */
    public final QQ0 mo9b(View view) {
        if (this.f46185r != null) {
            return super.mo9b(view);
        }
        return null;
    }

    @Override // p000.C0002A1
    /* renamed from: c */
    public final void mo10c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo10c(view, accessibilityEvent);
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
    @Override // p000.AbstractC6426mR, p000.C0002A1
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo11d(p000.C1009Q1 r17, android.view.View r18) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11782yJ0.mo11d(Q1, android.view.View):void");
    }

    @Override // p000.C0002A1
    /* renamed from: g */
    public boolean mo14g(View view, int i, Bundle bundle) {
        if (i == 524288) {
            view.setTag(R.id.accessibility_state_expanded, Boolean.FALSE);
        }
        if (i == 262144) {
            view.setTag(R.id.accessibility_state_expanded, Boolean.TRUE);
        }
        HashMap map = this.f46187t;
        if (!map.containsKey(Integer.valueOf(i))) {
            return super.mo14g(view, i, bundle);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("actionName", (String) map.get(Integer.valueOf(i)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveReactInstance()) {
            int id = view.getId();
            int iM6093d = OZ1.m6093d(reactContext);
            UIManager uIManagerM6095f = OZ1.m6095f(reactContext, R02.m6874b(id), true);
            if (uIManagerM6095f != null) {
                ((InterfaceC6947uP) uIManagerM6095f.getEventDispatcher()).mo11046g(new C4004ef(iM6093d, id, writableMapCreateMap));
            }
        } else {
            ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        EnumC11528wJ0 enumC11528wJ0 = (EnumC11528wJ0) view.getTag(R.id.accessibility_role);
        ReadableMap readableMap = (ReadableMap) view.getTag(R.id.accessibility_value);
        if (enumC11528wJ0 != EnumC11528wJ0.f44787h || (i != C0695L1.f6456i.m4832a() && i != C0695L1.f6457j.m4832a())) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            HandlerC11145tJ0 handlerC11145tJ0 = this.f46186s;
            if (handlerC11145tJ0.hasMessages(1, view)) {
                handlerC11145tJ0.removeMessages(1, view);
            }
            handlerC11145tJ0.sendMessageDelayed(handlerC11145tJ0.obtainMessage(1, view), 200L);
        }
        return super.mo14g(view, i, bundle);
    }

    @Override // p000.AbstractC6426mR
    /* renamed from: m */
    public final int mo5118m(float f, float f2) {
        Layout layout;
        C11273uJ0 c11273uJ0;
        C11401vJ0 c11401vJ0 = this.f46185r;
        if (c11401vJ0 == null) {
            return Integer.MIN_VALUE;
        }
        ArrayList arrayList = c11401vJ0.f44327a;
        if (arrayList.size() == 0) {
            return Integer.MIN_VALUE;
        }
        View view = this.f46184q;
        if (!(view instanceof TextView)) {
            return Integer.MIN_VALUE;
        }
        TextView textView = (TextView) view;
        if (!(textView.getText() instanceof Spanned) || (layout = textView.getLayout()) == null) {
            return Integer.MIN_VALUE;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical((int) ((f2 - textView.getTotalPaddingTop()) + textView.getScrollY())), (f - textView.getTotalPaddingLeft()) + textView.getScrollX());
        ClickableSpan clickableSpan = (ClickableSpan) m26123w(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpan == null) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) textView.getText();
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                c11273uJ0 = null;
                break;
            }
            c11273uJ0 = (C11273uJ0) it.next();
            if (c11273uJ0.f43646b == spanStart && c11273uJ0.f43647c == spanEnd) {
                break;
            }
        }
        if (c11273uJ0 != null) {
            return c11273uJ0.f43648d;
        }
        return Integer.MIN_VALUE;
    }

    @Override // p000.AbstractC6426mR
    /* renamed from: n */
    public final void mo5119n(ArrayList arrayList) {
        C11401vJ0 c11401vJ0 = this.f46185r;
        if (c11401vJ0 == null) {
            return;
        }
        for (int i = 0; i < c11401vJ0.f44327a.size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // p000.AbstractC6426mR
    /* renamed from: q */
    public final boolean mo5120q(int i, int i2) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011e  */
    @Override // p000.AbstractC6426mR
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo5122s(int r18, p000.C1009Q1 r19) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C11782yJ0.mo5122s(int, Q1):void");
    }

    /* renamed from: w */
    public final Object m26123w(int i, int i2, Class cls) {
        View view = this.f46184q;
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
