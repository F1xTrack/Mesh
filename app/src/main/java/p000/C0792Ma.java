package p000;

import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecordingConfiguration;
import java.util.Iterator;
import java.util.List;

/* renamed from: Ma */
/* loaded from: classes.dex */
public final class C0792Ma extends AudioManager$AudioRecordingCallback {

    /* renamed from: a */
    public final /* synthetic */ C0855Na f7229a;

    public C0792Ma(C0855Na c0855Na) {
        this.f7229a = c0855Na;
    }

    public final void onRecordingConfigChanged(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfigurationM18353f = AbstractC4088g.m18353f(it.next());
            if (AbstractC1138S5.m7176a(audioRecordingConfigurationM18353f) == this.f7229a.f7880a.getAudioSessionId()) {
                this.f7229a.m5781c(AbstractC1264U5.m7893b(audioRecordingConfigurationM18353f));
                return;
            }
        }
    }
}
