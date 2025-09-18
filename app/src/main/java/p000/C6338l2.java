package p000;

import android.content.Context;
import android.view.View;
import ru.mes.dnevnik.R;

/* renamed from: l2 */
/* loaded from: classes.dex */
public final class C6338l2 extends C8230Rq0 {

    /* renamed from: l */
    public final /* synthetic */ int f36823l = 1;

    /* renamed from: m */
    public final /* synthetic */ C6527o2 f36824m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6338l2(C6527o2 c6527o2, Context context, MenuC7450Cq0 menuC7450Cq0, View view) {
        super(R.attr.actionOverflowMenuStyle, menuC7450Cq0, context, view, true);
        this.f36824m = c6527o2;
        this.f10450f = 8388613;
        C9196e41 c9196e41 = c6527o2.f38712w;
        this.f10452h = c9196e41;
        AbstractC8126Pq0 abstractC8126Pq0 = this.f10453i;
        if (abstractC8126Pq0 != null) {
            abstractC8126Pq0.mo305g(c9196e41);
        }
    }

    @Override // p000.C8230Rq0
    /* renamed from: c */
    public final void mo7122c() {
        switch (this.f36823l) {
            case 0:
                C6527o2 c6527o2 = this.f36824m;
                c6527o2.f38709t = null;
                c6527o2.getClass();
                super.mo7122c();
                break;
            default:
                C6527o2 c6527o22 = this.f36824m;
                MenuC7450Cq0 menuC7450Cq0 = c6527o22.f38692c;
                if (menuC7450Cq0 != null) {
                    menuC7450Cq0.m1404c(true);
                }
                c6527o22.f38708s = null;
                super.mo7122c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6338l2(C6527o2 c6527o2, Context context, I51 i51, View view) {
        super(R.attr.actionOverflowMenuStyle, i51, context, view, false);
        this.f36824m = c6527o2;
        if (!i51.f4695A.m4770f()) {
            View view2 = c6527o2.f38698i;
            this.f10449e = view2 == null ? (View) c6527o2.f38697h : view2;
        }
        C9196e41 c9196e41 = c6527o2.f38712w;
        this.f10452h = c9196e41;
        AbstractC8126Pq0 abstractC8126Pq0 = this.f10453i;
        if (abstractC8126Pq0 != null) {
            abstractC8126Pq0.mo305g(c9196e41);
        }
    }
}
