package p000;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* renamed from: j2 */
/* loaded from: classes.dex */
public final class C6212j2 extends AbstractViewOnTouchListenerC0034AX {

    /* renamed from: j */
    public final /* synthetic */ int f34848j = 0;

    /* renamed from: k */
    public final /* synthetic */ View f34849k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6212j2(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f34849k = actionMenuItemView;
    }

    @Override // p000.AbstractViewOnTouchListenerC0034AX
    /* renamed from: b */
    public final InterfaceC11742y01 mo200b() {
        C6338l2 c6338l2;
        switch (this.f34848j) {
            case 0:
                AbstractC6275k2 abstractC6275k2 = ((ActionMenuItemView) this.f34849k).f15756m;
                if (abstractC6275k2 == null || (c6338l2 = ((C6401m2) abstractC6275k2).f37418a.f38709t) == null) {
                    return null;
                }
                return c6338l2.m7120a();
            default:
                C6338l2 c6338l22 = ((C6464n2) this.f34849k).f38047d.f38708s;
                if (c6338l22 == null) {
                    return null;
                }
                return c6338l22.m7120a();
        }
    }

    @Override // p000.AbstractViewOnTouchListenerC0034AX
    /* renamed from: c */
    public final boolean mo201c() {
        InterfaceC11742y01 interfaceC11742y01Mo200b;
        switch (this.f34848j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f34849k;
                InterfaceC7398Bq0 interfaceC7398Bq0 = actionMenuItemView.f15754k;
                return interfaceC7398Bq0 != null && interfaceC7398Bq0.mo892a(actionMenuItemView.f15751h) && (interfaceC11742y01Mo200b = mo200b()) != null && interfaceC11742y01Mo200b.mo334a();
            default:
                ((C6464n2) this.f34849k).f38047d.m23313l();
                return true;
        }
    }

    @Override // p000.AbstractViewOnTouchListenerC0034AX
    /* renamed from: d */
    public boolean mo202d() {
        switch (this.f34848j) {
            case 1:
                C6527o2 c6527o2 = ((C6464n2) this.f34849k).f38047d;
                if (c6527o2.f38710u != null) {
                    return false;
                }
                c6527o2.m23311b();
                return true;
            default:
                return super.mo202d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6212j2(C6464n2 c6464n2, C6464n2 c6464n22) {
        super(c6464n22);
        this.f34849k = c6464n2;
    }
}
