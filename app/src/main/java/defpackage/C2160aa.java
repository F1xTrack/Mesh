package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: aa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2160aa extends AudioDeviceCallback {
    public final /* synthetic */ C2541ca a;

    public C2160aa(C2541ca c2541ca) {
        this.a = c2541ca;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C2541ca c2541ca = this.a;
        c2541ca.a(Y9.b((Context) c2541ca.b, (Q9) c2541ca.j, (C3607ea) c2541ca.i));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C2541ca c2541ca = this.a;
        if (AbstractC0277Dh1.l(audioDeviceInfoArr, (C3607ea) c2541ca.i)) {
            c2541ca.i = null;
        }
        c2541ca.a(Y9.b((Context) c2541ca.b, (Q9) c2541ca.j, (C3607ea) c2541ca.i));
    }
}
