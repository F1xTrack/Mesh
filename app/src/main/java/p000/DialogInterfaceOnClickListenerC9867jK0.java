package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import ru.mes.dnevnik.R;

/* renamed from: jK0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC9867jK0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f35066a;

    /* renamed from: b */
    public final /* synthetic */ C10891rK0 f35067b;

    public /* synthetic */ DialogInterfaceOnClickListenerC9867jK0(C10891rK0 c10891rK0, int i) {
        this.f35066a = i;
        this.f35067b = c10891rK0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f35066a) {
            case 0:
                C10891rK0 c10891rK0 = this.f35067b;
                c10891rK0.getClass();
                if (i == 0) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(c10891rK0.f41589u1);
                    builder.setTitle(R.string.select_playback_speed);
                    builder.setSingleChoiceItems(new String[]{"0.5x", "1.0x", "1.5x", "2.0x"}, c10891rK0.f41536D1, new DialogInterfaceOnClickListenerC9867jK0(c10891rK0, 1));
                    builder.show();
                    break;
                }
                break;
            default:
                C10891rK0 c10891rK02 = this.f35067b;
                c10891rK02.f41536D1 = i;
                c10891rK02.setRateModifier(i != 0 ? i != 2 ? i != 3 ? 1.0f : 2.0f : 1.5f : 0.5f);
                break;
        }
    }
}
