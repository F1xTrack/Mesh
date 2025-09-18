package com.google.firebase.perf.network;

import android.os.SystemClock;
import androidx.annotation.Keep;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p000.AbstractC11161tR0;
import p000.AbstractC8784av0;
import p000.C0974PT;
import p000.C10777qR0;
import p000.C7731Ia1;
import p000.C8540Xp0;
import p000.C8619Zc1;
import p000.C8654Zu0;
import p000.D40;
import p000.DN0;
import p000.HS0;
import p000.IS0;
import p000.InterfaceC0111Bl;
import p000.InterfaceC6843sl;

/* loaded from: classes.dex */
public class FirebasePerfOkHttpClient {
    /* renamed from: a */
    public static void m11337a(HS0 hs0, C8654Zu0 c8654Zu0, long j, long j2) {
        C10777qR0 c10777qR0 = hs0.f4295a;
        if (c10777qR0 == null) {
            return;
        }
        c8654Zu0.m9636k(c10777qR0.f40870a.m1536i().toString());
        c8654Zu0.m9629d(c10777qR0.f40871b);
        AbstractC11161tR0 abstractC11161tR0 = c10777qR0.f40873d;
        if (abstractC11161tR0 != null) {
            long jMo9186a = abstractC11161tR0.mo9186a();
            if (jMo9186a != -1) {
                c8654Zu0.m9631f(jMo9186a);
            }
        }
        IS0 is0 = hs0.f4301g;
        if (is0 != null) {
            long jMo3383o = is0.mo3383o();
            if (jMo3383o != -1) {
                c8654Zu0.m9634i(jMo3383o);
            }
            C8540Xp0 c8540Xp0Mo3384p = is0.mo3384p();
            if (c8540Xp0Mo3384p != null) {
                c8654Zu0.m9633h(c8540Xp0Mo3384p.f13988a);
            }
        }
        c8654Zu0.m9630e(hs0.f4298d);
        c8654Zu0.m9632g(j);
        c8654Zu0.m9635j(j2);
        c8654Zu0.m9628b();
    }

    @Keep
    public static void enqueue(InterfaceC6843sl interfaceC6843sl, InterfaceC0111Bl interfaceC0111Bl) {
        C7731Ia1 c7731Ia1 = new C7731Ia1();
        DN0 dn0 = (DN0) interfaceC6843sl;
        dn0.m1669f(new C0974PT(interfaceC0111Bl, C8619Zc1.f15028s, c7731Ia1, c7731Ia1.f5021a));
    }

    @Keep
    public static HS0 execute(InterfaceC6843sl interfaceC6843sl) throws IOException {
        C8654Zu0 c8654Zu0 = new C8654Zu0(C8619Zc1.f15028s);
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        long micros2 = TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
        try {
            HS0 hs0M1670h = ((DN0) interfaceC6843sl).m1670h();
            TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
            m11337a(hs0M1670h, c8654Zu0, micros, TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()) - micros2);
            return hs0M1670h;
        } catch (IOException e) {
            C10777qR0 c10777qR0 = ((DN0) interfaceC6843sl).f1981b;
            if (c10777qR0 != null) {
                D40 d40 = c10777qR0.f40870a;
                if (d40 != null) {
                    c8654Zu0.m9636k(d40.m1536i().toString());
                }
                String str = c10777qR0.f40871b;
                if (str != null) {
                    c8654Zu0.m9629d(str);
                }
            }
            c8654Zu0.m9632g(micros);
            TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
            c8654Zu0.m9635j(TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos()) - micros2);
            AbstractC8784av0.m10381c(c8654Zu0);
            throw e;
        }
    }
}
