package ru.p031ok.tracer.base.manifest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Metadata;
import p000.AbstractC11433vZ0;
import p000.AbstractC7167xu;
import p000.AbstractC7222ym;
import p000.C10665pZ0;
import p000.O90;
import ru.p031ok.tracer.manifest.TracerLiteManifest;

@Metadata(m22266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\"\u0016\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m22267d2 = {"tracerLiteManifests", "", "Lru/ok/tracer/manifest/TracerLiteManifest;", "findTracerLiteManifests", "requireTracerLiteManifest", "libraryPackageName", "", "tracer-base_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class TracerLiteManifestUtils {
    private static volatile Set<? extends TracerLiteManifest> tracerLiteManifests;

    public static final Set<TracerLiteManifest> findTracerLiteManifests() {
        Set set = tracerLiteManifests;
        if (set != null) {
            return set;
        }
        C10665pZ0 c10665pZ0 = new C10665pZ0();
        Iterator it = ServiceLoader.load(TracerLiteManifest.class, TracerLiteManifest.class.getClassLoader()).iterator();
        O90.m5967e(it, "load(S::class.java, S::c…a.classLoader).iterator()");
        while (it.hasNext()) {
            Object next = it.next();
            O90.m5967e(next, "i.next()");
            c10665pZ0.add(next);
        }
        tracerLiteManifests = c10665pZ0;
        return AbstractC11433vZ0.m25450a(c10665pZ0);
    }

    public static final TracerLiteManifest requireTracerLiteManifest(String str) throws NoSuchElementException {
        O90.m5968f(str, "libraryPackageName");
        Set<TracerLiteManifest> setFindTracerLiteManifests = findTracerLiteManifests();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setFindTracerLiteManifests) {
            if (O90.m5963a(((TracerLiteManifest) obj).namespace(), str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            StringBuilder sbM26240q = AbstractC7222ym.m26240q("More then one manifest found for ", str, ": ");
            sbM26240q.append(AbstractC7167xu.m25962H(arrayList, null, null, null, TracerLiteManifestUtils$requireTracerLiteManifest$1$1.INSTANCE, 31));
            throw new IllegalStateException(sbM26240q.toString().toString());
        }
        if (arrayList.size() == 1) {
            return (TracerLiteManifest) arrayList.get(0);
        }
        try {
            String str2 = str + ".TracerLibraryManifest";
            Object objNewInstance = Class.forName(str2).newInstance();
            O90.m5966d(objNewInstance, "null cannot be cast to non-null type ru.ok.tracer.manifest.TracerLiteManifest");
            TracerLiteManifest tracerLiteManifest = (TracerLiteManifest) objNewInstance;
            if (O90.m5963a(tracerLiteManifest.namespace(), str)) {
                return tracerLiteManifest;
            }
            throw new IllegalStateException(("Unexpected " + str2 + ".namespace()").toString());
        } catch (Throwable th) {
            NoSuchElementException noSuchElementException = new NoSuchElementException("No manifest found for ".concat(str));
            noSuchElementException.initCause(th);
            throw noSuchElementException;
        }
    }
}
