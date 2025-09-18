package p000;

import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: W9 */
/* loaded from: classes.dex */
public abstract class AbstractC1394W9 {
    /* renamed from: a */
    public static C1520Y9 m8689a(AudioManager audioManager, C1017Q9 c1017q9) {
        List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) c1017q9.m6587a().f3494a);
        HashMap map = new HashMap();
        map.put(2, new HashSet(AbstractC10983s22.m24579a(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfileM7589h = AbstractC1205T9.m7589h(directProfilesForAttributes.get(i));
            if (audioProfileM7589h.getEncapsulationType() != 1) {
                int format = audioProfileM7589h.getFormat();
                if (AbstractC7485Dh1.m1798M(format) || C1520Y9.f14175e.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) map.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(AbstractC10983s22.m24579a(audioProfileM7589h.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(AbstractC10983s22.m24579a(audioProfileM7589h.getChannelMasks())));
                    }
                }
            }
        }
        M70 m70M6233t = P70.m6233t();
        for (Map.Entry entry : map.entrySet()) {
            m70M6233t.m3755a(new C1457X9(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new C1520Y9(m70M6233t.m5273h());
    }

    /* renamed from: b */
    public static C3999ea m8690b(AudioManager audioManager, C1017Q9 c1017q9) {
        try {
            audioManager.getClass();
            List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) c1017q9.m6587a().f3494a);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new C3999ea((AudioDeviceInfo) audioDevicesForAttributes.get(0));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
