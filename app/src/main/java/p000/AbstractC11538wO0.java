package p000;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: wO0 */
/* loaded from: classes.dex */
public abstract class AbstractC11538wO0 {

    /* renamed from: a */
    public C9432fw1 f44847a;

    /* renamed from: b */
    public ArrayList f44848b;

    /* renamed from: c */
    public long f44849c;

    /* renamed from: d */
    public long f44850d;

    /* renamed from: e */
    public long f44851e;

    /* renamed from: f */
    public long f44852f;

    /* renamed from: b */
    public static void m25613b(OO0 oo0) {
        RecyclerView recyclerView;
        int i = oo0.f8417j;
        if (oo0.m6050g() || (i & 4) != 0 || (recyclerView = oo0.f8425r) == null) {
            return;
        }
        recyclerView.m10243J(oo0);
    }

    /* renamed from: a */
    public abstract boolean mo8953a(OO0 oo0, OO0 oo02, C11649xG0 c11649xG0, C11649xG0 c11649xG02);

    /* renamed from: c */
    public final void m25614c(OO0 oo0) {
        C9432fw1 c9432fw1 = this.f44847a;
        if (c9432fw1 != null) {
            boolean z = true;
            oo0.m6058o(true);
            if (oo0.f8415h != null && oo0.f8416i == null) {
                oo0.f8415h = null;
            }
            oo0.f8416i = null;
            if ((oo0.f8417j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = (RecyclerView) c9432fw1.f27505b;
            recyclerView.m10271j0();
            C10189lr0 c10189lr0 = recyclerView.f16504f;
            C9196e41 c9196e41 = (C9196e41) c10189lr0.f37323b;
            RecyclerView recyclerView2 = (RecyclerView) c9196e41.f26532b;
            View view = oo0.f8408a;
            int iIndexOfChild = recyclerView2.indexOfChild(view);
            if (iIndexOfChild == -1) {
                c10189lr0.m22569b0(view);
            } else {
                C0495Hr c0495Hr = (C0495Hr) c10189lr0.f37324c;
                if (c0495Hr.m3632v(iIndexOfChild)) {
                    c0495Hr.m3634z(iIndexOfChild);
                    c10189lr0.m22569b0(view);
                    c9196e41.m17856S0(iIndexOfChild);
                } else {
                    z = false;
                }
            }
            if (z) {
                OO0 oo0M10226M = RecyclerView.m10226M(view);
                FO0 fo0 = recyclerView.f16498c;
                fo0.m2629l(oo0M10226M);
                fo0.m2626i(oo0M10226M);
                if (RecyclerView.f16451M1) {
                    Objects.toString(view);
                    recyclerView.toString();
                }
            }
            recyclerView.m10273k0(!z);
            if (z || !oo0.m6054k()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    /* renamed from: d */
    public abstract void mo8954d(OO0 oo0);

    /* renamed from: e */
    public abstract void mo8955e();

    /* renamed from: f */
    public abstract boolean mo8956f();
}
