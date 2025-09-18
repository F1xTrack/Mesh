package io.appmetrica.analytics.impl;

import defpackage.C0163Bv1;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrash;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.io.File;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.kd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4670kd implements NativeCrashHandler {
    public final C4745ng a;
    public final InterfaceC6099nZ b;

    public C4670kd(C4745ng c4745ng, InterfaceC6099nZ interfaceC6099nZ) {
        this.a = c4745ng;
        this.b = interfaceC6099nZ;
    }

    public static final void a(C4670kd c4670kd, NativeCrash nativeCrash, File file) {
        c4670kd.b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    public static final void b(C4670kd c4670kd, NativeCrash nativeCrash, File file) {
        c4670kd.b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
    }

    @Override // io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashHandler
    public final void newCrash(NativeCrash nativeCrash) {
        C4944w0 c4944w0;
        try {
            NativeCrashSource source = nativeCrash.getSource();
            String handlerVersion = nativeCrash.getHandlerVersion();
            String str = nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String();
            String dumpFile = nativeCrash.getDumpFile();
            long creationTime = nativeCrash.getCreationTime();
            C4968x0 c4968x0A = C4992y0.a(nativeCrash.getMetadata());
            O90.c(c4968x0A);
            c4944w0 = new C4944w0(source, handlerVersion, str, dumpFile, creationTime, c4968x0A);
        } catch (Throwable unused) {
            c4944w0 = null;
        }
        if (c4944w0 == null) {
            this.b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            return;
        }
        C4745ng c4745ng = this.a;
        C0163Bv1 c0163Bv1 = new C0163Bv1(this, nativeCrash, 1);
        c4745ng.getClass();
        c4745ng.a(c4944w0, c0163Bv1, new C4673kg(c4944w0));
    }

    public final void a(List<NativeCrash> list) {
        C4944w0 c4944w0;
        for (NativeCrash nativeCrash : list) {
            try {
                NativeCrashSource source = nativeCrash.getSource();
                String handlerVersion = nativeCrash.getHandlerVersion();
                String str = nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String();
                String dumpFile = nativeCrash.getDumpFile();
                long creationTime = nativeCrash.getCreationTime();
                C4968x0 c4968x0A = C4992y0.a(nativeCrash.getMetadata());
                O90.c(c4968x0A);
                c4944w0 = new C4944w0(source, handlerVersion, str, dumpFile, creationTime, c4968x0A);
            } catch (Throwable unused) {
                c4944w0 = null;
            }
            if (c4944w0 != null) {
                C4745ng c4745ng = this.a;
                C0163Bv1 c0163Bv1 = new C0163Bv1(this, nativeCrash, 0);
                c4745ng.getClass();
                c4745ng.a(c4944w0, c0163Bv1, new C4697lg(c4944w0));
            } else {
                this.b.invoke(nativeCrash.getIo.appmetrica.analytics.networktasks.internal.CommonUrlParts.UUID java.lang.String());
            }
        }
    }
}
