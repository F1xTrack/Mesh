package defpackage;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class W9 {
    public static Y9 a(AudioManager audioManager, Q9 q9) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) q9.a().a);
        HashMap map = new HashMap();
        map.put(2, new HashSet(AbstractC6955s22.a(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfileH = T9.h(directProfilesForAttributes.get(i));
            if (audioProfileH.getEncapsulationType() != 1) {
                int format = audioProfileH.getFormat();
                if (AbstractC0277Dh1.M(format) || Y9.e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(AbstractC6955s22.a(audioProfileH.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(AbstractC6955s22.a(audioProfileH.getChannelMasks())));
                    }
                }
            }
        }
        M70 m70T = P70.t();
        for (Map.Entry entry : map.entrySet()) {
            m70T.a(new X9(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new Y9(m70T.h());
    }

    public static C3607ea b(AudioManager audioManager, Q9 q9) {
        try {
            audioManager.getClass();
            List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) q9.a().a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C3607ea((AudioDeviceInfo) audioDevicesForAttributes.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
