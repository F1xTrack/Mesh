package defpackage;

import android.app.Notification;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;
import androidx.work.impl.foreground.SystemForegroundService;
import com.huawei.hms.rn.push.constants.NotificationConstants;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* renamed from: Zr0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC2021Zr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC2021Zr0(Object obj, int i, Object obj2, int i2, int i3) {
        this.a = i3;
        this.e = obj;
        this.b = i;
        this.d = obj2;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TimePickerDialogC8143yH0 timePickerDialogC8143yH0 = (TimePickerDialogC8143yH0) this.e;
                View viewFindViewById = timePickerDialogC8143yH0.findViewById(timePickerDialogC8143yH0.g.getResources().getIdentifier("input_mode", NotificationConstants.ID, ConstantDeviceInfo.APP_PLATFORM));
                int i = this.c;
                TimePicker timePicker = (TimePicker) this.d;
                int i2 = this.b;
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
                int i4 = this.c;
                Notification notification = (Notification) this.d;
                int i5 = this.b;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.e;
                if (i3 < 31) {
                    if (i3 < 29) {
                        systemForegroundService.startForeground(i5, notification);
                        break;
                    } else {
                        O71.a(systemForegroundService, i5, notification, i4);
                        break;
                    }
                } else {
                    P71.a(systemForegroundService, i5, notification, i4);
                    break;
                }
        }
    }
}
