package defpackage;

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
public final class C2541ca {
    public boolean a;
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;

    public C2541ca() {
        this.b = new AtomicBoolean();
        this.c = null;
        this.d = new HashMap(16, 1.0f);
        this.e = new HashMap(16, 1.0f);
        this.f = new HashMap(16, 1.0f);
        this.g = new HashMap(16, 1.0f);
        this.h = null;
        this.a = false;
        this.i = new String[0];
        this.j = new OG1(3);
    }

    public void a(Y9 y9) {
        C2103aH c2103aH;
        if (!this.a || y9.equals((Y9) this.h)) {
            return;
        }
        this.h = y9;
        NE ne = (NE) ((EE) this.c).b;
        ne.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = ne.i0;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(AbstractC7209tN0.x("Current looper (", looperMyLooper == null ? "null" : looperMyLooper.getThread().getName(), ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        if (y9.equals(ne.x)) {
            return;
        }
        ne.x = y9;
        G10 g10 = ne.s;
        if (g10 != null) {
            C0843Ko0 c0843Ko0 = (C0843Ko0) g10.b;
            synchronized (c0843Ko0.a) {
                c2103aH = c0843Ko0.q;
            }
            if (c2103aH != null) {
                c2103aH.i();
            }
        }
    }

    public void b(AudioDeviceInfo audioDeviceInfo) {
        C3607ea c3607ea = (C3607ea) this.i;
        if (AbstractC0277Dh1.a(audioDeviceInfo, c3607ea == null ? null : c3607ea.a)) {
            return;
        }
        C3607ea c3607ea2 = audioDeviceInfo != null ? new C3607ea(audioDeviceInfo) : null;
        this.i = c3607ea2;
        a(Y9.b((Context) this.b, (Q9) this.j, c3607ea2));
    }

    public C2541ca(Context context, EE ee, Q9 q9, C3607ea c3607ea) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = ee;
        this.j = q9;
        this.i = c3607ea;
        int i = AbstractC0277Dh1.a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.d = handler;
        int i2 = AbstractC0277Dh1.a;
        this.e = i2 >= 23 ? new C2160aa(this) : null;
        this.f = i2 >= 21 ? new D6(1, this) : null;
        Y9 y9 = Y9.c;
        String str = AbstractC0277Dh1.c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.g = uriFor != null ? new C2351ba(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }
}
