package p000;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;

/* renamed from: U5 */
/* loaded from: classes.dex */
public abstract class AbstractC1264U5 {
    /* renamed from: a */
    public static AudioRecordingConfiguration m7892a(AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    /* renamed from: b */
    public static boolean m7893b(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    /* renamed from: c */
    public static void m7894c(AudioRecord audioRecord, ExecutorC10151lY0 executorC10151lY0, C0792Ma c0792Ma) {
        audioRecord.registerAudioRecordingCallback(executorC10151lY0, c0792Ma);
    }

    /* renamed from: d */
    public static void m7895d(AudioRecord audioRecord, C0792Ma c0792Ma) {
        audioRecord.unregisterAudioRecordingCallback(c0792Ma);
    }
}
