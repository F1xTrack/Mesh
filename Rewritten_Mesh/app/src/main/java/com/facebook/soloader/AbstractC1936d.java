package com.facebook.soloader;

import android.os.Trace;
import java.io.FileInputStream;
import java.nio.channels.ClosedByInterruptException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p000.AbstractC11164tS1;
import p000.AbstractC9594hB1;
import p000.C6739rN;
import p000.C8596Yr0;
import p000.InterfaceC6676qN;

/* renamed from: com.facebook.soloader.d */
/* loaded from: classes.dex */
public abstract class AbstractC1936d {
    static {
        new ReentrantReadWriteLock();
    }

    /* renamed from: a */
    public static String[] m11089a(String str, InterfaceC6676qN interfaceC6676qN) {
        String[] strArrM18770b;
        if (SoLoader.f17962a) {
            Api18TraceUtils.m11066a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        try {
            try {
                if (interfaceC6676qN instanceof C6739rN) {
                    C6739rN c6739rN = (C6739rN) interfaceC6676qN;
                    int i = 0;
                    while (true) {
                        try {
                            strArrM18770b = AbstractC9594hB1.m18770b(c6739rN);
                            break;
                        } catch (ClosedByInterruptException e) {
                            i++;
                            if (i > 4) {
                                throw e;
                            }
                            Thread.interrupted();
                            FileInputStream fileInputStream = new FileInputStream(c6739rN.f41620a);
                            c6739rN.f41621b = fileInputStream;
                            c6739rN.f41622c = fileInputStream.getChannel();
                        }
                    }
                } else {
                    strArrM18770b = AbstractC9594hB1.m18770b(interfaceC6676qN);
                }
                return strArrM18770b;
            } catch (C8596Yr0 e2) {
                throw AbstractC11164tS1.m24935b(str, e2);
            }
        } finally {
            if (SoLoader.f17962a) {
                Trace.endSection();
            }
        }
    }
}
