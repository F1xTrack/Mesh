package p000;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ca */
/* loaded from: classes.dex */
public final class C1856ca {

    /* renamed from: a */
    public boolean f17604a;

    /* renamed from: b */
    public final Object f17605b;

    /* renamed from: c */
    public Object f17606c;

    /* renamed from: d */
    public final Object f17607d;

    /* renamed from: e */
    public final Object f17608e;

    /* renamed from: f */
    public final Object f17609f;

    /* renamed from: g */
    public final Object f17610g;

    /* renamed from: h */
    public Object f17611h;

    /* renamed from: i */
    public Object f17612i;

    /* renamed from: j */
    public Object f17613j;

    public C1856ca() {
        this.f17605b = new AtomicBoolean();
        this.f17606c = null;
        this.f17607d = new HashMap(16, 1.0f);
        this.f17608e = new HashMap(16, 1.0f);
        this.f17609f = new HashMap(16, 1.0f);
        this.f17610g = new HashMap(16, 1.0f);
        this.f17611h = null;
        this.f17604a = false;
        this.f17612i = new String[0];
        this.f17613j = new OG1(3);
    }

    /* renamed from: a */
    public void m10789a(C1520Y9 c1520y9) {
        C1654aH c1654aH;
        if (!this.f17604a || c1520y9.equals((C1520Y9) this.f17611h)) {
            return;
        }
        this.f17611h = c1520y9;
        C0833NE c0833ne = (C0833NE) ((C0267EE) this.f17606c).f2543b;
        c0833ne.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = c0833ne.f7631i0;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(AbstractC11153tN0.m24912x("Current looper (", looperMyLooper == null ? "null" : looperMyLooper.getThread().getName(), ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        if (c1520y9.equals(c0833ne.f7649x)) {
            return;
        }
        c0833ne.f7649x = c1520y9;
        G10 g10 = c0833ne.f7644s;
        if (g10 != null) {
            C7862Ko0 c7862Ko0 = (C7862Ko0) g10.f3531b;
            synchronized (c7862Ko0.f306a) {
                c1654aH = c7862Ko0.f322q;
            }
            if (c1654aH != null) {
                c1654aH.m9696i();
            }
        }
    }

    /* renamed from: b */
    public void m10790b(AudioDeviceInfo audioDeviceInfo) {
        C3999ea c3999ea = (C3999ea) this.f17612i;
        if (AbstractC7485Dh1.m1812a(audioDeviceInfo, c3999ea == null ? null : c3999ea.f26754a)) {
            return;
        }
        C3999ea c3999ea2 = audioDeviceInfo != null ? new C3999ea(audioDeviceInfo) : null;
        this.f17612i = c3999ea2;
        m10789a(C1520Y9.m9223b((Context) this.f17605b, (C1017Q9) this.f17613j, c3999ea2));
    }

    public C1856ca(Context context, C0267EE c0267ee, C1017Q9 c1017q9, C3999ea c3999ea) {
        Context applicationContext = context.getApplicationContext();
        this.f17605b = applicationContext;
        this.f17606c = c0267ee;
        this.f17613j = c1017q9;
        this.f17612i = c3999ea;
        int i = AbstractC7485Dh1.f2166a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f17607d = handler;
        int i2 = AbstractC7485Dh1.f2166a;
        this.f17608e = i2 >= 23 ? new C1673aa(this) : null;
        this.f17609f = i2 >= 21 ? new C0196D6(1, this) : null;
        C1520Y9 c1520y9 = C1520Y9.f14173c;
        String str = AbstractC7485Dh1.f2168c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f17610g = uriFor != null ? new C1794ba(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }
}
