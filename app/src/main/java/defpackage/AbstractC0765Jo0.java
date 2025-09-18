package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* renamed from: Jo0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0765Jo0 {
    public static void a(InterfaceC0410Fa interfaceC0410Fa, Object obj) {
        C3607ea c3607ea;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
        NE ne = (NE) interfaceC0410Fa;
        if (audioDeviceInfo == null) {
            c3607ea = null;
        } else {
            ne.getClass();
            c3607ea = new C3607ea(audioDeviceInfo);
        }
        ne.c0 = c3607ea;
        C2541ca c2541ca = ne.y;
        if (c2541ca != null) {
            c2541ca.b(audioDeviceInfo);
        }
        AudioTrack audioTrack = ne.w;
        if (audioTrack != null) {
            FE.a(audioTrack, ne.c0);
        }
    }
}
