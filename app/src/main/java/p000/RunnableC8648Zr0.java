package p000;

import android.app.Notification;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;
import androidx.work.impl.foreground.SystemForegroundService;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* renamed from: Zr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC8648Zr0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f15154a;

    /* renamed from: b */
    public final /* synthetic */ int f15155b;

    /* renamed from: c */
    public final /* synthetic */ int f15156c;

    /* renamed from: d */
    public final /* synthetic */ Object f15157d;

    /* renamed from: e */
    public final /* synthetic */ Object f15158e;

    public /* synthetic */ RunnableC8648Zr0(Object obj, int i, Object obj2, int i2, int i3) {
        this.f15154a = i3;
        this.f15158e = obj;
        this.f15155b = i;
        this.f15157d = obj2;
        this.f15156c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15154a) {
            case 0:
                TimePickerDialogC11778yH0 timePickerDialogC11778yH0 = (TimePickerDialogC11778yH0) this.f15158e;
                View viewFindViewById = timePickerDialogC11778yH0.findViewById(timePickerDialogC11778yH0.f46174g.getResources().getIdentifier("input_mode", NotificationConstants.f19487ID, ConstantDeviceInfo.APP_PLATFORM));
                int i = this.f15156c;
                TimePicker timePicker = (TimePicker) this.f15157d;
                int i2 = this.f15155b;
                if (viewFindViewById != null && viewFindViewById.hasFocus()) {
                    if (i2 > 5) {
                        timePicker.setHour(i);
                        timePicker.setMinute(i2);
                        View viewFindFocus = timePicker.findFocus();
                        if (viewFindFocus instanceof EditText) {
                            EditText editText = (EditText) viewFindFocus;
                            editText.setSelection(editText.getText().length());
                            break;
                        }
                    }
                } else {
                    timePicker.setHour(i);
                    timePicker.setMinute(i2);
                    break;
                }
                break;
            default:
                int i3 = Build.VERSION.SDK_INT;
                int i4 = this.f15156c;
                Notification notification = (Notification) this.f15157d;
                int i5 = this.f15155b;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f15158e;
                if (i3 < 31) {
                    if (i3 < 29) {
                        systemForegroundService.startForeground(i5, notification);
                        break;
                    } else {
                        O71.m5955a(systemForegroundService, i5, notification, i4);
                        break;
                    }
                } else {
                    P71.m6238a(systemForegroundService, i5, notification, i4);
                    break;
                }
        }
    }
}
