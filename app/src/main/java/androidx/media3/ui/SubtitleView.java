package androidx.media3.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import defpackage.AbstractC0277Dh1;
import defpackage.C1312Qp;
import defpackage.C1461Sm1;
import defpackage.C1468Sp;
import defpackage.C7172tB;
import defpackage.C7363uB;
import defpackage.DT1;
import defpackage.InterfaceC1754Wg0;
import defpackage.InterfaceC4283i61;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {
    public List a;
    public C1468Sp b;
    public int c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public int h;
    public InterfaceC4283i61 i;
    public View j;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = Collections.emptyList();
        this.b = C1468Sp.g;
        this.c = 0;
        this.d = 0.0533f;
        this.e = 0.08f;
        this.f = true;
        this.g = true;
        C1312Qp c1312Qp = new C1312Qp(context);
        this.i = c1312Qp;
        this.j = c1312Qp;
        addView(c1312Qp);
        this.h = 1;
    }

    private List<C7363uB> getCuesWithStylingPreferencesApplied() {
        if (this.f && this.g) {
            return this.a;
        }
        ArrayList arrayList = new ArrayList(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            C7172tB c7172tBA = ((C7363uB) this.a.get(i)).a();
            if (!this.f) {
                c7172tBA.n = false;
                CharSequence charSequence = c7172tBA.a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c7172tBA.a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c7172tBA.a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof InterfaceC1754Wg0)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                DT1.b(c7172tBA);
            } else if (!this.g) {
                DT1.b(c7172tBA);
            }
            arrayList.add(c7172tBA.a());
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

    private C1468Sp getUserCaptionStyle() {
        CaptioningManager captioningManager;
        boolean zIsInEditMode = isInEditMode();
        C1468Sp c1468Sp = C1468Sp.g;
        if (zIsInEditMode || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return c1468Sp;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (AbstractC0277Dh1.a >= 21) {
            return new C1468Sp(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new C1468Sp(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    private <T extends View & InterfaceC4283i61> void setView(T t) {
        removeView(this.j);
        View view = this.j;
        if (view instanceof C1461Sm1) {
            ((C1461Sm1) view).b.destroy();
        }
        this.j = t;
        this.i = t;
        addView(t);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.i.a(getCuesWithStylingPreferencesApplied(), this.b, this.d, this.c, this.e);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.g = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f = z;
        c();
    }

    public void setBottomPaddingFraction(float f) {
        this.e = f;
        c();
    }

    public void setCues(List<C7363uB> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.a = list;
        c();
    }

    public void setFractionalTextSize(float f) {
        this.c = 0;
        this.d = f;
        c();
    }

    public void setStyle(C1468Sp c1468Sp) {
        this.b = c1468Sp;
        c();
    }

    public void setViewType(int i) {
        if (this.h == i) {
            return;
        }
        if (i == 1) {
            setView(new C1312Qp(getContext()));
        } else {
            if (i != 2) {
                throw new IllegalArgumentException();
            }
            setView(new C1461Sm1(getContext()));
        }
        this.h = i;
    }
}
