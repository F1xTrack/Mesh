package p000;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.C1943d;
import java.util.Calendar;

/* renamed from: Xn0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC8536Xn0 implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f13970a;

    /* renamed from: b */
    public final Object f13971b;

    /* renamed from: c */
    public final /* synthetic */ Object f13972c;

    public /* synthetic */ ViewOnClickListenerC8536Xn0(C8898bo0 c8898bo0, C1943d c1943d, int i) {
        this.f13970a = i;
        this.f13972c = c8898bo0;
        this.f13971b = c1943d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13970a) {
            case 0:
                C8898bo0 c8898bo0 = (C8898bo0) this.f13972c;
                int iM10195O0 = ((LinearLayoutManager) c8898bo0.f17167i.getLayoutManager()).m10195O0() - 1;
                if (iM10195O0 >= 0) {
                    Calendar calendarM23523d = AbstractC10554oh1.m23523d(((C1943d) this.f13971b).f18210d.f41848a.f11016a);
                    calendarM23523d.add(2, iM10195O0);
                    c8898bo0.m10522s(new C8286Ss0(calendarM23523d));
                    break;
                }
                break;
            case 1:
                C8898bo0 c8898bo02 = (C8898bo0) this.f13972c;
                int iM10194N0 = ((LinearLayoutManager) c8898bo02.f17167i.getLayoutManager()).m10194N0() + 1;
                if (iM10194N0 < c8898bo02.f17167i.getAdapter().mo3173a()) {
                    Calendar calendarM23523d2 = AbstractC10554oh1.m23523d(((C1943d) this.f13971b).f18210d.f41848a.f11016a);
                    calendarM23523d2.add(2, iM10194N0);
                    c8898bo02.m10522s(new C8286Ss0(calendarM23523d2));
                    break;
                }
                break;
            default:
                C9518gb1 c9518gb1 = (C9518gb1) this.f13972c;
                Window.Callback callback = c9518gb1.f27872k;
                if (callback != null && c9518gb1.f27873l) {
                    callback.onMenuItemSelected(0, (C4217i2) this.f13971b);
                    break;
                }
                break;
        }
    }

    public ViewOnClickListenerC8536Xn0(C9518gb1 c9518gb1) {
        this.f13970a = 2;
        this.f13972c = c9518gb1;
        Context context = c9518gb1.f27862a.getContext();
        CharSequence charSequence = c9518gb1.f27869h;
        C4217i2 c4217i2 = new C4217i2();
        c4217i2.f28766e = 4096;
        c4217i2.f28768g = 4096;
        c4217i2.f28773l = null;
        c4217i2.f28774m = null;
        c4217i2.f28775n = false;
        c4217i2.f28776o = false;
        c4217i2.f28777p = 16;
        c4217i2.f28770i = context;
        c4217i2.f28762a = charSequence;
        this.f13971b = c4217i2;
    }
}
