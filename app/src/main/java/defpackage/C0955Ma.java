package defpackage;

import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecordingConfiguration;
import java.util.Iterator;
import java.util.List;

/* renamed from: Ma, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0955Ma extends AudioManager$AudioRecordingCallback {
    public final /* synthetic */ C1033Na a;

    public C0955Ma(C1033Na c1033Na) {
        this.a = c1033Na;
    }

    public final void onRecordingConfigChanged(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfigurationF = AbstractC3876g.f(it.next());
            if (S5.a(audioRecordingConfigurationF) == this.a.a.getAudioSessionId()) {
                this.a.c(U5.b(audioRecordingConfigurationF));
                return;
            }
        }
    }
}
