package p000;

import android.net.Uri;

/* renamed from: sg */
/* loaded from: classes.dex */
public class C6838sg extends RuntimeException {
    public /* synthetic */ C6838sg() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public static C6838sg m24762a(String str, String str2, Exception exc) {
        return new C6838sg(AbstractC1374Vq.m8589h(str2, "\n\nTry the following to fix the issue:\n• Ensure that Metro is running\n• Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n• Ensure Airplane Mode is disabled\n• If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT>' to forward requests from your device\n• If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n".replace("<PORT>", String.valueOf(Uri.parse(str).getPort())), ""), exc);
    }

    public /* synthetic */ C6838sg(Exception exc) {
        super("An exception was thrown by an Executor", exc);
    }

    public C6838sg(String str) {
        super("Invalid request builder: ".concat(str));
    }

    public C6838sg(Integer num) {
        super("Invalid size: " + num.toString());
    }
}
