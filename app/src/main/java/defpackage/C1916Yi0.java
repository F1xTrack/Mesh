package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: Yi0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1916Yi0 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iB;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((OO0) this.k.get(i2)).a;
            AO0 ao0 = (AO0) view3.getLayoutParams();
            if (view3 != view && !ao0.a.i() && (iB = (ao0.a.b() - this.d) * this.e) >= 0 && iB < i) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i = iB;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((AO0) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(FO0 fo0) {
        List list = this.k;
        if (list == null) {
            View view = fo0.k(this.d, Long.MAX_VALUE).a;
            this.d += this.e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((OO0) this.k.get(i)).a;
            AO0 ao0 = (AO0) view2.getLayoutParams();
            if (!ao0.a.i() && this.d == ao0.a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
