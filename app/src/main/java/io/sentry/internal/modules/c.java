package io.sentry.internal.modules;

import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class c extends d {
    public final Pattern d;
    public final Pattern e;
    public final ClassLoader f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ILogger iLogger) {
        super(iLogger);
        ClassLoader classLoader = c.class.getClassLoader();
        this.d = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.e = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f = classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }

    @Override // io.sentry.internal.modules.d
    public final Map b() {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                Matcher matcher = this.d.matcher(resources.nextElement().toString());
                b bVar = null;
                String strGroup = (matcher.matches() && matcher.groupCount() == 1) ? matcher.group(1) : null;
                if (strGroup != null) {
                    Matcher matcher2 = this.e.matcher(strGroup);
                    if (matcher2.matches() && matcher2.groupCount() == 2) {
                        bVar = new b(matcher2.group(1), matcher2.group(2));
                    }
                }
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
        } catch (Throwable th) {
            this.a.d(EnumC5148n1.ERROR, "Unable to detect modules via manifest files.", th);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            map.put(bVar2.a, bVar2.b);
        }
        return map;
    }
}
