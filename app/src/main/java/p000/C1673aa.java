package p000;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: aa */
/* loaded from: classes.dex */
public final class C1673aa extends AudioDeviceCallback {

    /* renamed from: a */
    public final /* synthetic */ C1856ca f15567a;

    public C1673aa(C1856ca c1856ca) {
        this.f15567a = c1856ca;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C1856ca c1856ca = this.f15567a;
        c1856ca.m10789a(C1520Y9.m9223b((Context) c1856ca.f17605b, (C1017Q9) c1856ca.f17613j, (C3999ea) c1856ca.f17612i));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C1856ca c1856ca = this.f15567a;
        if (AbstractC7485Dh1.m1827l(audioDeviceInfoArr, (C3999ea) c1856ca.f17612i)) {
            c1856ca.f17612i = null;
        }
        c1856ca.m10789a(C1520Y9.m9223b((Context) c1856ca.f17605b, (C1017Q9) c1856ca.f17613j, (C3999ea) c1856ca.f17612i));
    }
}
