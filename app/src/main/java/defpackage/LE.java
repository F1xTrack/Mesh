package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* loaded from: classes.dex */
public final class LE extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ ME a;

    public LE(ME me2) {
        this.a = me2;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        NE ne;
        G10 g10;
        YQ yq;
        if (audioTrack.equals(this.a.c.w) && (g10 = (ne = this.a.c).s) != null && ne.Y && (yq = ((C0843Ko0) g10.b).G) != null) {
            yq.a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.a.c.w)) {
            this.a.c.X = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        NE ne;
        G10 g10;
        YQ yq;
        if (audioTrack.equals(this.a.c.w) && (g10 = (ne = this.a.c).s) != null && ne.Y && (yq = ((C0843Ko0) g10.b).G) != null) {
            yq.a();
        }
    }
}
