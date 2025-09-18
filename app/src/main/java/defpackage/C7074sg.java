package defpackage;

import android.net.Uri;

/* renamed from: sg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7074sg extends RuntimeException {
    public /* synthetic */ C7074sg() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public static C7074sg a(String str, String str2, Exception exc) {
        return new C7074sg(AbstractC1705Vq.h(str2, "\n\nTry the following to fix the issue:\n• Ensure that Metro is running\n• Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n• Ensure Airplane Mode is disabled\n• If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT>' to forward requests from your device\n• If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n".replace("<PORT>", String.valueOf(Uri.parse(str).getPort())), ""), exc);
    }

    public /* synthetic */ C7074sg(Exception exc) {
        super("An exception was thrown by an Executor", exc);
    }

    public C7074sg(String str) {
        super("Invalid request builder: ".concat(str));
    }

    public C7074sg(Integer num) {
        super("Invalid size: " + num.toString());
    }
}
