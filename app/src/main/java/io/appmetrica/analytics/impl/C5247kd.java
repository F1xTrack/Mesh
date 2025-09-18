package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;
import java.util.List;
import p000.C7409Bv1;
import p000.InterfaceC6497nZ;
import p000.O90;

/* renamed from: io.appmetrica.analytics.impl.kd */
/* loaded from: classes2.dex */
public final class C5247kd implements NativeCrashHandler {

    /* renamed from: a */
    public final C5325ng f32067a;

    /* renamed from: b */
    public final InterfaceC6497nZ f32068b;

    public C5247kd(C5325ng c5325ng, InterfaceC6497nZ interfaceC6497nZ) {
        this.f32067a = c5325ng;
        this.f32068b = interfaceC6497nZ;
    }

    /* renamed from: a */
    public static final void m20644a(C5247kd c5247kd, NativeCrash nativeCrash, File file) {
        c5247kd.f32068b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    /* renamed from: b */
    public static final void m20645b(C5247kd c5247kd, NativeCrash nativeCrash, File file) {
        c5247kd.f32068b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(NativeCrash nativeCrash) {
        C5534w0 c5534w0;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String str = nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            C5559x0 c5559x0M21214a = C5584y0.m21214a(nativeCrash.getMetadata());
            O90.m5965c(c5559x0M21214a);
            c5534w0 = new C5534w0(source, handlerVersion, str, dumpFile, creationTime, c5559x0M21214a);
        } catch (Throwable unused) {
            c5534w0 = null;
        }
        if (c5534w0 == null) {
            this.f32068b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            return;
        }
        C5325ng c5325ng = this.f32067a;
        C7409Bv1 c7409Bv1 = new C7409Bv1(this, nativeCrash, 1);
        c5325ng.getClass();
        c5325ng.m20835a(c5534w0, c7409Bv1, new C5250kg(c5534w0));
    }

    /* renamed from: a */
    public final void m20646a(List<NativeCrash> list) {
        C5534w0 c5534w0;
        for (NativeCrash nativeCrash : list) {
            try {
                NativeCrashSource source = nativeCrash.getSource();
                String handlerVersion = nativeCrash.getHandlerVersion();
                String str = nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String();
                String dumpFile = nativeCrash.getDumpFile();
                long creationTime = nativeCrash.getCreationTime();
                C5559x0 c5559x0M21214a = C5584y0.m21214a(nativeCrash.getMetadata());
                O90.m5965c(c5559x0M21214a);
                c5534w0 = new C5534w0(source, handlerVersion, str, dumpFile, creationTime, c5559x0M21214a);
            } catch (Throwable unused) {
                c5534w0 = null;
            }
            if (c5534w0 != null) {
                C5325ng c5325ng = this.f32067a;
                C7409Bv1 c7409Bv1 = new C7409Bv1(this, nativeCrash, 0);
                c5325ng.getClass();
                c5325ng.m20835a(c5534w0, c7409Bv1, new C5275lg(c5534w0));
            } else {
                this.f32068b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            }
        }
    }
}
