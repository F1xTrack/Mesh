package defpackage;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;

/* loaded from: classes.dex */
public abstract class U5 {
    public static AudioRecordingConfiguration a(AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    public static boolean b(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    public static void c(AudioRecord audioRecord, ExecutorC5715lY0 executorC5715lY0, C0955Ma c0955Ma) {
        audioRecord.registerAudioRecordingCallback(executorC5715lY0, c0955Ma);
    }

    public static void d(AudioRecord audioRecord, C0955Ma c0955Ma) {
        audioRecord.unregisterAudioRecordingCallback(c0955Ma);
    }
}
