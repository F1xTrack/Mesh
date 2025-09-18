package io.sentry.internal.modules;

import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: io.sentry.internal.modules.c */
/* loaded from: classes2.dex */
public final class C6047c extends AbstractC6048d {

    /* renamed from: d */
    public final Pattern f34206d;

    /* renamed from: e */
    public final Pattern f34207e;

    /* renamed from: f */
    public final ClassLoader f34208f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6047c(ILogger iLogger) {
        super(iLogger);
        ClassLoader classLoader = C6047c.class.getClassLoader();
        this.f34206d = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f34207e = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f34208f = classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    @Override // io.sentry.internal.modules.AbstractC6048d
    /* renamed from: b */
    public final Map mo21793b() {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f34208f.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Matcher matcher = this.f34206d.matcher(resources.nextElement().toString());
                C6046b c6046b = null;
                String strGroup = (matcher.matches() && matcher.groupCount() == 1) ? matcher.group(1) : null;
                if (strGroup != null) {
                    Matcher matcher2 = this.f34207e.matcher(strGroup);
                    if (matcher2.matches() && matcher2.groupCount() == 2) {
                        c6046b = new C6046b(matcher2.group(1), matcher2.group(2));
                    }
                }
                if (c6046b != null) {
                    arrayList.add(c6046b);
                }
            }
        } catch (Throwable th) {
            this.f34210a.mo21406d(EnumC6069n1.ERROR, "Unable to detect modules via manifest files.", th);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6046b c6046b2 = (C6046b) it.next();
            map.put(c6046b2.f34204a, c6046b2.f34205b);
        }
        return map;
    }
}
