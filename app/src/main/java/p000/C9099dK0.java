package p000;

import android.R;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.QwertyKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

/* renamed from: dK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9099dK0 extends C0700L6 {

    /* renamed from: M */
    public static final QwertyKeyListener f25942M = QwertyKeyListener.getInstanceForFullKeyboard();

    /* renamed from: A */
    public boolean f25943A;

    /* renamed from: B */
    public String f25944B;

    /* renamed from: C */
    public int f25945C;

    /* renamed from: D */
    public int f25946D;

    /* renamed from: E */
    public boolean f25947E;

    /* renamed from: F */
    public boolean f25948F;

    /* renamed from: G */
    public boolean f25949G;

    /* renamed from: H */
    public String f25950H;

    /* renamed from: I */
    public final C1356VY f25951I;

    /* renamed from: J */
    public G41 f25952J;

    /* renamed from: K */
    public boolean f25953K;

    /* renamed from: L */
    public InterfaceC6947uP f25954L;

    /* renamed from: g */
    public final InputMethodManager f25955g;

    /* renamed from: h */
    public final String f25956h;

    /* renamed from: i */
    public boolean f25957i;

    /* renamed from: j */
    public final int f25958j;

    /* renamed from: k */
    public final int f25959k;

    /* renamed from: l */
    public int f25960l;

    /* renamed from: m */
    public ArrayList f25961m;

    /* renamed from: n */
    public C8966cK0 f25962n;

    /* renamed from: o */
    public int f25963o;

    /* renamed from: p */
    public boolean f25964p;

    /* renamed from: q */
    public String f25965q;

    /* renamed from: r */
    public boolean f25966r;

    /* renamed from: s */
    public String f25967s;

    /* renamed from: t */
    public UX0 f25968t;

    /* renamed from: u */
    public InterfaceC0439Gy f25969u;

    /* renamed from: v */
    public OW0 f25970v;

    /* renamed from: w */
    public C8838bK0 f25971w;

    /* renamed from: x */
    public boolean f25972x;

    /* renamed from: y */
    public boolean f25973y;

    /* renamed from: z */
    public final C9846j91 f25974z;

    public C9099dK0(S91 s91) {
        super(s91, null, 0);
        this.f25956h = C9099dK0.class.getSimpleName();
        this.f25965q = null;
        this.f25972x = false;
        this.f25973y = false;
        this.f25943A = false;
        this.f25944B = null;
        this.f25945C = -1;
        this.f25946D = -1;
        this.f25947E = false;
        this.f25948F = false;
        this.f25949G = false;
        this.f25950H = null;
        this.f25952J = null;
        this.f25953K = false;
        setFocusableInTouchMode(false);
        this.f25951I = new C1356VY(this);
        Object systemService = s91.getSystemService("input_method");
        UN1.m7999c(systemService);
        this.f25955g = (InputMethodManager) systemService;
        this.f25958j = getGravity() & 8388615;
        this.f25959k = getGravity() & 112;
        this.f25960l = 0;
        this.f25957i = false;
        this.f25966r = false;
        this.f25961m = null;
        this.f25962n = null;
        this.f25963o = getInputType();
        if (this.f25971w == null) {
            this.f25971w = new C8838bK0();
        }
        this.f25970v = null;
        this.f25974z = new C9846j91();
        m17533b();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27) {
            setLayerType(1, null);
        }
        AbstractC10944rk1.m24482n(this, new ZJ0(this, this, isFocusable(), getImportantForAccessibility()));
        ActionModeCallbackC8710aK0 actionModeCallbackC8710aK0 = new ActionModeCallbackC8710aK0(this);
        setCustomSelectionActionModeCallback(actionModeCallbackC8710aK0);
        setCustomInsertionActionModeCallback(actionModeCallbackC8710aK0);
    }

    private C8966cK0 getTextWatcherDelegator() {
        if (this.f25962n == null) {
            this.f25962n = new C8966cK0(this);
        }
        return this.f25962n;
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        if (this.f25961m == null) {
            this.f25961m = new ArrayList();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.f25961m.add(textWatcher);
    }

    /* renamed from: b */
    public final void m17533b() {
        C9846j91 c9846j91 = this.f25974z;
        setTextSize(0, c9846j91.m21976a());
        float fM21977b = c9846j91.m21977b();
        if (Float.isNaN(fM21977b)) {
            return;
        }
        setLetterSpacing(fM21977b);
    }

    /* renamed from: c */
    public final void m17534c() {
        if (getInputType() != this.f25963o) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.f25963o);
            super.setSelection(selectionStart, selectionEnd);
        }
    }

    @Override // android.view.View
    public final void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        this.f25955g.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    /* renamed from: d */
    public final boolean m17535d() {
        return (getInputType() & 131072) != 0;
    }

    /* renamed from: e */
    public final void m17536e(int i, int i2, int i3) {
        if (i < this.f25960l || i2 == -1 || i3 == -1) {
            return;
        }
        super.setSelection(Math.max(0, Math.min(i2, getText() == null ? 0 : getText().length())), Math.max(0, Math.min(i3, getText() == null ? 0 : getText().length())));
    }

    /* renamed from: f */
    public final void m17537f(C8972cN0 c8972cN0) {
        C9846j91 c9846j91;
        if (((getInputType() & 144) == 0 || !TextUtils.equals(getText(), c8972cN0.f17454a)) && c8972cN0.f17455b >= this.f25960l) {
            Spannable spannable = c8972cN0.f17454a;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
            Object[] spans = getText().getSpans(0, length(), Object.class);
            int i = 0;
            while (true) {
                if (i >= spans.length) {
                    break;
                }
                Object obj = spans[i];
                int spanFlags = getText().getSpanFlags(obj);
                boolean z = (spanFlags & 33) == 33;
                if (obj instanceof LM0) {
                    getText().removeSpan(obj);
                }
                if (z) {
                    int spanStart = getText().getSpanStart(obj);
                    int spanEnd = getText().getSpanEnd(obj);
                    getText().removeSpan(obj);
                    Editable text = getText();
                    if (spanStart <= spannableStringBuilder.length() && spanEnd <= spannableStringBuilder.length()) {
                        int i2 = spanStart;
                        while (true) {
                            if (i2 >= spanEnd) {
                                spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                                break;
                            } else if (text.charAt(i2) != spannableStringBuilder.charAt(i2)) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                i++;
            }
            Object[] spans2 = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C11017sJ0.class);
            int length = spans2.length;
            int i3 = 0;
            while (true) {
                c9846j91 = this.f25974z;
                if (i3 >= length) {
                    break;
                }
                Object obj2 = spans2[i3];
                if (((C11017sJ0) obj2).getSize() == c9846j91.m21976a()) {
                    spannableStringBuilder.removeSpan(obj2);
                }
                i3++;
            }
            for (Object obj3 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), JJ0.class)) {
                int backgroundColor = ((JJ0) obj3).getBackgroundColor();
                this.f25951I.getClass();
                if (backgroundColor == 0) {
                    spannableStringBuilder.removeSpan(obj3);
                }
            }
            for (Object obj4 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C11530wK0.class)) {
                if (((C11530wK0) obj4).getForegroundColor() == getCurrentTextColor()) {
                    spannableStringBuilder.removeSpan(obj4);
                }
            }
            for (Object obj5 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MM0.class)) {
                if ((getPaintFlags() & 16) != 0) {
                    spannableStringBuilder.removeSpan(obj5);
                }
            }
            for (Object obj6 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C9361fN0.class)) {
                if ((getPaintFlags() & 8) != 0) {
                    spannableStringBuilder.removeSpan(obj6);
                }
            }
            for (Object obj7 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C0579JB.class)) {
                if (((C0579JB) obj7).f5373a == c9846j91.m21977b()) {
                    spannableStringBuilder.removeSpan(obj7);
                }
            }
            for (Object obj8 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C1019QB.class)) {
                C1019QB c1019qb = (C1019QB) obj8;
                int i4 = c1019qb.f9512a;
                if (i4 == -1) {
                    i4 = 0;
                }
                if (i4 == this.f25946D) {
                    if (Objects.equals(c1019qb.f9515d, this.f25944B)) {
                        int i5 = c1019qb.f9513b;
                        if (i5 == -1) {
                            i5 = 400;
                        }
                        if (i5 == this.f25945C) {
                            if (Objects.equals(c1019qb.f9514c, getFontFeatureSettings())) {
                                spannableStringBuilder.removeSpan(obj8);
                            }
                        }
                    }
                }
            }
            this.f25964p = c8972cN0.f17456c;
            this.f25953K = true;
            if (spannable.length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.f25953K = false;
            int breakStrategy = getBreakStrategy();
            int i6 = c8972cN0.f17462i;
            if (breakStrategy != i6) {
                setBreakStrategy(i6);
            }
            m17541j();
        }
    }

    public final void finalize() {
        A91.f93b.remove(Integer.valueOf(getId()));
    }

    /* renamed from: g */
    public final void m17538g() {
        InterfaceC0439Gy interfaceC0439Gy = this.f25969u;
        if (interfaceC0439Gy != null) {
            YM0 ym0 = (YM0) interfaceC0439Gy;
            InterfaceC6947uP interfaceC6947uP = (InterfaceC6947uP) ym0.f14269b;
            if (interfaceC6947uP != null) {
                C9099dK0 c9099dK0 = (C9099dK0) ym0.f14268a;
                int width = c9099dK0.getWidth();
                int height = c9099dK0.getHeight();
                if (c9099dK0.getLayout() != null) {
                    width = c9099dK0.getCompoundPaddingRight() + c9099dK0.getLayout().getWidth() + c9099dK0.getCompoundPaddingLeft();
                    height = c9099dK0.getCompoundPaddingBottom() + c9099dK0.getLayout().getHeight() + c9099dK0.getCompoundPaddingTop();
                }
                if (width != ym0.f14271d || height != ym0.f14272e) {
                    ym0.f14272e = height;
                    ym0.f14271d = width;
                    int id = c9099dK0.getId();
                    float fM25402a = AbstractC11406vL1.m25402a(width);
                    float fM25402a2 = AbstractC11406vL1.m25402a(height);
                    SJ0 sj0 = new SJ0(ym0.f14270c, id);
                    sj0.f10683a = fM25402a;
                    sj0.f10684b = fM25402a2;
                    interfaceC6947uP.mo11046g(sj0);
                }
            }
        }
        ReactContext reactContextM6092c = OZ1.m6092c(this);
        if (this.f25952J != null || reactContextM6092c.isBridgeless()) {
            return;
        }
        VM0 vm0 = new VM0(this);
        UIManagerModule uIManagerModule = (UIManagerModule) reactContextM6092c.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), vm0);
        }
    }

    public boolean getDisableFullscreenUI() {
        return this.f25966r;
    }

    public int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public String getReturnKeyType() {
        return this.f25967s;
    }

    public int getStagedInputType() {
        return this.f25963o;
    }

    public G41 getStateWrapper() {
        return this.f25952J;
    }

    public String getSubmitBehavior() {
        return this.f25965q;
    }

    /* renamed from: h */
    public final boolean m17539h() {
        setFocusableInTouchMode(true);
        boolean zRequestFocus = super.requestFocus(130, null);
        if (getShowSoftInputOnFocus()) {
            this.f25955g.showSoftInput(this, 0);
        }
        return zRequestFocus;
    }

    /* renamed from: i */
    public final boolean m17540i() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior == null) {
            if (m17535d()) {
                return false;
            }
        } else if (!submitBehavior.equals("submit") && !submitBehavior.equals("blurAndSubmit")) {
            return false;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (this.f25964p) {
            Editable text = getText();
            for (C4187hZ c4187hZ : (C4187hZ[]) text.getSpans(0, text.length(), C4187hZ.class)) {
                if (c4187hZ.f28448a == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public final boolean isLayoutRequested() {
        return false;
    }

    /* renamed from: j */
    public final void m17541j() {
        if (this.f25952J == null || getId() == -1) {
            return;
        }
        Editable text = getText();
        boolean z = text != null && text.length() > 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            try {
                spannableStringBuilder.append(text.subSequence(0, text.length()));
            } catch (IndexOutOfBoundsException e) {
                ReactSoftExceptionLogger.logSoftException(this.f25956h, e);
            }
        }
        if (!z) {
            if (getHint() == null || getHint().length() <= 0) {
                spannableStringBuilder.append((CharSequence) "I");
            } else {
                spannableStringBuilder.append(getHint());
            }
        }
        C9846j91 c9846j91 = this.f25974z;
        spannableStringBuilder.setSpan(new C11017sJ0(c9846j91.m21976a()), 0, spannableStringBuilder.length(), 16711698);
        spannableStringBuilder.setSpan(new C11530wK0(getCurrentTextColor()), 0, spannableStringBuilder.length(), 16711698);
        this.f25951I.getClass();
        if ((getPaintFlags() & 16) != 0) {
            spannableStringBuilder.setSpan(new MM0(), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 8) != 0) {
            spannableStringBuilder.setSpan(new C9361fN0(), 0, spannableStringBuilder.length(), 16711698);
        }
        float fM21977b = c9846j91.m21977b();
        if (!Float.isNaN(fM21977b)) {
            spannableStringBuilder.setSpan(new C0579JB(fM21977b), 0, spannableStringBuilder.length(), 16711698);
        }
        if (this.f25946D != -1 || this.f25945C != -1 || this.f25944B != null || getFontFeatureSettings() != null) {
            spannableStringBuilder.setSpan(new C1019QB(this.f25946D, this.f25945C, getFontFeatureSettings(), this.f25944B, getContext().getAssets()), 0, spannableStringBuilder.length(), 16711698);
        }
        float fM21978c = c9846j91.m21978c();
        if (!Float.isNaN(fM21978c)) {
            spannableStringBuilder.setSpan(new C0642KB(fM21978c), 0, spannableStringBuilder.length(), 16711698);
        }
        A91.f93b.put(Integer.valueOf(getId()), spannableStringBuilder);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m17542k() {
        /*
            r9 = this;
            r0 = 5
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = r9.f25967s
            r6 = 6
            if (r5 == 0) goto L6a
            r5.getClass()
            r7 = -1
            int r8 = r5.hashCode()
            switch(r8) {
                case -1273775369: goto L58;
                case -906336856: goto L4d;
                case 3304: goto L42;
                case 3089282: goto L37;
                case 3377907: goto L2c;
                case 3387192: goto L21;
                case 3526536: goto L16;
                default: goto L15;
            }
        L15:
            goto L62
        L16:
            java.lang.String r8 = "send"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L1f
            goto L62
        L1f:
            r7 = r6
            goto L62
        L21:
            java.lang.String r8 = "none"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L2a
            goto L62
        L2a:
            r7 = r0
            goto L62
        L2c:
            java.lang.String r8 = "next"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L35
            goto L62
        L35:
            r7 = r1
            goto L62
        L37:
            java.lang.String r8 = "done"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L40
            goto L62
        L40:
            r7 = r2
            goto L62
        L42:
            java.lang.String r8 = "go"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L4b
            goto L62
        L4b:
            r7 = r3
            goto L62
        L4d:
            java.lang.String r8 = "search"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L56
            goto L62
        L56:
            r7 = r4
            goto L62
        L58:
            java.lang.String r8 = "previous"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L61
            goto L62
        L61:
            r7 = 0
        L62:
            switch(r7) {
                case 0: goto L70;
                case 1: goto L6e;
                case 2: goto L6c;
                case 3: goto L6a;
                case 4: goto L71;
                case 5: goto L68;
                case 6: goto L66;
                default: goto L65;
            }
        L65:
            goto L6a
        L66:
            r0 = r1
            goto L71
        L68:
            r0 = r4
            goto L71
        L6a:
            r0 = r6
            goto L71
        L6c:
            r0 = r3
            goto L71
        L6e:
            r0 = r2
            goto L71
        L70:
            r0 = 7
        L71:
            boolean r1 = r9.f25966r
            if (r1 == 0) goto L7c
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r0 = r0 | r1
            r9.setImeOptions(r0)
            goto L7f
        L7c:
            r9.setImeOptions(r0)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9099dK0.m17542k():void");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        setTextIsSelectable(true);
        super.setSelection(selectionStart, selectionEnd);
        if (this.f25964p) {
            Editable text = getText();
            for (C4187hZ c4187hZ : (C4187hZ[]) text.getSpans(0, text.length(), C4187hZ.class)) {
                EnumC6880tL enumC6880tL = EnumC6880tL.f43011o;
                C6596p6 c6596p6 = c4187hZ.f28450c;
                ((C6943uL) c6596p6.f39834c).m25182a(enumC6880tL);
                c6596p6.f39836e = true;
                c6596p6.m23614d();
            }
        }
        if (this.f25947E && !this.f25949G) {
            m17539h();
        }
        this.f25949G = true;
    }

    @Override // p000.C0700L6, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        OZ1.m6092c(this);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        boolean zEquals = false;
        if (inputConnectionOnCreateInputConnection != null && this.f25973y) {
            InterfaceC6947uP interfaceC6947uP = this.f25954L;
            C9227eK0 c9227eK0 = new C9227eK0(inputConnectionOnCreateInputConnection, false);
            c9227eK0.f26662d = null;
            c9227eK0.f26660b = interfaceC6947uP;
            c9227eK0.f26659a = this;
            inputConnectionOnCreateInputConnection = c9227eK0;
        }
        if (m17535d()) {
            String submitBehavior = getSubmitBehavior();
            if (submitBehavior != null) {
                zEquals = submitBehavior.equals("blurAndSubmit");
            } else if (!m17535d()) {
                zEquals = true;
            }
            if (zEquals || m17540i()) {
                editorInfo.imeOptions &= -1073741825;
            }
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // p000.C0700L6, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f25964p) {
            Editable text = getText();
            for (C4187hZ c4187hZ : (C4187hZ[]) text.getSpans(0, text.length(), C4187hZ.class)) {
                EnumC6880tL enumC6880tL = EnumC6880tL.f43012p;
                C6596p6 c6596p6 = c4187hZ.f28450c;
                ((C6943uL) c6596p6.f39834c).m25182a(enumC6880tL);
                c6596p6.f39836e = false;
                c6596p6.m23614d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        this.f25951I.m8483U(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.f25964p) {
            Editable text = getText();
            for (C4187hZ c4187hZ : (C4187hZ[]) text.getSpans(0, text.length(), C4187hZ.class)) {
                EnumC6880tL enumC6880tL = EnumC6880tL.f43011o;
                C6596p6 c6596p6 = c4187hZ.f28450c;
                ((C6943uL) c6596p6.f39834c).m25182a(enumC6880tL);
                c6596p6.f39836e = true;
                c6596p6.m23614d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        UX0 ux0;
        super.onFocusChanged(z, i, rect);
        if (!z || (ux0 = this.f25968t) == null) {
            return;
        }
        ((YM0) ux0).m9268c(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 66 || m17535d()) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f25955g.hideSoftInputFromWindow(getWindowToken(), 0);
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m17538g();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OW0 ow0 = this.f25970v;
        if (ow0 != null) {
            YM0 ym0 = (YM0) ow0;
            if (ym0.f14271d == i && ym0.f14272e == i2) {
                return;
            }
            C9099dK0 c9099dK0 = (C9099dK0) ym0.f14268a;
            int width = c9099dK0.getWidth();
            int height = c9099dK0.getHeight();
            C10107lC0 c10107lC0 = JW0.f5565k;
            ((InterfaceC6947uP) ym0.f14269b).mo11046g(AbstractC11926zR1.m26436a(ym0.f14270c, c9099dK0.getId(), MW0.f7205d, i, i2, 0.0f, 0.0f, 0, 0, width, height, false));
            ym0.f14271d = i;
            ym0.f14272e = i2;
        }
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.f25968t == null || !hasFocus()) {
            return;
        }
        ((YM0) this.f25968t).m9268c(i, i2);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.f25964p) {
            Editable text = getText();
            for (C4187hZ c4187hZ : (C4187hZ[]) text.getSpans(0, text.length(), C4187hZ.class)) {
                EnumC6880tL enumC6880tL = EnumC6880tL.f43012p;
                C6596p6 c6596p6 = c4187hZ.f28450c;
                ((C6943uL) c6596p6.f39834c).m25182a(enumC6880tL);
                c6596p6.f39836e = false;
                c6596p6.m23614d();
            }
        }
    }

    @Override // p000.C0700L6, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            i = R.id.pasteAsPlainText;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f25972x = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.f25972x) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f25972x = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList arrayList = this.f25961m;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.f25961m.isEmpty()) {
                this.f25961m = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    @Override // android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        return isFocused();
    }

    public void setAllowFontScaling(boolean z) {
        C9846j91 c9846j91 = this.f25974z;
        if (c9846j91.f34946a != z) {
            c9846j91.f34946a = z;
            m17533b();
        }
    }

    public void setAutoFocus(boolean z) {
        this.f25947E = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f25951I.m8489b0(i);
    }

    public void setBorderRadius(float f) {
        this.f25951I.m8469G().m7444l(f);
    }

    public void setBorderStyle(String str) {
        int iM26222B;
        C1179Sk c1179SkM8469G = this.f25951I.m8469G();
        if (str == null) {
            iM26222B = 0;
        } else {
            c1179SkM8469G.getClass();
            iM26222B = AbstractC7222ym.m26222B(str.toUpperCase(Locale.US));
        }
        if (c1179SkM8469G.f10930A != iM26222B) {
            c1179SkM8469G.f10930A = iM26222B;
            c1179SkM8469G.f10949s = true;
            c1179SkM8469G.invalidateSelf();
        }
    }

    public void setContentSizeWatcher(InterfaceC0439Gy interfaceC0439Gy) {
        this.f25969u = interfaceC0439Gy;
    }

    public void setContextMenuHidden(boolean z) {
        this.f25948F = z;
    }

    public void setDisableFullscreenUI(boolean z) {
        this.f25966r = z;
        m17542k();
    }

    public void setEventDispatcher(InterfaceC6947uP interfaceC6947uP) {
        this.f25954L = interfaceC6947uP;
    }

    public void setFontFamily(String str) {
        this.f25944B = str;
        this.f25943A = true;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(String str) {
        if (Objects.equals(str, getFontFeatureSettings())) {
            return;
        }
        super.setFontFeatureSettings(str);
        this.f25943A = true;
    }

    public void setFontSize(float f) {
        this.f25974z.f34947b = f;
        m17533b();
    }

    public void setFontStyle(String str) {
        int iM8006c = UO1.m8006c(str);
        if (iM8006c != this.f25946D) {
            this.f25946D = iM8006c;
            this.f25943A = true;
        }
    }

    public void setFontWeight(String str) {
        int iM8008e = UO1.m8008e(str);
        if (iM8008e != this.f25945C) {
            this.f25945C = iM8008e;
            this.f25943A = true;
        }
    }

    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.f25958j;
        }
        setGravity(i | (getGravity() & (-8388616)));
    }

    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.f25959k;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        Typeface typeface = getTypeface();
        super.setInputType(i);
        this.f25963o = i;
        setTypeface(typeface);
        if (m17535d()) {
            setSingleLine(false);
        }
        if (this.f25971w == null) {
            this.f25971w = new C8838bK0();
        }
        C8838bK0 c8838bK0 = this.f25971w;
        c8838bK0.f16982a = i;
        setKeyListener(c8838bK0);
    }

    public void setLetterSpacingPt(float f) {
        this.f25974z.f34949d = f;
        m17533b();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        this.f25974z.f34948c = i;
    }

    public void setMaxFontSizeMultiplier(float f) {
        C9846j91 c9846j91 = this.f25974z;
        if (f != c9846j91.f34950e) {
            if (f == 0.0f || f >= 1.0f) {
                c9846j91.f34950e = f;
            } else {
                AbstractC3929dS.m17683p("ReactNative");
                c9846j91.f34950e = Float.NaN;
            }
            m17533b();
        }
    }

    public void setOnKeyPress(boolean z) {
        this.f25973y = z;
    }

    public void setOverflow(String str) {
        this.f25951I.m8493e0(str);
    }

    public void setPlaceholder(String str) {
        if (Objects.equals(str, this.f25950H)) {
            return;
        }
        this.f25950H = str;
        setHint(str);
    }

    public void setReturnKeyType(String str) {
        this.f25967s = str;
        m17542k();
    }

    public void setScrollWatcher(OW0 ow0) {
        this.f25970v = ow0;
    }

    public void setSelectionWatcher(UX0 ux0) {
        this.f25968t = ux0;
    }

    public void setStagedInputType(int i) {
        this.f25963o = i;
    }

    public void setStateWrapper(G41 g41) {
        this.f25952J = g41;
    }

    public void setSubmitBehavior(String str) {
        this.f25965q = str;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f25964p) {
            Editable text = getText();
            for (C4187hZ c4187hZ : (C4187hZ[]) text.getSpans(0, text.length(), C4187hZ.class)) {
                if (c4187hZ.f28448a == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
