package ru.p031ok.tracer.base.manifest;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import p000.AbstractC7167xu;
import p000.AbstractC7230yu;
import p000.C10685pj0;
import p000.O90;
import ru.p031ok.tracer.manifest.TracerManifest;

@Metadata(m22266d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0002\u001a\u001f\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u0001H\tH\t0\b\"\u0006\b\u0000\u0010\t\u0018\u0001H\u0080\b\u001a\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005\"\u0016\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m22267d2 = {"tracerManifests", "", "Lru/ok/tracer/manifest/TracerManifest;", "findTracerManifest", "packageName", "", "findTracerManifests", "loadService", "", "S", "kotlin.jvm.PlatformType", "requireTracerManifest", "tracer-base_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerManifestUtils {
    private static volatile List<? extends TracerManifest> tracerManifests;

    public static final TracerManifest findTracerManifest(String str) {
        O90.m5968f(str, "packageName");
        List<TracerManifest> listFindTracerManifests = findTracerManifests();
        if (listFindTracerManifests.size() > 1) {
            throw new IllegalStateException("More then one manifest found: ".concat(AbstractC7167xu.m25962H(listFindTracerManifests, null, null, null, TracerManifestUtils$findTracerManifest$1$1.INSTANCE, 31)).toString());
        }
        if (listFindTracerManifests.size() != 1) {
            return null;
        }
        TracerManifest tracerManifest = listFindTracerManifests.get(0);
        if (O90.m5963a(tracerManifest.applicationId(), str)) {
            return tracerManifest;
        }
        throw new IllegalStateException(("Unexpected " + tracerManifest.getClass().getName() + ".applicationId()").toString());
    }

    private static final List<TracerManifest> findTracerManifests() {
        List list = tracerManifests;
        if (list != null) {
            return list;
        }
        C10685pj0 c10685pj0M26272c = AbstractC7230yu.m26272c();
        Iterator it = ServiceLoader.load(TracerManifest.class, TracerManifest.class.getClassLoader()).iterator();
        O90.m5967e(it, "load(S::class.java, S::c…a.classLoader).iterator()");
        while (it.hasNext()) {
            Object next = it.next();
            O90.m5967e(next, "i.next()");
            c10685pj0M26272c.add(next);
        }
        tracerManifests = c10685pj0M26272c;
        return AbstractC7230yu.m26271b(c10685pj0M26272c);
    }

    public static final /* synthetic */ <S> Iterator<S> loadService() {
        O90.m5974l();
        throw null;
    }

    public static final TracerManifest requireTracerManifest(String str) {
        O90.m5968f(str, "packageName");
        TracerManifest tracerManifestFindTracerManifest = findTracerManifest(str);
        if (tracerManifestFindTracerManifest != null) {
            return tracerManifestFindTracerManifest;
        }
        throw new IllegalStateException("Could not find TracerApplicationManifest for applicationId ".concat(str).toString());
    }
}
