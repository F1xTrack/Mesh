package io.sentry.util;

import com.huawei.hms.rn.push.constants.LocalNotification;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.S;
import io.sentry.protocol.F;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes2.dex */
public abstract class a {
    public static final Charset a = Charset.forName("UTF-8");

    public static ArrayList a(AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i)));
        }
        return arrayList;
    }

    public static byte[] b(S s, ILogger iLogger, F f) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, a));
                try {
                    s.e(f, bufferedWriter);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            iLogger.d(EnumC5148n1.ERROR, "Could not serialize serializable", th);
            return null;
        }
    }

    public static HashMap c(Calendar calendar) {
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
