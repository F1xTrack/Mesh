package p000;

import android.content.DialogInterface;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g;

/* loaded from: classes2.dex */
public class UI0 extends DialogInterfaceOnCancelListenerC1725g {

    /* renamed from: a */
    public TimePickerDialogC11778yH0 f11724a;

    /* renamed from: b */
    public DialogInterfaceOnDismissListenerC10668pa1 f11725b;

    /* renamed from: c */
    public DialogInterfaceOnDismissListenerC10668pa1 f11726c;

    /* renamed from: d */
    public DialogInterfaceOnDismissListenerC10668pa1 f11727d;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.Dialog onCreateDialog(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = r17
            android.os.Bundle r1 = r17.getArguments()
            androidx.fragment.app.l r11 = r17.getActivity()
            pa1 r4 = r0.f11725b
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            if (r1 == 0) goto L21
            java.lang.String r3 = "value"
            boolean r5 = r1.containsKey(r3)
            if (r5 == 0) goto L21
            long r5 = r1.getLong(r3)
            r2.setTimeInMillis(r5)
        L21:
            java.util.TimeZone r3 = p000.AbstractC9886jT1.m22039e(r1)
            r2.setTimeZone(r3)
            r3 = 11
            int r5 = r2.get(r3)
            r3 = 12
            int r6 = r2.get(r3)
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r11)
            if (r1 == 0) goto L44
            java.lang.String r2 = "is24Hour"
            boolean r3 = android.text.format.DateFormat.is24HourFormat(r11)
            boolean r2 = r1.getBoolean(r2, r3)
        L44:
            r8 = r2
            r12 = 1
            if (r1 == 0) goto L61
            java.lang.String r2 = "minuteInterval"
            int r3 = r1.getInt(r2)
            int r7 = p000.TimePickerDialogC11778yH0.f46167h
            if (r3 < r12) goto L61
            r7 = 30
            if (r3 > r7) goto L61
            r7 = 60
            int r7 = r7 % r3
            if (r7 != 0) goto L61
            int r2 = r1.getInt(r2)
            r7 = r2
            goto L62
        L61:
            r7 = r12
        L62:
            r13 = 2
            r14 = 0
            java.lang.String r15 = "display"
            if (r1 == 0) goto L7e
            java.lang.String r2 = r1.getString(r15, r14)
            if (r2 == 0) goto L7e
            java.lang.String r2 = r1.getString(r15)
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = r2.toUpperCase(r3)
            int r2 = p000.AbstractC0852NX.m5774w(r2)
            r9 = r2
            goto L7f
        L7e:
            r9 = r13
        L7f:
            if (r9 != r12) goto L8b
            yH0 r16 = new yH0
            r10 = 0
            r2 = r16
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L93
        L8b:
            yH0 r16 = new yH0
            r2 = r16
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L93:
            if (r1 == 0) goto Lbc
            pa1 r3 = r0.f11727d
            p000.AbstractC9886jT1.m22043i(r1, r2, r3)
            if (r11 == 0) goto Lbc
            java.lang.String r3 = r1.getString(r15, r14)
            if (r3 == 0) goto Lb0
            java.lang.String r3 = r1.getString(r15)
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r3 = r3.toUpperCase(r4)
            int r13 = p000.AbstractC0852NX.m5774w(r3)
        Lb0:
            if (r13 != r12) goto Lb3
            goto Lb4
        Lb3:
            r12 = 0
        Lb4:
            Pu r3 = new Pu
            r3.<init>(r2, r11, r1, r12)
            r2.setOnShowListener(r3)
        Lbc:
            r0.f11724a = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.UI0.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC1725g, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        DialogInterfaceOnDismissListenerC10668pa1 dialogInterfaceOnDismissListenerC10668pa1 = this.f11726c;
        if (dialogInterfaceOnDismissListenerC10668pa1 != null) {
            dialogInterfaceOnDismissListenerC10668pa1.onDismiss(dialogInterface);
        }
    }
}
