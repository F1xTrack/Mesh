package io.sentry.util;

import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5801S;
import io.sentry.protocol.C6083F;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: io.sentry.util.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6168a {

    /* renamed from: a */
    public static final Charset f34659a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static ArrayList m21877a(AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static byte[] m21878b(InterfaceC5801S interfaceC5801S, ILogger iLogger, C6083F c6083f) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f34659a));
                try {
                    interfaceC5801S.mo21461e(c6083f, bufferedWriter);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            iLogger.mo21406d(EnumC6069n1.ERROR, "Could not serialize serializable", th);
            return null;
        }
    }

    /* renamed from: c */
    public static HashMap m21879c(Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put(LocalNotification.Repeat.Type.MINUTE, Integer.valueOf(calendar.get(12)));
        map.put("second", Integer.valueOf(calendar.get(13)));
        return map;
    }
}
