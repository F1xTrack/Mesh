package ru.ok.tracer.base.manifest;

import defpackage.AbstractC7627vZ0;
import defpackage.AbstractC8069xu;
import defpackage.AbstractC8235ym;
import defpackage.C6482pZ0;
import defpackage.O90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.tracer.manifest.TracerLiteManifest;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006\"\u0016\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"tracerLiteManifests", "", "Lru/ok/tracer/manifest/TracerLiteManifest;", "findTracerLiteManifests", "requireTracerLiteManifest", "libraryPackageName", "", "tracer-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class TracerLiteManifestUtils {
    private static volatile Set<? extends TracerLiteManifest> tracerLiteManifests;

    public static final Set<TracerLiteManifest> findTracerLiteManifests() {
        Set set = tracerLiteManifests;
        if (set != null) {
            return set;
        }
        C6482pZ0 c6482pZ0 = new C6482pZ0();
        Iterator it = ServiceLoader.load(TracerLiteManifest.class, TracerLiteManifest.class.getClassLoader()).iterator();
        O90.e(it, "load(S::class.java, S::c…a.classLoader).iterator()");
        while (it.hasNext()) {
            Object next = it.next();
            O90.e(next, "i.next()");
            c6482pZ0.add(next);
        }
        tracerLiteManifests = c6482pZ0;
        return AbstractC7627vZ0.a(c6482pZ0);
    }

    public static final TracerLiteManifest requireTracerLiteManifest(String str) throws NoSuchElementException {
        O90.f(str, "libraryPackageName");
        Set<TracerLiteManifest> setFindTracerLiteManifests = findTracerLiteManifests();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setFindTracerLiteManifests) {
            if (O90.a(((TracerLiteManifest) obj).namespace(), str)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() > 1) {
            StringBuilder sbQ = AbstractC8235ym.q("More then one manifest found for ", str, ": ");
            sbQ.append(AbstractC8069xu.H(arrayList, null, null, null, TracerLiteManifestUtils$requireTracerLiteManifest$1$1.INSTANCE, 31));
            throw new IllegalStateException(sbQ.toString().toString());
        }
        if (arrayList.size() == 1) {
            return (TracerLiteManifest) arrayList.get(0);
        }
        try {
            String str2 = str + ".TracerLibraryManifest";
            Object objNewInstance = Class.forName(str2).newInstance();
            O90.d(objNewInstance, "null cannot be cast to non-null type ru.ok.tracer.manifest.TracerLiteManifest");
            TracerLiteManifest tracerLiteManifest = (TracerLiteManifest) objNewInstance;
            if (O90.a(tracerLiteManifest.namespace(), str)) {
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
