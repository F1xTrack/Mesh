package com.yandex.metrica.impl.p022ob;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.n1 */
/* loaded from: classes2.dex */
public class C3455n1 {

    /* renamed from: a */
    private static final Pattern f24274a = Pattern.compile("com\\.yandex\\.metrica\\.(?!push)");

    /* renamed from: b */
    private static final Pattern f24275b = Pattern.compile("com\\.yandex\\.metrica\\.push\\..*");

    /* renamed from: a */
    public boolean m16439a(List<StackTraceElement> list) {
        return m16438a(list, f24274a);
    }

    /* renamed from: b */
    public boolean m16440b(List<StackTraceElement> list) {
        return m16438a(list, f24275b);
    }

    /* renamed from: a */
    private boolean m16438a(List<StackTraceElement> list, Pattern pattern) {
        Iterator<StackTraceElement> it = list.iterator();
        while (it.hasNext()) {
            if (pattern.matcher(it.next().getClassName()).find()) {
                return true;
            }
        }
        return false;
    }
}
