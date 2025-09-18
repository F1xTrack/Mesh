package defpackage;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class KE {
    public final AudioTrack a;
    public final C2541ca b;
    public JE c = new AudioRouting.OnRoutingChangedListener() { // from class: JE
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            this.a.b(audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [JE] */
    public KE(AudioTrack audioTrack, C2541ca c2541ca) {
        this.a = audioTrack;
        this.b = c2541ca;
        audioTrack.addOnRoutingChangedListener(this.c, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(AudioRouting audioRouting) {
        if (this.c == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        this.b.b(audioRouting.getRoutedDevice());
    }

    public void c() {
        JE je = this.c;
        je.getClass();
        this.a.removeOnRoutingChangedListener(je);
        this.c = null;
    }
}
