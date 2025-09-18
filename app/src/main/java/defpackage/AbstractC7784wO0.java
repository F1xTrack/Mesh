package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: wO0 */
/* loaded from: classes.dex */
public abstract class AbstractC7784wO0 {
    public C3866fw1 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(OO0 oo0) {
        RecyclerView recyclerView;
        int i = oo0.j;
        if (oo0.g() || (i & 4) != 0 || (recyclerView = oo0.r) == null) {
            return;
        }
        recyclerView.J(oo0);
    }

    public abstract boolean a(OO0 oo0, OO0 oo02, C7950xG0 c7950xG0, C7950xG0 c7950xG02);

    public final void c(OO0 oo0) {
        C3866fw1 c3866fw1 = this.a;
        if (c3866fw1 != null) {
            boolean z = true;
            oo0.o(true);
            if (oo0.h != null && oo0.i == null) {
                oo0.h = null;
            }
            oo0.i = null;
            if ((oo0.j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = (RecyclerView) c3866fw1.b;
            recyclerView.j0();
            C5772lr0 c5772lr0 = recyclerView.f;
            C3513e41 c3513e41 = (C3513e41) c5772lr0.b;
            RecyclerView recyclerView2 = (RecyclerView) c3513e41.b;
            View view = oo0.a;
            int iIndexOfChild = recyclerView2.indexOfChild(view);
            if (iIndexOfChild == -1) {
                c5772lr0.b0(view);
            } else {
                C0617Hr c0617Hr = (C0617Hr) c5772lr0.c;
                if (c0617Hr.v(iIndexOfChild)) {
                    c0617Hr.z(iIndexOfChild);
                    c5772lr0.b0(view);
                    c3513e41.S0(iIndexOfChild);
                } else {
                    z = false;
                }
            }
            if (z) {
                OO0 oo0M = RecyclerView.M(view);
                FO0 fo0 = recyclerView.c;
                fo0.l(oo0M);
                fo0.i(oo0M);
                if (RecyclerView.M1) {
                    Objects.toString(view);
                    recyclerView.toString();
                }
            }
            recyclerView.k0(!z);
            if (z || !oo0.k()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(OO0 oo0);

    public abstract void e();

    public abstract boolean f();
}
