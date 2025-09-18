package p000;

import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;

/* renamed from: KE */
/* loaded from: classes.dex */
public final class C0645KE {

    /* renamed from: a */
    public final AudioTrack f5948a;

    /* renamed from: b */
    public final C1856ca f5949b;

    /* renamed from: c */
    public C0582JE f5950c = new AudioRouting.OnRoutingChangedListener() { // from class: JE
        @Override // android.media.AudioRouting.OnRoutingChangedListener
        public final void onRoutingChanged(AudioRouting audioRouting) {
            this.f5399a.m4585b(audioRouting);
        }
    };

    /* JADX WARN: Type inference failed for: r3v1, types: [JE] */
    public C0645KE(AudioTrack audioTrack, C1856ca c1856ca) {
        this.f5948a = audioTrack;
        this.f5949b = c1856ca;
        audioTrack.addOnRoutingChangedListener(this.f5950c, new Handler(Looper.myLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m4585b(AudioRouting audioRouting) {
        if (this.f5950c == null || audioRouting.getRoutedDevice() == null) {
            return;
        }
        this.f5949b.m10790b(audioRouting.getRoutedDevice());
    }

    /* renamed from: c */
    public void m4586c() {
        C0582JE c0582je = this.f5950c;
        c0582je.getClass();
        this.f5948a.removeOnRoutingChangedListener(c0582je);
        this.f5950c = null;
    }
}
