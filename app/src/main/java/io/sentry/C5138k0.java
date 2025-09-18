package io.sentry;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.k0 */
/* loaded from: classes2.dex */
public final class C5138k0 implements Closeable {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public C5138k0(Reader reader) {
        this.b = new io.sentry.vendor.gson.stream.a(reader);
    }

    public final Double A() throws IOException {
        switch (this.a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.b;
                if (aVar.o0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Double.valueOf(aVar.W());
                }
                aVar.h0();
                return null;
            default:
                Object objR0 = r0();
                if (objR0 instanceof Number) {
                    return Double.valueOf(((Number) objR0).doubleValue());
                }
                return null;
        }
    }

    public final float D() throws IOException {
        switch (this.a) {
            case 0:
                return (float) ((io.sentry.vendor.gson.stream.a) this.b).W();
            default:
                Object objR0 = r0();
                if (objR0 instanceof Number) {
                    return ((Number) objR0).floatValue();
                }
                throw new IOException("Expected float");
        }
    }

    public final Float J() throws IOException {
        switch (this.a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.b;
                if (aVar.o0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Float.valueOf(D());
                }
                aVar.h0();
                return null;
            default:
                Object objR0 = r0();
                if (objR0 instanceof Number) {
                    return Float.valueOf(((Number) objR0).floatValue());
                }
                return null;
        }
    }

    public final int S() throws IOException {
        switch (this.a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.b).X();
            default:
                Object objR0 = r0();
                if (objR0 instanceof Number) {
                    return ((Number) objR0).intValue();
                }
                throw new IOException("Expected int");
        }
    }

    public final Integer U() throws IOException {
        switch (this.a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.b;
                if (aVar.o0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Integer.valueOf(aVar.X());
                }
                aVar.h0();
                return null;
            default:
                Object objR0 = r0();
                if (objR0 instanceof Number) {
                    return Integer.valueOf(((Number) objR0).intValue());
                }
                return null;
        }
    }

    public final ArrayList W(ILogger iLogger, InterfaceC5082a0 interfaceC5082a0) throws IOException {
        switch (this.a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.b;
                if (aVar.o0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.h0();
                    return null;
                }
                aVar.m();
                ArrayList arrayList = new ArrayList();
                if (aVar.D()) {
                    do {
                        try {
                            arrayList.add(interfaceC5082a0.a(this, iLogger));
                        } catch (Exception e) {
                            iLogger.d(EnumC5148n1.WARNING, "Failed to deserialize object in list.", e);
                        }
                    } while (aVar.o0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
                }
                aVar.w();
                return arrayList;
            default:
                if (s0() == io.sentry.vendor.gson.stream.b.NULL) {
                    i0();
                    return null;
                }
                try {
                    m();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayDeque arrayDeque = (ArrayDeque) this.b;
                    if (!arrayDeque.isEmpty()) {
                        do {
                            try {
                                arrayList2.add(interfaceC5082a0.a(this, iLogger));
                            } catch (Exception e2) {
                                iLogger.d(EnumC5148n1.WARNING, "Failed to deserialize object in list.", e2);
                            }
                        } while (s0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
                    }
                    if (arrayDeque.size() > 1) {
                        arrayDeque.removeLast();
                    }
                    return arrayList2;
                } catch (Exception e3) {
                    throw new IOException(e3);
                }
        }
    }

    public final long X() throws IOException {
        switch (this.a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.b).b0();
            default:
                Object objR0 = r0();
                if (objR0 instanceof Number) {
                    return ((Number) objR0).longValue();
                }
                throw new IOException("Expected long");
        }
    }

    public final Long b0() throws IOException {
        switch (this.a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.b;
                if (aVar.o0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Long.valueOf(aVar.b0());
                }
                aVar.h0();
                return null;
            default:
                Object objR0 = r0();
                if (objR0 instanceof Number) {
                    return Long.valueOf(((Number) objR0).longValue());
                }
                return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.b).close();
                break;
            default:
                ((ArrayDeque) this.b).clear();
                break;
        }
    }

    public final HashMap d0(ILogger iLogger, io.sentry.clientreport.a aVar) throws IOException {
        switch (this.a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar2 = (io.sentry.vendor.gson.stream.a) this.b;
                if (aVar2.o0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar2.h0();
                    return null;
                }
                HashMap map = new HashMap();
                n();
                if (aVar2.D()) {
                    while (true) {
                        String strD0 = aVar2.d0();
                        ArrayList arrayListW = W(iLogger, aVar);
                        if (arrayListW != null) {
                            map.put(strD0, arrayListW);
                        }
                        if (aVar2.o0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT || aVar2.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                        }
                    }
                }
                o();
                return map;
            default:
                if (s0() == io.sentry.vendor.gson.stream.b.NULL) {
                    i0();
                    return null;
                }
                HashMap map2 = new HashMap();
                try {
                    n();
                    if (!((ArrayDeque) this.b).isEmpty()) {
                        while (true) {
                            String strH0 = h0();
                            ArrayList arrayListW2 = W(iLogger, aVar);
                            if (arrayListW2 != null) {
                                map2.put(strH0, arrayListW2);
                            }
                            if (s0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT || s0() == io.sentry.vendor.gson.stream.b.NAME) {
                            }
                        }
                    }
                    o();
                    return map2;
                } catch (Exception e) {
                    throw new IOException(e);
                }
        }
    }

    public final HashMap e0(ILogger iLogger, InterfaceC5082a0 interfaceC5082a0) throws IOException {
        switch (this.a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.b;
                if (aVar.o0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.h0();
                    return null;
                }
                aVar.n();
                HashMap map = new HashMap();
                if (aVar.D()) {
                    while (true) {
                        try {
                            map.put(aVar.d0(), interfaceC5082a0.a(this, iLogger));
                        } catch (Exception e) {
                            iLogger.d(EnumC5148n1.WARNING, "Failed to deserialize object in map.", e);
                        }
                        if (aVar.o0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT || aVar.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                        }
                    }
                }
                aVar.x();
                return map;
            default:
                if (s0() == io.sentry.vendor.gson.stream.b.NULL) {
                    i0();
                    return null;
                }
                try {
                    n();
                    HashMap map2 = new HashMap();
                    if (!((ArrayDeque) this.b).isEmpty()) {
                        while (true) {
                            try {
                                map2.put(h0(), interfaceC5082a0.a(this, iLogger));
                            } catch (Exception e2) {
                                iLogger.d(EnumC5148n1.WARNING, "Failed to deserialize object in map.", e2);
                            }
                            if (s0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT || s0() == io.sentry.vendor.gson.stream.b.NAME) {
                            }
                        }
                    }
                    o();
                    return map2;
                } catch (Exception e3) {
                    throw new IOException(e3);
                }
        }
    }

    public final String h0() throws IOException {
        switch (this.a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.b).d0();
            default:
                Map.Entry entry = (Map.Entry) ((ArrayDeque) this.b).peekLast();
                if (entry != null && entry.getKey() != null) {
                    return (String) entry.getKey();
                }
                throw new IOException("Expected a name but was " + s0());
        }
    }

    public void i0() throws IOException {
        if (r0() == null) {
            return;
        }
        throw new IOException("Expected null but was " + s0());
    }

    public void m() throws IOException {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
        if (entry == null) {
            throw new IOException("No more entries");
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            throw new IOException("Current token is not an object");
        }
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    public final Object m0() {
        switch (this.a) {
            case 0:
                C5135j0 c5135j0 = new C5135j0();
                c5135j0.d(this);
                InterfaceC5120e0 interfaceC5120e0A = c5135j0.a();
                if (interfaceC5120e0A != null) {
                    return interfaceC5120e0A.getValue();
                }
                return null;
            default:
                return r0();
        }
    }

    public final void n() throws IOException {
        switch (this.a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.b).n();
                return;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.b;
                Map.Entry entry = (Map.Entry) arrayDeque.removeLast();
                if (entry == null) {
                    throw new IOException("No more entries");
                }
                Object value = entry.getValue();
                if (!(value instanceof Map)) {
                    throw new IOException("Current token is not an object");
                }
                arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
                Iterator it = ((Map) value).entrySet().iterator();
                while (it.hasNext()) {
                    arrayDeque.addLast((Map.Entry) it.next());
                }
                return;
        }
    }

    public final Object n0(ILogger iLogger, InterfaceC5082a0 interfaceC5082a0) {
        switch (this.a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.b;
                if (aVar.o0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return interfaceC5082a0.a(this, iLogger);
                }
                aVar.h0();
                return null;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.b;
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return null;
                }
                Object value = entry.getValue();
                if (iLogger != null) {
                    return interfaceC5082a0.a(this, iLogger);
                }
                arrayDeque.removeLast();
                return value;
        }
    }

    public final void o() {
        switch (this.a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.b).x();
                break;
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.b;
                if (arrayDeque.size() > 1) {
                    arrayDeque.removeLast();
                    break;
                }
                break;
        }
    }

    public final String o0() throws IOException {
        switch (this.a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.b).m0();
            default:
                String str = (String) r0();
                if (str != null) {
                    return str;
                }
                throw new IOException("Expected string");
        }
    }

    public final Boolean p() {
        switch (this.a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.b;
                if (aVar.o0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return Boolean.valueOf(aVar.U());
                }
                aVar.h0();
                return null;
            default:
                return (Boolean) r0();
        }
    }

    public final String p0() {
        switch (this.a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.b;
                if (aVar.o0() != io.sentry.vendor.gson.stream.b.NULL) {
                    return aVar.m0();
                }
                aVar.h0();
                return null;
            default:
                return (String) r0();
        }
    }

    public final void q0(ILogger iLogger, AbstractMap abstractMap, String str) {
        switch (this.a) {
            case 0:
                try {
                    abstractMap.put(str, m0());
                    break;
                } catch (Exception e) {
                    iLogger.c(EnumC5148n1.ERROR, e, "Error deserializing unknown key: %s", str);
                }
            default:
                try {
                    abstractMap.put(str, r0());
                    break;
                } catch (Exception e2) {
                    iLogger.c(EnumC5148n1.ERROR, e2, "Error deserializing unknown key: %s", str);
                    return;
                }
        }
    }

    public Object r0() throws IOException {
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.b;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public final io.sentry.vendor.gson.stream.b s0() {
        switch (this.a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.b).o0();
            default:
                ArrayDeque arrayDeque = (ArrayDeque) this.b;
                if (arrayDeque.isEmpty()) {
                    return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
                }
                Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
                if (entry == null) {
                    return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
                }
                if (entry.getKey() != null) {
                    return io.sentry.vendor.gson.stream.b.NAME;
                }
                Object value = entry.getValue();
                return value instanceof Map ? io.sentry.vendor.gson.stream.b.BEGIN_OBJECT : value instanceof List ? io.sentry.vendor.gson.stream.b.BEGIN_ARRAY : value instanceof String ? io.sentry.vendor.gson.stream.b.STRING : value instanceof Number ? io.sentry.vendor.gson.stream.b.NUMBER : value instanceof Boolean ? io.sentry.vendor.gson.stream.b.BOOLEAN : value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
    }

    public final void t0(boolean z) {
        switch (this.a) {
            case 0:
                ((io.sentry.vendor.gson.stream.a) this.b).b = z;
                break;
        }
    }

    public final Date w(ILogger iLogger) {
        switch (this.a) {
            case 0:
                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) this.b;
                if (aVar.o0() == io.sentry.vendor.gson.stream.b.NULL) {
                    aVar.h0();
                    break;
                } else {
                    String strM0 = aVar.m0();
                    if (strM0 != null) {
                        try {
                            try {
                                break;
                            } catch (Exception e) {
                                iLogger.d(EnumC5148n1.ERROR, "Error when deserializing millis timestamp format.", e);
                                return null;
                            }
                        } catch (Exception unused) {
                            return io.sentry.config.a.n(strM0);
                        }
                    }
                }
                break;
            default:
                String str = (String) r0();
                if (str != null) {
                    try {
                        try {
                            break;
                        } catch (Exception unused2) {
                            return io.sentry.config.a.n(str);
                        }
                    } catch (Exception e2) {
                        iLogger.d(EnumC5148n1.ERROR, "Error when deserializing millis timestamp format.", e2);
                        return null;
                    }
                }
                break;
        }
        return null;
    }

    public final double x() throws IOException {
        switch (this.a) {
            case 0:
                return ((io.sentry.vendor.gson.stream.a) this.b).W();
            default:
                Object objR0 = r0();
                if (objR0 instanceof Number) {
                    return ((Number) objR0).doubleValue();
                }
                throw new IOException("Expected double");
        }
    }

    public C5138k0(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.b = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    private final void v0() {
    }

    private final void u0(boolean z) {
    }
}
