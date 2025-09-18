package defpackage;

import android.content.Context;
import android.view.View;
import ru.mes.dnevnik.R;

/* renamed from: l2 */
/* loaded from: classes.dex */
public final class C5616l2 extends C1394Rq0 {
    public final /* synthetic */ int l = 1;
    public final /* synthetic */ C6189o2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5616l2(C6189o2 c6189o2, Context context, MenuC0225Cq0 menuC0225Cq0, View view) {
        super(R.attr.actionOverflowMenuStyle, menuC0225Cq0, context, view, true);
        this.m = c6189o2;
        this.f = 8388613;
        C3513e41 c3513e41 = c6189o2.w;
        this.h = c3513e41;
        AbstractC1238Pq0 abstractC1238Pq0 = this.i;
        if (abstractC1238Pq0 != null) {
            abstractC1238Pq0.g(c3513e41);
        }
    }

    @Override // defpackage.C1394Rq0
    public final void c() {
        switch (this.l) {
            case 0:
                C6189o2 c6189o2 = this.m;
                c6189o2.t = null;
                c6189o2.getClass();
                super.c();
                break;
            default:
                C6189o2 c6189o22 = this.m;
                MenuC0225Cq0 menuC0225Cq0 = c6189o22.c;
                if (menuC0225Cq0 != null) {
                    menuC0225Cq0.c(true);
                }
                c6189o22.s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5616l2(C6189o2 c6189o2, Context context, I51 i51, View view) {
        super(R.attr.actionOverflowMenuStyle, i51, context, view, false);
        this.m = c6189o2;
        if (!i51.A.f()) {
            View view2 = c6189o2.i;
            this.e = view2 == null ? (View) c6189o2.h : view2;
        }
        C3513e41 c3513e41 = c6189o2.w;
        this.h = c3513e41;
        AbstractC1238Pq0 abstractC1238Pq0 = this.i;
        if (abstractC1238Pq0 != null) {
            abstractC1238Pq0.g(c3513e41);
        }
    }
}
