package defpackage;

import android.app.Activity;
import android.widget.Toast;
import ru.mes.dnevnik.R;

/* renamed from: hU0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4163hU0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ Activity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4163hU0(Activity activity, int i) {
        super(0);
        this.e = i;
        this.f = activity;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        switch (this.e) {
            case 0:
                Activity activity = this.f;
                Toast.makeText(activity, activity.getString(R.string.default_open_error), 0).show();
                break;
            case 1:
                Activity activity2 = this.f;
                Toast.makeText(activity2, activity2.getString(R.string.default_open_error), 0).show();
                break;
            case 2:
                Activity activity3 = this.f;
                Toast.makeText(activity3, activity3.getString(R.string.default_open_error), 0).show();
                break;
            default:
                Activity activity4 = this.f;
                Toast.makeText(activity4, activity4.getString(R.string.default_open_error), 0).show();
                break;
        }
        return C1518Tf1.a;
    }
}
