package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.d;
import java.util.Calendar;

/* renamed from: Xn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1853Xn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ViewOnClickListenerC1853Xn0(C2394bo0 c2394bo0, d dVar, int i) {
        this.a = i;
        this.c = c2394bo0;
        this.b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                C2394bo0 c2394bo0 = (C2394bo0) this.c;
                int iO0 = ((LinearLayoutManager) c2394bo0.i.getLayoutManager()).O0() - 1;
                if (iO0 >= 0) {
                    Calendar calendarD = AbstractC6316oh1.d(((d) this.b).d.a.a);
                    calendarD.add(2, iO0);
                    c2394bo0.s(new C1478Ss0(calendarD));
                    break;
                }
                break;
            case 1:
                C2394bo0 c2394bo02 = (C2394bo0) this.c;
                int iN0 = ((LinearLayoutManager) c2394bo02.i.getLayoutManager()).N0() + 1;
                if (iN0 < c2394bo02.i.getAdapter().a()) {
                    Calendar calendarD2 = AbstractC6316oh1.d(((d) this.b).d.a.a);
                    calendarD2.add(2, iN0);
                    c2394bo02.s(new C1478Ss0(calendarD2));
                    break;
                }
                break;
            default:
                C3994gb1 c3994gb1 = (C3994gb1) this.c;
                Window.Callback callback = c3994gb1.k;
                if (callback != null && c3994gb1.l) {
                    callback.onMenuItemSelected(0, (C4267i2) this.b);
                    break;
                }
                break;
        }
    }

    public ViewOnClickListenerC1853Xn0(C3994gb1 c3994gb1) {
        this.a = 2;
        this.c = c3994gb1;
        Context context = c3994gb1.a.getContext();
        CharSequence charSequence = c3994gb1.h;
        C4267i2 c4267i2 = new C4267i2();
        c4267i2.e = 4096;
        c4267i2.g = 4096;
        c4267i2.l = null;
        c4267i2.m = null;
        c4267i2.n = false;
        c4267i2.o = false;
        c4267i2.p = 16;
        c4267i2.i = context;
        c4267i2.a = charSequence;
        this.b = c4267i2;
    }
}
