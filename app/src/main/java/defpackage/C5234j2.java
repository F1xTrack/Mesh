package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* renamed from: j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5234j2 extends AX {
    public final /* synthetic */ int j = 0;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5234j2(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.k = actionMenuItemView;
    }

    @Override // defpackage.AX
    public final InterfaceC8090y01 b() {
        C5616l2 c5616l2;
        switch (this.j) {
            case 0:
                AbstractC5425k2 abstractC5425k2 = ((ActionMenuItemView) this.k).m;
                if (abstractC5425k2 == null || (c5616l2 = ((C5807m2) abstractC5425k2).a.t) == null) {
                    return null;
                }
                return c5616l2.a();
            default:
                C5616l2 c5616l22 = ((C5998n2) this.k).d.s;
                if (c5616l22 == null) {
                    return null;
                }
                return c5616l22.a();
        }
    }

    @Override // defpackage.AX
    public final boolean c() {
        InterfaceC8090y01 interfaceC8090y01B;
        switch (this.j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.k;
                InterfaceC0147Bq0 interfaceC0147Bq0 = actionMenuItemView.k;
                return interfaceC0147Bq0 != null && interfaceC0147Bq0.a(actionMenuItemView.h) && (interfaceC8090y01B = b()) != null && interfaceC8090y01B.a();
            default:
                ((C5998n2) this.k).d.l();
                return true;
        }
    }

    @Override // defpackage.AX
    public boolean d() {
        switch (this.j) {
            case 1:
                C6189o2 c6189o2 = ((C5998n2) this.k).d;
                if (c6189o2.u != null) {
                    return false;
                }
                c6189o2.b();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5234j2(C5998n2 c5998n2, C5998n2 c5998n22) {
        super(c5998n22);
        this.k = c5998n2;
    }
}
