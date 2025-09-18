package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import ru.mes.dnevnik.R;

/* renamed from: d7 */
/* loaded from: classes.dex */
public final class C3908d7 extends C7696Hj0 implements InterfaceC4033f7 {

    /* renamed from: D */
    public CharSequence f25818D;

    /* renamed from: E */
    public C1644a7 f25819E;

    /* renamed from: F */
    public final Rect f25820F;

    /* renamed from: G */
    public int f25821G;

    /* renamed from: H */
    public final /* synthetic */ C4096g7 f25822H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3908d7(C4096g7 c4096g7, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f25822H = c4096g7;
        this.f25820F = new Rect();
        this.f4469o = c4096g7;
        this.f4479y = true;
        this.f4480z.setFocusable(true);
        this.f4470p = new C1765b7(0, this);
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: e */
    public final CharSequence mo9478e() {
        return this.f25818D;
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: g */
    public final void mo9480g(CharSequence charSequence) {
        this.f25818D = charSequence;
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: k */
    public final void mo9483k(int i) {
        this.f25821G = i;
    }

    @Override // p000.InterfaceC4033f7
    /* renamed from: l */
    public final void mo9484l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C1014Q6 c1014q6 = this.f4480z;
        boolean zIsShowing = c1014q6.isShowing();
        m17495r();
        this.f4480z.setInputMethodMode(2);
        mo335b();
        C1659aM c1659aM = this.f4457c;
        c1659aM.setChoiceMode(1);
        c1659aM.setTextDirection(i);
        c1659aM.setTextAlignment(i2);
        C4096g7 c4096g7 = this.f25822H;
        int selectedItemPosition = c4096g7.getSelectedItemPosition();
        C1659aM c1659aM2 = this.f4457c;
        if (c1014q6.isShowing() && c1659aM2 != null) {
            c1659aM2.setListSelectionHidden(false);
            c1659aM2.setSelection(selectedItemPosition);
            if (c1659aM2.getChoiceMode() != 0) {
                c1659aM2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c4096g7.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1454X6 viewTreeObserverOnGlobalLayoutListenerC1454X6 = new ViewTreeObserverOnGlobalLayoutListenerC1454X6(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1454X6);
        this.f4480z.setOnDismissListener(new C1827c7(this, viewTreeObserverOnGlobalLayoutListenerC1454X6));
    }

    @Override // p000.C7696Hj0, p000.InterfaceC4033f7
    /* renamed from: o */
    public final void mo3567o(ListAdapter listAdapter) {
        super.mo3567o(listAdapter);
        this.f25819E = (C1644a7) listAdapter;
    }

    /* renamed from: r */
    public final void m17495r() {
        int i;
        C1014Q6 c1014q6 = this.f4480z;
        Drawable background = c1014q6.getBackground();
        C4096g7 c4096g7 = this.f25822H;
        if (background != null) {
            background.getPadding(c4096g7.f27575h);
            boolean z = AbstractC7337Al1.f354a;
            int layoutDirection = c4096g7.getLayoutDirection();
            Rect rect = c4096g7.f27575h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c4096g7.f27575h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c4096g7.getPaddingLeft();
        int paddingRight = c4096g7.getPaddingRight();
        int width = c4096g7.getWidth();
        int i2 = c4096g7.f27574g;
        if (i2 == -2) {
            int iM18402a = c4096g7.m18402a(this.f25819E, c1014q6.getBackground());
            int i3 = c4096g7.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c4096g7.f27575h;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (iM18402a > i4) {
                iM18402a = i4;
            }
            m3569q(Math.max(iM18402a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m3569q((width - paddingLeft) - paddingRight);
        } else {
            m3569q(i2);
        }
        boolean z2 = AbstractC7337Al1.f354a;
        this.f4460f = c4096g7.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f4459e) - this.f25821G) + i : paddingLeft + this.f25821G + i;
    }
}
