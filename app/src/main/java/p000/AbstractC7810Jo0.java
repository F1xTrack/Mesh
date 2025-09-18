package p000;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* renamed from: Jo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7810Jo0 {
    /* renamed from: a */
    public static void m4417a(InterfaceC0352Fa interfaceC0352Fa, Object obj) {
        C3999ea c3999ea;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        C0833NE c0833ne = (C0833NE) interfaceC0352Fa;
        if (audioDeviceInfo == null) {
            c3999ea = null;
        } else {
            c0833ne.getClass();
            c3999ea = new C3999ea(audioDeviceInfo);
        }
        c0833ne.f7619c0 = c3999ea;
        C1856ca c1856ca = c0833ne.f7650y;
        if (c1856ca != null) {
            c1856ca.m10790b(audioDeviceInfo);
        }
        AudioTrack audioTrack = c0833ne.f7648w;
        if (audioTrack != null) {
            AbstractC0330FE.m2556a(audioTrack, c0833ne.f7619c0);
        }
    }
}
