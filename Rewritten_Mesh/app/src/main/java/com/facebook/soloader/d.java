package com.facebook.soloader;

import android.os.Trace;
import defpackage.AbstractC4107hB1;
import defpackage.AbstractC7225tS1;
import defpackage.C1943Yr0;
import defpackage.C6826rN;
import defpackage.InterfaceC6636qN;
import java.io.FileInputStream;
import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class d {
    static {
        new ReentrantReadWriteLock();
    }

    public static String[] a(String str, InterfaceC6636qN interfaceC6636qN) {
        String[] strArrB;
        if (SoLoader.a) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        try {
            try {
                if (interfaceC6636qN instanceof C6826rN) {
                    C6826rN c6826rN = (C6826rN) interfaceC6636qN;
                    int i = 0;
                    while (true) {
                        try {
                            strArrB = AbstractC4107hB1.b(c6826rN);
                            break;
                        } catch (ClosedByInterruptException e) {
                            i++;
                            if (i > 4) {
                                throw e;
                            }
                            Thread.interrupted();
                            FileInputStream fileInputStream = new FileInputStream(c6826rN.a);
                            c6826rN.b = fileInputStream;
                            c6826rN.c = fileInputStream.getChannel();
                        }
                    }
                } else {
                    strArrB = AbstractC4107hB1.b(interfaceC6636qN);
                }
                return strArrB;
            } catch (C1943Yr0 e2) {
                throw AbstractC7225tS1.b(str, e2);
            }
        } finally {
            if (SoLoader.a) {
                Trace.endSection();
            }
        }
    }
}
