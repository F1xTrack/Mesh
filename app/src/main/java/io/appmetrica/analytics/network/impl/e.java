package io.appmetrica.analytics.network.impl;

import defpackage.AbstractC2141aT1;
import defpackage.InterfaceC5908mZ;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class e {
    public static byte[] a(int i, InterfaceC5908mZ interfaceC5908mZ) {
        try {
            InputStream inputStream = (InputStream) interfaceC5908mZ.invoke();
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
                        AbstractC2141aT1.a(byteArrayOutputStream, null);
                        AbstractC2141aT1.a(inputStream, null);
                        return byteArray;
                    } catch (Throwable unused) {
                        AbstractC2141aT1.a(byteArrayOutputStream, null);
                        AbstractC2141aT1.a(inputStream, null);
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }

    public static final Map a(Map map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }
}
