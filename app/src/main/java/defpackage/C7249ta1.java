package defpackage;

import android.content.Context;
import android.view.View;
import ru.mes.dnevnik.R;

/* renamed from: ta1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7249ta1 extends AbstractC2023Zs {
    public final /* synthetic */ int e;
    public final /* synthetic */ C5722la1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7249ta1(Context context, C5722la1 c5722la1, int i) {
        super(context, R.string.material_hour_selection);
        this.e = i;
        switch (i) {
            case 1:
                this.f = c5722la1;
                super(context, R.string.material_minute_selection);
                break;
            default:
                this.f = c5722la1;
                break;
        }
    }

    @Override // defpackage.AbstractC2023Zs, defpackage.A1
    public final void d(Q1 q1, View view) {
        C5722la1 c5722la1 = this.f;
        switch (this.e) {
            case 0:
                super.d(q1, view);
                q1.l(view.getResources().getString(c5722la1.c == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(c5722la1.b())));
                break;
            default:
                super.d(q1, view);
                q1.l(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(c5722la1.e)));
                break;
        }
    }
}
