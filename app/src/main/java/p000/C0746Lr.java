package p000;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import ru.mes.dnevnik.R;

/* renamed from: Lr */
/* loaded from: classes.dex */
public final class C0746Lr extends AbstractC6426mR {

    /* renamed from: q */
    public final /* synthetic */ Chip f6898q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0746Lr(Chip chip, Chip chip2) {
        super(chip2);
        this.f6898q = chip;
    }

    @Override // p000.AbstractC6426mR
    /* renamed from: m */
    public final int mo5118m(float f, float f2) {
        Rect rect = Chip.f18176w;
        Chip chip = this.f6898q;
        return (chip.m11233d() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
    }

    @Override // p000.AbstractC6426mR
    /* renamed from: n */
    public final void mo5119n(ArrayList arrayList) {
        boolean z = false;
        arrayList.add(0);
        Rect rect = Chip.f18176w;
        Chip chip = this.f6898q;
        if (chip.m11233d()) {
            C0872Nr c0872Nr = chip.f18179e;
            if (c0872Nr != null && c0872Nr.f8056L) {
                z = true;
            }
            if (!z || chip.f18182h == null) {
                return;
            }
            arrayList.add(1);
        }
    }

    @Override // p000.AbstractC6426mR
    /* renamed from: q */
    public final boolean mo5120q(int i, int i2) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.f6898q;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.f18182h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.f18193s) {
                    chip.f18192r.m22825v(1, 1);
                }
            }
        }
        return z;
    }

    @Override // p000.AbstractC6426mR
    /* renamed from: r */
    public final void mo5121r(C1009Q1 c1009q1) {
        Chip chip = this.f6898q;
        boolean zM11234e = chip.m11234e();
        AccessibilityNodeInfo accessibilityNodeInfo = c1009q1.f9401a;
        accessibilityNodeInfo.setCheckable(zM11234e);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c1009q1.m6539k(chip.getAccessibilityClassName());
        c1009q1.m6544p(chip.getText());
    }

    @Override // p000.AbstractC6426mR
    /* renamed from: s */
    public final void mo5122s(int i, C1009Q1 c1009q1) {
        if (i != 1) {
            c1009q1.m6540l("");
            c1009q1.m6538j(Chip.f18176w);
            return;
        }
        Chip chip = this.f6898q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            c1009q1.m6540l(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            c1009q1.m6540l(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        c1009q1.m6538j(chip.getCloseIconTouchBoundsInt());
        c1009q1.m6531b(C0695L1.f6454g);
        c1009q1.f9401a.setEnabled(chip.isEnabled());
    }

    @Override // p000.AbstractC6426mR
    /* renamed from: t */
    public final void mo5123t(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.f6898q;
            chip.f18187m = z;
            chip.refreshDrawableState();
        }
    }
}
