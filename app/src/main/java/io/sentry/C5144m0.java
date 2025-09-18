package io.sentry;

import io.sentry.protocol.C5155a;
import io.sentry.protocol.C5156b;
import io.sentry.protocol.C5157c;
import io.sentry.protocol.C5158d;
import io.sentry.protocol.C5160f;
import io.sentry.protocol.C5161g;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.EnumC5159e;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.m0 */
/* loaded from: classes2.dex */
public final class C5144m0 implements S {
    public static final Charset c = Charset.forName("UTF-8");
    public final D1 a;
    public final HashMap b;

    public C5144m0(D1 d1) {
        this.a = d1;
        HashMap map = new HashMap();
        this.b = map;
        map.put(C5155a.class, new io.sentry.clientreport.a(4));
        map.put(C5122f.class, new C5119e(0));
        map.put(C5156b.class, new io.sentry.clientreport.a(5));
        map.put(C5157c.class, new io.sentry.clientreport.a(6));
        map.put(DebugImage.class, new io.sentry.clientreport.a(7));
        map.put(C5158d.class, new io.sentry.clientreport.a(8));
        map.put(C5160f.class, new io.sentry.clientreport.a(9));
        map.put(EnumC5159e.class, new io.sentry.clientreport.a(10));
        map.put(io.sentry.protocol.h.class, new io.sentry.clientreport.a(12));
        map.put(io.sentry.protocol.i.class, new io.sentry.clientreport.a(13));
        map.put(io.sentry.protocol.j.class, new io.sentry.clientreport.a(14));
        map.put(io.sentry.protocol.k.class, new io.sentry.clientreport.a(15));
        map.put(io.sentry.protocol.l.class, new io.sentry.clientreport.a(16));
        map.put(io.sentry.protocol.m.class, new io.sentry.clientreport.a(17));
        map.put(E0.class, new C5119e(1));
        map.put(F0.class, new C5119e(2));
        map.put(io.sentry.profilemeasurements.a.class, new io.sentry.clientreport.a(2));
        map.put(io.sentry.profilemeasurements.b.class, new io.sentry.clientreport.a(3));
        map.put(io.sentry.protocol.n.class, new io.sentry.clientreport.a(18));
        map.put(J0.class, new C5119e(3));
        map.put(io.sentry.rrweb.a.class, new io.sentry.protocol.D(3));
        map.put(io.sentry.rrweb.c.class, new io.sentry.protocol.D(4));
        map.put(io.sentry.rrweb.g.class, new io.sentry.protocol.D(6));
        map.put(io.sentry.rrweb.i.class, new io.sentry.protocol.D(8));
        map.put(io.sentry.rrweb.j.class, new io.sentry.protocol.D(10));
        map.put(io.sentry.rrweb.l.class, new io.sentry.protocol.D(11));
        map.put(io.sentry.rrweb.m.class, new io.sentry.protocol.D(12));
        map.put(io.sentry.protocol.q.class, new io.sentry.clientreport.a(19));
        map.put(io.sentry.protocol.r.class, new io.sentry.clientreport.a(20));
        map.put(C5115c1.class, new C5119e(5));
        map.put(C5130h1.class, new C5119e(6));
        map.put(C5133i1.class, new C5119e(7));
        map.put(io.sentry.protocol.s.class, new io.sentry.clientreport.a(21));
        map.put(EnumC5145m1.class, new C5119e(8));
        map.put(EnumC5148n1.class, new C5119e(9));
        map.put(C5151o1.class, new C5119e(10));
        map.put(io.sentry.protocol.u.class, new io.sentry.clientreport.a(23));
        map.put(io.sentry.protocol.v.class, new io.sentry.clientreport.a(24));
        map.put(F1.class, new C5119e(11));
        map.put(io.sentry.protocol.w.class, new io.sentry.clientreport.a(25));
        map.put(io.sentry.protocol.x.class, new io.sentry.clientreport.a(26));
        map.put(io.sentry.protocol.y.class, new io.sentry.clientreport.a(27));
        map.put(T0.class, new C5119e(4));
        map.put(io.sentry.protocol.z.class, new io.sentry.clientreport.a(28));
        map.put(io.sentry.protocol.A.class, new io.sentry.clientreport.a(29));
        map.put(O1.class, new C5119e(13));
        map.put(Q1.class, new C5119e(14));
        map.put(S1.class, new C5119e(15));
        map.put(U1.class, new C5119e(16));
        map.put(io.sentry.protocol.E.class, new io.sentry.protocol.D(0));
        map.put(C5161g.class, new io.sentry.clientreport.a(11));
        map.put(d2.class, new C5119e(19));
        map.put(io.sentry.clientreport.b.class, new io.sentry.clientreport.a(0));
        map.put(io.sentry.protocol.G.class, new io.sentry.protocol.D(2));
        map.put(io.sentry.protocol.F.class, new io.sentry.protocol.D(1));
    }

    @Override // io.sentry.S
    public final String a(ConcurrentHashMap concurrentHashMap) {
        return g(concurrentHashMap, false);
    }

    @Override // io.sentry.S
    public final Object b(Reader reader, Class cls) {
        D1 d1 = this.a;
        try {
            C5138k0 c5138k0 = new C5138k0(reader);
            try {
                InterfaceC5082a0 interfaceC5082a0 = (InterfaceC5082a0) this.b.get(cls);
                if (interfaceC5082a0 != null) {
                    Object objCast = cls.cast(interfaceC5082a0.a(c5138k0, d1.getLogger()));
                    c5138k0.close();
                    return objCast;
                }
                if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                    c5138k0.close();
                    return null;
                }
                Object objM0 = c5138k0.m0();
                c5138k0.close();
                return objM0;
            } finally {
            }
        } catch (Exception e) {
            d1.getLogger().d(EnumC5148n1.ERROR, "Error when deserializing", e);
            return null;
        }
    }

    @Override // io.sentry.S
    public final io.sentry.internal.debugmeta.c c(BufferedInputStream bufferedInputStream) {
        D1 d1 = this.a;
        try {
            return d1.getEnvelopeReader().a(bufferedInputStream);
        } catch (IOException e) {
            d1.getLogger().d(EnumC5148n1.ERROR, "Error deserializing envelope.", e);
            return null;
        }
    }

    @Override // io.sentry.S
    public final Object d(BufferedReader bufferedReader, Class cls, C5119e c5119e) {
        D1 d1 = this.a;
        try {
            C5138k0 c5138k0 = new C5138k0(bufferedReader);
            try {
                if (!Collection.class.isAssignableFrom(cls)) {
                    Object objM0 = c5138k0.m0();
                    c5138k0.close();
                    return objM0;
                }
                if (c5119e == null) {
                    Object objM02 = c5138k0.m0();
                    c5138k0.close();
                    return objM02;
                }
                ArrayList arrayListW = c5138k0.W(d1.getLogger(), c5119e);
                c5138k0.close();
                return arrayListW;
            } finally {
            }
        } catch (Throwable th) {
            d1.getLogger().d(EnumC5148n1.ERROR, "Error when deserializing", th);
            return null;
        }
    }

    @Override // io.sentry.S
    public final void e(Object obj, BufferedWriter bufferedWriter) throws IOException {
        io.sentry.config.a.D(obj, "The entity is required.");
        D1 d1 = this.a;
        ILogger logger = d1.getLogger();
        EnumC5148n1 enumC5148n1 = EnumC5148n1.DEBUG;
        if (logger.l(enumC5148n1)) {
            d1.getLogger().k(enumC5148n1, "Serializing object: %s", g(obj, d1.isEnablePrettySerializationOutput()));
        }
        C5142l1 c5142l1 = new C5142l1(bufferedWriter, d1.getMaxDepth());
        ((com.yandex.metrica.e) c5142l1.b).z(c5142l1, d1.getLogger(), obj);
        bufferedWriter.flush();
    }

    @Override // io.sentry.S
    public final void f(io.sentry.internal.debugmeta.c cVar, OutputStream outputStream) throws IOException {
        D1 d1 = this.a;
        io.sentry.config.a.D(cVar, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), c));
        try {
            ((C5115c1) cVar.b).serialize(new C5142l1(bufferedWriter, d1.getMaxDepth()), d1.getLogger());
            bufferedWriter.write("\n");
            for (C5127g1 c5127g1 : (Collection) cVar.c) {
                try {
                    byte[] bArrD = c5127g1.d();
                    c5127g1.a.serialize(new C5142l1(bufferedWriter, d1.getMaxDepth()), d1.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrD);
                    bufferedWriter.write("\n");
                } catch (Exception e) {
                    d1.getLogger().d(EnumC5148n1.ERROR, "Failed to create envelope item. Dropping it.", e);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    public final String g(Object obj, boolean z) {
        StringWriter stringWriter = new StringWriter();
        D1 d1 = this.a;
        C5142l1 c5142l1 = new C5142l1(stringWriter, d1.getMaxDepth());
        if (z) {
            io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) c5142l1.a;
            cVar.getClass();
            cVar.d = "\t";
            cVar.e = ": ";
        }
        ((com.yandex.metrica.e) c5142l1.b).z(c5142l1, d1.getLogger(), obj);
        return stringWriter.toString();
    }
}
