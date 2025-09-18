package androidx.media3.p002ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000.AbstractC7485Dh1;
import p000.C1059Qp;
import p000.C1184Sp;
import p000.C6870tB;
import p000.C6933uB;
import p000.C8275Sm1;
import p000.DT1;
import p000.InterfaceC8470Wg0;
import p000.InterfaceC9712i61;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* renamed from: a */
    public List f16405a;

    /* renamed from: b */
    public C1184Sp f16406b;

    /* renamed from: c */
    public int f16407c;

    /* renamed from: d */
    public float f16408d;

    /* renamed from: e */
    public float f16409e;

    /* renamed from: f */
    public boolean f16410f;

    /* renamed from: g */
    public boolean f16411g;

    /* renamed from: h */
    public int f16412h;

    /* renamed from: i */
    public InterfaceC9712i61 f16413i;

    /* renamed from: j */
    public View f16414j;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16405a = Collections.emptyList();
        this.f16406b = C1184Sp.f10989g;
        this.f16407c = 0;
        this.f16408d = 0.0533f;
        this.f16409e = 0.08f;
        this.f16410f = true;
        this.f16411g = true;
        C1059Qp c1059Qp = new C1059Qp(context);
        this.f16413i = c1059Qp;
        this.f16414j = c1059Qp;
        addView(c1059Qp);
        this.f16412h = 1;
    }

    private List<C6933uB> getCuesWithStylingPreferencesApplied() {
        if (this.f16410f && this.f16411g) {
            return this.f16405a;
        }
        ArrayList arrayList = new ArrayList(this.f16405a.size());
        for (int i = 0; i < this.f16405a.size(); i++) {
            C6870tB c6870tBM25128a = ((C6933uB) this.f16405a.get(i)).m25128a();
            if (!this.f16410f) {
                c6870tBM25128a.f42914n = false;
                CharSequence charSequence = c6870tBM25128a.f42901a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c6870tBM25128a.f42901a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c6870tBM25128a.f42901a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof InterfaceC8470Wg0)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                DT1.m1704b(c6870tBM25128a);
            } else if (!this.f16411g) {
                DT1.m1704b(c6870tBM25128a);
            }
            arrayList.add(c6870tBM25128a.m24850a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C1184Sp getUserCaptionStyle() {
        CaptioningManager captioningManager;
        boolean zIsInEditMode = isInEditMode();
        C1184Sp c1184Sp = C1184Sp.f10989g;
        if (zIsInEditMode || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return c1184Sp;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (AbstractC7485Dh1.f2166a >= 21) {
            return new C1184Sp(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new C1184Sp(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & InterfaceC9712i61> void setView(T t) {
        removeView(this.f16414j);
        View view = this.f16414j;
        if (view instanceof C8275Sm1) {
            ((C8275Sm1) view).f10971b.destroy();
        }
        this.f16414j = t;
        this.f16413i = t;
        addView(t);
    }

    /* renamed from: a */
    public final void m10142a() {
        setStyle(getUserCaptionStyle());
    }

    /* renamed from: b */
    public final void m10143b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    /* renamed from: c */
    public final void m10144c() {
        this.f16413i.mo6792a(getCuesWithStylingPreferencesApplied(), this.f16406b, this.f16408d, this.f16407c, this.f16409e);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f16411g = z;
        m10144c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f16410f = z;
        m10144c();
    }

    public void setBottomPaddingFraction(float f) {
        this.f16409e = f;
        m10144c();
    }

    public void setCues(List<C6933uB> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f16405a = list;
        m10144c();
    }

    public void setFractionalTextSize(float f) {
        this.f16407c = 0;
        this.f16408d = f;
        m10144c();
    }

    public void setStyle(C1184Sp c1184Sp) {
        this.f16406b = c1184Sp;
        m10144c();
    }

    public void setViewType(int i) {
        if (this.f16412h == i) {
            return;
        }
        if (i == 1) {
            setView(new C1059Qp(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new C8275Sm1(getContext()));
        }
        this.f16412h = i;
    }
}
