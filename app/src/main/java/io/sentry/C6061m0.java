package io.sentry;

import com.yandex.metrica.C2460e;
import io.sentry.clientreport.C5997a;
import io.sentry.clientreport.C5998b;
import io.sentry.config.AbstractC6003a;
import io.sentry.internal.debugmeta.C6042c;
import io.sentry.profilemeasurements.C6076a;
import io.sentry.profilemeasurements.C6077b;
import io.sentry.protocol.C6078A;
import io.sentry.protocol.C6081D;
import io.sentry.protocol.C6082E;
import io.sentry.protocol.C6083F;
import io.sentry.protocol.C6084G;
import io.sentry.protocol.C6085a;
import io.sentry.protocol.C6086b;
import io.sentry.protocol.C6087c;
import io.sentry.protocol.C6088d;
import io.sentry.protocol.C6090f;
import io.sentry.protocol.C6091g;
import io.sentry.protocol.C6092h;
import io.sentry.protocol.C6093i;
import io.sentry.protocol.C6094j;
import io.sentry.protocol.C6095k;
import io.sentry.protocol.C6096l;
import io.sentry.protocol.C6097m;
import io.sentry.protocol.C6098n;
import io.sentry.protocol.C6101q;
import io.sentry.protocol.C6102r;
import io.sentry.protocol.C6103s;
import io.sentry.protocol.C6105u;
import io.sentry.protocol.C6106v;
import io.sentry.protocol.C6107w;
import io.sentry.protocol.C6108x;
import io.sentry.protocol.C6109y;
import io.sentry.protocol.C6110z;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.EnumC6089e;
import io.sentry.rrweb.C6130a;
import io.sentry.rrweb.C6136g;
import io.sentry.rrweb.C6138i;
import io.sentry.rrweb.C6139j;
import io.sentry.rrweb.C6141l;
import io.sentry.rrweb.C6142m;
import io.sentry.rrweb.EnumC6132c;
import io.sentry.vendor.gson.stream.C6186c;
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
public final class C6061m0 implements InterfaceC5801S {

    /* renamed from: c */
    public static final Charset f34237c = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C5759D1 f34238a;

    /* renamed from: b */
    public final HashMap f34239b;

    public C6061m0(C5759D1 c5759d1) {
        this.f34238a = c5759d1;
        HashMap map = new HashMap();
        this.f34239b = map;
        map.put(C6085a.class, new C5997a(4));
        map.put(C6017f.class, new C6012e(0));
        map.put(C6086b.class, new C5997a(5));
        map.put(C6087c.class, new C5997a(6));
        map.put(DebugImage.class, new C5997a(7));
        map.put(C6088d.class, new C5997a(8));
        map.put(C6090f.class, new C5997a(9));
        map.put(EnumC6089e.class, new C5997a(10));
        map.put(C6092h.class, new C5997a(12));
        map.put(C6093i.class, new C5997a(13));
        map.put(C6094j.class, new C5997a(14));
        map.put(C6095k.class, new C5997a(15));
        map.put(C6096l.class, new C5997a(16));
        map.put(C6097m.class, new C5997a(17));
        map.put(C5761E0.class, new C6012e(1));
        map.put(C5764F0.class, new C6012e(2));
        map.put(C6076a.class, new C5997a(2));
        map.put(C6077b.class, new C5997a(3));
        map.put(C6098n.class, new C5997a(18));
        map.put(C5776J0.class, new C6012e(3));
        map.put(C6130a.class, new C6081D(3));
        map.put(EnumC6132c.class, new C6081D(4));
        map.put(C6136g.class, new C6081D(6));
        map.put(C6138i.class, new C6081D(8));
        map.put(C6139j.class, new C6081D(10));
        map.put(C6141l.class, new C6081D(11));
        map.put(C6142m.class, new C6081D(12));
        map.put(C6101q.class, new C5997a(19));
        map.put(C6102r.class, new C5997a(20));
        map.put(C5987c1.class, new C6012e(5));
        map.put(C6025h1.class, new C6012e(6));
        map.put(C6039i1.class, new C6012e(7));
        map.put(C6103s.class, new C5997a(21));
        map.put(EnumC6062m1.class, new C6012e(8));
        map.put(EnumC6069n1.class, new C6012e(9));
        map.put(C6072o1.class, new C6012e(10));
        map.put(C6105u.class, new C5997a(23));
        map.put(C6106v.class, new C5997a(24));
        map.put(C5765F1.class, new C6012e(11));
        map.put(C6107w.class, new C5997a(25));
        map.put(C6108x.class, new C5997a(26));
        map.put(C6109y.class, new C5997a(27));
        map.put(C5805T0.class, new C6012e(4));
        map.put(C6110z.class, new C5997a(28));
        map.put(C6078A.class, new C5997a(29));
        map.put(C5792O1.class, new C6012e(13));
        map.put(C5798Q1.class, new C6012e(14));
        map.put(C5803S1.class, new C6012e(15));
        map.put(EnumC5809U1.class, new C6012e(16));
        map.put(C6082E.class, new C6081D(0));
        map.put(C6091g.class, new C5997a(11));
        map.put(C6011d2.class, new C6012e(19));
        map.put(C5998b.class, new C5997a(0));
        map.put(C6084G.class, new C6081D(2));
        map.put(C6083F.class, new C6081D(1));
    }

    @Override // io.sentry.InterfaceC5801S
    /* renamed from: a */
    public final String mo21457a(ConcurrentHashMap concurrentHashMap) {
        return m21838g(concurrentHashMap, false);
    }

    @Override // io.sentry.InterfaceC5801S
    /* renamed from: b */
    public final Object mo21458b(Reader reader, Class cls) {
        C5759D1 c5759d1 = this.f34238a;
        try {
            C6055k0 c6055k0 = new C6055k0(reader);
            try {
                InterfaceC5826a0 interfaceC5826a0 = (InterfaceC5826a0) this.f34239b.get(cls);
                if (interfaceC5826a0 != null) {
                    Object objCast = cls.cast(interfaceC5826a0.mo21493a(c6055k0, c5759d1.getLogger()));
                    c6055k0.close();
                    return objCast;
                }
                if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                    c6055k0.close();
                    return null;
                }
                Object objM21816m0 = c6055k0.m21816m0();
                c6055k0.close();
                return objM21816m0;
            } finally {
            }
        } catch (Exception e) {
            c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Error when deserializing", e);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC5801S
    /* renamed from: c */
    public final C6042c mo21459c(BufferedInputStream bufferedInputStream) {
        C5759D1 c5759d1 = this.f34238a;
        try {
            return c5759d1.getEnvelopeReader().mo21401a(bufferedInputStream);
        } catch (IOException e) {
            c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Error deserializing envelope.", e);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC5801S
    /* renamed from: d */
    public final Object mo21460d(BufferedReader bufferedReader, Class cls, C6012e c6012e) {
        C5759D1 c5759d1 = this.f34238a;
        try {
            C6055k0 c6055k0 = new C6055k0(bufferedReader);
            try {
                if (!Collection.class.isAssignableFrom(cls)) {
                    Object objM21816m0 = c6055k0.m21816m0();
                    c6055k0.close();
                    return objM21816m0;
                }
                if (c6012e == null) {
                    Object objM21816m02 = c6055k0.m21816m0();
                    c6055k0.close();
                    return objM21816m02;
                }
                ArrayList arrayListM21808W = c6055k0.m21808W(c5759d1.getLogger(), c6012e);
                c6055k0.close();
                return arrayListM21808W;
            } finally {
            }
        } catch (Throwable th) {
            c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Error when deserializing", th);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC5801S
    /* renamed from: e */
    public final void mo21461e(Object obj, BufferedWriter bufferedWriter) throws IOException {
        AbstractC6003a.m21735D(obj, "The entity is required.");
        C5759D1 c5759d1 = this.f34238a;
        ILogger logger = c5759d1.getLogger();
        EnumC6069n1 enumC6069n1 = EnumC6069n1.DEBUG;
        if (logger.mo21408l(enumC6069n1)) {
            c5759d1.getLogger().mo21407k(enumC6069n1, "Serializing object: %s", m21838g(obj, c5759d1.isEnablePrettySerializationOutput()));
        }
        C6059l1 c6059l1 = new C6059l1(bufferedWriter, c5759d1.getMaxDepth());
        ((C2460e) c6059l1.f34227b).m13832z(c6059l1, c5759d1.getLogger(), obj);
        bufferedWriter.flush();
    }

    @Override // io.sentry.InterfaceC5801S
    /* renamed from: f */
    public final void mo21462f(C6042c c6042c, OutputStream outputStream) throws IOException {
        C5759D1 c5759d1 = this.f34238a;
        AbstractC6003a.m21735D(c6042c, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f34237c));
        try {
            ((C5987c1) c6042c.f34198b).serialize(new C6059l1(bufferedWriter, c5759d1.getMaxDepth()), c5759d1.getLogger());
            bufferedWriter.write("\n");
            for (C6022g1 c6022g1 : (Collection) c6042c.f34199c) {
                try {
                    byte[] bArrM21783d = c6022g1.m21783d();
                    c6022g1.f34164a.serialize(new C6059l1(bufferedWriter, c5759d1.getMaxDepth()), c5759d1.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrM21783d);
                    bufferedWriter.write("\n");
                } catch (Exception e) {
                    c5759d1.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to create envelope item. Dropping it.", e);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    /* renamed from: g */
    public final String m21838g(Object obj, boolean z) {
        StringWriter stringWriter = new StringWriter();
        C5759D1 c5759d1 = this.f34238a;
        C6059l1 c6059l1 = new C6059l1(stringWriter, c5759d1.getMaxDepth());
        if (z) {
            C6186c c6186c = (C6186c) c6059l1.f34226a;
            c6186c.getClass();
            c6186c.f34700d = "\t";
            c6186c.f34701e = ": ";
        }
        ((C2460e) c6059l1.f34227b).m13832z(c6059l1, c5759d1.getLogger(), obj);
        return stringWriter.toString();
    }
}
