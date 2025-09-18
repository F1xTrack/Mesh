package p000;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* renamed from: U9 */
/* loaded from: classes.dex */
public abstract class AbstractC1268U9 {
    /* renamed from: a */
    private static V70 m7919a() {
        U70 u70 = new U70(4);
        u70.m3756b(8, 7);
        int i = AbstractC7485Dh1.f2166a;
        if (i >= 31) {
            u70.m3756b(26, 27);
        }
        if (i >= 33) {
            u70.m3755a(30);
        }
        return u70.m7918h();
    }

    /* renamed from: b */
    public static boolean m7920b(AudioManager audioManager, C3999ea c3999ea) {
        AudioDeviceInfo[] devices;
        if (c3999ea == null) {
            audioManager.getClass();
            devices = audioManager.getDevices(2);
        } else {
            devices = new AudioDeviceInfo[]{c3999ea.f26754a};
        }
        V70 v70M7919a = m7919a();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (v70M7919a.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return true;
            }
        }
        return false;
    }
}
