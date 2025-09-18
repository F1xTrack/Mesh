package p000;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* renamed from: LE */
/* loaded from: classes.dex */
public final class C0708LE extends AudioTrack$StreamEventCallback {

    /* renamed from: a */
    public final /* synthetic */ C0770ME f6554a;

    public C0708LE(C0770ME c0770me) {
        this.f6554a = c0770me;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        C0833NE c0833ne;
        G10 g10;
        C1537YQ c1537yq;
        if (audioTrack.equals(this.f6554a.f7044c.f7648w) && (g10 = (c0833ne = this.f6554a.f7044c).f7644s) != null && c0833ne.f7612Y && (c1537yq = ((C7862Ko0) g10.f3531b).f12080G) != null) {
            c1537yq.m9296a();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (audioTrack.equals(this.f6554a.f7044c.f7648w)) {
            this.f6554a.f7044c.f7611X = true;
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        C0833NE c0833ne;
        G10 g10;
        C1537YQ c1537yq;
        if (audioTrack.equals(this.f6554a.f7044c.f7648w) && (g10 = (c0833ne = this.f6554a.f7044c).f7644s) != null && c0833ne.f7612Y && (c1537yq = ((C7862Ko0) g10.f3531b).f12080G) != null) {
            c1537yq.m9296a();
        }
    }
}
