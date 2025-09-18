package io.appmetrica.analytics.network.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC8729aT1;
import p000.InterfaceC6434mZ;

/* renamed from: io.appmetrica.analytics.network.impl.e */
/* loaded from: classes2.dex */
public abstract class AbstractC5674e {
    /* renamed from: a */
    public static byte[] m21290a(int i, InterfaceC6434mZ interfaceC6434mZ) {
        try {
            InputStream inputStream = (InputStream) interfaceC6434mZ.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        int i2 = 0;
                        while (true) {
                            int i3 = inputStream.read(bArr);
                            if (-1 == i3 || i2 > i) {
                                break;
                            }
                            if (i3 > 0) {
                                byteArrayOutputStream.write(bArr, 0, i3);
                                i2 += i3;
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        AbstractC8729aT1.m9749a(byteArrayOutputStream, null);
                        AbstractC8729aT1.m9749a(inputStream, null);
                        return byteArray;
                    } catch (Throwable unused) {
                        AbstractC8729aT1.m9749a(byteArrayOutputStream, null);
                        AbstractC8729aT1.m9749a(inputStream, null);
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }

    /* renamed from: a */
    public static final Map m21289a(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }
}
