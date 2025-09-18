package p000;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.material.timepicker.C1950f;
import ru.mes.dnevnik.R;

/* renamed from: oa1 */
/* loaded from: classes.dex */
public final class C10540oa1 extends AbstractC1628Zs {

    /* renamed from: e */
    public final /* synthetic */ int f39098e;

    /* renamed from: f */
    public final /* synthetic */ C1950f f39099f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10540oa1(C1950f c1950f, Context context, int i) {
        super(context, R.string.material_hour_selection);
        this.f39098e = i;
        switch (i) {
            case 1:
                this.f39099f = c1950f;
                super(context, R.string.material_minute_selection);
                break;
            default:
                this.f39099f = c1950f;
                break;
        }
    }

    @Override // p000.AbstractC1628Zs, p000.C0002A1
    /* renamed from: d */
    public final void mo11d(C1009Q1 c1009q1, View view) {
        C1950f c1950f = this.f39099f;
        switch (this.f39098e) {
            case 0:
                super.mo11d(c1009q1, view);
                Resources resources = view.getResources();
                C10156la1 c10156la1 = c1950f.f18421b;
                c1009q1.m6540l(resources.getString(c10156la1.f37170c == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(c10156la1.m22511b())));
                break;
            default:
                super.mo11d(c1009q1, view);
                c1009q1.m6540l(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(c1950f.f18421b.f37172e)));
                break;
        }
    }
}
