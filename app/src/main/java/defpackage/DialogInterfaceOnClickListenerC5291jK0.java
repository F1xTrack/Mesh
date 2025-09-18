package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import ru.mes.dnevnik.R;

/* renamed from: jK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC5291jK0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ C6818rK0 b;

    public /* synthetic */ DialogInterfaceOnClickListenerC5291jK0(C6818rK0 c6818rK0, int i) {
        this.a = i;
        this.b = c6818rK0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                C6818rK0 c6818rK0 = this.b;
                c6818rK0.getClass();
                if (i == 0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(c6818rK0.u1);
                    builder.setTitle(R.string.select_playback_speed);
                    builder.setSingleChoiceItems(new String[]{"0.5x", "1.0x", "1.5x", "2.0x"}, c6818rK0.D1, new DialogInterfaceOnClickListenerC5291jK0(c6818rK0, 1));
                    builder.show();
                    break;
                }
                break;
            default:
                C6818rK0 c6818rK02 = this.b;
                c6818rK02.D1 = i;
                c6818rK02.setRateModifier(i != 0 ? i != 2 ? i != 3 ? 1.0f : 2.0f : 1.5f : 0.5f);
                break;
        }
    }
}
