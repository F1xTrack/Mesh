package com.facebook.react.views.text;

import android.text.Spannable;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC10889rJ0;
import p000.AbstractC10944rk1;
import p000.C11401vJ0;
import p000.C11782yJ0;
import p000.C4187hZ;
import p000.C8844bN0;
import p000.C8972cN0;
import p000.C9105dN0;
import p000.G41;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9233eN0;
import p000.InterfaceC9871jM0;
import p000.J50;
import p000.NJ0;
import p000.NM0;
import p000.S91;
import ru.mes.dnevnik.R;

@InterfaceC9101dL0(name = ReactTextViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactTextViewManager extends ReactTextAnchorViewManager<C9105dN0, C8844bN0> implements J50 {
    public static final String REACT_CLASS = "RCTText";
    private static final String TAG = "ReactTextViewManager";
    private static final short TX_STATE_KEY_ATTRIBUTED_STRING = 0;
    private static final short TX_STATE_KEY_HASH = 2;
    private static final short TX_STATE_KEY_MOST_RECENT_EVENT_COUNT = 3;
    private static final short TX_STATE_KEY_PARAGRAPH_ATTRIBUTES = 1;
    protected InterfaceC9233eN0 mReactTextViewManagerCallback;

    public ReactTextViewManager() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Object getReactTextUpdate(p000.C9105dN0 r12, p000.NM0 r13, p000.InterfaceC8534Xm0 r14) {
        /*
            r11 = this;
            r0 = 0
            Xm0 r1 = r14.mo9115W(r0)
            r2 = 1
            Xm0 r14 = r14.mo9115W(r2)
            android.content.Context r3 = r12.getContext()
            eN0 r4 = r11.mReactTextViewManagerCallback
            android.text.Spannable r6 = p000.A91.m93c(r3, r1, r4)
            r12.setSpanned(r6)
            r3 = 6
            double r3 = r14.getDouble(r3)     // Catch: java.lang.IllegalArgumentException -> L80
            float r3 = (float) r3     // Catch: java.lang.IllegalArgumentException -> L80
            r12.setMinimumFontSize(r3)     // Catch: java.lang.IllegalArgumentException -> L80
            r3 = 2
            java.lang.String r14 = r14.getString(r3)
            if (r14 == 0) goto L37
            java.lang.String r4 = "balanced"
            boolean r4 = r14.equals(r4)
            if (r4 != 0) goto L3b
            java.lang.String r3 = "simple"
            boolean r14 = r14.equals(r3)
            if (r14 != 0) goto L39
        L37:
            r9 = r2
            goto L3c
        L39:
            r9 = r0
            goto L3c
        L3b:
            r9 = r3
        L3c:
            int r14 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r14 >= r3) goto L44
            r14 = r0
            goto L48
        L44:
            int r14 = p000.AbstractC8962cI0.m10642b(r12)
        L48:
            cN0 r3 = new cN0
            int r12 = r12.getGravityHorizontal()
            android.text.Layout$Alignment r1 = p000.A91.m94d(r1, r6)
            android.text.TextDirectionHeuristic r4 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r5 = r6.length()
            boolean r0 = r4.isRtl(r6, r0, r5)
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_NORMAL
            r5 = 3
            r7 = 5
            if (r1 != r4) goto L69
            if (r0 == 0) goto L66
        L64:
            r2 = r7
            goto L67
        L66:
            r2 = r5
        L67:
            r8 = r2
            goto L76
        L69:
            android.text.Layout$Alignment r4 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            if (r1 != r4) goto L70
            if (r0 == 0) goto L64
            goto L66
        L70:
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            if (r1 != r0) goto L75
            goto L67
        L75:
            r8 = r12
        L76:
            int r10 = p000.C9718i91.m18974a(r14, r13)
            r7 = -1
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return r3
        L80:
            r12 = move-exception
            if (r14 == 0) goto L88
            java.lang.String r13 = r14.toString()
            goto L8a
        L88:
            java.lang.String r13 = "<empty>"
        L8a:
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r0] = r13
            java.lang.String r13 = "ReactTextViewManager"
            java.lang.String r0 = "Paragraph Attributes: %s"
            p000.AbstractC3929dS.m17673f(r13, r0, r14)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextViewManager.getReactTextUpdate(dN0, NM0, Xm0):java.lang.Object");
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(AbstractC10889rJ0.m24257d("topTextLayout", AbstractC10889rJ0.m24256c("registrationName", "onTextLayout"), "topInlineViewLayout", AbstractC10889rJ0.m24256c("registrationName", "onInlineViewLayout")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<C8844bN0> getShadowNodeClass() {
        return C8844bN0.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0182  */
    @Override // com.facebook.react.uimanager.ViewManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long measure(android.content.Context r22, p000.InterfaceC8534Xm0 r23, p000.InterfaceC8534Xm0 r24, p000.InterfaceC8534Xm0 r25, float r26, p000.EnumC7813Jp1 r27, float r28, p000.EnumC7813Jp1 r29, float[] r30) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextViewManager.measure(android.content.Context, Xm0, Xm0, Xm0, float, Jp1, float, Jp1, float[]):long");
    }

    @Override // p000.J50
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @InterfaceC9871jM0(name = "overflow")
    public void setOverflow(C9105dN0 c9105dN0, String str) {
        c9105dN0.setOverflow(str);
    }

    public ReactTextViewManager(InterfaceC9233eN0 interfaceC9233eN0) {
        this.mReactTextViewManagerCallback = interfaceC9233eN0;
        setupViewRecycling();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C8844bN0 createShadowNodeInstance() {
        return new C8844bN0(this.mReactTextViewManagerCallback);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C9105dN0 createViewInstance(S91 s91) {
        C9105dN0 c9105dN0 = new C9105dN0(s91, null);
        c9105dN0.m17557i();
        return c9105dN0;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C9105dN0 c9105dN0) {
        super.onAfterUpdateTransaction((ReactTextViewManager) c9105dN0);
        c9105dN0.setEllipsize((c9105dN0.f25997i == Integer.MAX_VALUE || c9105dN0.f25999k) ? null : c9105dN0.f25998j);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public C9105dN0 prepareToRecycleView(S91 s91, C9105dN0 c9105dN0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.prepareToRecycleView(s91, (S91) c9105dN0);
        c9105dN0.m17558k();
        setSelectionColor(c9105dN0, null);
        return c9105dN0;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void setPadding(C9105dN0 c9105dN0, int i, int i2, int i3, int i4) {
        c9105dN0.setPadding(i, i2, i3, i4);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(C9105dN0 c9105dN0, Object obj) {
        C8972cN0 c8972cN0 = (C8972cN0) obj;
        Spannable spannable = c8972cN0.f17454a;
        if (c8972cN0.f17456c) {
            C4187hZ.m18837a(spannable, c9105dN0);
        }
        c9105dN0.setText(c8972cN0);
        NJ0[] nj0Arr = (NJ0[]) spannable.getSpans(0, c8972cN0.f17454a.length(), NJ0.class);
        if (nj0Arr.length > 0) {
            c9105dN0.setTag(R.id.accessibility_links, new C11401vJ0(nj0Arr, spannable));
            AbstractC10944rk1.m24482n(c9105dN0, new C11782yJ0(c9105dN0.getImportantForAccessibility(), c9105dN0, c9105dN0.isFocusable()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(C9105dN0 c9105dN0, NM0 nm0, G41 g41) {
        ReadableMapBuffer stateDataMapBuffer = g41.getStateDataMapBuffer();
        if (stateDataMapBuffer != null) {
            return getReactTextUpdate(c9105dN0, nm0, stateDataMapBuffer);
        }
        return null;
    }

    public C8844bN0 createShadowNodeInstance(InterfaceC9233eN0 interfaceC9233eN0) {
        return new C8844bN0(interfaceC9233eN0);
    }
}
