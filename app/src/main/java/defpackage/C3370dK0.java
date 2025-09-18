package defpackage;

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
public final class C3370dK0 extends L6 {
    public static final QwertyKeyListener M = QwertyKeyListener.getInstanceForFullKeyboard();
    public boolean A;
    public String B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public final VY I;
    public G41 J;
    public boolean K;
    public InterfaceC7405uP L;
    public final InputMethodManager g;
    public final String h;
    public boolean i;
    public final int j;
    public final int k;
    public int l;
    public ArrayList m;
    public C2494cK0 n;
    public int o;
    public boolean p;
    public String q;
    public boolean r;
    public String s;
    public UX0 t;
    public InterfaceC0560Gy u;
    public OW0 v;
    public C2304bK0 w;
    public boolean x;
    public boolean y;
    public final C5259j91 z;

    public C3370dK0(S91 s91) {
        super(s91, null, 0);
        this.h = C3370dK0.class.getSimpleName();
        this.q = null;
        this.x = false;
        this.y = false;
        this.A = false;
        this.B = null;
        this.C = -1;
        this.D = -1;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = null;
        this.J = null;
        this.K = false;
        setFocusableInTouchMode(false);
        this.I = new VY(this);
        Object systemService = s91.getSystemService("input_method");
        UN1.c(systemService);
        this.g = (InputMethodManager) systemService;
        this.j = getGravity() & 8388615;
        this.k = getGravity() & 112;
        this.l = 0;
        this.i = false;
        this.r = false;
        this.m = null;
        this.n = null;
        this.o = getInputType();
        if (this.w == null) {
            this.w = new C2304bK0();
        }
        this.v = null;
        this.z = new C5259j91();
        b();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27) {
            setLayerType(1, null);
        }
        AbstractC6897rk1.n(this, new ZJ0(this, this, isFocusable(), getImportantForAccessibility()));
        ActionModeCallbackC2113aK0 actionModeCallbackC2113aK0 = new ActionModeCallbackC2113aK0(this);
        setCustomSelectionActionModeCallback(actionModeCallbackC2113aK0);
        setCustomInsertionActionModeCallback(actionModeCallbackC2113aK0);
    }

    private C2494cK0 getTextWatcherDelegator() {
        if (this.n == null) {
            this.n = new C2494cK0(this);
        }
        return this.n;
    }

    @Override // android.widget.TextView
    public final void addTextChangedListener(TextWatcher textWatcher) {
        if (this.m == null) {
            this.m = new ArrayList();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.m.add(textWatcher);
    }

    public final void b() {
        C5259j91 c5259j91 = this.z;
        setTextSize(0, c5259j91.a());
        float fB = c5259j91.b();
        if (Float.isNaN(fB)) {
            return;
        }
        setLetterSpacing(fB);
    }

    public final void c() {
        if (getInputType() != this.o) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.o);
            super.setSelection(selectionStart, selectionEnd);
        }
    }

    @Override // android.view.View
    public final void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        this.g.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public final boolean d() {
        return (getInputType() & 131072) != 0;
    }

    public final void e(int i, int i2, int i3) {
        if (i < this.l || i2 == -1 || i3 == -1) {
            return;
        }
        super.setSelection(Math.max(0, Math.min(i2, getText() == null ? 0 : getText().length())), Math.max(0, Math.min(i3, getText() == null ? 0 : getText().length())));
    }

    public final void f(C2503cN0 c2503cN0) {
        C5259j91 c5259j91;
        if (((getInputType() & 144) == 0 || !TextUtils.equals(getText(), c2503cN0.a)) && c2503cN0.b >= this.l) {
            Spannable spannable = c2503cN0.a;
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
            Object[] spans2 = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C7006sJ0.class);
            int length = spans2.length;
            int i3 = 0;
            while (true) {
                c5259j91 = this.z;
                if (i3 >= length) {
                    break;
                }
                Object obj2 = spans2[i3];
                if (((C7006sJ0) obj2).getSize() == c5259j91.a()) {
                    spannableStringBuilder.removeSpan(obj2);
                }
                i3++;
            }
            for (Object obj3 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), JJ0.class)) {
                int backgroundColor = ((JJ0) obj3).getBackgroundColor();
                this.I.getClass();
                if (backgroundColor == 0) {
                    spannableStringBuilder.removeSpan(obj3);
                }
            }
            for (Object obj4 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C7772wK0.class)) {
                if (((C7772wK0) obj4).getForegroundColor() == getCurrentTextColor()) {
                    spannableStringBuilder.removeSpan(obj4);
                }
            }
            for (Object obj5 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), MM0.class)) {
                if ((getPaintFlags() & 16) != 0) {
                    spannableStringBuilder.removeSpan(obj5);
                }
            }
            for (Object obj6 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C3760fN0.class)) {
                if ((getPaintFlags() & 8) != 0) {
                    spannableStringBuilder.removeSpan(obj6);
                }
            }
            for (Object obj7 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), JB.class)) {
                if (((JB) obj7).a == c5259j91.b()) {
                    spannableStringBuilder.removeSpan(obj7);
                }
            }
            for (Object obj8 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), QB.class)) {
                QB qb = (QB) obj8;
                int i4 = qb.a;
                if (i4 == -1) {
                    i4 = 0;
                }
                if (i4 == this.D) {
                    if (Objects.equals(qb.d, this.B)) {
                        int i5 = qb.b;
                        if (i5 == -1) {
                            i5 = 400;
                        }
                        if (i5 == this.C) {
                            if (Objects.equals(qb.c, getFontFeatureSettings())) {
                                spannableStringBuilder.removeSpan(obj8);
                            }
                        }
                    }
                }
            }
            this.p = c2503cN0.c;
            this.K = true;
            if (spannable.length() == 0) {
                setText((CharSequence) null);
            } else {
                getText().replace(0, length(), spannableStringBuilder);
            }
            this.K = false;
            int breakStrategy = getBreakStrategy();
            int i6 = c2503cN0.i;
            if (breakStrategy != i6) {
                setBreakStrategy(i6);
            }
            j();
        }
    }

    public final void finalize() {
        A91.b.remove(Integer.valueOf(getId()));
    }

    public final void g() {
        InterfaceC0560Gy interfaceC0560Gy = this.u;
        if (interfaceC0560Gy != null) {
            YM0 ym0 = (YM0) interfaceC0560Gy;
            InterfaceC7405uP interfaceC7405uP = (InterfaceC7405uP) ym0.b;
            if (interfaceC7405uP != null) {
                C3370dK0 c3370dK0 = (C3370dK0) ym0.a;
                int width = c3370dK0.getWidth();
                int height = c3370dK0.getHeight();
                if (c3370dK0.getLayout() != null) {
                    width = c3370dK0.getCompoundPaddingRight() + c3370dK0.getLayout().getWidth() + c3370dK0.getCompoundPaddingLeft();
                    height = c3370dK0.getCompoundPaddingBottom() + c3370dK0.getLayout().getHeight() + c3370dK0.getCompoundPaddingTop();
                }
                if (width != ym0.d || height != ym0.e) {
                    ym0.e = height;
                    ym0.d = width;
                    int id = c3370dK0.getId();
                    float fA = AbstractC7586vL1.a(width);
                    float fA2 = AbstractC7586vL1.a(height);
                    SJ0 sj0 = new SJ0(ym0.c, id);
                    sj0.a = fA;
                    sj0.b = fA2;
                    interfaceC7405uP.g(sj0);
                }
            }
        }
        ReactContext reactContextC = OZ1.c(this);
        if (this.J != null || reactContextC.isBridgeless()) {
            return;
        }
        VM0 vm0 = new VM0(this);
        UIManagerModule uIManagerModule = (UIManagerModule) reactContextC.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.setViewLocalData(getId(), vm0);
        }
    }

    public boolean getDisableFullscreenUI() {
        return this.r;
    }

    public int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public String getReturnKeyType() {
        return this.s;
    }

    public int getStagedInputType() {
        return this.o;
    }

    public G41 getStateWrapper() {
        return this.J;
    }

    public String getSubmitBehavior() {
        return this.q;
    }

    public final boolean h() {
        setFocusableInTouchMode(true);
        boolean zRequestFocus = super.requestFocus(130, null);
        if (getShowSoftInputOnFocus()) {
            this.g.showSoftInput(this, 0);
        }
        return zRequestFocus;
    }

    public final boolean i() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior == null) {
            if (d()) {
                return false;
            }
        } else if (!submitBehavior.equals("submit") && !submitBehavior.equals("blurAndSubmit")) {
            return false;
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (this.p) {
            Editable text = getText();
            for (C4177hZ c4177hZ : (C4177hZ[]) text.getSpans(0, text.length(), C4177hZ.class)) {
                if (c4177hZ.a == drawable) {
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

    public final void j() {
        if (this.J == null || getId() == -1) {
            return;
        }
        Editable text = getText();
        boolean z = text != null && text.length() > 0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            try {
                spannableStringBuilder.append(text.subSequence(0, text.length()));
            } catch (IndexOutOfBoundsException e) {
                ReactSoftExceptionLogger.logSoftException(this.h, e);
            }
        }
        if (!z) {
            if (getHint() == null || getHint().length() <= 0) {
                spannableStringBuilder.append((CharSequence) "I");
            } else {
                spannableStringBuilder.append(getHint());
            }
        }
        C5259j91 c5259j91 = this.z;
        spannableStringBuilder.setSpan(new C7006sJ0(c5259j91.a()), 0, spannableStringBuilder.length(), 16711698);
        spannableStringBuilder.setSpan(new C7772wK0(getCurrentTextColor()), 0, spannableStringBuilder.length(), 16711698);
        this.I.getClass();
        if ((getPaintFlags() & 16) != 0) {
            spannableStringBuilder.setSpan(new MM0(), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 8) != 0) {
            spannableStringBuilder.setSpan(new C3760fN0(), 0, spannableStringBuilder.length(), 16711698);
        }
        float fB = c5259j91.b();
        if (!Float.isNaN(fB)) {
            spannableStringBuilder.setSpan(new JB(fB), 0, spannableStringBuilder.length(), 16711698);
        }
        if (this.D != -1 || this.C != -1 || this.B != null || getFontFeatureSettings() != null) {
            spannableStringBuilder.setSpan(new QB(this.D, this.C, getFontFeatureSettings(), this.B, getContext().getAssets()), 0, spannableStringBuilder.length(), 16711698);
        }
        float fC = c5259j91.c();
        if (!Float.isNaN(fC)) {
            spannableStringBuilder.setSpan(new KB(fC), 0, spannableStringBuilder.length(), 16711698);
        }
        A91.b.put(Integer.valueOf(getId()), spannableStringBuilder);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            r9 = this;
            r0 = 5
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            java.lang.String r5 = r9.s
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
            boolean r1 = r9.r
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3370dK0.k():void");
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        setTextIsSelectable(true);
        super.setSelection(selectionStart, selectionEnd);
        if (this.p) {
            Editable text = getText();
            for (C4177hZ c4177hZ : (C4177hZ[]) text.getSpans(0, text.length(), C4177hZ.class)) {
                EnumC7202tL enumC7202tL = EnumC7202tL.o;
                C6394p6 c6394p6 = c4177hZ.c;
                ((C7393uL) c6394p6.c).a(enumC7202tL);
                c6394p6.e = true;
                c6394p6.d();
            }
        }
        if (this.E && !this.G) {
            h();
        }
        this.G = true;
    }

    @Override // defpackage.L6, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        OZ1.c(this);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        boolean zEquals = false;
        if (inputConnectionOnCreateInputConnection != null && this.y) {
            InterfaceC7405uP interfaceC7405uP = this.L;
            C3560eK0 c3560eK0 = new C3560eK0(inputConnectionOnCreateInputConnection, false);
            c3560eK0.d = null;
            c3560eK0.b = interfaceC7405uP;
            c3560eK0.a = this;
            inputConnectionOnCreateInputConnection = c3560eK0;
        }
        if (d()) {
            String submitBehavior = getSubmitBehavior();
            if (submitBehavior != null) {
                zEquals = submitBehavior.equals("blurAndSubmit");
            } else if (!d()) {
                zEquals = true;
            }
            if (zEquals || i()) {
                editorInfo.imeOptions &= -1073741825;
            }
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // defpackage.L6, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.p) {
            Editable text = getText();
            for (C4177hZ c4177hZ : (C4177hZ[]) text.getSpans(0, text.length(), C4177hZ.class)) {
                EnumC7202tL enumC7202tL = EnumC7202tL.p;
                C6394p6 c6394p6 = c4177hZ.c;
                ((C7393uL) c6394p6.c).a(enumC7202tL);
                c6394p6.e = false;
                c6394p6.d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        this.I.U(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.p) {
            Editable text = getText();
            for (C4177hZ c4177hZ : (C4177hZ[]) text.getSpans(0, text.length(), C4177hZ.class)) {
                EnumC7202tL enumC7202tL = EnumC7202tL.o;
                C6394p6 c6394p6 = c4177hZ.c;
                ((C7393uL) c6394p6.c).a(enumC7202tL);
                c6394p6.e = true;
                c6394p6.d();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        UX0 ux0;
        super.onFocusChanged(z, i, rect);
        if (!z || (ux0 = this.t) == null) {
            return;
        }
        ((YM0) ux0).c(getSelectionStart(), getSelectionEnd());
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 66 || d()) {
            return super.onKeyUp(i, keyEvent);
        }
        this.g.hideSoftInputFromWindow(getWindowToken(), 0);
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OW0 ow0 = this.v;
        if (ow0 != null) {
            YM0 ym0 = (YM0) ow0;
            if (ym0.d == i && ym0.e == i2) {
                return;
            }
            C3370dK0 c3370dK0 = (C3370dK0) ym0.a;
            int width = c3370dK0.getWidth();
            int height = c3370dK0.getHeight();
            C5649lC0 c5649lC0 = JW0.k;
            ((InterfaceC7405uP) ym0.b).g(AbstractC8364zR1.a(ym0.c, c3370dK0.getId(), MW0.d, i, i2, 0.0f, 0.0f, 0, 0, width, height, false));
            ym0.d = i;
            ym0.e = i2;
        }
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.t == null || !hasFocus()) {
            return;
        }
        ((YM0) this.t).c(i, i2);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.p) {
            Editable text = getText();
            for (C4177hZ c4177hZ : (C4177hZ[]) text.getSpans(0, text.length(), C4177hZ.class)) {
                EnumC7202tL enumC7202tL = EnumC7202tL.p;
                C6394p6 c6394p6 = c4177hZ.c;
                ((C7393uL) c6394p6.c).a(enumC7202tL);
                c6394p6.e = false;
                c6394p6.d();
            }
        }
    }

    @Override // defpackage.L6, android.widget.EditText, android.widget.TextView
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
            this.x = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2 && this.x) {
            if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.x = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.m.isEmpty()) {
                this.m = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    @Override // android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        return isFocused();
    }

    public void setAllowFontScaling(boolean z) {
        C5259j91 c5259j91 = this.z;
        if (c5259j91.a != z) {
            c5259j91.a = z;
            b();
        }
    }

    public void setAutoFocus(boolean z) {
        this.E = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.I.b0(i);
    }

    public void setBorderRadius(float f) {
        this.I.G().l(f);
    }

    public void setBorderStyle(String str) {
        int iB;
        C1453Sk c1453SkG = this.I.G();
        if (str == null) {
            iB = 0;
        } else {
            c1453SkG.getClass();
            iB = AbstractC8235ym.B(str.toUpperCase(Locale.US));
        }
        if (c1453SkG.A != iB) {
            c1453SkG.A = iB;
            c1453SkG.s = true;
            c1453SkG.invalidateSelf();
        }
    }

    public void setContentSizeWatcher(InterfaceC0560Gy interfaceC0560Gy) {
        this.u = interfaceC0560Gy;
    }

    public void setContextMenuHidden(boolean z) {
        this.F = z;
    }

    public void setDisableFullscreenUI(boolean z) {
        this.r = z;
        k();
    }

    public void setEventDispatcher(InterfaceC7405uP interfaceC7405uP) {
        this.L = interfaceC7405uP;
    }

    public void setFontFamily(String str) {
        this.B = str;
        this.A = true;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(String str) {
        if (Objects.equals(str, getFontFeatureSettings())) {
            return;
        }
        super.setFontFeatureSettings(str);
        this.A = true;
    }

    public void setFontSize(float f) {
        this.z.b = f;
        b();
    }

    public void setFontStyle(String str) {
        int iC = UO1.c(str);
        if (iC != this.D) {
            this.D = iC;
            this.A = true;
        }
    }

    public void setFontWeight(String str) {
        int iE = UO1.e(str);
        if (iE != this.C) {
            this.C = iE;
            this.A = true;
        }
    }

    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.j;
        }
        setGravity(i | (getGravity() & (-8388616)));
    }

    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.k;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        Typeface typeface = getTypeface();
        super.setInputType(i);
        this.o = i;
        setTypeface(typeface);
        if (d()) {
            setSingleLine(false);
        }
        if (this.w == null) {
            this.w = new C2304bK0();
        }
        C2304bK0 c2304bK0 = this.w;
        c2304bK0.a = i;
        setKeyListener(c2304bK0);
    }

    public void setLetterSpacingPt(float f) {
        this.z.d = f;
        b();
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        this.z.c = i;
    }

    public void setMaxFontSizeMultiplier(float f) {
        C5259j91 c5259j91 = this.z;
        if (f != c5259j91.e) {
            if (f == 0.0f || f >= 1.0f) {
                c5259j91.e = f;
            } else {
                AbstractC3393dS.p("ReactNative");
                c5259j91.e = Float.NaN;
            }
            b();
        }
    }

    public void setOnKeyPress(boolean z) {
        this.y = z;
    }

    public void setOverflow(String str) {
        this.I.e0(str);
    }

    public void setPlaceholder(String str) {
        if (Objects.equals(str, this.H)) {
            return;
        }
        this.H = str;
        setHint(str);
    }

    public void setReturnKeyType(String str) {
        this.s = str;
        k();
    }

    public void setScrollWatcher(OW0 ow0) {
        this.v = ow0;
    }

    public void setSelectionWatcher(UX0 ux0) {
        this.t = ux0;
    }

    public void setStagedInputType(int i) {
        this.o = i;
    }

    public void setStateWrapper(G41 g41) {
        this.J = g41;
    }

    public void setSubmitBehavior(String str) {
        this.q = str;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.p) {
            Editable text = getText();
            for (C4177hZ c4177hZ : (C4177hZ[]) text.getSpans(0, text.length(), C4177hZ.class)) {
                if (c4177hZ.a == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
