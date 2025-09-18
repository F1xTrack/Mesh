package p000;

import android.content.Context;
import android.view.View;
import ru.mes.dnevnik.R;

/* renamed from: ta1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11180ta1 extends AbstractC1628Zs {

    /* renamed from: e */
    public final /* synthetic */ int f43145e;

    /* renamed from: f */
    public final /* synthetic */ C10156la1 f43146f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11180ta1(Context context, C10156la1 c10156la1, int i) {
        super(context, R.string.material_hour_selection);
        this.f43145e = i;
        switch (i) {
            case 1:
                this.f43146f = c10156la1;
                super(context, R.string.material_minute_selection);
                break;
            default:
                this.f43146f = c10156la1;
                break;
        }
    }

    @Override // p000.AbstractC1628Zs, p000.C0002A1
    /* renamed from: d */
    public final void mo11d(C1009Q1 c1009q1, View view) {
        C10156la1 c10156la1 = this.f43146f;
        switch (this.f43145e) {
            case 0:
                super.mo11d(c1009q1, view);
                c1009q1.m6540l(view.getResources().getString(c10156la1.f37170c == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(c10156la1.m22511b())));
                break;
            default:
                super.mo11d(c1009q1, view);
                c1009q1.m6540l(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(c10156la1.f37172e)));
                break;
        }
    }
}
