package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.android.material.timepicker.f;
import ru.mes.dnevnik.R;

/* renamed from: oa1 */
/* loaded from: classes.dex */
public final class C6295oa1 extends AbstractC2023Zs {
    public final /* synthetic */ int e;
    public final /* synthetic */ f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6295oa1(f fVar, Context context, int i) {
        super(context, R.string.material_hour_selection);
        this.e = i;
        switch (i) {
            case 1:
                this.f = fVar;
                super(context, R.string.material_minute_selection);
                break;
            default:
                this.f = fVar;
                break;
        }
    }

    @Override // defpackage.AbstractC2023Zs, defpackage.A1
    public final void d(Q1 q1, View view) {
        f fVar = this.f;
        switch (this.e) {
            case 0:
                super.d(q1, view);
                Resources resources = view.getResources();
                C5722la1 c5722la1 = fVar.b;
                q1.l(resources.getString(c5722la1.c == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix, String.valueOf(c5722la1.b())));
                break;
            default:
                super.d(q1, view);
                q1.l(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(fVar.b.e)));
                break;
        }
    }
}
