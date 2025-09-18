package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import ru.mes.dnevnik.R;

/* renamed from: d7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3330d7 extends C0594Hj0 implements InterfaceC3711f7 {
    public CharSequence D;
    public C2073a7 E;
    public final Rect F;
    public int G;
    public final /* synthetic */ C3902g7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3330d7(C3902g7 c3902g7, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.H = c3902g7;
        this.F = new Rect();
        this.o = c3902g7;
        this.y = true;
        this.z.setFocusable(true);
        this.p = new C2264b7(0, this);
    }

    @Override // defpackage.InterfaceC3711f7
    public final CharSequence e() {
        return this.D;
    }

    @Override // defpackage.InterfaceC3711f7
    public final void g(CharSequence charSequence) {
        this.D = charSequence;
    }

    @Override // defpackage.InterfaceC3711f7
    public final void k(int i) {
        this.G = i;
    }

    @Override // defpackage.InterfaceC3711f7
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        Q6 q6 = this.z;
        boolean zIsShowing = q6.isShowing();
        r();
        this.z.setInputMethodMode(2);
        b();
        C2118aM c2118aM = this.c;
        c2118aM.setChoiceMode(1);
        c2118aM.setTextDirection(i);
        c2118aM.setTextAlignment(i2);
        C3902g7 c3902g7 = this.H;
        int selectedItemPosition = c3902g7.getSelectedItemPosition();
        C2118aM c2118aM2 = this.c;
        if (q6.isShowing() && c2118aM2 != null) {
            c2118aM2.setListSelectionHidden(false);
            c2118aM2.setSelection(selectedItemPosition);
            if (c2118aM2.getChoiceMode() != 0) {
                c2118aM2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = c3902g7.getViewTreeObserver()) == null) {
            return;
        }
        X6 x6 = new X6(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(x6);
        this.z.setOnDismissListener(new C2454c7(this, x6));
    }

    @Override // defpackage.C0594Hj0, defpackage.InterfaceC3711f7
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.E = (C2073a7) listAdapter;
    }

    public final void r() {
        int i;
        Q6 q6 = this.z;
        Drawable background = q6.getBackground();
        C3902g7 c3902g7 = this.H;
        if (background != null) {
            background.getPadding(c3902g7.h);
            boolean z = AbstractC0055Al1.a;
            int layoutDirection = c3902g7.getLayoutDirection();
            Rect rect = c3902g7.h;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c3902g7.h;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c3902g7.getPaddingLeft();
        int paddingRight = c3902g7.getPaddingRight();
        int width = c3902g7.getWidth();
        int i2 = c3902g7.g;
        if (i2 == -2) {
            int iA = c3902g7.a(this.E, q6.getBackground());
            int i3 = c3902g7.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c3902g7.h;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (iA > i4) {
                iA = i4;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i2);
        }
        boolean z2 = AbstractC0055Al1.a;
        this.f = c3902g7.getLayoutDirection() == 1 ? (((width - paddingRight) - this.e) - this.G) + i : paddingLeft + this.G + i;
    }
}
