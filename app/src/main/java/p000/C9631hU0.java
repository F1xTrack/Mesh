package p000;

import android.app.Activity;
import android.widget.Toast;
import ru.mes.dnevnik.R;

/* renamed from: hU0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9631hU0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f28430e;

    /* renamed from: f */
    public final /* synthetic */ Activity f28431f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9631hU0(Activity activity, int i) {
        super(0);
        this.f28430e = i;
        this.f28431f = activity;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        switch (this.f28430e) {
            case 0:
                Activity activity = this.f28431f;
                Toast.makeText(activity, activity.getString(R.string.default_open_error), 0).show();
                break;
            case 1:
                Activity activity2 = this.f28431f;
                Toast.makeText(activity2, activity2.getString(R.string.default_open_error), 0).show();
                break;
            case 2:
                Activity activity3 = this.f28431f;
                Toast.makeText(activity3, activity3.getString(R.string.default_open_error), 0).show();
                break;
            default:
                Activity activity4 = this.f28431f;
                Toast.makeText(activity4, activity4.getString(R.string.default_open_error), 0).show();
                break;
        }
        return C8313Tf1.f11463a;
    }
}
