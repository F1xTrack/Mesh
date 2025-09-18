package p000;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;

/* renamed from: S5 */
/* loaded from: classes.dex */
public abstract class AbstractC1138S5 {
    /* renamed from: a */
    public static int m7176a(AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }

    /* renamed from: b */
    public static int m7177b(AudioRecord audioRecord, AudioTimestamp audioTimestamp) {
        return audioRecord.getTimestamp(audioTimestamp, 0);
    }
}
