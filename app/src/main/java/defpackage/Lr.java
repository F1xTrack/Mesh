package defpackage;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class Lr extends AbstractC5884mR {
    public final /* synthetic */ Chip q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lr(Chip chip, Chip chip2) {
        super(chip2);
        this.q = chip;
    }

    @Override // defpackage.AbstractC5884mR
    public final int m(float f, float f2) {
        Rect rect = Chip.w;
        Chip chip = this.q;
        return (chip.d() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
    }

    @Override // defpackage.AbstractC5884mR
    public final void n(ArrayList arrayList) {
        boolean z = false;
        arrayList.add(0);
        Rect rect = Chip.w;
        Chip chip = this.q;
        if (chip.d()) {
            C1084Nr c1084Nr = chip.e;
            if (c1084Nr != null && c1084Nr.L) {
                z = true;
            }
            if (!z || chip.h == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // defpackage.AbstractC5884mR
    public final boolean q(int i, int i2) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.q;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.s) {
                    chip.r.v(1, 1);
                }
            }
        }
        return z;
    }

    @Override // defpackage.AbstractC5884mR
    public final void r(Q1 q1) {
        Chip chip = this.q;
        boolean zE = chip.e();
        AccessibilityNodeInfo accessibilityNodeInfo = q1.a;
        accessibilityNodeInfo.setCheckable(zE);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        q1.k(chip.getAccessibilityClassName());
        q1.p(chip.getText());
    }

    @Override // defpackage.AbstractC5884mR
    public final void s(int i, Q1 q1) {
        if (i != 1) {
            q1.l("");
            q1.j(Chip.w);
            return;
        }
        Chip chip = this.q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            q1.l(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            q1.l(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        q1.j(chip.getCloseIconTouchBoundsInt());
        q1.b(L1.g);
        q1.a.setEnabled(chip.isEnabled());
    }

    @Override // defpackage.AbstractC5884mR
    public final void t(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.q;
            chip.m = z;
            chip.refreshDrawableState();
        }
    }
}
