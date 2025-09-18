package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* loaded from: classes.dex */
public abstract class U9 {
    private static V70 a() {
        U70 u70 = new U70(4);
        u70.b(8, 7);
        int i = AbstractC0277Dh1.a;
        if (i >= 31) {
            u70.b(26, 27);
        }
        if (i >= 33) {
            u70.a(30);
        }
        return u70.h();
    }

    public static boolean b(AudioManager audioManager, C3607ea c3607ea) {
        AudioDeviceInfo[] devices;
        if (c3607ea == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{c3607ea.a};
        }
        V70 v70A = a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (v70A.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
